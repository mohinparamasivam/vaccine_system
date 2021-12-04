/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author howar
 */
public abstract class Vaccine implements Model {

    private final UUID vaccineId;
    private String name;
    private int dosageNeeded;
    private int daysNeeded;

    public Vaccine(String name, int dosageNeeded, int daysNeeded) {
        this.vaccineId = UUID.randomUUID();
        this.name = name;
        this.dosageNeeded = dosageNeeded;
        this.daysNeeded = daysNeeded;
    }

    @Override
    public String toString() {
        return "Vaccine{" + "vaccineId=" + vaccineId + ", name=" + name + ", dosageNeeded=" + dosageNeeded + ", daysNeeded=" + daysNeeded + '}';
    }


    @Override
    public UUID getKey() {
        return vaccineId;
    }

    public UUID getVaccineId() {
        return vaccineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDosageNeeded() {
        return dosageNeeded;
    }

    public void setDosageNeeded(int dosageNeeded) {
        this.dosageNeeded = dosageNeeded;
    }

    public int getDaysNeeded() {
        return daysNeeded;
    }

    public void setDaysNeeded(int daysNeeded) {
        this.daysNeeded = daysNeeded;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Vaccine other = (Vaccine) obj;
        if (!Objects.equals(this.vaccineId, other.vaccineId)) {
            return false;
        }
        return true;
    }


}
