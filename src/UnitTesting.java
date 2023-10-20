package src;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UnitTesting {
    /*
     * Workflow class tests
     */
    @Test
    public void WorkFlowTest1(){
        String name = "Bob";
        String spouse = "Linda";
        DivorceReport report = new DivorceReport(name, spouse);
        Workflow workflow = new Workflow(report);

        assertEquals(report, workflow.getReport());
    }

    /*
     * Divorce Report class tests
     */
    @Test
    public void DivorceReportTest0(){
        
        DivorceReport dr = new DivorceReport("Mary", "John");

        assertEquals("Mary", dr.getUsersName());
        assertEquals("John", dr.getSpousesName());
    }

    @Test
    public void DivorceReportTest1(){
        
        DivorceReport dr = new DivorceReport("Jeff", "Hellen");

        assertEquals("Jeff", dr.getUsersName());
        assertEquals("Hellen", dr.getSpousesName());
    }

    @Test
    public void DivorceReportTest2(){
        
        DivorceReport dr = new DivorceReport("", "");

        assertEquals("", dr.getUsersName());
        assertEquals("", dr.getSpousesName());
    }


    /*
     * Review class tests
     */

     @Test
    public void review() {

        Review review = new Review("Bob", true, 1539845);

        assertEquals("Bob", review.getName());
         assertEquals(1539845, review.getID());
         assertTrue(review.getMaritalStatus());
    }


    /*
     * Data Entry class tests
     */

    @Test
    public void dataEntryTest1(){
        DataEntry dataEntry = new DataEntry("Bob", "Lisa", "Marry");

        assertEquals("Bob", dataEntry.getUsersName());
        assertEquals("Lisa", dataEntry.getSpousesName());
        assertEquals("Marry", dataEntry.getAction());
    }

    @Test
    public void dataEntryTest2(){
        DataEntry dataEntry = new DataEntry("Bob", "Lisa", "Divorce");

        assertEquals("Bob", dataEntry.getUsersName());
        assertEquals("Lisa", dataEntry.getSpousesName());
        assertEquals("Divorce", dataEntry.getAction());
    }

    /*
     * Approval class tests
     */

    public static void main(String[] args){

    }

}