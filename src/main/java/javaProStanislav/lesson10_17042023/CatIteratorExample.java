package javaProStanislav.lesson10_17042023;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CatIteratorExample {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();

        Cat murzik = new Cat("Murzik");
        Cat barsik = new Cat("Barsik");
        Cat lastochka = new Cat("Lastochka");
        Cat begemot = new Cat("Begemot");
        Cat pushok = new Cat("Pushok");

        cats.add(murzik);
        cats.add(barsik);
        cats.add(lastochka);
        cats.add(begemot);
        cats.add(pushok);
        System.out.println(cats);

//        for(CatExamples cat : cats){
//            if (cat.name.equals("Begemot")){
//                cats.remove(cat);
//            }
//        }
        Iterator<Cat> catIterator = cats.iterator();
        while (catIterator.hasNext()){
            System.out.println(catIterator.next());
        }
        ListIterator<Cat> catIterator1 = cats.listIterator();
        while (catIterator1.hasNext()){
            Cat tempCat = catIterator1.next();
            if (tempCat.name.equals("Begemot")){
                catIterator1.remove();
                catIterator1.add(new Cat("Burbon"));
            }
        }
        System.out.println(cats);
    }
}
