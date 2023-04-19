package javaProStanislav.lesson09_05042023.compareObjects.mixCompare;
import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        int compareResult = cat1.getBreed().compareTo(cat2.getBreed());
        if (compareResult == 0){
            compareResult = cat1.getName().compareTo(cat2.getName());
        }
        return compareResult;
    }
}
