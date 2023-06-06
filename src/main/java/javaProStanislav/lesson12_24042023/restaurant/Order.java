package javaProStanislav.lesson12_24042023.restaurant;

public class Order {
    private int id;
    private String dishName;
    private int qty;
    private double costOfDish;

    public Order(int id, String dishName, int qty, double costOfDish) {
        this.id = id;
        this.dishName = dishName;
        this.qty = qty;
        this.costOfDish = costOfDish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getCostOfDish() {
        return costOfDish;
    }

    public void setCostOfDish(double costOfDish) {
        this.costOfDish = costOfDish;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dishName='" + dishName + '\'' +
                ", qty=" + qty +
                ", costOfDish=" + costOfDish +
                '}';
    }
}
