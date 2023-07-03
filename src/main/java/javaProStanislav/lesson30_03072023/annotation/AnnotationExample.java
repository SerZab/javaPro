package javaProStanislav.lesson30_03072023.annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnnotationExample {
    private int id;
    private String name;
    private String description;
}
