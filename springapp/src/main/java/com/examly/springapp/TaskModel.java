package com.examly.springapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="tasks")
public class TaskModel {
	
	@Id
    @Column(name="taskId")
	private String taskId;
    @Column(name="taskHolderName")
	private String taskHolderName;
    @Column(name="taskDate")
	private String taskDate;
    @Column(name="taskName")
	private String taskName;
    @Column(name="taskStatus")
	private String taskStatus;
	
	public TaskModel(String taskId, String taskHolderName, String taskDate, String taskName, String taskStatus) {
		super();
		this.taskId = taskId;
		this.taskHolderName = taskHolderName;
		this.taskDate = taskDate;
		this.taskName = taskName;
		this.taskStatus = taskStatus;
	}
	public TaskModel() {
		
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskHolderName() {
		return taskHolderName;
	}
	public void setTaskHolderName(String taskHolderName) {
		this.taskHolderName = taskHolderName;
	}
	public String getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	
	
	
	

}