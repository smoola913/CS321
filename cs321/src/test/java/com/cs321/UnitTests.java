package com.cs321;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class UnitTests {

    // Workflow

    /*
     * Tests that the createWorkflowItem() function adds a report to the workflow in
     * order, and then the getReviewItem() function removes and returns a report.
     * Uses several reports to test that they are made and retrieved using first-in
     * first-out order.
     */
    @Test
    public void CreateReviewWorkflowItemTest() {
        DivorceReport report = new DivorceReport("a", "b", "c");
        DivorceReport report_one = new DivorceReport("d", "e", "f");
        DivorceReport report_two = new DivorceReport("g", "h", "i");

        Workflow.createWorkflowItem(report);
        Workflow.createWorkflowItem(report_one);
        Workflow.createWorkflowItem(report_two);

        DivorceReport get_report = Workflow.getReviewItem();
        assertNotNull(get_report);
        assertEquals(get_report, report);

        DivorceReport get_report_one = Workflow.getReviewItem();
        assertNotNull(get_report_one);
        assertEquals(get_report_one, report_one);

        DivorceReport get_report_two = Workflow.getReviewItem();
        assertNotNull(get_report_two);
        assertEquals(get_report_two, report_two);
    }

    /*
     * Tests that the returnApprovalItem() function adds a report to the workflow in
     * order, and then the getApprovalItem() function removes and returns a report.
     * Uses several reports to test that they are made and retrieved using first-in
     * first-out order.
     */
    @Test
    public void CreateApprovalWorkflowItemTest() {
        DivorceReport report = new DivorceReport("a", "b", "c");
        DivorceReport report_one = new DivorceReport("d", "e", "f");
        DivorceReport report_two = new DivorceReport("g", "h", "i");

        Workflow.putReviewedItem(report);
        Workflow.putReviewedItem(report_one);
        Workflow.putReviewedItem(report_two);

        DivorceReport get_report = Workflow.getApprovalItem();
        assertNotNull(get_report);
        assertEquals(get_report, report);

        DivorceReport get_report_one = Workflow.getApprovalItem();
        assertNotNull(get_report_one);
        assertEquals(get_report_one, report_one);

        DivorceReport get_report_two = Workflow.getApprovalItem();
        assertNotNull(get_report_two);
        assertEquals(get_report_two, report_two);
    }

    /*
     * Tests that getReviewItem() returns null if there are no review items.
     */
    @Test
    public void NoReviewItemTest() {
        DivorceReport report = Workflow.getReviewItem();

        assertNull(report);
    }

    /*
     * Tests that getApprovalItem() returns null if there are no approval items.
     */
    @Test
    public void NoApprovalItemTest() {
        DivorceReport report = Workflow.getApprovalItem();

        assertNull(report);
    }

    /*
     * Tests that createWorkflowItem() does not add to the review item queue if its
     * report is null. Attempts to retrieve from the review queue to check.
     */
    @Test
    public void CreateReviewWorkflowItemNullTest() {
        Workflow.createWorkflowItem(null);

        DivorceReport report = Workflow.getReviewItem();

        assertNull(report);

    }

    /*
     * Tests that putReviewedItem() does not add to the approval item queue if its
     * report is null. Attempts to retrieve from the approval queue to check.
     */
    @Test
    public void CreateApprovalWorkflowItemNullTest() {
        Workflow.putReviewedItem(null);

        DivorceReport report = Workflow.getApprovalItem();

        assertNull(report);
    }

    // Divorce Report Tests

    /*
     * Tests that the report has been successfully initialized.
     */
    @Test
    public void ReportCreatedTest() {
        DivorceReport report = new DivorceReport("Jeff", "Jane", "Status");

        assertNotNull(report);
    }

    // Tests that the report's fields have been successfully initialized.
    @Test
    public void GetReportInfoTest() {

        DivorceReport report = new DivorceReport("Mary", "John", "Status");

        assertEquals("Mary", report.getUserInformation());
        assertEquals("John", report.getSpouseInformation());
        assertEquals("Status", report.getMarriageStatus());
    }
}