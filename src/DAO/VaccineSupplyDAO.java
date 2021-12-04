/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import java.util.UUID;
import model.Centre;
import model.VaccineSupply;

/**
 *
 * @author howar
 */
public interface VaccineSupplyDAO extends BaseRootDAO<VaccineSupply> {

    public VaccineSupply findVaccineSupplyByBatchNo(String batchNo);

    public List<VaccineSupply> findVaccineSupplyByCentre(UUID centreId);

    public boolean isDuplicatedBatchNo(String batchNo);

    public boolean canDeleteVaccineSupply(UUID vaccineId);

    public void create(VaccineSupply t, Centre centre);
}
