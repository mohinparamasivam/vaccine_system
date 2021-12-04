/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import model.Centre;
import model.VaccineSupply;

/**
 *
 * @author howar
 */
public interface CentreDAO extends BaseRootDAO<Centre> {

    public List<Centre> findCentreByName(String searchKey);

    public Centre findCentreByVaccineSupply(VaccineSupply vs);

}
