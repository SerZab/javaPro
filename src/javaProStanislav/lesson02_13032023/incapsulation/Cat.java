package javaProStanislav.lesson02_13032023.incapsulation;

public class Cat {
    public String name;
    protected int id;
    protected String breed;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
