package javaProStanislav.lesson19_22052023.lessoncode;

public class ValidationService {
    /*
    проверка на:
    - продукт не null;
    - длина названия меньше 3 символов;
    - цена не 0;
    - цена меньше 0;
     */
    public void validate (Product product){
        if(product.getName() == null){
            throw new ProductValidation("Product name is null");
        }
        if(product.getName().length() < 3){
            throw new ProductValidation("Product name length less then 3");
        }
        if(product.getPrice() == 0){
            throw new ProductValidation("Product price is null");
        }
        if(product.getPrice() < 0){
            throw new ProductValidation("Product price less then 0");
        }
    }
}
