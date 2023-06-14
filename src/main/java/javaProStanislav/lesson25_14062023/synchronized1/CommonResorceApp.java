package javaProStanislav.lesson25_14062023.synchronized1;

public class CommonResorceApp {
    public static void main(String[] args) {

        CommonResource resource = new CommonResource();

        for (int i = 0; i < 6; i++) {
            Thread thread = new Thread(new CommonResourceThread(resource));
            thread.start();
        }
    }

}
