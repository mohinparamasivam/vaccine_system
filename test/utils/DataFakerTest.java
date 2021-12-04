/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package utils;

import org.junit.Test;

/**
 *
 * @author howar
 */
public class DataFakerTest {

    public DataFakerTest() {
    }

    @Test
    public void test() {
        DataFaker.initAllData();
//        DataFaker.resetPeople();
//        DataFaker.resetPersonnel();
//        DataFaker.resetCentre();
//        DataFaker.resetVaccine();
//        DataFaker.resetVaccineSupply();
//        DataFaker.resetAppointmentAndVaccination();
//
//        List<FileBaseDAO> list = new ArrayList<>();
//        list.add(FilePeopleDAO.getInstance());
//        list.add(FilePersonnelDAO.getInstance());
//        list.add(FileCentreDAO.getInstance());
//        list.add(FileVaccineDAO.getInstance());
//        list.add(FileVaccineSupplyDAO.getInstance());
//        list.add(FileAppointmentDAO.getInstance());
//        list.add(FileVaccinationDAO.getInstance());
//
//        System.out.println("==================");
//        for (FileBaseDAO fileBaseDAO : list) {
//            DataFaker.printAll(fileBaseDAO.all());
//            System.out.println("");
//        }
//        DataFaker.resetPersonnel();
//        DataFaker.printAll(FilePersonnelDAO.getInstance().all());
//        for (People p : peopleDao.all()) {
//            System.out.println(p.getUsername() + "\t" + p.getName() + "\t" + p.getCountry() + "\t" + p.getPassword());
//        }
//
//        System.out.println("==============================================");
//
//        DataFaker.resetPersonnel();
//        PersonnelDAO personnelDao = FilePersonnelDAO.getInstance();
//        for (Personnel p : personnelDao.all()) {
//            System.out.println(p.getUsername() + "\t" + p.getName() + "\t" + p.getPassword());
//        }
//
//        System.out.println("==============================================");
//
//        DataFaker.resetPersonnel();
//        Centre centreDAO = FilePersonnelDAO.getInstance();
//        for (Personnel p : personnelDao.all()) {
//            System.out.println(p.getUsername() + "\t" + p.getName() + "\t" + p.getPassword());
//        }
    }


}
