/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import java.util.List;

/**
 *
 * @author howar
 */
public class PdfReportGenerator extends FileReportGenerator {

    public PdfReportGenerator(String filePath, List<? extends Generatable> subjects) {
        super(filePath, subjects);
    }

//    @Override
//    public void saveReport() {
//        try (PrintWriter writer = new PrintWriter(new File(this.getFilePath()));) {
//            writer.write(this.getContent());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    public void saveReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
