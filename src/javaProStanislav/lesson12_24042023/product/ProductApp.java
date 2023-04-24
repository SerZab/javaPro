package javaProStanislav.lesson12_24042023.product;

public class ProductApp {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();

        Product product1 = new Product("Milk", 2.5);
        Product product2 = new Product("Sugar", 3.5);
        Product product3 = new Product("Bread", 1.25);
        Product product4 = new Product("Butter", 1.75);
        Product product5 = new Product("Cheese", 3.15);

        productCatalog.addProduct(1,product1);
        productCatalog.addProduct(2,product2);
        productCatalog.addProduct(3,product3);
        productCatalog.addProduct(4,product4);
        productCatalog.addProduct(5,product5);
        productCatalog.addProduct(5,product4);

        productCatalog.findProduct(2);

        productCatalog.findProduct(7);

        productCatalog.deleteProduct(3);
        productCatalog.deleteProduct(3);



    }
}