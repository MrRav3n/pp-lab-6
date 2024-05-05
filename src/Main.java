import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2500, 101, "2022-01-15", "Junior Worker");
        Worker worker2 = new Worker("Alice", 2700, 102, "2021-12-20", "Senior Worker");
        Worker worker3 = new Worker("Bob", 2600, 103, "2023-03-10", "Mid-level Worker");
        Worker worker4 = new Worker("Emily", 2800, 104, "2023-05-01", "Senior Worker");

        Manager manager = new Manager("Michael", 5000, 201, "2020-05-10", "Project Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
            employee.work();
        }
    }
}