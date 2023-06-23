package summaryJavaIlia.lesson13_16062023;

import java.util.Random;

public class Philosophers {

    static class Fork {

        private final Integer id;

        public Fork(Integer id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Fork{" + "id='" + id + '\'' + '}';
        }
    }

    static class Philosopher {

        private final String name;
        private final Fork fork1;
        private final Fork fork2;
        private static final Random random = new Random();

        public Philosopher(String name, Fork fork1, Fork fork2) {
            this.name = name;
            this.fork1 = fork1;
            this.fork2 = fork2;
        }
        @Override
        public String toString() {
            return "Philosopher{" + "name='" + name + '\'' + '}';
        }

        public void atTheTable() {
            while (true) {
                snack();
                think();
            }
        }
        public void snack() {
            // Определяем порядок захвата вилок
            Fork firstFork = fork1.id < fork2.id ? fork1 : fork2;
            Fork secondFork = fork1.id < fork2.id ? fork2 : fork1;

            synchronized (firstFork) {
                synchronized (secondFork) {
                    eatSpaghetti(firstFork);
                    eatSpaghetti(secondFork);
                }
            }
        }
        public void think() {
            try {
                System.err.println(this + " thinks about important things... ");
                Thread.sleep(random.nextInt(50));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void eatSpaghetti(Fork fork) {
            try {
                System.out.println(this + " eats spaghetti with " + fork);
                Thread.sleep(random.nextInt(50));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Fork fork1 = new Fork(1);
        Fork fork2 = new Fork(2);
        Fork fork3 = new Fork(3);
        Fork fork4 = new Fork(4);
        Fork fork5 = new Fork(5);

        Philosopher philosopher1 = new Philosopher("Plato", fork1, fork2);
        Philosopher philosopher2 = new Philosopher("Socrates", fork2, fork3);
        Philosopher philosopher3 = new Philosopher("Aristotle", fork3, fork4);
        Philosopher philosopher4 = new Philosopher("Pythagoras", fork4, fork5);
        Philosopher philosopher5 = new Philosopher("Diogenes", fork5, fork1);

        new Thread(philosopher1::atTheTable).start();
        new Thread(philosopher2::atTheTable).start();
        new Thread(philosopher3::atTheTable).start();
        new Thread(philosopher4::atTheTable).start();
        new Thread(philosopher5::atTheTable).start();
    }

}