/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author howar
 */
public class Centre implements Model {

    private final UUID centreId;
    private List<VaccineSupply> vaccineSupplies;
    private String name;
    private int countOfBooth;
    private LocalTime openTime;
    private LocalTime closeTime;

    public Centre(List<VaccineSupply> vaccineSupplies, String name, int countOfBooth, LocalTime openTime, LocalTime closeTime) {
        this.centreId = UUID.randomUUID();
        this.vaccineSupplies = vaccineSupplies;
        this.name = name;
        this.countOfBooth = countOfBooth;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    @Override
    public String toString() {
        return "Centre{" + "centreId=" + centreId + ", vaccineSupplies=" + vaccineSupplies + ", name=" + name + ", countOfBooth=" + countOfBooth + ", openTime=" + openTime + ", closeTime=" + closeTime + '}';
    }


    public UUID getCentreId() {
        return centreId;
    }

    public List<VaccineSupply> getVaccineSupplies() {
        return vaccineSupplies;
    }

    public void setVaccineSupplies(List<VaccineSupply> vaccineSupplies) {
        this.vaccineSupplies = vaccineSupplies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfBooth() {
        return countOfBooth;
    }

    public void setCountOfBooth(int countOfBooth) {
        this.countOfBooth = countOfBooth;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(LocalTime openTime) {
        this.openTime = openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalTime closeTime) {
        this.closeTime = closeTime;
    }

    @Override
    public UUID getKey() {
        return centreId;
    }

}
