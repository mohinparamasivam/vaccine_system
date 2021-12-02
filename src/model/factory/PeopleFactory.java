/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.factory;

import java.time.LocalDate;
import model.Citizen;
import model.NonCitizen;
import model.People;

/**
 *
 * @author howar
 */
public class PeopleFactory {

    public static People createCitizen(LocalDate dob, People.Gender gender, String peopleId, String address, String username, String name, String password, int age, String contact) {
        People citizen = new Citizen(dob, gender, peopleId, address, username, name, password, age, contact);
        return citizen;
    }

    public static People createMaleCitizen(LocalDate dob, String peopleId, String address, String username, String name, String password, int age, String contact) {
        People citizen = new Citizen(dob, People.Gender.MALE, peopleId, address, username, name, password, age, contact);
        return citizen;
    }

    public static People createFemaleCitizen(LocalDate dob, String peopleId, String address, String username, String name, String password, int age, String contact) {
        People citizen = new Citizen(dob, People.Gender.FEMALE, peopleId, address, username, name, password, age, contact);
        return citizen;
    }

    public static People createNonCitizen(LocalDate dob, People.Gender gender, String peopleId, String address, String country, String username, String name, String password, int age, String contact) {
        People nonCitizen = new NonCitizen(dob, gender, peopleId, address, country, username, name, password, age, contact);
        return nonCitizen;
    }

    public static People createMaleNonCitizen(LocalDate dob, String peopleId, String address, String country, String username, String name, String password, int age, String contact) {
        People nonCitizen = new NonCitizen(dob, People.Gender.MALE, peopleId, address, country, username, name, password, age, contact);
        return nonCitizen;
    }

    public static People createFemaleNonCitizen(LocalDate dob, String peopleId, String address, String country, String username, String name, String password, int age, String contact) {
        People nonCitizen = new NonCitizen(dob, People.Gender.FEMALE, peopleId, address, country, username, name, password, age, contact);
        return nonCitizen;
    }

}
