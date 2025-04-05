package Experiment7;

public class Experiment7 {
    public static void main(String[] args) {

        System.out.println("\n--- Shape: Rectangle ---");
        Rectangle rect = new Rectangle();
        rect.calculateArea();

        System.out.println("\n--- Shape: Circle ---");
        Circle cir = new Circle();
        cir.calculateArea();

        System.out.println("\n--- Employee: Manager ---");
        Manager mgr = new Manager();
        mgr.displayDetails();
        mgr.calculateSalary();

        System.out.println("\n--- Employee: Developer ---");
        Developer dev = new Developer();
        dev.displayDetails();
        dev.calculateSalary();

        System.out.println("\n--- Bank Operations ---");
        Acc acc = new Acc();
        acc.deposit(10000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}
