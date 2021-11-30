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
abstract class FileReportGenerator extends ReportGenerator {

    private String filePath;

    public FileReportGenerator(String filePath, List<? extends Generatable> subjects) {
        super(subjects);
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public abstract void saveReport();

}
