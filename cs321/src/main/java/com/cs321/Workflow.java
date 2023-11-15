package com.cs321;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

enum wfStep{
    REVIEW, APPROVAL
}

public class Workflow {
    HashMap<wfStep, Queue<DivorceReport>> wfTable = new HashMap<>();

    /**
     * createWorkflowItem will take a divorce report as a parameter and add it to the hashmap. 
     * The associated key is wfStep.REVIEW.
     * @param dr
     */
    public void createWorkflowItem(DivorceReport dr){
        if (!wfTable.containsKey(wfStep.REVIEW)) {
            wfTable.put(wfStep.REVIEW, new LinkedList<>());
        }
        wfTable.get(wfStep.REVIEW).add(dr);
    }

    /**
     * getReviewitem() is called from the review screen, and polls the REVIEW queue from the map to get the next review item.
     * @return
     */
    public DivorceReport getReviewItem() {
        return wfTable.get(wfStep.REVIEW).poll();
    }

    /**
     * puReviewedItem is called from review
     * It puts the reviewed divorce report into the hasmap with the wfStep.APPROVAL key. 
     * @param dr
     */
    public void putReviewedItem(DivorceReport dr) {
        if (!wfTable.containsKey(wfStep.APPROVAL)) {
            wfTable.put(wfStep.APPROVAL, new LinkedList<>());
        }
        wfTable.get(wfStep.APPROVAL).add(dr);
    }

    /**
     * getAppprovalItem will poll the approvalQueue of the workflow table to get a divorce report to approve.
     * @return
     */
    public DivorceReport getApprovalItem() {
        return wfTable.get(wfStep.APPROVAL).poll();
    }  
}
