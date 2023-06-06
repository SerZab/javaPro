package practiceMihail.lesson08_03042023.paramEx;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Participant {
    private String name;
    private int age;
}

class Adult extends Participant {

    public Adult(String name, int age) {
        super(name, age);
    }
}

class Student extends Participant {

    public Student(String name, int age) {
        super(name, age);
    }
}

class Pupil extends Participant {

    public Pupil(String name, int age) {
        super(name, age);
    }
}

