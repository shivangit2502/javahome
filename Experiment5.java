// Combined Java Program for Inheritance, Polymorphism, and Classes
import java.util.*;

public class Experiment5 {
    /* 1. Private Member Access Demonstration */
    class SuperClass {
        private int privateMember = 100;
        public int getPrivateMember() {
            return privateMember;
        }
    }
    class SubClass extends SuperClass {
        void display() {
            System.out.println("Private member (via getter): " + getPrivateMember());
        }
    }

    /* 2. Player and Subclasses */
    class Player {
        String name;
        int age;
        String position;
        Player(String name, int age, String position) {
            this.name = name;
            this.age = age;
            this.position = position;
        }
        void play() { System.out.println(name + " is playing at " + position); }
        void train() { System.out.println(name + " is training."); }
    }
    class Cricket_Player extends Player {
        Cricket_Player(String name, int age, String position) { super(name, age, position); }
    }
    class Football_Player extends Player {
        Football_Player(String name, int age, String position) { super(name, age, position); }
    }
    class Hockey_Player extends Player {
        Hockey_Player(String name, int age, String position) { super(name, age, position); }
    }

    /* 3. Worker and Subclasses */
    abstract class Worker {
        String name;
        double salaryRate;
        Worker(String name, double salaryRate) { this.name = name; this.salaryRate = salaryRate; }
        abstract double computePay(int hours);
    }
    class DailyWorker extends Worker {
        DailyWorker(String name, double salaryRate) { super(name, salaryRate); }
        double computePay(int hours) { return (hours / 8) * salaryRate; }
    }
    class SalariedWorker extends Worker {
        SalariedWorker(String name, double salaryRate) { super(name, salaryRate); }
        double computePay(int hours) { return salaryRate * 40; }
    }

    /* 4. Trunk Call Charges Calculation */
    class TrunkCall {
        double duration;
        String type;
        TrunkCall(double duration, String type) {
            this.duration = duration;
            this.type = type;
        }
        double calculateCharge() {
            return switch(type.toLowerCase()) {
                case "ordinary" -> duration * 2.0;
                case "urgent" -> duration * 3.0;
                case "lightning" -> duration * 5.0;
                default -> 0;
            };
        }
    }

    /* 5. Employee and Manager */
    class Employee {
        String name;
        int empid;
        double salary;
        Employee() {}
        Employee(String name, int empid, double salary) {
            this.name = name; this.empid = empid; this.salary = salary;
        }
        String getName() { return name; }
        double getSalary() { return salary; }
        void increaseSalary(double percentage) { salary += salary * percentage / 100; }
    }
    class Manager extends Employee {
        String department;
        Manager(String name, int empid, double salary, String department) {
            super(name, empid, salary); this.department = department;
        }
    }

    // Main Method for Testing
    public static void main(String[] args) {
        Experiment5 exp = new Experiment5();
        SubClass subclass = exp.new SubClass();
        subclass.display();
        
        Cricket_Player cp = exp.new Cricket_Player("Virat", 35, "Batsman");
        cp.play(); cp.train();

        DailyWorker dw = exp.new DailyWorker("Raj", 500);
        System.out.println("DailyWorker Pay: " + dw.computePay(40));

        SalariedWorker sw = exp.new SalariedWorker("Amit", 1000);
        System.out.println("SalariedWorker Pay: " + sw.computePay(45));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter duration (minutes): ");
        double duration = scanner.nextDouble();
        System.out.print("Enter call type (Ordinary/Urgent/Lightning): ");
        String type = scanner.next();
        TrunkCall call = exp.new TrunkCall(duration, type);
        System.out.println("Total Charge: " + call.calculateCharge());

        Manager mgr = exp.new Manager("Alice", 101, 75000, "HR");
        System.out.println("Manager Salary Before Increase: " + mgr.getSalary());
        mgr.increaseSalary(10);
        System.out.println("Manager Salary After Increase: " + mgr.getSalary());

        scanner.close();
    }
}

