package javaProStanislav.lesson21_31052023;

import java.time.LocalDateTime;
import java.util.Date;

public class Date1Example {
    public static void main(String[] args) {
        Date date1 = new Date(0,11,21);
        Date date2 = new Date();
        Date date3 = new Date(110,1,3);

        System.out.println("Current date is " + date1);
        System.out.println("Date2 is "+ date2);
        System.out.println("Date3 is "+ date3);

        boolean isAfter = date3.after(date1);
        System.out.println(isAfter);

        System.out.println(LocalDateTime.now());
        Date newDate = new Date();
        System.out.println(newDate.getTime());

    }
}
