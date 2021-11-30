/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author howar
 */
public abstract class User implements Model {
    private final UUID userId;
    private String username;
    private String name;
    private String password;

    @Override
    public UUID getKey() {
        return userId;
    }

    public User(String username, String name, String password) {
        this.userId = UUID.randomUUID();
        this.username = username;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", username=" + username + ", name=" + name + ", password=" + password + '}';
    }


    public UUID getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.userId, other.userId)) {
            return false;
        }
        return true;
    }



}
