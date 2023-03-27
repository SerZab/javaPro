package lessons.lesson03_15032023;

abstract class Dog implements Util1, Util2 {
    String name;
    @Override
    public void voice(){
        System.out.println("Dog voice");
    }
    @Override
    public void sleep(){
        System.out.println("Sleep");
    }

}
