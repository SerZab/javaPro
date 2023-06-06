package javaProStanislav.lesson22_05062023.junitExample;

import org.junit.*;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class Junit4AnnotationExample {

    private ArrayList<String> list = new ArrayList<>();

    @BeforeClass
    public static void method1(){
        System.out.println("Using @BeforeClass, executing before all test cases");
    }
    @Before
    public void method2(){
        System.out.println("Using @Before, executing before each test cases");
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

    @After
    public void method4(){
        System.out.println("Using @After, executing after each test cases");
        list.clear();
        System.out.println(list);
    }

    @AfterClass
    public static void method5(){
        System.out.println("Using @AfterClass, executing after all test cases");
    }
}
