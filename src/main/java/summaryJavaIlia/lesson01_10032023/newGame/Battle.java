package summaryJavaIlia.lesson01_10032023.newGame;

public class Battle {
    public static void main(String[] args) {
        Superhero hero1 = Superhero.generateRandomSuperhero();
        Superhero hero2 = Superhero.generateRandomSuperhero();
        System.out.println(hero1);
        System.out.println(hero2);
        Superhero.fight(hero1, hero2);

    }
}
