/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.File;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author howar
 */
public class Util {

    public static String capitalizeFirstLetter(String word) {
        String w = word.toLowerCase();
        return w.substring(0, 1).toUpperCase() + w.substring(1);
    }

    public static void emptyTableModel(DefaultTableModel model) {
        model.setRowCount(0);
    }

    public static void createFolderIfNotExist(String folderPath) {
        File directory = new File(folderPath);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public static String convertStringToHtmlString(String content) {
        StringBuilder c = new StringBuilder("<html>\r\n");
        c.append(content.replaceAll("\n", "<br>\r\n"));
        c.append("</html>");
        return c.toString();
    }
}
