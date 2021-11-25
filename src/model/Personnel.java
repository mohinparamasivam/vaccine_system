/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author howar
 */
public class Personnel extends User {
    private static final Logger logger = LogManager.getLogger(Personnel.class);

    public Personnel(String username, String name, String password) {
        super(username, name, password);
        logger.info("Personnel created successfully: {}", this.getName());
    }

}
