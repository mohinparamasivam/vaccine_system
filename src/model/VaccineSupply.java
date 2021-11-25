/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author howar
 */
public class VaccineSupply {

    private String batchNo;
    private LocalDate supplyDate;
    private Vaccine vaccine;
    private String supplier;
    private int supplyQuantity;
    private int availableQuantity;
    private List<People> accesiblePeopleTypes;

    public VaccineSupply(String batchNo, LocalDate supplyDate, Vaccine vaccine, String supplier, int supplyQuantity, int availableQuantity, List<People> accesiblePeopleTypes) {
        this.batchNo = batchNo;
        this.supplyDate = supplyDate;
        this.vaccine = vaccine;
        this.supplier = supplier;
        this.supplyQuantity = supplyQuantity;
        this.availableQuantity = availableQuantity;
        this.accesiblePeopleTypes = accesiblePeopleTypes;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public LocalDate getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(LocalDate supplyDate) {
        this.supplyDate = supplyDate;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public int getSupplyQuantity() {
        return supplyQuantity;
    }

    public void setSupplyQuantity(int supplyQuantity) {
        this.supplyQuantity = supplyQuantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public List<People> getAccesiblePeopleTypes() {
        return accesiblePeopleTypes;
    }

    public void setAccesiblePeopleTypes(List<People> accesiblePeopleTypes) {
        this.accesiblePeopleTypes = accesiblePeopleTypes;
    }


}
