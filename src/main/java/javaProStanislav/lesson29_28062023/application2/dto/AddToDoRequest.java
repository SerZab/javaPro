package javaProStanislav.lesson29_28062023.application2.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddToDoRequest {
    private String name;
    private String description;
}
