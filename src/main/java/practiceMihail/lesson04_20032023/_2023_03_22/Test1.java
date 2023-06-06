package practiceMihail.lesson04_20032023._2023_03_22;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {


        //List list = new ArrayList<>();
        //list.add("MIK"); --> list.add((String)"MIK");
        List<String> list = new ArrayList<>();
        list.add("QQQ");
        list.add("WWW");
        list.add("EEE");
        list.add("FFF");
        list.add("GGG");

        for (String s : list) {
            System.out.println(s);
        }
    }
}