package com.fyp.SpringSophie1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Task {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskID;
    private String taskName;

    @ManyToOne // Many tasks can be assigned to one employee
    @JoinColumn(name = "username", nullable = false) // username is the foreign key in the Task table
    private Employee assignedEmployee;



    public Task(int taskID, String taskName) {
        this.taskID = taskID;
        this.taskName = taskName;
    }
    public Task() {

    }

    // Getters and setters for all attributes
    public int getTaskID() { return taskID; }
    public void setTaskID(int taskID) { this.taskID = taskID; }
    public String getTaskName() { return taskName; }
    public void setTaskName(String taskName) { this.taskName = taskName; }
    public Employee getAssignedEmployee() { return assignedEmployee; }
    public void setAssignedEmployee(Employee assignedEmployee) { this.assignedEmployee = assignedEmployee; }

}
