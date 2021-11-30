/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import java.util.UUID;
import model.User;

/**
 *
 * @author howar
 */
public interface UserDAO {

    public List<User> all();

    public List<User> allPersonnelUsers();

    public List<User> allPeopleUsers();

    public User get(UUID userId);

    public void updateUserPassword(UUID userId, String newPassword);

    public boolean canPeopleLogin(String username, String password);

    public boolean canPersonnelLogin(String username, String password);

    public boolean canLogin(String username, String password);

}
