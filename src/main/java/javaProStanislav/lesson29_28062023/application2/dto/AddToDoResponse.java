package javaProStanislav.lesson29_28062023.application2.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AddToDoResponse {
    private Integer createdToDoId;
    private List<CoreError> errors;

}
