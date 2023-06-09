package summaryJavaIlia.lesson02_17032023.school;

public class Cat implements Playable{
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("CatExamples play!");
    }

    public class Kitten {
        private String name;

        public Kitten(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");

        Kitten kitten1 = cat1.new Kitten("Vasya");
        Kitten kitten2 = cat1.new Kitten("Marusia");
        Kitten kitten3 = cat1.new Kitten("Petya");

        String kittenName = kitten1.name;

        Cat cat2 = new Cat("Jerry");

        Kitten kitten4 = cat2.new Kitten("Vasya");
        Kitten kitten5 = cat2.new Kitten("Marusia");
        Kitten kitten6 = cat2.new Kitten("Petya");

    }
}
