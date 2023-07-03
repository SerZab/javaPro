package javaProStanislav.lesson30_03072023.annotation.annotation3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface HelloAnnotation {
    String value();
    String greetTo();
}
