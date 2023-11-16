package com.cs321;

// Second workflow step that involves the review and editing of a given workflow's divorce report.
public class Review {
    private DivorceReport report;
    private Boolean validated;
    private Workflow workflow;

    public Review(Boolean validated, Workflow workflow) {
        this.validated = validated;
        this.workflow = workflow;
        // this.report = workflow.getReport();
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
        // Not needed for Sprint 1.
    }

    public void nextStep(Boolean validated) {
        // Not needed for Sprint 1.
    }
}
