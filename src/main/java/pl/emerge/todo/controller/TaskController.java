package pl.emerge.todo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.emerge.todo.entity.Task;
import pl.emerge.todo.repository.TaskRepository;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;
    
    @GetMapping("/task")
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/task/{taskId}")
    public Optional<Task> getTask(@PathVariable Long taskId) {
        return taskRepository.findById(taskId);
    }
    
    @PostMapping("/task")
    public void createTask(@RequestBody Task newTask) {
        taskRepository.save(newTask);
    }
}
