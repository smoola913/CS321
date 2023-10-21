package src;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class UnitTesting {

    // Workflow

    // Tests that the workflow is created from DataEntry's createWorkflowItem
    // method.
    @Test
    public void WorkflowCreatedTest() {
        DataEntry dataEntry = new DataEntry();

        DivorceReport report = new DivorceReport("User", "Spouse", "Status");

        Workflow workflow = dataEntry.createWorkflowItem(report);

        assertNotNull(workflow);
    }

    // Tests that the workflow is returned from Review
    @Test
    public void WorkflowReviewReturnedTest() {
        Workflow workflow = new Workflow();

        DivorceReport report = new DivorceReport("User", "Spouse", "Status");

        Review review = new Review(report, true, workflow);

        review.nextStep(review.getValidated());

        assertEquals("Approval", workflow.getStep());
    }

    // Tests that the workflow is returned from Approval if not validated
    @Test
    public void WorkflowApprovalReturnedTest() {
        Workflow workflow = new Workflow();

        DivorceReport report = new DivorceReport("User", "Spouse", "Status");

        Approval approval = new Approval(report, false, workflow);

        approval.nextStep(approval.getValidated());

        assertEquals("Review", workflow.getStep);

    }

    // Divorce Report
    @Test
    public void ReportCreatedTest() {
        // create report
        DivorceReport report = new DivorceReport();

        assertTrue(checkReport(report));
        // assert whether review was created
    }

    @Test
    public void ReportReceivedTest() {
        // create review
        DivorceReport report = new DivorceReport();
        Boolean validated = checkReport(report);

        // send review
        nextStep(validated);

        // assert whether review was received
        assertEquals(report, getDivorceReport(workflow));

    }
}