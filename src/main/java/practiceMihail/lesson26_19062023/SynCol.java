package practiceMihail.lesson26_19062023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynCol {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> synList = Collections.synchronizedList(new ArrayList<>());

    }
}
