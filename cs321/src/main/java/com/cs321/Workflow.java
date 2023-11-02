package com.cs321;

public class Workflow {
    private DivorceReport report;
    private String step;

    public Workflow(DivorceReport report, String step) {
        this.report = report;
        this.step = step;
    }

    public DivorceReport getReport() {
        return report;
    }

    public void setReport(DivorceReport report) {
        this.report = report;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public void callNextStep(String step) {
        // Not needed for Sprint 1.
    }
}
