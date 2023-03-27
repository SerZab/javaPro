package practiceIlia.lesson02_17032023.school;

public class Teacher extends Human implements Playable{
    private String subject;


    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void introduceYourself() {
        System.out.println("I'm a teacher!");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, dear students!");
    }

    public void teach(Student student) {
        System.out.println("Teacher " + this.getName() + " teaches " + student.getName());
    }

    public void teach(Student[] students) {

    }

    @Override
    public void play() {
        System.out.println("Teacher play");
    }
}
