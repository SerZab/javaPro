package lessons.lesson07_29032023;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal bird = new Bird();
        bird.move(); // выводит "Птицы летают"

        Animal lizard = new Lizard();
        lizard.move(); // выводит "Ящерицы ползают"

        Animal pterodactyl = new Pterodactyl();
        pterodactyl.move(); // выводит "Птеродактили и летают, и ползают"
    }
}
interface Animal {
    void move();
}
class Bird implements Animal {
    @Override
    public void move() {
        System.out.println("Птицы летают");
    }
}

class Lizard implements Animal {
    @Override
    public void move() {
        System.out.println("Ящерицы ползают");
    }
}
class Pterodactyl extends Bird {
    @Override
    public void move() {
        System.out.println("Птеродактили и летают, и ползают");
    }
}

