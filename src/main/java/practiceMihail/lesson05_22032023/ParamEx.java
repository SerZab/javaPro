package practiceMihail.lesson05_22032023;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class ParamEx {
    public static void main(String[] args) {

    }
}
@Getter
@AllArgsConstructor

class P<V1, V2, V3> {
    private V1 value1;
    private V2 value2;
    private V3 value3;
}
