package summaryJavaIlia.lesson15_30062023;

public class Custom {

    private int value;

    public int process(int data){
        System.out.println("Processing " + data);
        return data + 10;
    }
    private void process(){
        System.out.println("Processing inner data " + value);
    }
}
