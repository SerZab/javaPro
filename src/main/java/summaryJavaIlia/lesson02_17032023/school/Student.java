package summaryJavaIlia.lesson02_17032023.school;

public class Student extends Human implements Playable{
    private int classNumber;

    public Student(String name, int id, int classNumber) {
        super(name, id);
        this.classNumber = classNumber;
    }

    @Override
    public void introduceYourself() {
        System.out.println("I'm a student!");
    }

    @Override
    public void play() {
        System.out.println("Students play!");
    }
}
