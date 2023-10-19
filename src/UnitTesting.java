package src;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTesting {
    /*
     * Workflow class tests
     */


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

        Review review = new Review();

        review.setName("Bob");

        assertEquals("Bob", review.getName());
        // assertEquals("Boeb", review.getName());
    }


    /*
     * Data Entry class tests
     */


    /*
     * Approval class tests
     */
}