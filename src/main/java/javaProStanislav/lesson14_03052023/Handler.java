package javaProStanislav.lesson14_03052023;

import java.util.function.Function;

public class Handler implements Function<Request, String> {

    @Override
    public String apply(Request request) {
        return String.format("Message is %s, number is %d",
                request.getMessage(),
                request.getNumber());
    }
}
