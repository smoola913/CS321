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

    @Test
    public void WorkflowTest() {
        DivorceReport report = new DivorceReport("Bob", "Linda", "Status");

        Workflow workflow = new Workflow(report, "Review");

        assertEquals(report, workflow.getReport());
    }

    // DivorceReport
    @Test
    public void DivorceReportTest() {

        DivorceReport report = new DivorceReport("Mary", "John", "Status");

        assertEquals("Mary", report.getUserInformation());
        assertEquals("John", report.getSpouseInformation());
        assertEquals("Status", report.getMarriageStatus());
    }

    @Test
    public void DivorceReportTest_1() {

        DivorceReport report = new DivorceReport("Jeff", "Hellen", "Status");

        assertEquals("Jeff", report.getUserInformation());
        assertEquals("Hellen", report.getSpouseInformation());
        assertEquals("Status", report.getMarriageStatus());
    }

    @Test
    public void DivorceReportTest_2() {

        DivorceReport report = new DivorceReport("", "", "");

        assertEquals("", report.getUserInformation());
        assertEquals("", report.getSpouseInformation());
        assertEquals("", report.getMarriageStatus());
    }

    // Review
    @Test
    public void ReviewTest() {

        Review review = new Review("Bob", true, 1539845);

        assertEquals("Bob", review.getName());
        assertEquals(1539845, review.getID());
        assertTrue(review.getMaritalStatus());
    }

    // DataEntry
    @Test
    public void DataEntryTest1() {
        DataEntry dataEntry = new DataEntry("Bob", "Lisa", "Marry");

        assertEquals("Bob", dataEntry.getUserInformation());
        assertEquals("Lisa", dataEntry.getSpouseInformation());
        assertEquals("Marry", dataEntry.getAction());
    }

    @Test
    public void DataEntryTest2() {
        DataEntry dataEntry = new DataEntry("Bob", "Lisa", "Divorce");

        assertEquals("Bob", dataEntry.getUserInformation());
        assertEquals("Lisa", dataEntry.getSpouseInformation());
        assertEquals("Divorce", dataEntry.getAction());
    }
}