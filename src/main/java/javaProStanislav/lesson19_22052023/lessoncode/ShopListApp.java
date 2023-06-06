package javaProStanislav.lesson19_22052023.lessoncode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShopListApp {
    public static void main(String[] args) {
        ValidationService validationService = new ValidationService();
        ProductService productService = new ProductService(validationService);

        while (true){
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter product name: ");
                String name = scanner.nextLine();
                System.out.println("Enter product price");
                Double price = scanner.nextDouble();
                Product product = new Product(name,price);
                productService.add(product);
            }catch (ProductValidation e){
                System.out.println("Validation failed");
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("Incorrect number entered");
            }catch (InputMismatchException e){
                System.out.println("Incorrect input type data");
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
