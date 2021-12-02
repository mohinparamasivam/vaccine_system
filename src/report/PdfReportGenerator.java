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

    public PdfReportGenerator(String fileName, List<? extends Generatable> subjects) {
        super(fileName, subjects);
    }

    @Override
    public void saveReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
