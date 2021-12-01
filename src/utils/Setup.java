/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author howar
 */
public class Setup {
    public static void main(String[] args) {
        Settings.createDefaultSettings();
        DataFaker.initAllData();
        DataFaker.printAllData();

//        CentreDAO centreDao = FileCentreDAO.getInstance();
//        List<Centre> fullCentreList = centreDao.all();
//        UUID key = null;
//        for (Centre centre : fullCentreList) {
//            System.out.println(centre.getName());
//            key = centre.getKey();
//        }
//
//        System.out.println(key);
////        Centre c1 = centreDao.get(key);
////        System.out.println("The centre name is: " + c1.getName());
////        c1.setName("New Centre Name"); // changed at runtime
////        centreDao.update(key, c1); // store to file
////
////        c1 = centreDao.get(key);
////        System.out.println("The new centre name is: " + c1.getName());
//        centreDao.delete(key);
//        System.out.println("=========after deleting=========");
//        for (Centre centre : centreDao.all()) {
//            System.out.println(centre.getName());
//        }

    }
}
