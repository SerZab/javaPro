package lessons.lesson05_22032023.arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        System.out.println(stringArrayList.size());
        stringArrayList.add("AAA");
        System.out.println(stringArrayList.size());
        stringArrayList.add("BBB");
        stringArrayList.add("CCC");
        stringArrayList.add(0, "DDD");
        System.out.println(stringArrayList);

        for (int i = 0; i < stringArrayList.size(); i++) {
            String tempString = stringArrayList.get(i);
            System.out.println(i + "-й  элемент коллекции : " + tempString);
        }

        stringArrayList.remove(0);

        System.out.println(stringArrayList);

        //stringArrayList.remove("BBB");
        System.out.println(stringArrayList);


        System.out.println(stringArrayList);

        System.out.println(stringArrayList.size());
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println("Current collection size:" + stringArrayList.size());
            System.out.println("index i = " + i);
            System.out.println("Collection: before delete " + stringArrayList);
            stringArrayList.remove(0);
            System.out.println("Collection: after delete " + stringArrayList);
            System.out.println("============");
        }


        System.out.println(stringArrayList);
    }
}