/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import model.VaccineSupply;

/**
 *
 * @author howar
 */
public interface VaccineSupplyDAO extends BaseRootDAO<VaccineSupply> {

    public VaccineSupply findVaccineSupplyByBatchNo(String batchNo);
}
