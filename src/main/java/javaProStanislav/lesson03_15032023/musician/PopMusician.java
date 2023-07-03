package javaProStanislav.lesson03_15032023.musician;

public class PopMusician implements Musician{
    @Override
    public void dance() {
        System.out.println("Dancing Pop");
    }

    @Override
    public void playMusic() {

    }

    @Override
    public void sing() {
        System.out.println("Singing Pop");
    }

    @Override
    public void greating() {
        System.out.println("Person Pop");
    }
}
