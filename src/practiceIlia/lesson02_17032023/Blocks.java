package practiceIlia.lesson02_17032023;

public class Blocks {
    static int i = 1;
    int j = 2;

    {
        System.out.println("In non-static block");
    }
    static {
        System.out.println("In static block");
    }
    public Blocks(int j){
        this.j = j;
    }

    public static void main(String[] args) {
        Blocks block = new Blocks(4);
        System.out.println(block.j);
    }
}
