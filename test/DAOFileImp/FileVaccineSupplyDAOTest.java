/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAOFileImp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author howar
 */
public class FileVaccineSupplyDAOTest {

    public FileVaccineSupplyDAOTest() {
    }

    @Test
    public void test() {
        boolean result = FileVaccineSupplyDAO.getInstance().isDuplicatedBatchNo("VS201");
        assertEquals(true, result);
    }

}
