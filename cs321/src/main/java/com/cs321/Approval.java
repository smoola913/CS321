package com.cs321;

public class Approval {
    public DivorceReport report;

    public Approval(){
        setReport(null);
    }

    public Approval(DivorceReport report){
        setReport(report);
    }

    public DivorceReport getReport(){
        return report;
    }

    public void setReport(DivorceReport report){
        this.report = report;
    }
}