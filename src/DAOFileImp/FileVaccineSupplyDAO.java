/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOFileImp;

import DAO.VaccineSupplyDAO;
import java.util.List;
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


//    @Override
//    public List<VaccineSupply> findVaccineSupplyByCentre(UUID centreId) {
//        List<VaccineSupply> vaccineSupplies = this.all();
//         List<VaccineSupply> vsList = new ArrayList<>();
//        peoples.stream().filter(people -> (people.getName().toLowerCase().contains(searchKey.toLowerCase()))).forEachOrdered(people -> {
//            vsList.add(people);
//        });
//        return vsList;
//
//    }
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

}
