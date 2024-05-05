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
        Worker worker5 = new Worker("David", 2900, 102, "2022-11-10", "Junior Worker"); // Worker with the same id as worker2

        Manager manager1 = new Manager("Michael", 5000, 201, "2020-05-10", "Project Manager");
        Manager manager2 = new Manager("Sophia", 6000, 202, "2021-08-15", "Senior Manager");
        Manager manager3 = new Manager("Sarah", 5500, 203, "2023-02-20", "Junior Manager"); // Manager with the same id as worker3

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Total salary of all employees: $" + totalSalary);
        System.out.println("Total salary of all managers: $" + totalManagerSalary);
        System.out.println("Total salary of all workers: $" + totalWorkerSalary);

        for (Employee employee : employees) {
            for (Employee otherEmployee : employees) {
                if (employee.equals(otherEmployee) && employee != otherEmployee) {
                    System.out.println(employee.getName() + " has a duplicate with ID: " + employee.hashCode());
                }
            }
        }
    }
}