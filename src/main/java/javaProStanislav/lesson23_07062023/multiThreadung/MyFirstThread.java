package javaProStanislav.lesson23_07062023.multiThreadung;

public class MyFirstThread extends Thread{
    public void start(){
        System.out.println("I'm Thread! My name is Thread " + getName());
    }
}
