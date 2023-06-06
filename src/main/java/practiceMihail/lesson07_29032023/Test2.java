package practiceMihail.lesson07_29032023;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(M1(Test2::M2));
    }
    public static int M2(){
        return 5*3;
    }
    public static int M1(Sum sum){
        return sum.getSum();
    }
}
@FunctionalInterface
interface Sum {
    int getSum();
}
