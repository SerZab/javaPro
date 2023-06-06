package javaProStanislav.lesson15_08052023.streamPractice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("iPhone",1000));
        phoneList.add(new Phone("Samsung",900));
        phoneList.add(new Phone("Huawei",750));
        phoneList.add(new Phone("Motorolla",500));
        phoneList.add(new Phone("Nokia",620));
        phoneList.add(new Phone("Xiaomi",900));

        System.out.println(phoneList.stream()
                .filter(x->x.getPrice() > 700)
                .map(x->x.getModel())
                .collect(Collectors.toSet()));
    }
}
@ToString
@AllArgsConstructor
@Getter
class Phone{
    private String model;
    private double price;
}
