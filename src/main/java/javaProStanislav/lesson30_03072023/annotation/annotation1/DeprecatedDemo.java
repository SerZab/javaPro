package javaProStanislav.lesson30_03072023.annotation.annotation1;

public class DeprecatedDemo {

    @Deprecated(since="4.5", forRemoval = true)
    public void testLegacyFunction(){
        System.out.println("This is legacy function");
    }
}
