package javaProStanislav.test3;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerPurchaseHistory {
    private Map<LocalDate, List<String>> purchaseHistory;

    public CustomerPurchaseHistory() {
        purchaseHistory = new HashMap<>();
    }

    public void addOrder(LocalDate orderDate, List<String> itemNames) {
        purchaseHistory.put(orderDate, itemNames);
    }

    public Map<LocalDate, List<String>> getPurchaseHistory() {
        return purchaseHistory;
    }

    public static void main(String[] args) {

        CustomerPurchaseHistory history1 = new CustomerPurchaseHistory();
        history1.addOrder(LocalDate.now().minusDays(15), Arrays.asList("Товар1", "Товар2", "Товар3"));
        history1.addOrder(LocalDate.now().minusDays(25), Arrays.asList("Товар3", "Товар4", "Товар5"));

        CustomerPurchaseHistory history2 = new CustomerPurchaseHistory();
        history2.addOrder(LocalDate.now().minusDays(5), Arrays.asList("Товар1", "Товар2", "Товар6"));
        history2.addOrder(LocalDate.now().minusDays(35), Arrays.asList("Товар7", "Товар8", "Товар9"));

        LocalDate currentDate = LocalDate.now();
        LocalDate thirtyDaysAgo = currentDate.minusDays(30);

        Set<String> allItemNames = Stream.concat(history1.getPurchaseHistory().entrySet().stream(),
                        history2.getPurchaseHistory().entrySet().stream())
                .filter(entry -> entry.getKey().isAfter(thirtyDaysAgo))
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.toSet());

        allItemNames.forEach(System.out::println);
    }
}
