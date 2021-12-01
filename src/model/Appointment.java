/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author howar
 */
public class Appointment implements Model {

    private final UUID appointmentId;
    private LocalDateTime time;
    private Centre centre;
    private People people;
    private AppointmentStatus appointmentStatus;

    @Override
    public String toString() {
        return "Appointment{" + "appointmentId=" + appointmentId + ", time=" + time + ", centre=" + centre + ", people=" + people + ", appointmentStatus=" + appointmentStatus + '}';
    }

    public Appointment(LocalDateTime time, Centre centre, People people, AppointmentStatus appointmentStatus) {
        this.appointmentId = UUID.randomUUID();
        this.time = time;
        this.centre = centre;
        this.people = people;
        this.appointmentStatus = appointmentStatus;
    }

    public UUID getAppointmentId() {
        return appointmentId;
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

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Appointment other = (Appointment) obj;
        if (!Objects.equals(this.appointmentId, other.appointmentId)) {
            return false;
        }
        return true;
    }

    @Override
    public UUID getKey() {
        return appointmentId;
    }


    public enum AppointmentStatus {
        PENDING,
        CANCELED,
        COMPLETED;

        @Override
        public String toString() {
            return utils.Util.capitalizeFirstLetter(this.name());
        }

    }


}
