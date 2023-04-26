package javaProStanislav.lesson13_26042023.functionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("DD");
        myList.add("FFF");
        myList.add("AAA");
        myList.add("CC");
        myList.add("E");
        myList.add("BBBBBBBB");

        System.out.println(myList);
            // 1
//        StringLengthComparator comparator = new StringLengthComparator();
//        Collections.sort(myList, comparator);
        
//        Collections.sort(myList, new StringLengthComparator());
            // 2
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
//        Collections.sort(myList, comparator);
            // 3
//        Comparator<String> comparator = (String o1, String o2) -> {
//            return o1.length()-o2.length();
//        };
//        Collections.sort(myList, comparator);
            // 4
//        Comparator<String> comparator = (o1, o2) -> {
//           return o1.length()-o2.length();
//        };
//        Collections.sort(myList, comparator);
            // 5
        Collections.sort(myList, (o1, o2) -> o2.length()-o1.length());

        System.out.println(myList);
    }
}
