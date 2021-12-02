/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import DAO.AppointmentDAO;
import DAO.CentreDAO;
import DAO.PeopleDAO;
import DAO.PersonnelDAO;
import DAO.VaccinationDAO;
import DAO.VaccineDAO;
import DAO.VaccineSupplyDAO;
import DAOFileImp.FileAppointmentDAO;
import DAOFileImp.FileBaseDAO;
import DAOFileImp.FileCentreDAO;
import DAOFileImp.FilePeopleDAO;
import DAOFileImp.FilePersonnelDAO;
import DAOFileImp.FileVaccinationDAO;
import DAOFileImp.FileVaccineDAO;
import DAOFileImp.FileVaccineSupplyDAO;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import model.Appointment;
import model.AstraZeneca;
import model.Centre;
import model.Janssen;
import model.Moderna;
import model.People;
import model.PeopleFactory;
import model.Personnel;
import model.Pfizer;
import model.Sinovac;
import model.Vaccination;
import model.Vaccine;
import model.VaccineSupply;

/**
 *
 * @author howar
 */
public class DataFaker {
    public static void initAllData() {
        DataFaker.resetPeople();
        DataFaker.resetPersonnel();
        DataFaker.resetCentre();
        DataFaker.resetVaccine();
        DataFaker.resetVaccineSupply();
        DataFaker.resetAppointmentAndVaccination();
    }

    public static void printAllData() {
        List<FileBaseDAO> list = new ArrayList<>();
        list.add(FilePeopleDAO.getInstance());
        list.add(FilePersonnelDAO.getInstance());
        list.add(FileCentreDAO.getInstance());
        list.add(FileVaccineDAO.getInstance());
        list.add(FileVaccineSupplyDAO.getInstance());
        list.add(FileAppointmentDAO.getInstance());
        list.add(FileVaccinationDAO.getInstance());

        System.out.println("==================");
        for (FileBaseDAO fileBaseDAO : list) {
            DataFaker.printAll(fileBaseDAO.all());
            System.out.println("");
        }
    }

