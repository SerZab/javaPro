package javaProStanislav.lesson09_05042023.compareObjects.comparator;

import java.util.Comparator;

public class PersonCompareRulesByName implements Comparator<PersonComparator> {
    @Override
    public int compare(PersonComparator person1, PersonComparator person2) {
        return person1.name.compareTo(person2.name);
    }
}
