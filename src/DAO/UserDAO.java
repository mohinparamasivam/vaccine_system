/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import java.util.UUID;
import model.People;
import model.Personnel;
import model.User;

/**
 *
 * @author howar
 */
public interface UserDAO {

    public List<User> all();

    public User get(UUID userId);

    public void updateUserPassword(UUID userId, String newPassword);

    public boolean canLogin(String username, String password);

    public Personnel getPersonnel(UUID userId);

    public People getPeople(UUID userId);

}
