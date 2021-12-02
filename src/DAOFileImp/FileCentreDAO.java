/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOFileImp;

import DAO.CentreDAO;
import java.util.ArrayList;
import java.util.List;
import model.Centre;
import model.VaccineSupply;

/**
 *
 * @author howar
 */
public class FileCentreDAO extends FileBaseDAO<Centre> implements CentreDAO {

    private volatile static FileCentreDAO instance;

    private FileCentreDAO() {
        super(Centre.class);
    }

    public static FileCentreDAO getInstance() {
        if (instance == null) {
            synchronized (FileCentreDAO.class) {
                if (instance == null) {
                    instance = new FileCentreDAO();
                }
            }
        }
        return instance;
    }

    @Override
    public List<Centre> findCentreByName(String searchKey) {
        List<Centre> centres = this.all();
        List<Centre> ctList = new ArrayList<>();
        centres.stream().filter(centre -> (centre.getName().toLowerCase().contains(searchKey.toLowerCase()))).forEachOrdered(centre -> {
            ctList.add(centre);
        });
        return ctList;
    }

    @Override
    public Centre findCentreByVaccineSupply(VaccineSupply vs) {
        List<Centre> centres = this.all();
        for (Centre centre : centres) {
            if (centre.getVaccineSupplies().contains(vs)) {
                return centre;
            }
        }
        return null;
    }



}
