package javaProStanislav.lesson28_26062023.application.repository;

import javaProStanislav.lesson28_26062023.application.domain.Task;

import java.util.HashMap;
import java.util.Map;

public class TaskInMemoryRepository {
    private Long taskId = 0L;
    private Map<Long, Task> taskMap = new HashMap<>();
    public void insert(Task task){
        task.setId(++taskId);
        taskMap.put(taskId,task);
    }
    public Map<Long,Task> findAll(){
        return taskMap;
    }
    public Task findById(Long id){
        return taskMap.get(id);
    }
}
