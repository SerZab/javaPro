package javaProStanislav.lesson29_28062023.application2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class FindToDoResponse {
    private List<ToDoDTO> todos;
    private List<CoreError> errors;
}
