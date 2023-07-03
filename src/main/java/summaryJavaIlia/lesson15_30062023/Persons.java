package summaryJavaIlia.lesson15_30062023;

import java.lang.reflect.Field;

public class Persons {
    @Person(age = 20, name = "Tom")
    private String person1;

    @Person(name = "Peter")
    private String person2;

    public Persons(String person1, String person2) {
        this.person1 = person1;
        this.person2 = person2;
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Persons person = new Persons("Tom","Peter");

        Class<? extends Persons> personClass = person.getClass();
        Field field = personClass.getDeclaredField("person2");
        Person annotation = field.getAnnotation(Person.class);
        System.out.println(annotation.age());
        System.out.println(annotation.name());
        System.out.println(person.person2);

    }

}
