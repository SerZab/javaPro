package javaProStanislav.lesson21_31052023;

import java.util.Calendar;
import java.util.TimeZone;

public class Date4Example {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println("Local time " + calendar.getTime());

        TimeZone newTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        calendar.setTimeZone(newTimeZone);

        calendar.set(calendar.HOUR_OF_DAY,24);
        calendar.set(calendar.MINUTE,10);
        calendar.set(calendar.SECOND,20);

        System.out.println("China time " + calendar.getTime());

    }
}
