/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

/**
 *
 * @author howar
 */
public class EmptyVaccination implements Generatable {

    @Override
    public String getGenerateTitle() {
        return "Incomplete Vaccination";
    }

    @Override
    public String getGenerateContent() {
        return "Vaccination not completed.";
    }

}
