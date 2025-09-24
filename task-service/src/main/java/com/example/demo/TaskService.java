package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
private final TaskRepository repo;

public TaskService(TaskRepository repo) {
    this.repo = repo;
}

public List<Task> getAllTasks() {
    return repo.findAll();
}

public Task getTaskById(Long id) {
    return repo.findById(id).orElse(null);
}

public Task createTask(Task task) {   // ✅ FIXED: use your Task entity
    return repo.save(task);
}

public Task updateTask(Long id, Task task) {
    Task existing = repo.findById(id).orElse(null);
    if (existing != null) {
        existing.setTitle(task.getTitle());
        existing.setDescription(task.getDescription()); // ✅ FIXED: use description, not status
        existing.setStatus(task.getStatus());
        return repo.save(existing);
    }
    return null;
}

public void deleteTask(Long id) {
    repo.deleteById(id);
}
}