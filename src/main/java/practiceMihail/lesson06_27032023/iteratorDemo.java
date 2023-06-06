package practiceMihail.lesson06_27032023;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class iteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Olga");
        list.add("Sem");
        list.add("Mikhail");
        list.add("Vitali");
        list.add("Nikolay");
        list.add("Sergey");
        list.add("Roma");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
            if("Sem".equals(s)) {
                iterator.remove();
            }
        }

        System.out.println("********************************");
        System.out.println(list);


        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            String s = listIterator.previous();
            System.out.println(s);
            if("Sem".equals(s)) {
                iterator.remove();
            }
        }

        System.out.println("********************************");
        System.out.println(list);
    }
}
