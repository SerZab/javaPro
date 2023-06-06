package javaProStanislav.lesson18_17052023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx6 {
    public static void main(String[] args) {
        String regEx = "\\w+\\.(com|org|ua(\\.com)?|lv(\\d{1,2})?)";
        System.out.println(checkMail("google.com", regEx));
        System.out.println(checkMail("reference.ua", regEx));
        System.out.println(checkMail("reference.ua.com", regEx));
        System.out.println(checkMail("reference2.lv", regEx));
        System.out.println(checkMail("reference2.lv22", regEx));
        System.out.println(checkMail("reference3.org", regEx));
    }

    public static boolean checkMail(String text, String reg){
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();

    }
}
