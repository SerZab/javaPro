package javaProStanislav.lesson28_26062023.application.service;

import javaProStanislav.lesson28_26062023.application.domain.Task;
import javaProStanislav.lesson28_26062023.application.repository.TaskInMemoryRepository;

import java.util.Map;

public class TaskService {
    private TaskInMemoryRepository repository = new TaskInMemoryRepository();

    public Long saveTask(Task task) {
        // провести проверку корректности данных полей task (Validation)
        repository.insert(task);
        return task.getId();
    }

    public Map<Long, Task> findAll(){
        // может появится проверка прав пользователя
        return repository.findAll();}

    public Task findById(Long id){
        // может появится проверка прав пользователя
        return repository.findById(id);}

}
