/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOFileImp;

import DAO.VaccineSupplyDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import model.Centre;
import model.Vaccination;
import model.VaccineSupply;

/**
 *
 * @author howar
 */
public class FileVaccineSupplyDAO extends FileBaseDAO<VaccineSupply> implements VaccineSupplyDAO {

    private volatile static FileVaccineSupplyDAO instance;

    private FileVaccineSupplyDAO() {
        super(VaccineSupply.class);
    }

    public static FileVaccineSupplyDAO getInstance() {
        if (instance == null) {
            synchronized (FileVaccineSupplyDAO.class) {
                if (instance == null) {
                    instance = new FileVaccineSupplyDAO();
                }
            }
        }
        return instance;
    }

    @Override
    public List<VaccineSupply> findVaccineSupplyByCentre(UUID centreId) {
        List<VaccineSupply> vaccineSupplies = this.all();
        Centre centre = FileCentreDAO.getInstance().get(centreId);
        List<VaccineSupply> vsList = new ArrayList<>();
        vaccineSupplies.stream().filter(vs -> centre.getVaccineSupplies().contains(vs)).forEachOrdered(vs -> {
            vsList.add(vs);
        });
        return vsList;
    }

    @Override
    public VaccineSupply findVaccineSupplyByBatchNo(String batchNo) {
        List<VaccineSupply> vaccineSupplies = this.all();
        for (VaccineSupply vaccineSupply : vaccineSupplies) {
            if (vaccineSupply.getBatchNo().equalsIgnoreCase(batchNo)) {
                return vaccineSupply;
            }
        }
        return null;
    }

    @Override
    public void create(VaccineSupply t) {
        throw new UnsupportedOperationException("Should not use this create method for vaccine supply, use create(VaccineSupply t, Centre centre) instead");
    }

    @Override
    public void create(VaccineSupply t, Centre centre) {
        super.create(t);
        List<VaccineSupply> vss = centre.getVaccineSupplies();
        vss.add(t);
        centre.setVaccineSupplies(vss);
        FileCentreDAO.getInstance().update(centre.getKey(), centre);
    }

    @Override
    public void update(UUID id, VaccineSupply t) {
        super.update(id, t);
        Centre centre = FileCentreDAO.getInstance().findCentreByVaccineSupply(t);
        List<VaccineSupply> vss = centre.getVaccineSupplies();
        vss.add(t);
        centre.setVaccineSupplies(vss);
        FileCentreDAO.getInstance().update(centre.getKey(), centre);
    }

    @Override
    public boolean isDuplicatedBatchNo(String batchNo) {
        List<VaccineSupply> vaccineSupplies = this.all();
        for (VaccineSupply vaccineSupply : vaccineSupplies) {
            if (vaccineSupply.getBatchNo().equalsIgnoreCase(batchNo)) {
                logger.debug(batchNo + " vs " + vaccineSupply.getBatchNo() + " is duplicated.");
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean canDeleteVaccineSupply(UUID vaccineId) {
        List<Vaccination> vcns = FileVaccinationDAO.getInstance().all();
        for (Vaccination vcn : vcns) {
            if (vcn.getSupply().getKey().equals(vaccineId)) {
                return false;
            }
        }
        return true;
    }

}
