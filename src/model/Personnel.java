/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author howar
 */
public class Personnel extends User {

    public Personnel(String username, String password) {
        super(username, password);
    }
    public static void main(String[] args) {
        User nes = new Personnel("jerry", "123");
    }
}
