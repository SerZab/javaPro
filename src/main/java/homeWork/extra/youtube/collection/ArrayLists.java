package homeWork.extra.youtube.collection;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();

        people.add("Sergey");
        people.add("Alona");
        people.add("Julana");
        people.add("Anna");
        people.add("Andrej");
        people.add(0,"Larisa");
        System.out.println(people);
        System.out.println(people.size());
        for(String person : people){
            System.out.println(person);
        }
        if(people.contains("Andrej")){
            System.out.println("Sergey");
        }else {
            System.out.println("Doesn't contain the name");
        }
        System.out.println("----------");
        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray){
            System.out.println(person);
        }

    }
}
