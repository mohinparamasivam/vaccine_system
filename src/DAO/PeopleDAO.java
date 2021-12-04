/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import model.People;

/**
 *
 * @author howar
 */
public interface PeopleDAO extends BaseRootDAO<People> {

    public List<People> findPeopleByName(String searchKey);

    public List<People> getCitizens();

    public List<People> getNonCitizens();

    public List<People> getRegisteredPeople();

    public List<People> getNotRegisteredPeople();

    public boolean isDuplicatedUsername(String username);

    public boolean isDuplicatedIc(String ic);

}
