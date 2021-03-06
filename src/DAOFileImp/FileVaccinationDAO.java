/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOFileImp;

import DAO.VaccinationDAO;
import java.util.List;
import model.Appointment;
import model.People;
import model.Vaccination;
import model.VaccineSupply;

/**
 *
 * @author howar
 */
public class FileVaccinationDAO extends FileBaseDAO<Vaccination> implements VaccinationDAO {

    private volatile static FileVaccinationDAO instance;

    private FileVaccinationDAO() {
        super(Vaccination.class);
    }

    public static FileVaccinationDAO getInstance() {
        if (instance == null) {
            synchronized (FileVaccinationDAO.class) {
                if (instance == null) {
                    instance = new FileVaccinationDAO();
                }
            }
        }
        return instance;
    }

    @Override
    public void createVaccination(Appointment appointment, String batchNo) {
        //first deduct the available count for the supply by 1
        VaccineSupply vcSupply = FileVaccineSupplyDAO.getInstance().findVaccineSupplyByBatchNo(batchNo);
        logger.info("Deducting available count from {} for vaccine supply: {}", vcSupply.getAvailableQuantity(), vcSupply.getKey());
        vcSupply.setAvailableQuantity(vcSupply.getAvailableQuantity() - 1);
        FileVaccineSupplyDAO.getInstance().update(vcSupply.getKey(), vcSupply);
        logger.info("Deducted available count to {} for vaccine supply: {}", vcSupply.getAvailableQuantity(), vcSupply.getKey());

        // create vaccination
        Vaccination vcn = new Vaccination(appointment.getTime(),
                appointment.getCentre(),
                vcSupply);
        super.create(vcn);
        logger.info("Created vaccination at {}: {}, ", vcn.getCentre().getName(), vcn.getKey());

        //then update the people vaccinations and vaccination status
        People people = FilePeopleDAO.getInstance().get(appointment.getPeople().getKey());
        List<Vaccination> vcns = people.getVaccinations();
        vcns.add(vcn);
        people.setVaccinations(vcns);
        logger.info("Added vaccination for {}: {}", people.getName(), vcn.getKey());

        //change vaccination status
        People.VaccincationStatus vcnStatus = people.getVaccinationStatus();
        if (!vcnStatus.equals(People.VaccincationStatus.FULLY_VACCINATED)) {
            logger.info("Changing {}'s vaccination status from {}", people.getName(), people.getVaccinationStatus());
            people.setVaccinationStatus(vcnStatus.next());
            logger.info("Changed {}'s vaccination status to {}", people.getName(), people.getVaccinationStatus());
        }

        FilePeopleDAO.getInstance().update(people.getKey(), people);

        //update the people with vaccination in appointment
        appointment.setPeople(people);
        FileAppointmentDAO.getInstance().update(appointment.getKey(), appointment);
        logger.info("Set appointment's people to people with vaccinations.");

    }


}
