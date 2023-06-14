package homeWork.practice.hw08_14062023;

public class ProductionApp {
    public static void main(String[] args) {
        Production production = new Production();
        Factory factory = new Factory(production);
        Delivery delivery = new Delivery(production);
        Shop shop = new Shop(production);

        // добавляем в цикл 3 раза для наглядности процесса производства / доставки / продажи
        
        for (int i = 0; i < 3; i++) {
            Thread factoryThread = new Thread(factory);
            Thread deliveryThread = new Thread(delivery);
            Thread shopThread = new Thread(shop);

            factoryThread.start();
            try {
                factoryThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            deliveryThread.start();
            try {
                deliveryThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            shopThread.start();
            try {
                shopThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------");
        }
    }
}
