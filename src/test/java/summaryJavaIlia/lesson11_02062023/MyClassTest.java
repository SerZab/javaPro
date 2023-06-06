package test.java.summaryJavaIlia.lesson11_02062023;

import org.junit.BeforeClass;
import org.junit.Test;
import summaryJavaIlia.lesson11_02062023.MyClass;

import static org.junit.Assert.assertEquals;


public class MyClassTest {
    private String data;
    private static MyClass myClass;
    @BeforeClass
    public static void init(){
        myClass = new MyClass();
    }
    @Test
    public void myFunctionTest(){
        MyClass myClass = new MyClass();

        String result = myClass.myFunction(10);
        assertEquals ("Result = 100", result);
        //assertThrows(ArithmeticException.class,()-> myClass.myFunction(0));
    }
}
