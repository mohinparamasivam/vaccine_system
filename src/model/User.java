/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author howar
 */
public abstract class User implements Serializable {

    private final String userId;
    private String username;
    private String password;
    private static final Logger logger = LogManager.getLogger(User.class);


    public User(String username, String password) {
        this.userId = UUID.randomUUID().toString();
        this.username = username;
        this.password = password;
        logger.info("info!");
        logger.error("error!");
        logger.debug("debug!");
        logger.error("User created");
    }

}
