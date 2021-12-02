/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import java.util.List;
import utils.Settings;

/**
 *
 * @author howar
 */
abstract class FileReportGenerator extends ReportGenerator {

    private String fileFolder = Settings.getProperty("report.folder", "report/");
    private String fileName;
    private String filePath;

    public FileReportGenerator(String fileName, List<? extends Generatable> subjects) {
        super(subjects);
        this.fileName = fileName;
        this.filePath = fileFolder + fileName;
        utils.Util.createFolderIfNotExist(fileFolder);
    }


    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileFolder() {
        return fileFolder;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    public abstract void saveReport();

}
