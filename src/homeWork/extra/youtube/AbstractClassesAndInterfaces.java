package homeWork.extra.youtube;

public class AbstractClassesAndInterfaces extends Abstracts implements MyInterface1, MyInterface2{
    public static void main(String[] args) {
        new AbstractClassesAndInterfaces().yourAge();
        System.out.println(MyInterface2.b);
    }

    @Override
    void bye() {
        System.out.println("Bye!");
    }

    @Override
    public void yourName() {
        System.out.println("Name");
    }
}
// =======================================
abstract class Abstracts {
    String s;
    int a;

    void hello(){
        System.out.println("Hello!");
    }
    abstract void bye();
}
interface MyInterface1{
    String c = "qwerty"; //final static String c = "qwerty";
    int b = 15; //final static String b = 10;

    void yourName();
    default void yourAge(){
        System.out.println(25);
    }
}
interface MyInterface2 extends MyInterface1{
    String c = "qwerty"; //final static String c = "qwerty";
    int b = 12; //final static String b = 10;

}