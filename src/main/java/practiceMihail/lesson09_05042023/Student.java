package practiceMihail.lesson09_05042023;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    private String name;
    private int course;
    private double avgGrade;
}
