/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.util.UUID;
import report.Generatable;
import report.ReportGenerator;

/**
 *
 * @author howar
 */
public class Vaccination implements Generatable, Model {

    private final UUID vaccinationId;
    private LocalDateTime time;
    private Centre centre;
    private VaccineSupply supply;

    public Vaccination(LocalDateTime time, Centre centre, VaccineSupply supply) {
        this.vaccinationId = UUID.randomUUID();
        this.time = time;
        this.centre = centre;
        this.supply = supply;
    }

    @Override
    public String toString() {
        return "Vaccination{" + "vaccinationId=" + vaccinationId + ", time=" + time + ", centre=" + centre + ", supply=" + supply + '}';
    }



    @Override
    public UUID getKey() {
        return vaccinationId;
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
    public String getGenerateTitle() {
        return "Vaccination";
    }

    @Override
    public String getGenerateContent() {
        StringBuilder strb = new StringBuilder();
        String lineBreak = ReportGenerator.LINE_SEPERATOR;

        strb.append(lineBreak);
        strb.append("Date of Vaccination: \t");
        strb.append(this.time);
        strb.append(lineBreak);
        strb.append("Vaccination Centre: \t");
        strb.append(this.centre.getName());
        strb.append(lineBreak);
        strb.append("Vaccine Name: \t");
        strb.append(this.supply.getVaccine().getName());
        strb.append(lineBreak);
        strb.append("Vaccine Supplier: \t");
        strb.append(this.supply.getSupplier());
        strb.append(lineBreak);
        strb.append("Batch No.: \t");
        strb.append(this.supply.getBatchNo());

        return strb.toString();
    }

}
