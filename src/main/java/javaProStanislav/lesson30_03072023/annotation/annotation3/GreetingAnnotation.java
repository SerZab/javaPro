package javaProStanislav.lesson30_03072023.annotation.annotation3;

import lombok.Data;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

@Data
@HelloAnnotation(value = "Hello", greetTo = "Universe")
public class GreetingAnnotation {

    public static void main(String[] args) {
        GreetingAnnotation demo = new GreetingAnnotation();

        Class gaClass = demo.getClass();
        Annotation[] annotations = gaClass.getAnnotations();
        System.out.println(Arrays.toString(annotations));

        for (Annotation annotation : annotations){
            System.out.println("Annotation type: " + annotation.annotationType());
        }

        HelloAnnotation myAnnotation = (HelloAnnotation) gaClass.getAnnotation(HelloAnnotation.class);
        System.out.println("value = " + myAnnotation.value());
        System.out.println("greetTo = " + myAnnotation.greetTo());

        demo.sayHello();
        demo.sayHi();
    }
    @HelloAnnotation(value = "hello", greetTo = "Alisa")
    public void sayHi(){
        try {
            Method method = getClass().getMethod("sayHi");
            HelloAnnotation annotation = method.getAnnotation(HelloAnnotation.class);
            System.out.println(annotation.value() + " " + annotation.greetTo());
        }catch (Exception e){
            e.getMessage();
        }
    }

    @HelloAnnotation(value = "hello", greetTo = "Robert")
    public void sayHello(){
        try {
            Method method = getClass().getMethod("sayHello");
            HelloAnnotation annotation = method.getAnnotation(HelloAnnotation.class);
            System.out.println(annotation.value() + " " + annotation.greetTo());
        }catch (Exception e){
            e.getMessage();
        }
    }
}