    public static <T> void printAll(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

    public static void resetPeople() {
        PeopleDAO peopleDao = FilePeopleDAO.getInstance();
        peopleDao.deleteAll();

        String[] mNames = {"Jerry MYR", "Justin B MYR", "Sakura MYR", "Marceline MYR"};
        String[] countries = {"Nigeria", "Brunei", "Singapore", "Japan"};
        String[] names = {"Sally NGN", "Naruto BND", "Itachi SGD", "Brown JPY"};

        //create 2 male citizen
        for (int i = 0; i < 2; i++) {
            String ind = Integer.toString(i);
            People people = PeopleFactory.createMaleCitizen(LocalDate.of(1990 + i, 1 + i, 8 + i),
                    "1111-11-111" + ind,
                    "Lot 123, Jalan Test Male " + ind,
                    "people_M" + ind,
                    mNames[i],
                    "people",
                    25 + i,
                    "011-111111" + ind);
            if (i == 0) { //set the first guy to registered
                people.setRegistrationStatus(People.RegistrationStatus.REGISTERED);
            }
            peopleDao.create(people);
        }
        //create 2 female citizen
        for (int i = 2; i < 4; i++) {
            String ind = Integer.toString(i);
            People people = PeopleFactory.createFemaleCitizen(LocalDate.of(1980 + i, 1 + i, 8 + i),
                    "1111-11-112" + ind,
                    "Lot 456, Jalan Test Female " + ind,
                    "people_F" + ind,
                    mNames[i],
                    "people",
                    30 + i,
                    "012-222222" + ind);
            if (i == 2) { //set the first guy to registered
                people.setRegistrationStatus(People.RegistrationStatus.REGISTERED);
            }
            peopleDao.create(people);
        }

        //create 2 male non-citizen
        for (int i = 0; i < 2; i++) {
            String ind = Integer.toString(i);
            People people = PeopleFactory.createMaleNonCitizen(LocalDate.of(1980 + i, 1 + i, 8 + i),
                    "9911NCZ" + ind,
                    "1111, Test Male Non-CitizeN Road" + countries[i],
                    countries[i],
                    "people_NCZ_M" + ind,
                    names[i],
                    "people",
                    22 + i,
                    "011-3333333" + ind);
            if (i == 0) { //set the first guy to registered
                people.setRegistrationStatus(People.RegistrationStatus.REGISTERED);
            }
            peopleDao.create(people);
        }
        //create 2 female non-citizen
        for (int i = 2; i < 4; i++) {
            String ind = Integer.toString(i);
            People people = PeopleFactory.createFemaleNonCitizen(LocalDate.of(1980 + i, 1 + i, 8 + i),
                    "9900NCZ" + ind,
                    "1111, Test Female Non-CitizeN Road" + countries[i],
                    countries[i],
                    "people_NCZ_F" + ind,
                    names[i],
                    "people",
                    40 + i,
                    "011-4444444" + ind);
            if (i == 0) { //set the first guy to registered
                people.setRegistrationStatus(People.RegistrationStatus.REGISTERED);
            }
            peopleDao.create(people);
        }
    }

    public static void resetPersonnel() {
        PersonnelDAO personnelDao = FilePersonnelDAO.getInstance();
        personnelDao.deleteAll();
        //create 2 male personnel
        String[] names = {"Personnel BTC", "Personnel ETH"};
        for (int i = 0; i < 2; i++) {
            String ind = Integer.toString(i);
            Personnel personnel = new Personnel("personnel_" + ind,
                    names[i],
                    "personnel");
            personnelDao.create(personnel);
        }
    }

    public static void resetCentre() {
        CentreDAO centreDAO = FileCentreDAO.getInstance();
        centreDAO.deleteAll();
        String[] names = {"PWTC", "UTM", "Genting Highland"};
        //create 3 fake centre
        for (int i = 0; i < 3; i++) {
            Centre centre = new Centre(new ArrayList<VaccineSupply>(),
                    names[i],
                    i,
                    LocalTime.of(9 + i, 0),
                    LocalTime.of(16 + i, 0)
            );
            centreDAO.create(centre);
        }
    }

    public static void resetVaccine() {
        VaccineDAO vaccineDao = FileVaccineDAO.getInstance();
        vaccineDao.deleteAll();
        //create 5 types of vaccines
        Vaccine sinovac = new Sinovac();
        Vaccine pfizer = new Pfizer();
        Vaccine az = new AstraZeneca();
        Vaccine janssen = new Janssen();
        Vaccine moderna = new Moderna();

        vaccineDao.create(sinovac);
        vaccineDao.create(pfizer);
        vaccineDao.create(az);
        vaccineDao.create(janssen);
        vaccineDao.create(moderna);

    }

    public static void resetVaccineSupply() {
        VaccineSupplyDAO vsDao = FileVaccineSupplyDAO.getInstance();
        vsDao.deleteAll();

        VaccineDAO vaccineDao = FileVaccineDAO.getInstance();
        List<Vaccine> vaccines = vaccineDao.all();

        CentreDAO centreDAO = FileCentreDAO.getInstance();
        List<Centre> centres = centreDAO.all();

        List<List<People.PeopleType>> access = new ArrayList<>();
        access.add(VaccineSupply.getAccessOnlyCitizen());
        access.add(VaccineSupply.getAccessOnlyNonCitizen());
        access.add(VaccineSupply.getAccessCitizenAndNonCitizen());

        //create 3 supply for centre 1, mixed accessibility
        List<VaccineSupply> vsSupplies = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String ind = Integer.toString(i);
            VaccineSupply vs = new VaccineSupply("VS10" + ind,
                    LocalDate.of(2021, 1 + i, (i + 1) * 2),
                    vaccines.get(i),
                    "Supplier1_" + ind,
                    100,
                    100,
                    access.get(i));
            vsSupplies.add(vs);
            vsDao.create(vs);
        }
        centres.get(0).setVaccineSupplies(new ArrayList<VaccineSupply>(vsSupplies));

        vsSupplies.clear();
        //create 3 supply for centre 2, only citizen
        for (int i = 0; i < 3; i++) {
            String ind = Integer.toString(i);
            VaccineSupply vs = new VaccineSupply("VS20" + ind,
                    LocalDate.of(2020, 5 + i, (i + 1) * 2),
                    vaccines.get(i + 2),
                    "Supplier2_" + ind,
                    80 + i * 10,
                    80 + i * 10,
                    access.get(0));
            vsSupplies.add(vs);
            vsDao.create(vs);
        }
        centres.get(1).setVaccineSupplies(new ArrayList<VaccineSupply>(vsSupplies));

        vsSupplies.clear();
        //create 2 supply for centre 3, only non-citizen
        for (int i = 0; i < 2; i++) {
            String ind = Integer.toString(i);
            VaccineSupply vs = new VaccineSupply("VS30" + ind,
                    LocalDate.of(2020, 5 + i, (i + 1) * 2),
                    vaccines.get(3),
                    "Supplier3_" + ind,
                    70 + i * 10,
                    70 + i * 10,
                    access.get(1));
            vsSupplies.add(vs);
            vsDao.create(vs);
        }
        centres.get(2).setVaccineSupplies(new ArrayList<VaccineSupply>(vsSupplies));

        centreDAO.replace(centres);
    }

