package com.cs321;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

enum wfStep{
    REVIEW, APPROVAL
}

public class Workflow {
    private static HashMap<wfStep, Queue<DivorceReport>> wfTable = new HashMap<>();

    /**
     * createWorkflowItem will take a divorce report as a parameter and add it to the hashmap. 
     * The associated key is wfStep.REVIEW.
     * @param dr
     */
    public static void createWorkflowItem(DivorceReport dr){
        if (!wfTable.containsKey(wfStep.REVIEW)) {
            wfTable.put(wfStep.REVIEW, new LinkedList<>());
        }
        wfTable.get(wfStep.REVIEW).add(dr);
        System.out.println(dr + " has been added to workflow");
    }

    /**
     * getReviewitem() is called from the review screen, and polls the REVIEW queue from the map to get the next review item.
     * @return
     */
    public static DivorceReport getReviewItem() {
        DivorceReport dr = wfTable.get(wfStep.REVIEW).poll();
        System.out.println(dr + " has been removed from workflow");
        return dr;
    }

    /**
     * puReviewedItem is called from review
     * It puts the reviewed divorce report into the hasmap with the wfStep.APPROVAL key. 
     * @param dr
     */
    public static void putReviewedItem(DivorceReport dr) {
        if (!wfTable.containsKey(wfStep.APPROVAL)) {
            wfTable.put(wfStep.APPROVAL, new LinkedList<>());
        }
        wfTable.get(wfStep.APPROVAL).add(dr);
        System.out.println(dr + " has been added to workflow");
    }

    /**
     * getAppprovalItem will poll the approvalQueue of the workflow table to get a divorce report to approve.
     * @return
     */
    public static DivorceReport getApprovalItem() {
        DivorceReport dr = wfTable.get(wfStep.APPROVAL).poll();
        System.out.println(dr + " has been removed from workflow");
        return dr;
    }  
}
