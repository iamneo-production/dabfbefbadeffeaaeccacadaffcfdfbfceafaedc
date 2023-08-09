package com.examly.springapp;

import java.util.List;

public interface TaskServiceImpl {
    List<TaskModel> getAllTasks();
    TaskModel getTaskById(String id);
}