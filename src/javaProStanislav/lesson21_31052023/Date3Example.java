package javaProStanislav.lesson21_31052023;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date3Example {
    public static void main(String[] args) {
        GregorianCalendar day = new GregorianCalendar();

        day.set(1976,Calendar.DECEMBER,30);
        day.add(Calendar.MONTH,2);
        System.out.println(day);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormat = formatter.format(new Date());
        System.out.println(dateFormat);

        Calendar calendar = Calendar.getInstance();
        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = formatter.format(new Date());
        System.out.println(dateStr);
    }
}
