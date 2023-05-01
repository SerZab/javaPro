package homeWork.extra.youtube.lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Person {
    private String name;
    private String lastname;
    private int age;
}
@FunctionalInterface
interface PersonCheck{
    boolean check(Person person);
}
