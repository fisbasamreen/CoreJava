package src;

import src.util.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareEmployee {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        Employee e1 = new Employee(123, "Troy", 25);
        Employee e2 = new Employee(137, "Sam", 27);
        Employee e3 = new Employee(111, "John", 22);

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        System.out.println("Original list " + emp);

        //Sorting based on name - Java11
        emp.sort(Comparator.comparing(Employee::getName));
        System.out.println("Sorting based on name " + emp);

        //Sorting based on name - Java8
        emp.sort((emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
        System.out.println("Sorting based on name " + emp);

    }
}
