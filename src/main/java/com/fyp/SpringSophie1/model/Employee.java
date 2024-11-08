package com.fyp.SpringSophie1.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staffID;
    private String fName;
    private String sName;
    private String role;
    private String password;

    // Define the One-to-Many relationship with Task
    @OneToMany(mappedBy = "assignedEmployee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Task> tasks;





    //Parameterised Constructors
    public Employee(int staffID, String fName, String sName, String role, String password) {
        this.staffID = staffID;
        this.fName = fName;
        this.sName = sName;
        this.role = role;
        this.password = password;
    }

    public Employee() {

    }

    // Getters and setters for all attributes
    public int getStaffID() { return staffID; }
    public void setStaffID(int staffID) { this.staffID = staffID; }
    public String getfName() { return fName; }
    public void setfName(String fName) { this.fName = fName; }
    public String getsName() { return sName; }
    public void setsName(String sName) { this.sName = sName; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public List<Task> getTasks() { return tasks; }
    public void setTasks(List<Task> tasks) { this.tasks = tasks; }

}
