package practiceMihail.lesson28_26062023.treeOfModels;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/*
Удобно обрабатывать и предоставлять любую иерархию
Tree of Models
 */
public class Department {
    private String name;
    private List<Employee> employees;
    private List<Department> subDepartment;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
        subDepartment = new ArrayList<>();
    }
}
@Getter
@AllArgsConstructor
class Employee{
    private String name;
    private String position;
}
