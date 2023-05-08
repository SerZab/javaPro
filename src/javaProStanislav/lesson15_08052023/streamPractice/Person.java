package javaProStanislav.lesson15_08052023.streamPractice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Person {
    private String name;
    private int age;

    public static Person maxAge(Person person1, Person person2){
        return person1.getAge() > person2.getAge() ? person1 : person2;
    }
}
