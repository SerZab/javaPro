package javaProStanislav.lesson12_24042023.product;

import java.util.HashMap;

public class ProductCatalog {
    private HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(int productId, Product product){
        if (!products.containsKey(productId)){
            products.put(productId,product);
            System.out.println("Product " + product.getName() + " added successfully");
        } else {
            System.out.println("Product with id " + productId + " is already exist");
        }
    }

    public void deleteProduct(int productId){
        if (products.containsKey(productId)){
            products.remove(productId);
            System.out.println("Product with id " + productId + " deleted successfully");
        } else {
            System.out.println("Product with id " + productId + " doesn't exist");
        }
    }

    public Product findProduct(int productId){
        if (products.containsKey(productId)){
            return products.get(productId);
        } else {
            System.out.println("Product with id " + productId + " doesn't exist");
            return null;
        }
    }

}
