/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import model.Appointment;
import model.Vaccination;

/**
 *
 * @author howar
 */
public interface VaccinationDAO extends BaseRootDAO<Vaccination> {

    public void createVaccination(Appointment appointment, String batchNo);

}
