/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author howar
 */
public class Centre {

    private List<VaccineSupply> vaccineSupplies;
    private String name;
    private int countOfBooth;
    private LocalTime openTime;
    private LocalTime closeTime;

    public Centre(List<VaccineSupply> vaccineSupplies, String name, int countOfBooth, LocalTime openTime, LocalTime closeTime) {
        this.vaccineSupplies = vaccineSupplies;
        this.name = name;
        this.countOfBooth = countOfBooth;
        this.openTime = openTime;
        this.closeTime = closeTime;
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


}
