package src;

import src.util.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        Employee e1 = new Employee(123, "Troy", 24, 30000);
        Employee e2 = new Employee(137, "Sam", 29, 45000);
        Employee e3 = new Employee(111, "John", 27, 33000);
        Employee e4 = new Employee(121, "Joe", 28, 33000);
        Employee e5 = new Employee(131, "Nick", 21, 25000);

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);

        System.out.println("Original list " + emp);

        //Increment salary by 10% for employees greater than age 25
        List<Employee> incrementedSalary = emp.stream().map(employee -> {
            if(employee.getAge() > 25) {
                employee.setSalary(employee.getSalary() * 1.10);
            }
            return employee;
        }).collect(Collectors.toList());

        System.out.println("Incremented Salary " + incrementedSalary);
    }
}
