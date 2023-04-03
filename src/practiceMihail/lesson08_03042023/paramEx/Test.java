package practiceMihail.lesson08_03042023.paramEx;

/**
 * - класс лига (1 2 3 4)
 * - класс игроки(имя возраст лига кол-во балов)
 * - класс игра <>
 * - класс генератор 5 игроков с именами и возрастом
 * - класс игра с методом, где каждый игрок одной лиги играет с каждым
 * если победа то 1 балл ничья 0,5 проигрыш
 * далее вывести на экран лидеров из каждой лиги
 * - если кол-во баллов будет одиноковое то переигрываем
 */
public class Test {
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Mik", 10);
        Pupil pupil2 = new Pupil("Mik", 10);

        Pupil pupil3 = new Pupil("Masha", 10);
        Pupil pupil4 = new Pupil("Yulya", 10);

        Student student1 = new Student("Serg", 18);
        Student student2 = new Student("Petr", 19);

        Adult adult1 = new Adult("Max", 30);
        Adult adult2 = new Adult("Elena", 33);

        Team<Pupil> PT1 = new Team<>("PT1");
        PT1.addNewPart(pupil1);
        PT1.addNewPart(pupil2);

        Team<Pupil> PT2 = new Team<>("PT2");
        PT2.addNewPart(pupil3);
        PT2.addNewPart(pupil4);

        Team<Student> ST1 = new Team<>("ST1");
        ST1.addNewPart(student1);
        ST1.addNewPart(student2);

        Team<Adult> AT1 = new Team<>("AT1");
        AT1.addNewPart(adult1);
        AT1.addNewPart(adult2);

        PT1.play(PT2);
    }
}
