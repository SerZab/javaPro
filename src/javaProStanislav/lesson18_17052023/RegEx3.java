package javaProStanislav.lesson18_17052023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {
    public static void main(String[] args) {
        String inputString = "code for learn java regex";
        // буквы от a - j

        String regEx = "[a-j]+";

        RegEx1.patternReg(inputString, regEx);
    }


}
