package practiceMihail.lesson26_19062023;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcHashMap {
    public static void main(String[] args) {
        
        Map<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1,"Q");
        map.put(2,"W");
        map.put(3,"E");
        map.put(4,"R");
        map.put(5,"T");

        Runnable R1 = ()-> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + " : "+ map.get(i));
            }
        };
        Runnable R2 = ()-> {

        };

    }
}
