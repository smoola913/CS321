package com.cs321;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class UnitTests {

    // Workflow

    
      
    // Tests that the workflow is created from DataEntry's createWorkflowItem
    // method.
    
    // @Test
    // public void WorkflowCreatedTest() {
    //     DivorceReport report = new DivorceReport("User", "Spouse", "Status");
        
    //     Workflow workflow = dataEntry .createWorkflowItem(report);
        
    //     assertNotNull(workflow);
    // }
     /*
     * // Tests that the workflow is returned from Review, assumes validation is
     * true
     * // and the workflow object will have Approval as the next step.
     * 
     * @Test
     * public void WorkflowReviewReturnedTest() {
     * Workflow workflow = new Workflow();
     * 
     * DivorceReport report = new DivorceReport("User", "Spouse", "Status");
     * 
     * Review review = new Review(report, true, workflow);
     * 
     * review.nextStep(review.getValidated());
     * 
     * assertEquals("Approval", workflow.getStep());
     * }
     * 
     * // Tests that the workflow is returned from Approval when not validated.
     * 
     * @Test
     * public void WorkflowApprovalReturnedTest() {
     * Workflow workflow = new Workflow();
     * 
     * DivorceReport report = new DivorceReport("User", "Spouse", "Status");
     * 
     * Approval approval = new Approval(report, false, workflow);
     * 
     * approval.nextStep(approval.getValidated());
     * 
     * assertEquals("Review", workflow.getStep);
     * 
     * }
     * 
     */

    // Tests to ensure that report is equal to the report created in the workflow.
    // @Test
    // public void WorkflowTest() {
    //     DivorceReport report = new DivorceReport("Bob", "Linda", "Status");

    //     Workflow workflow = new Workflow(report, "Review");

    //     assertEquals(report, workflow.getReport());
    // }

    // Divorce Report
    // Tests that the report is created.
    @Test
    public void ReportCreatedTest() {
        DivorceReport report = new DivorceReport("Jeff", "Jane", "Status");

        assertNotNull(report);
    }

    // Tests to ensure that fields are initialized correctly.
    @Test
    public void testGetUserInfo() {

        DivorceReport report = new DivorceReport("Mary", "John", "Status");

        assertEquals("Mary", report.getUserInformation());
        assertEquals("John", report.getSpouseInformation());
        assertEquals("Status", report.getMarriageStatus());
    }

    // Tests if the spouse and the user are the same person.
    /*
     * @Test
     * public void TestSameName() {
     * DivorceReport report = new DivorceReport("Jeff", "Jeff", "Status");
     * 
     * assertNotSame(report.getUserInformation(), report.getSpouseInformation());
     * }
     */

    // Tests if divorce report is created with an empty string.
    @Test
    public void EmptyString() {

        DivorceReport report = new DivorceReport("", "", "");

        assertTrue(report.getUserInformation().isEmpty());
    }

    // Review
    // Tests that review has initialized its values correctly.
    // @Test
    // public void ReviewInitializationTest() {
    //     DivorceReport report = new DivorceReport("Jeff", "Jane", "Status");
    //     // Workflow workflow = new Workflow(report, "Review");

    //     Review review = new Review(true, workflow);

    //     assertEquals(report, review.getReport());
    //     assertEquals(true, review.getValidated());
    //     assertEquals(workflow, review.getWorkflow());
    // }

    //Workflow Test
    // @Test
    // public void Workflo
}