/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author howar
 */
public class PoepleFactory {

    public static People createCitizen(LocalDate dob, People.Gender gender, String peopleId, String address, String username, String name, String password) {
        People citizen = new Citizen(dob, gender, peopleId, address, username, name, password);
        return citizen;
    }

    public static People createNonCitizen(LocalDate dob, People.Gender gender, String peopleId, String address, String country, String username, String name, String password) {
        People nonCitizen = new NonCitizen(dob, gender, peopleId, address, country, username, name, password);
        return nonCitizen;
    }

}
