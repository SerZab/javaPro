package javaProStanislav.lesson18_17052023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
        String inputString = "java java javfdhf java";

        String regEx = "java";

        patternReg(inputString, regEx);
    }
    static void patternReg(String text, String search) {
        Pattern pattern = Pattern.compile(search);
        Matcher matcher = pattern.matcher(text);
        int matchCount = 0;

        while (matcher.find()){
            matchCount++;
            System.out.println("'" + text.substring(matcher.start(), matcher.end()) + "'");
            System.out.println("Start : " + matcher.start());
            System.out.println("End : "+ matcher.end());
            System.out.println("Number of match: " + matchCount);
            System.out.println("-------------");
        }
    }
}
