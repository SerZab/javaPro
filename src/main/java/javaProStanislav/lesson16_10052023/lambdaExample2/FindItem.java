package javaProStanislav.lesson16_10052023.lambdaExample2;

public class FindItem {
    public static void main(String[] args) {
        IFindItem ref;

        ref = (item, stringArray) -> {
            int count = 0;
            for (int i = 0; i < stringArray.length; i++) {
                if (item.equals(stringArray[i])) {
                    count++;
                }
            }
            return count;
        };

        String[] strings = {"DDD", "HHH", "EEE", "FFF", "BBB", "DDD", "CCC", "AAA", "GGG", "RRR"};

        int counter = ref.countingElement("DDD", strings);

        System.out.println(counter);
    }

}
