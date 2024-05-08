package tema14DefiningClassesExerc.task02CompanyRoster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Department {

    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public double calculateAverageSalary(){
        return this.employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    public String getName() {
        return name;
    }
}
