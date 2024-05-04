import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2500, 101);
        Worker worker2 = new Worker("Alice", 2700, 102);
        Worker worker3 = new Worker("Bob", 2600, 103);
        Worker worker4 = new Worker("Emily", 2800, 104);

        Manager manager = new Manager("Michael", 5000, 201);

        System.out.println("Salary of " + worker1.getName() + ": " + worker1.getSalary());
        worker1.work();

        System.out.println("Salary of " + worker2.getName() + ": " + worker2.getSalary());
        worker2.work();

        System.out.println("Salary of " + worker3.getName() + ": " + worker3.getSalary());
        worker3.work();

        System.out.println("Salary of " + worker4.getName() + ": " + worker4.getSalary());
        worker4.work();

        System.out.println("Salary of " + manager.getName() + ": " + manager.getSalary());
        manager.work();
    }
}