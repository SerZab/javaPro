package summaryJavaIlia.lesson09_19052023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExamples {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9]{2,}@[a-z]+\\.[a-z]+";
        String text = "Sergey12@gmail.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        //System.out.println(matcher.find());
        System.out.println(matcher.matches());
    }

}
