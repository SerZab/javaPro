package javaProStanislav.lesson22_05062023.junitExample;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Junit5AnnotationExample {

    private ArrayList<String> list = new ArrayList<>();

    @BeforeAll
    public static void method1(){
        System.out.println("Using @BeforeAll, executing before all test cases");
    }
    @BeforeEach
    public void method2(){
        System.out.println("Using @BeforeEach, executing before each test cases");
        list.add("test0");
    }

    @Test
    public void method3(){
        list.add("test");
        System.out.println(list);
        assertEquals(2,list.size());

        assertFalse(list.isEmpty());
    }


    @Test
    public void method33(){
        list.add("test2");
        System.out.println(list);
        assertEquals(2,list.size());

        assertFalse(list.isEmpty());
    }

    @AfterEach
    public void method4(){
        System.out.println("Using @AfterEach, executing after each test cases");
        list.clear();
        System.out.println(list);
    }

    @AfterAll
    public static void method5(){
        System.out.println("Using @AfterAll, executing after all test cases");
    }
}

