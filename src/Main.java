import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2500, 101, "2022-01-15", "Junior Worker");
        Worker worker2 = new Worker("Alice", 2700, 102, "2021-12-20", "Senior Worker");
        Worker worker3 = new Worker("Bob", 2600, 103, "2023-03-10", "Mid-level Worker");
        Worker worker4 = new Worker("Emily", 2800, 102, "2023-05-01", "Senior Worker"); // Worker with the same id as worker2

        Manager manager = new Manager("Michael", 5000, 201, "2020-05-10", "Project Manager");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(worker4.getName() + " has code: " + worker4.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker4.getName() + " equals " + worker2.getName() + ": " + worker4.equals(worker2));
        System.out.println(worker4.getName() + " equals " + worker3.getName() + ": " + worker4.equals(worker3));
        System.out.println(worker4.getName() + " equals " + manager.getName() + ": " + worker4.equals(manager));
    }
}