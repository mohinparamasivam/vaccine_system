/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOFileImp;

import DAO.VaccineDAO;
import java.util.ArrayList;
import java.util.List;
import model.Vaccine;

/**
 *
 * @author howar
 */
public class FileVaccineDAO extends FileBaseDAO<Vaccine> implements VaccineDAO {

    private volatile static FileVaccineDAO instance;

    private FileVaccineDAO() {
        super(Vaccine.class);
    }

    public static FileVaccineDAO getInstance() {
        if (instance == null) {
            synchronized (FileVaccineDAO.class) {
                if (instance == null) {
                    instance = new FileVaccineDAO();
                }
            }
        }
        return instance;
    }

    @Override
    public List<Vaccine> findVaccineByName(String searchKey) {
        List<Vaccine> vaccines = this.all();
        List<Vaccine> vList = new ArrayList<>();
        vaccines.stream().filter(vaccine -> (vaccine.getName().toLowerCase().contains(searchKey.toLowerCase()))).forEachOrdered(vaccine -> {
            vList.add(vaccine);
        });
        return vList;
    }


}
