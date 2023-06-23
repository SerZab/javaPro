package practiceMihail.lesson27_21062023;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kaprik {
    public static void main(String[] args) {

        //kaprik(8952, 20);
        List<Integer> digit = findDigit(2695);
        List<Integer> list = sortNumberIncr(digit);
        List<Integer> list1 = sortNumberDecr(digit);
        int number = createNumber(list);
        int number1 = createNumber(list1);
        int c = number1 -number;
        System.out.println(c);

    }
    public static void kaprik (int number, int counter){
        if(counter == 0){
            return;
        }
        int a = createNumber(sortNumberIncr(findDigit(number)));
        int b = createNumber(sortNumberDecr(findDigit(number)));
        int c = b - a;
        System.out.println(c);

        kaprik(c, --counter);
    }
    public static List<Integer> findDigit(int number){
        List<Integer> arrayList = new ArrayList<>();
        int newNumber = number;
        while (newNumber >= 1) {
            int temp = newNumber % 10;
            arrayList.add(temp);
            newNumber = newNumber / 10;
        }
        return arrayList;
    }
    public static List<Integer> sortNumberIncr (List<Integer> list){
        return list.stream().sorted().toList();
    }
    public static List<Integer> sortNumberDecr (List<Integer> list){
        return list.stream().sorted(Comparator.reverseOrder()).toList();
    }
    public static int createNumber (List<Integer> list){
        StringBuilder number = new StringBuilder();
        for (int num : list) {
            number.append(num);
        }
        return Integer.parseInt(number.toString());
    }
}
