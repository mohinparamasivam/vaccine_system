/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.itextpdf.io.font.constants.StandardFonts;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author howar
 */
public class Settings {

    private static final String CONFIG_PATH = "config.properties";
    private static final Logger logger = LogManager.getLogger(Settings.class);

    private static void createConfigFileIfNotExist() {
        File file = new File(CONFIG_PATH);
        if (!file.exists() && !file.isFile()) {
            logger.warn("Config file not found, creating new default config");
            try {
                file.createNewFile();
            } catch (IOException ex) {
                logger.fatal(ex.getStackTrace());
            }
        }
    }

    public static String getProperty(String key, String defaultValue) {

        try (InputStream input = new FileInputStream(CONFIG_PATH)) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            return prop.getProperty(key, defaultValue);
        } catch (IOException ex) {
        }
        return defaultValue;
    }

    public static void createDefaultSettings() {
        createConfigFileIfNotExist();
        try (
                OutputStream output = new FileOutputStream(CONFIG_PATH)) {

            Properties prop = new Properties();

            // set the properties value
            prop.setProperty("db.folder", "data/");
            prop.setProperty("report.folder", "report/");
            prop.setProperty("report.header-font", StandardFonts.TIMES_BOLD);
            prop.setProperty("report.content-font", StandardFonts.TIMES_ROMAN);

            // save properties to project root folder
            prop.store(output, null);

            logger.info("Config created: {}", prop);

        } catch (IOException ex) {
            logger.fatal(ex.getStackTrace());
        }
    }

}
