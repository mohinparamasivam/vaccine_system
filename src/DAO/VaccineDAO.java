/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import model.Vaccine;

/**
 *
 * @author howar
 */
public interface VaccineDAO extends BaseRootDAO<Vaccine> {

    public List<Vaccine> findVaccineByName(String searchKey);

}
