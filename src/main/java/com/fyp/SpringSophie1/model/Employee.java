package com.fyp.SpringSophie1.model;


public class Employee {

    private String staffID;
    private String fName;
    private String sName;
    private String role;
    private String password;





    //Parameterised Constructors
    public Employee(String staffID, String fName, String sName, String role, String password) {
        this.staffID = staffID;
        this.fName = fName;
        this.sName = sName;
        this.role = role;
        this.password = password;
    }

    public Employee() {

    }

    // Getters and setters for all attributes
    public String getStaffID() { return staffID; }
    public void setStaffID(String staffID) { this.staffID = staffID; }
    public String getfName() { return fName; }
    public void setfName(String fName) { this.fName = fName; }
    public String getsName() { return sName; }
    public void setsName(String sName) { this.sName = sName; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

}
