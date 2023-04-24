package javaProStanislav.lesson12_24042023.restaurant;

import java.util.LinkedList;

public class OrderUtil {
    private LinkedList<Order> orders = new LinkedList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(int id) {
        for(Order order : orders){
            if(order.getId() == id){
                orders.remove(order);
            }
        }
        orders.remove(id);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Order order : orders) {
            totalCost += order.getCostOfDish() * order.getQty();
        }
        return totalCost;
    }

    public int getOrdersCount() {
        return orders.size();
    }

//    public Order getOrderById(int id) {
//
//    }

    public LinkedList<Order> getOrders() {
        return orders;
    }
}
