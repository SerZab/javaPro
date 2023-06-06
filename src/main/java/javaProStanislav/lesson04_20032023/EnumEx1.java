package javaProStanislav.lesson04_20032023;

public class EnumEx1 {

    String color1 = "red";
    String color2 = "blue";
    public void printRedColor(){
        System.out.println("Print red colour " + color1);
    }
    public void printBlueColor(){
        System.out.println("Print blue colour " + color2);
    }

    public enum Color {
        red,
        blue,
        green,
        yellow,
    }
}
