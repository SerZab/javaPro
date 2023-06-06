package homeWork.extra.youtube.lambda;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
}
