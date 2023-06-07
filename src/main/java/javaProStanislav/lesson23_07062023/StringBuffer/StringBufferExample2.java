package javaProStanislav.lesson23_07062023.StringBuffer;

public class StringBufferExample2 {
    public static void main(String[] args) {
        String numbers = "1234567890";
        StringBuffer sb = new StringBuffer(numbers);

        System.out.println(sb.substring(3));
        System.out.println(sb.substring(4,8));
        System.out.println(sb.replace(3,6, "ASDFGHJ"));

        sb = new StringBuffer(numbers);
        System.out.println(sb.reverse());

        sb.reverse();

        sb = new StringBuffer(numbers);
        System.out.println(sb.delete(5,9));
        System.out.println(sb.deleteCharAt(1));
        
    }
}
