package lessons.lesson03_15032023.musician;

public class RockMusician implements Musician{
    private String name;

    public RockMusician(String name) {
        this.name = name;
    }

    @Override
    public void dance() {
        System.out.println("Rock dance");
    }

    @Override
    public void playMusic() {

    }

    @Override
    public void sing() {
        System.out.println("Rock singing!");
    }

    @Override
    public void greating() {
        System.out.println("Rock greeting!");
    }
}
