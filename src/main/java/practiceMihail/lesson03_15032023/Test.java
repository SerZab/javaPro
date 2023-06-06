package practiceMihail.lesson03_15032023;
    import java.io.Serializable;
    import java.util.Arrays;

public class Test implements I1 {
        public static void main(String[] args) {
            String[] s = {"s", "a", "t"};
            Arrays.sort(s);
            System.out.println(Arrays.toString(s));
            I1 i1 = new Test();

        }
        void set(String... name) {
        }
        @Override
        public void get() {
        }
    }
    interface I1 {
        void get();
//    void put();
    }
    interface I2 extends I1, Serializable {
        void put();
    }
