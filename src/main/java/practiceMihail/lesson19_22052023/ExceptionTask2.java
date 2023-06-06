package practiceMihail.lesson19_22052023;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class ExceptionTask2 {
    public static void main(String[] args) {
        List<MyObject> objects = new ArrayList<>();
        objects.add(new MyObject("iMac", "device", 1));
        objects.add(new MyObject("Printer", "device", 2));
        objects.add(new MyObject("Laptop", "device", 3));

        List<MyObject> excList = new ArrayList<>();

        for (MyObject object : objects) {
            try {
                if (object.getName().length() > 5) {
                    continue;
                }
                object.process();
            } catch (ProcessFailedException e) {
                System.out.println(e.getMessage());
                excList.add(object);

            }
        }
        System.out.println(excList);
    }
}
@AllArgsConstructor
@Setter
@Getter
@ToString
class MyObject {
    private String name;
    private String description;
    private int quantity;
    public void process() throws ProcessFailedException {
        throw new ProcessFailedException("Ошибка: " + name);
    }
}

class ProcessFailedException extends Exception {
    public ProcessFailedException(String message) {
        super(message);
    }
}