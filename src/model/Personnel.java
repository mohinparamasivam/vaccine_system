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

    public Personnel(String username, String name, String password) {
        super(username, name, password);
    }

    @Override
    public String toString() {
        return "Personnel{" + "userId=" + this.getUserId() + ", username=" + this.getUsername() + ", name=" + this.getName() + ", password=" + this.getPassword() + '}';
    }


}
