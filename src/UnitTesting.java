package src;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UnitTesting {

    public Workflow workflow;
    /*
     * Workflow object tests
     */

    @Test
    public void ReportCreatedTest() {
        //create report
        DivorceReport report = new DivorceReport();

        assertTrue(checkReport(report));
        //assert whether review was created
    }

    @Test
    public void WorkflowCreatedTest(){
        //create workflow

        //assert whether workflow was created
    }

    /*
     * Business object tests
     */

    @Test
    public void ReportReceivedTest(){
        //create review
        DivorceReport report = new DivorceReport();
        Boolean validated = checkReport(report);

        //send review
        nextStep(validated);

        //assert whether review was received
        assertEquals(report, getDivorceReport(workflow));

    }
}