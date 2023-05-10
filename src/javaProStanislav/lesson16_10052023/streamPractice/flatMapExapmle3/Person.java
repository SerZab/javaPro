package javaProStanislav.lesson16_10052023.streamPractice.flatMapExapmle3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@ToString
@Getter
public class Person {
    private String name;
    private List<String> friends;

}

