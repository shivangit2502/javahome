// 1. Student Class
class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        this.name = "Default Name";
        t
    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// 2. BankAccount Class
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// 3. Calculator Class
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// 4. University Class
class University {
    static String universityName = "UPES";
    String studentName;

    University(String studentName) {
        this.studentName = studentName;
    }

    static void displayUniversityName() {
        System.out.println("University: " + universityName);
    }

    void displayStudentName() {
        System.out.println("Student Name: " + studentName);
    }
}

// 5. Course Class
class Course {
    String courseName;
    String courseCode;

    Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName + ", Course Code: " + courseCode);
    }
}

// Main Class to Demonstrate Functionality
public class Main {
    public static void main(String[] args) {
        // Student Class Demonstration
        Student defaultStudent = new Student();
        Student customStudent = new Student("Shivangi", 20);
        defaultStudent.displayDetails();
        customStudent.displayDetails();

        // BankAccount Class Demonstration
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        account.checkBalance();

        // Calculator Class Demonstration
        Calculator calc = new Calculator();
        System.out.println("Add Integers: " + calc.add(5, 10));
        System.out.println("Add Doubles: " + calc.add(5.5, 10.5));
        System.out.println("Add Three Integers: " + calc.add(1, 2, 3));

        // University Class Demonstration
        University student1 = new University("Alice");
        University student2 = new University("Bob");
        University.displayUniversityName();
        student1.displayStudentName();
        student2.displayStudentName();

        // Course Class Demonstration
        Course course = new Course("Computer Science", "CS101");
        course.displayCourseDetails();
    }
}

