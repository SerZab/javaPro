package javaProStanislav.lesson19_22052023.lessoncode;

public class ProductService {
    private final ValidationService validationService;

    public ProductService(ValidationService validationService) {
        this.validationService = validationService;
    }
    public void add (Product product){
        validationService.validate(product);
        System.out.println("Success add new product");
    }
}
