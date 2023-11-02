package com.cs321;

public class DivorceReport {
    private String userInformation;
    private String spouseInformation;
    private String marriageStatus;

    public DivorceReport(String userInformation, String spouseInformation, String marriageStatus) {
        this.userInformation = userInformation;
        this.spouseInformation = spouseInformation;
        this.marriageStatus = marriageStatus;
    }

    public String getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(String userInformation) {
        this.userInformation = userInformation;
    }

    public String getSpouseInformation() {
        return spouseInformation;
    }

    public void setSpouseInformation(String spouseInformation) {
        this.spouseInformation = spouseInformation;
    }

    public String getMarriageStatus() {
        return marriageStatus;
    }

    public void setMarriageStatus(String marriageStatus) {
        this.marriageStatus = marriageStatus;
    }
}