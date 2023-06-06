package summaryJavaIlia.lesson04_31032023;

public class PolymorphismExample {

    public static void main(String[] args) {
        A a = new A();
        a.action();

        a = new B();
        a.action();
    }

}
