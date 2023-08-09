package com.examly.springapp;

import java.util.List;

public interface TaskService {
    List<TaskModel> getAllTasks();
    TaskModel getTaskById(String id);
}