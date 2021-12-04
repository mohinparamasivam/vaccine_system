/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author howar
 */
public class TxtReportGenerator extends FileReportGenerator {

    public TxtReportGenerator(String fileName, List<? extends Generatable> subjects) {
        super(fileName + ".txt", subjects);
    }


    @Override
    public void saveReport() {
        try (PrintWriter writer = new PrintWriter(new File(this.getFilePath()));) {
            writer.write(this.getRawContent());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
