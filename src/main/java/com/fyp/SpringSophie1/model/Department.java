package com.fyp.SpringSophie1.model;

public class Department {
private String deptName;
    private int staffID;
    private String fName;
    private String sName;

    public Department(int staffID, String fName, String sName) {
        this.staffID = staffID;
        this.fName = fName;
        this.sName = sName;
    }

    public Department() {

    }

    //Getters and Setters for all attributes

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
