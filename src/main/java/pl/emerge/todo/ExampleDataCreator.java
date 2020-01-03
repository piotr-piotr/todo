package pl.emerge.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.emerge.todo.entity.Task;
import pl.emerge.todo.repository.TaskRepository;


@Component
public class ExampleDataCreator implements CommandLineRunner {
    @Autowired
    private TaskRepository taskRepository;
    
    @Override
    public void run(String... args) throws Exception {
        taskRepository.save(new Task("bake a cake", "Bake some strawberry cake.", false));
        taskRepository.save(new Task("cook kompot", "Cook some strawberry kompot.", false));
        taskRepository.save(new Task("invite guests", "Prepare guests list, email invitations, make sure they received them.", false));
    }
    
}
