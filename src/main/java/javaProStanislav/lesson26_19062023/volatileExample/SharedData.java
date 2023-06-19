package javaProStanislav.lesson26_19062023.volatileExample;

class SharedData {
    private volatile boolean flag = false;

    public void setFlag() {
        flag = true; // Изменяем значение флага
    }

    public void doSomething() {
        if (flag) {
            System.out.println("Флаг установлен!");
        }
    }
}
