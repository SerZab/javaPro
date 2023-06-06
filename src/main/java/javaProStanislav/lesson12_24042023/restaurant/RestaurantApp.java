package javaProStanislav.lesson12_24042023.restaurant;

import java.util.LinkedList;

public class RestaurantApp {
    public static void main(String[] args) {
        OrderUtil orders = new OrderUtil();
        Order order1 = new Order(1, "Солянка", 2, 5.00);
        Order order2 = new Order(2,"Борш", 2, 6.00);
        Order order3 = new Order(3,"Пельмени", 4, 4.00);
        Order order4 = new Order(4,"Шашлык", 2, 8.00);

        orders.addOrder(order1);
        orders.addOrder(order2);
        orders.addOrder(order3);
        orders.addOrder(order4);
        System.out.println("Количество заказов: " + orders.getOrdersCount());
        System.out.println("Общая стоимость заказа: " + orders.getTotalCost());
        //System.out.println("Заказ по id: " + orders.getOrderById(2));
        //orders.removeOrder(3);

        LinkedList<Order> orderList = orders.getOrders();
        for (Order order : orderList) {
            System.out.println(order.getDishName() + ": " + order.getQty() + " шт., " + order.getCostOfDish() + " Euro");
        }
    }
}
