package com.cs321;

public class DivorceReport{
    String username;
    String spouseName;
    String status;
    public DivorceReport(String username, String spouseName, String status){
        this.username = username;
        this.spouseName = spouseName;
        this.status = status;
    }

    String getfName(){
        return this.username;
    }

    public String toString(){
        return "DivorceReport Object: {Username: " + username +  ", Spouses Name: " + spouseName  + ", Current Status: " + status  + "}\n";
    }
}