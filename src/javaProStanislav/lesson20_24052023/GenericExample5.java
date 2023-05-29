package javaProStanislav.lesson20_24052023;

public class GenericExample5 {
    public static void main(String[] args) {
        OnlyNumber<Integer> number = new OnlyNumber<>(1);
        OnlyNumber<Long> number1 = new OnlyNumber<>(123L);
        OnlyNumber<Double> number2 = new OnlyNumber<>(20.3);
        number.print(4);


    }
    static class OnlyNumber<T extends Number>  {
        private T number;

        public OnlyNumber(T number) {
            this.number = number;
        }
        public void print(T number){
            System.out.println(number);
        }
    }

}
