package summaryJavaIlia.lesson04_31032023;

import java.util.Comparator;

public class PersonCompareBySurname implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        String surname1 = o1.getSurname();
        String surname2 = o2.getSurname();
        return surname1.compareTo(surname2);
    }
}
