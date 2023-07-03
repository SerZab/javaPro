package javaProStanislav.lesson29_28062023.application2.core.service;

import javaProStanislav.lesson29_28062023.application2.domain.ToDoEntity;
import javaProStanislav.lesson29_28062023.application2.dto.AddToDoRequest;
import javaProStanislav.lesson29_28062023.application2.dto.ToDoDTO;

public class ToDoConverters {

    public ToDoEntity convert(AddToDoRequest request) {
        ToDoEntity entity = new ToDoEntity();
        entity.setName(request.getName());
        entity.setDescription(request.getDescription());
        return entity;
    }

    public ToDoDTO convert(ToDoEntity entity) {
        return new ToDoDTO(entity.getName(), entity.getDescription());
    }
}
