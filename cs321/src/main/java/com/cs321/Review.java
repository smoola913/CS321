package com.cs321;

public class Review {
    private DivorceReport report;
    private Boolean validated;

    private Workflow workflow;

    public Review(DivorceReport report, Boolean validated, Workflow workflow) {
        this.report = report;
        this.validated = validated;
        this.workflow = workflow;
    }

    public DivorceReport getReport() {
        return report;
    }

    public void setReport(DivorceReport report) {
        this.report = report;
    }

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }

    public Workflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(Workflow workflow) {
        this.workflow = workflow;
    }

    public void showReviewScreen() {

    }

    public void nextStep(Boolean validated) {
        // Not needed for Sprint 1.
    }
}
