package practiceMihail.lesson07_29032023;

public class Test1 {
    public static void main(String[] args) {
        M1(Test1::www);
        M1(() -> System.out.println("123345"));
    }
    private static void www(){
        System.out.println("----");
        System.out.println("*****");
    }
    private static void M1(Inter inter) {
        System.out.println("/////");
        inter.get();
    }
}
@FunctionalInterface
interface Inter {
    void get();
}
