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
public class TxtReportGeneratorTest {

    public TxtReportGeneratorTest() {
    }

    /**
     * Test of saveReport method, of class TxtReportGenerator.
     */
    @Test
    public void testSaveReport() {
        People test1 = FilePeopleDAO.getInstance().all().get(0);
        FileReportGenerator txtReportGenerator = new TxtReportGenerator("testing_report_txt", test1.getVaccinationReportGeneratables());
        txtReportGenerator.saveReport();
        txtReportGenerator.printReport();
    }

}
