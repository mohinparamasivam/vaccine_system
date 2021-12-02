/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author howar
 */
public class VaccineSupply implements Model {

    private final UUID supplyId;
    private String batchNo;
    private LocalDate supplyDate;
    private Vaccine vaccine;
    private String supplier;
    private int supplyQuantity;
    private int availableQuantity;
    private List<People.PeopleType> accesiblePeopleTypes;

    public VaccineSupply(String batchNo, LocalDate supplyDate, Vaccine vaccine, String supplier, int supplyQuantity, int availableQuantity, List<People.PeopleType> accesiblePeopleTypes) {
        this.supplyId = UUID.randomUUID();
        this.batchNo = batchNo;
        this.supplyDate = supplyDate;
        this.vaccine = vaccine;
        this.supplier = supplier;
        this.supplyQuantity = supplyQuantity;
        this.availableQuantity = availableQuantity;
        this.accesiblePeopleTypes = accesiblePeopleTypes;
    }

    public static List<People.PeopleType> getAccessOnlyCitizen() {
        List<People.PeopleType> onlyCitizen = new ArrayList<>();
        onlyCitizen.add(People.PeopleType.CITIZEN);
        return onlyCitizen;
    }

    public static List<People.PeopleType> getAccessOnlyNonCitizen() {
        List<People.PeopleType> onlyNonCitizen = new ArrayList<>();
        onlyNonCitizen.add(People.PeopleType.NON_CITIZEN);
        return onlyNonCitizen;
    }

    public static List<People.PeopleType> getAccessCitizenAndNonCitizen() {
        List<People.PeopleType> citizenAndNonCitizen = new ArrayList<>();
        citizenAndNonCitizen.add(People.PeopleType.CITIZEN);
        citizenAndNonCitizen.add(People.PeopleType.NON_CITIZEN);
        return citizenAndNonCitizen;
    }

    @Override
    public String toString() {
        return "VaccineSupply{" + "supplyId=" + supplyId + ", batchNo=" + batchNo + ", supplyDate=" + supplyDate + ", vaccine=" + vaccine + ", supplier=" + supplier + ", supplyQuantity=" + supplyQuantity + ", availableQuantity=" + availableQuantity + ", accesiblePeopleTypes=" + accesiblePeopleTypes + '}';
    }

    @Override
    public UUID getKey() {
        return supplyId;
    }

    public UUID getSupplyId() {
        return supplyId;
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

    public List<People.PeopleType> getAccesiblePeopleTypes() {
        return accesiblePeopleTypes;
    }

    public void setAccesiblePeopleTypes(List<People.PeopleType> accesiblePeopleTypes) {
        this.accesiblePeopleTypes = accesiblePeopleTypes;
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
        final VaccineSupply other = (VaccineSupply) obj;
        if (!Objects.equals(this.supplyId, other.supplyId)) {
            return false;
        }
        return true;
    }


}
