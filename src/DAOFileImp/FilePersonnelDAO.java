/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOFileImp;

import DAO.PersonnelDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import model.Personnel;

/**
 *
 * @author howar
 */
public class FilePersonnelDAO extends FileBaseDAO<Personnel> implements PersonnelDAO {

    private volatile static FilePersonnelDAO instance;

    private FilePersonnelDAO() {
        super(Personnel.class);
    }

    public static FilePersonnelDAO getInstance() {
        if (instance == null) {
            synchronized (FilePersonnelDAO.class) {
                if (instance == null) {
                    instance = new FilePersonnelDAO();
                }
            }
        }
        return instance;
    }

    @Override
    public List<Personnel> findPersonnelByName(String searchKey) {
        List<Personnel> personnels = this.all();
        List<Personnel> ppList = new ArrayList<>();
        personnels.stream().filter(people -> (people.getName().toLowerCase().contains(searchKey.toLowerCase()))).forEachOrdered(people -> {
            ppList.add(people);
        });
        return ppList;
    }

    @Override
    public void update(UUID id, Personnel t) {
        super.update(id, t); //To change body of generated methods, choose Tools | Templates.
    }


}
