package summaryJavaIlia.lesson06_28042023;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cat {
    String name;
    int age;
    String colour;
    boolean isHungry;
}
