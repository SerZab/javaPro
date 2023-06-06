package summaryJavaIlia.lesson02_17032023;

public class AbstractInterface {
    private int i;
    private static int count;
    public void method1(){
        System.out.println(i++);
    }

    public static void getTotalCount(){
        System.out.println(count);
    }
    public AbstractInterface(){
        count++;
    }

    public static void main(String[] args) {
        AbstractInterface abstractInterface1 = new AbstractInterface();
        AbstractInterface abstractInterface2 = new AbstractInterface();
        AbstractInterface abstractInterface3 = new AbstractInterface();

        abstractInterface1.method1();
        AbstractInterface.getTotalCount();
        abstractInterface1.getTotalCount();
        abstractInterface2.getTotalCount();
        abstractInterface3.getTotalCount();

    }
}
