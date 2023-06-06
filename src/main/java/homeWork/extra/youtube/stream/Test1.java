package homeWork.extra.youtube.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i,String.valueOf(list.get(i).length()));
//        }
        List<Integer> list1 = list.stream().map(s -> s.length())
                        .toList();
        System.out.println(list1);
        int[] arr = {5,9,3,8,12,6,2};
        int[] arr1 = Arrays.stream(arr)
                .map(elem->{if (elem%3==0){
                elem=elem/3;} else {
                    elem+=2;} return elem;
                }).toArray();
        System.out.println(Arrays.toString(arr1));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        List<Integer> list2 = set.stream().map(el->el.length()).collect(Collectors.toList());
        System.out.println(list2);
    }
}
