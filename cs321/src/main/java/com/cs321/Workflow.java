package com.cs321;
import java.io.IOException;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

enum wfStep{
    REVIEW, APPROVAL
}

public class Workflow {
    
    private DivorceReport report;
    private String step;

    Queue<DivorceReport> review = new LinkedList<>();
    Queue<DivorceReport> approval = new LinkedList<>();
    HashMap<wfStep, Queue<DivorceReport>> wfTable = new HashMap<>();

    /**
     * 
     * @param report
     * @param step
     */
    
    public void createWorkflowItem(DivorceReport dr){
        if (!wfTable.containsKey(wfStep.REVIEW)) {
            wfTable.put(wfStep.REVIEW, new LinkedList<>());
        }
        wfTable.get(wfStep.REVIEW).add(dr);
    }

    public DivorceReport getReviewItem() {
        return wfTable.get(wfStep.REVIEW).poll();
    }

    public void putReviewedItem(DivorceReport dr) {
        if (!wfTable.containsKey(wfStep.APPROVAL)) {
            wfTable.put(wfStep.APPROVAL, new LinkedList<>());
        }
        wfTable.get(wfStep.APPROVAL).add(dr);
    }

    public DivorceReport getApprovalItem() {
        return wfTable.get(wfStep.APPROVAL).poll();
    }

    public void callNextStep(String step) {
        // Not needed for Sprint 1.
    }    
}
