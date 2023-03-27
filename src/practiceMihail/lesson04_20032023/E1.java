package practiceMihail.lesson04_20032023;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

public class E1 {
}

enum SecurityLevel {
    LOW,
    MEDIUM,
    HIGH
}

class Company {
    private String name;
    private List<Department> departmentList;
}


enum Department {
    IT,
    HR,
    FINANCE,
    SALES;
    private List<Information> information;

}

class Information {
    String info;
}

@AllArgsConstructor
@Getter
class Employee {
    private String name;
    private Department department;
    private SecurityLevel securityLevel;
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ivan", Department.HR, SecurityLevel.LOW);
        if(e1.getSecurityLevel() == SecurityLevel.LOW) {
            System.out.println("No info");
        }
    }
}
