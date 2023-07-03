package practiceMihail.lesson30_03062023.spring1;

public interface Pet {
    void say();
}
class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Dog.class || say()");
    }
}
class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Cat.class || say()");
    }
}
