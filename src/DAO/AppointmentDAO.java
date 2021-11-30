/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import model.Appointment;

/**
 *
 * @author howar
 */
public interface AppointmentDAO extends BaseRootDAO<Appointment> {

    public List<Appointment> findAppointmentByPeopleNameOrCentreName(String searchKey);



}
