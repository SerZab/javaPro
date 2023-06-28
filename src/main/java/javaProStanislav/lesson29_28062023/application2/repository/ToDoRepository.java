package javaProStanislav.lesson29_28062023.application2.repository;

import javaProStanislav.lesson29_28062023.application2.domain.ToDoEntity;

import java.util.List;
import java.util.Optional;

public interface ToDoRepository {

    ToDoEntity save(ToDoEntity entity);

    List<ToDoEntity> findAll();

    Optional<ToDoEntity> findById(Integer id);

}
