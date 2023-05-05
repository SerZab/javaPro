package summaryJavaIlia.lesson07_05052023;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String string = someFunction();

        String s1 = (string != null) ? string : "Some other String";

        Optional<String> optionalS = Optional.ofNullable(someFunction());
        s1 = optionalS.orElse("Some other String");

        System.out.println(s1.toUpperCase());
        System.out.println(someFunctionWithOptional().orElse("123").toUpperCase());

        Optional<String> any = Arrays.asList("A","C","B", "C", "D", "F").stream().filter(s -> s.equals("C")).findAny();
        System.out.println(any.orElse("No value"));

    }

    private static String someFunction() {
        return null;
    }
    private static Optional<String> someFunctionWithOptional() {
        return Optional.ofNullable("SomeString");
        //return Optional.ofNullable(null);
    }
}