    public static void resetAppointmentAndVaccination() {
        AppointmentDAO appDao = FileAppointmentDAO.getInstance();
        appDao.deleteAll();
        VaccinationDAO vcnDao = FileVaccinationDAO.getInstance();
        vcnDao.deleteAll();
        VaccineSupplyDAO vsDao = FileVaccineSupplyDAO.getInstance();

        CentreDAO centreDAO = FileCentreDAO.getInstance();
        List<Centre> centres = centreDAO.all();

        PeopleDAO peopleDAO = FilePeopleDAO.getInstance();
        List<People> peoples = peopleDAO.all();

        List<Vaccination> vcns = new ArrayList<>();
        // create 5 appointments
        // 2 for 1st citizen, completed vaccination
        for (int i = 0; i < 2; i++) {
            String ind = Integer.toString(i);
            Appointment app = new Appointment(LocalDateTime.of(2021, 7, 5 + i, i + 11, ((i + 1) * 15) % 60),
                    centres.get(1),
                    peoples.get(0),
                    Appointment.AppointmentStatus.COMPLETED);
            appDao.create(app);

            //create vaccination once appointment completed
            vcnDao.createVaccination(app, "VS20" + ind);
        }

        // 1 for 1 non-citizen,  completed vaccination
        vcns.clear();
        for (int i = 1; i < 2; i++) {
            String ind = Integer.toString(i);
            Appointment app = new Appointment(LocalDateTime.of(2021, 7, 5 + i, i + 11, ((i + 1) * 15) % 60),
                    centres.get(0),
                    peoples.get(6),
                    Appointment.AppointmentStatus.COMPLETED);
            appDao.create(app);

            //create vaccination once appointment completed
            vcnDao.createVaccination(app, "VS10" + ind);
        }

        // 1 for 1 citizen pending
        for (int i = 1; i < 2; i++) {
            String ind = Integer.toString(i);
            Appointment app = new Appointment(LocalDateTime.of(2021, 12, 20 + i, i + 11, ((i + 1) * 15) % 60),
                    centres.get(0),
                    peoples.get(1),
                    Appointment.AppointmentStatus.PENDING);
            appDao.create(app);
        }

        // 1 cancelled for 1 non-citizen
        for (int i = 1; i < 2; i++) {
            String ind = Integer.toString(i);
            Appointment app = new Appointment(LocalDateTime.of(2021, 3, 20 + i, i + 11, ((i + 1) * 15) % 60),
                    centres.get(2),
                    peoples.get(4),
                    Appointment.AppointmentStatus.CANCELED);
            appDao.create(app);
        }

    }

}
