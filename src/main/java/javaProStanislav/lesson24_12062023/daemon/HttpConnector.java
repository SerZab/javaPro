package javaProStanislav.lesson24_12062023.daemon;

public class HttpConnector implements Runnable{
    @Override
    public void run() {
        while (true){
            // делается запрос по http протоколу по адресу ip
            // получаем ответ
            // если не пустой
            try {
                Thread.sleep(600000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
