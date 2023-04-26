package javaProStanislav.lesson13_26042023.lambdaExamples;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample2 {
    public static void main(String[] args) {
        ListMerge listMerger = (list1, list2) -> {
            List<String> merge = new ArrayList<>();
            merge.addAll(list1);
            merge.addAll(list2);
            return merge;
        };

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("Toronto");
        list1.add("Berlin");
        list1.add("Leipzig");
        list1.add("London");

        list2.add("Paris");
        list2.add("Madrid");
        list2.add("Rome");
        list2.add("Istanbul");

        List<String> merge = listMerger.merge(list1,list2);
        System.out.println(merge);

    }
}
