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
public class NonCitizen extends People {

    public NonCitizen(LocalDate dob, Gender gender, String peopleId, String address, String country, String username, String name, String password) {
        super(PeopleType.NON_CITIZEN, dob, gender, peopleId, address, country, username, name, password);
    }

    public NonCitizen(PeopleType peopleType, VaccincationStatus vaccinationStatus, List<Vaccination> vaccinations, LocalDate dob, Gender gender, String peopleId, String address, String country, String username, String name, String password) {
        super(peopleType, vaccinationStatus, vaccinations, dob, gender, peopleId, address, country, username, name, password);
    }

}
