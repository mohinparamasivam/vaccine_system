/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOFileImp;

import DAO.PeopleDAO;
import java.util.ArrayList;
import java.util.List;
import model.People;

/**
 *
 * @author howar
 */
public class FilePeopleDAO extends FileBaseDAO<People> implements PeopleDAO {

    private volatile static FilePeopleDAO instance;

    private FilePeopleDAO() {
        super(People.class);
    }


    public static FilePeopleDAO getInstance() {
        if (instance == null) {
            synchronized (FilePeopleDAO.class) {
                if (instance == null) {
                    instance = new FilePeopleDAO();
                }
            }
        }
        return instance;
    }

    @Override
    public List<People> findPeopleByName(String searchKey) {
        List<People> peoples = this.all();
        List<People> ppList = new ArrayList<>();
        peoples.stream().filter(people -> (people.getName().toLowerCase().contains(searchKey.toLowerCase()))).forEachOrdered(people -> {
            ppList.add(people);
        });
        return ppList;
    }

    @Override
    public List<People> getCitizens() {
        List<People> peoples = this.all();
        List<People> ppList = new ArrayList<>();
        peoples.stream().filter(people -> (people.getPeopleType().equals(People.PeopleType.CITIZEN))).forEachOrdered(people -> {
            ppList.add(people);
        });
        return ppList;
    }

    @Override
    public List<People> getNonCitizens() {
        List<People> peoples = this.all();
        List<People> ppList = new ArrayList<>();
        peoples.stream().filter(people -> (people.getPeopleType().equals(People.PeopleType.NON_CITIZEN))).forEachOrdered(people -> {
            ppList.add(people);
        });
        return ppList;
    }

}
