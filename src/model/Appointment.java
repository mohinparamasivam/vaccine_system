/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author howar
 */
public class Appointment {

    private LocalDateTime time;
    private Centre centre;
    private People people;
    private AppointmentStatus appointmentStatus;

    public Appointment(LocalDateTime time, Centre centre, People people, AppointmentStatus appointmentStatus) {
        this.time = time;
        this.centre = centre;
        this.people = people;
        this.appointmentStatus = appointmentStatus;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public AppointmentStatus getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }


    enum AppointmentStatus {
        PENDING_CONFIRMATION,
        CONFIRMED,
        CANCELED,
        COMPLETED
    }


}
