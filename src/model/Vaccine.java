/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author howar
 */
abstract class Vaccine {

    private String name;
    private int dosageNeeded;
    private int daysNeeded;

    public Vaccine(String name, int dosageNeeded, int daysNeeded) {
        this.name = name;
        this.dosageNeeded = dosageNeeded;
        this.daysNeeded = daysNeeded;
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

}
