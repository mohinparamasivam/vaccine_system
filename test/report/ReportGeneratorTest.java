/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package report;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.People;
import model.PeopleFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 *
 * @author howar
 */
public class ReportGeneratorTest {

    public ReportGeneratorTest() {
    }

    /**
     * Test of getSubjects method, of class ReportGenerator.
     */
    @Test
    public void testGetSubjects() {
    }

    /**
     * Test of setSubjects method, of class ReportGenerator.
     */
    @Test
    public void testSetSubjects() {
    }

    /**
     * Test of getRawContent method, of class ReportGenerator.
     */
    @Test
    public void testGetRawContent() {
        System.out.println("getRawContent");
        People testModel = PeopleFactory.createMaleCitizen(LocalDate.MIN, "123", "lot123", "Jerry", "Jerry Sung", "123");
        List<People> subjects = new ArrayList<>();
        subjects.add(testModel);
        ReportGenerator instance = new ReportGenerator(subjects);
        Logger logger = LogManager.getLogger(ReportGeneratorTest.class);
        logger.debug(instance.getRawContent());

    }

    /**
     * Test of printReport method, of class ReportGenerator.
     */
    @Test
    public void testPrintReport() {
    }

}
