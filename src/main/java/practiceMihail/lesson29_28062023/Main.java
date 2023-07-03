package practiceMihail.lesson29_28062023;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Annot()
public class Main implements Inter{
    String s;

    @Override
    public void m1() {

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Annot{
    String type() default "Y";
    int year() default 2023;
}
@FunctionalInterface
interface Inter {
    void m1();
}