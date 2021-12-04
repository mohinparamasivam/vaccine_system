/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package report;

import DAOFileImp.FilePeopleDAO;
import model.People;
import org.junit.Test;

/**
 *
 * @author howar
 */
public class PdfReportGeneratorTest {

    public PdfReportGeneratorTest() {
    }

    /**
     * Test of saveReport method, of class PdfReportGenerator.
     */
    @Test
    public void testSaveReport() {
        People test1 = FilePeopleDAO.getInstance().all().get(0);
        FileReportGenerator pdfGenerator = new PdfReportGenerator("testing_report", test1.getVaccinationReportGeneratables());
        FileReportGenerator txtGenerator = new TxtReportGenerator("testing_report", test1.getVaccinationReportGeneratables());
        pdfGenerator.saveReport(); // create a pdf report
        txtGenerator.saveReport(); // create a txt report
    }

}
