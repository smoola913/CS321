package com.cs321;

// Second workflow step that involves the review and editing of a given workflow's divorce report.
public class Review {
    public DivorceReport report;
    private Boolean validated;

    public Review(Boolean validated, DivorceReport report) {
        this.validated = validated;
        this.report = report;
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

    public void showReviewScreen() {
        // Not needed for Sprint 1.
    }

    public void nextStep(Boolean validated) {
        // Not needed for Sprint 1.
    }
}
