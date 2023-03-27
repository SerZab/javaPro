package homeWork.extra.youtube;

import java.util.ArrayList;

public class Clients {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client("Harry Carter", 15, true));
        clients.add(new Client("Tom Bolin", 5, true));
        clients.add(new Client("Andrew Tomson", 8, true));
        clients.add(new Client("Antony Hopkin", 6, false));
        clients.add(new Client("Bill Carter", 9, true));
        clients.add(new Client("Ruslan Pokemonov", 10, false));
        clients.add(new Client("Jim Carry", 3, true));
        clients.add(new Client("Arnold Schwarzneigre", 7, true));

        clients.forEach(client -> client.setSum(client.getSum() -1));
        clients.forEach(client -> client.setActive(!client.isActive()));

        for (Client client : clients){
            System.out.println(client);
        }
    }
}
class Client {
    private String name;
    private int sum;
    private boolean isActive;

    public Client(String name, int sum, boolean isActive) {
        this.name = name;
        this.sum = sum;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                ", isActive=" + isActive +
                '}';
    }
}
