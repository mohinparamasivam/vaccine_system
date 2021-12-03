/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOFileImp;

import DAO.AppointmentDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import model.Appointment;

/**
 *
 * @author howar
 */
public class FileAppointmentDAO extends FileBaseDAO<Appointment> implements AppointmentDAO {

    private volatile static FileAppointmentDAO instance;

    private FileAppointmentDAO() {
        super(Appointment.class);
    }

    public static FileAppointmentDAO getInstance() {
        if (instance == null) {
            synchronized (FileAppointmentDAO.class) {
                if (instance == null) {
                    instance = new FileAppointmentDAO();
                }
            }
        }
        return instance;
    }

    @Override
    public List<Appointment> findAppointmentByPeopleNameOrCentreName(String searchKey) {
        List<Appointment> appointments = this.all();
        List<Appointment> apList = new ArrayList<>();
        appointments.stream().filter(appointment -> (appointment.getPeople().getName().toLowerCase().contains(searchKey.toLowerCase())
                || appointment.getCentre().getName().toLowerCase().contains(searchKey.toLowerCase()))).forEachOrdered(appointment -> {
            apList.add(appointment);
        });
        return apList;
    }

    @Override
    public List<Appointment> findAppointmentByPeopleName(String searchKey) {
        List<Appointment> appointments = this.all();
        List<Appointment> apList = new ArrayList<>();
        appointments.stream().filter(appointment -> (appointment.getPeople().getName().toLowerCase().contains(searchKey.toLowerCase()))).forEachOrdered(appointment -> {
            apList.add(appointment);
        });
        return apList;
    }

    @Override
    public List<Appointment> getNotCancelledAppointmentOfUser(UUID peopleKey) {
        List<Appointment> appointments = this.all();
        List<Appointment> apList = new ArrayList<>();
        appointments.stream().filter(appointment
                -> (appointment.getPeople().getKey().equals(peopleKey)
                && !appointment.getAppointmentStatus().equals(Appointment.AppointmentStatus.CANCELED))
        ).forEachOrdered(appointment -> {
            apList.add(appointment);
        });
        return apList;
    }

}
