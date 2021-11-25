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
public class Vaccination implements Generatable {

    private LocalDateTime time;
    private Centre centre;
    private VaccineSupply supply;

    public Vaccination(LocalDateTime time, Centre centre, VaccineSupply supply) {
        this.time = time;
        this.centre = centre;
        this.supply = supply;
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

    public VaccineSupply getSupply() {
        return supply;
    }

    public void setSupply(VaccineSupply supply) {
        this.supply = supply;
    }

    @Override
    public String getGenerateContent() {
        StringBuilder strb = new StringBuilder("Vaccination");
        StringBuilder seperator = new StringBuilder("===========================================================");
        strb.append(System.getProperty("line.separator"));
        strb.append(seperator);
        strb.append(System.getProperty("line.separator"));
        strb.append("Date of Vaccination: \t");
        strb.append(this.time);
        strb.append(System.getProperty("line.separator"));
        strb.append("Vaccination Centre: \t");
        strb.append(this.centre.getName());
        strb.append(System.getProperty("line.separator"));
        strb.append("Vaccine Name: \t");
        strb.append(this.supply.getVaccine().getName());
        strb.append(System.getProperty("line.separator"));
        strb.append("Vaccine Supplier: \t");
        strb.append(this.supply.getSupplier());
        strb.append(System.getProperty("line.separator"));
        strb.append("Batch No.: \t");
        strb.append(this.supply.getBatchNo());
        strb.append(System.getProperty("line.separator"));

        return strb.toString();
    }

}
