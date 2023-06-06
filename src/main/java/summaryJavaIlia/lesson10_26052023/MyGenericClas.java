package summaryJavaIlia.lesson10_26052023;

public class MyGenericClas <T,P,Q>{
    private T object;
    void action(P objectP){
        System.out.println("Action Method"+ objectP.getClass());

        if (objectP instanceof String){
            String s = (String) objectP;
            System.out.println("String action "+ s.toUpperCase());
        } else if (objectP instanceof Double){
            Double d = (Double) objectP;
            System.out.println("Doble action "+(++d));
        }
    }
    Q action2(){
        return null;
    }
    public <N,M> void action3(M objectM, N objectN){

    }
}
