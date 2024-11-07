package com.fyp.SpringSophie1.model;


public class Task {

    private int taskID;
    private String taskName;



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

}
