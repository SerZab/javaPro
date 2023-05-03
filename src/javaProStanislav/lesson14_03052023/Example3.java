package javaProStanislav.lesson14_03052023;

import java.util.function.Function;

public class Example3 {
    public static void main(String[] args) {
        Handler handler = new Handler();
        String result = handler.apply(new Request("All ok", 250));
        System.out.println(result);


        Function<Request,String> funcExample = (s) ->
                "Message is " + s.getMessage() + " number is " + s.getNumber();
        System.out.println(funcExample.apply(new Request("All OK!", 500)));

    }
}
