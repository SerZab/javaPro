package javaProStanislav.lesson30_03072023.reflection.example3;

public class MyClass {
    private int number;
    private String name = "default";

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }
    private void printData(){
        System.out.println(number + name);
    }
}
