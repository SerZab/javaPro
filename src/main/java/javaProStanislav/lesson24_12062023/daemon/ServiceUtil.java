package javaProStanislav.lesson24_12062023.daemon;

public class ServiceUtil {
    public static void main(String[] args) {
        DatabaseServer dbc = new DatabaseServer();
        Thread thread1 = new Thread();

        thread1.setDaemon(true);
        thread1.start();

        HttpConnector hc = new HttpConnector();
        Thread thread2 = new Thread();

        thread2.setDaemon(true);
        thread2.start();
    }
}
