package com.cs321;

import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

enum step {
    REVIEW, APPROVAL
}

public class Workflow {
    private static HashMap<step, Queue<DivorceReport>> workflowTable = new HashMap<>();

    /**
     * Takes a divorce report as a parameter
     * and adds it to the review step queue.
     * 
     * @param divorceReport
     */
    public static void createWorkflowItem(DivorceReport divorceReport) {
        if (divorceReport != null) {
            if (!workflowTable.containsKey(step.REVIEW)) {
                workflowTable.put(step.REVIEW, new LinkedList<>());
            }

            workflowTable.get(step.REVIEW).add(divorceReport);
            System.out.println(divorceReport + " has been added to workflow.");
        }
    }

    /**
     * This method is called from the review screen.
     * It polls the review step queue from the workflow table to get the next review
     * item.
     * 
     * @return
     */
    public static DivorceReport getReviewItem() {
        if (!workflowTable.isEmpty()) {
            if (!workflowTable.get(step.REVIEW).isEmpty()) {
                DivorceReport divorceReport = workflowTable.get(step.REVIEW).poll();
                System.out.println(divorceReport + " has been removed from workflow.");
                return divorceReport;
            }
        }

        return null;
    }

    /**
     * This method is called from the review screen.
     * It adds the reviewed divorce report into the approval step queue.
     * 
     * @param divorceReport
     */
    public static void putReviewedItem(DivorceReport divorceReport) {
        if (divorceReport != null) {
            if (!workflowTable.containsKey(step.APPROVAL)) {
                workflowTable.put(step.APPROVAL, new LinkedList<>());
            }

            workflowTable.get(step.APPROVAL).add(divorceReport);
            System.out.println(divorceReport + " has been added to workflow.");
        }
    }

    /**
     * This method is called from the approval screen.
     * It polls the approval step queue of the workflow table to get the next
     * approval item.
     * 
     * @return
     */
    public static DivorceReport getApprovalItem() {
        if (!workflowTable.isEmpty()) {
            if (!workflowTable.get(step.APPROVAL).isEmpty()) {
                DivorceReport divorceReport = workflowTable.get(step.APPROVAL).poll();
                System.out.println(divorceReport + " has been removed from workflow.");

                return divorceReport;
            }
        }

        return null;
    }
}
