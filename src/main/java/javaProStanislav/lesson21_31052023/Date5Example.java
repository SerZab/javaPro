package javaProStanislav.lesson21_31052023;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Date5Example {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();

        ZoneId germanyZone = ZoneId.of("Europe/Berlin");

        ZoneId asiaZoneTime = ZoneId.of("Asia/Shanghai");

        LocalDateTime germanyTime = LocalDateTime.now(germanyZone);

        LocalDateTime asiaTime = germanyTime.atZone(germanyZone)
                .withZoneSameInstant(asiaZoneTime)
                .toLocalDateTime();
        System.out.println("Текущее время в азии: " +asiaTime);
        System.out.println(LocalDateTime.now());

    }
}
