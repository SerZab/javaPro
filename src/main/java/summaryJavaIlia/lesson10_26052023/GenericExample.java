package summaryJavaIlia.lesson10_26052023;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add(100);
        Object o = list.get(0);
        String s = (String) o;
//        list.stream().map(o1 ->((String) o1)
//                .toUpperCase()).toList()
//                .forEach(System.out::println);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        MyGenericClas<String,String,Integer> myGenericClas = new MyGenericClas();
        myGenericClas.action("String");
        MyGenericClas<String,Double,Integer> myGenericClas1 = new MyGenericClas<>();


    }
}
