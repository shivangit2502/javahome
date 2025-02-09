import java.util.Scanner;

public class experiment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Area of Triangle
        System.out.print("Enter base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle: " + area);

        // 2. Simple Interest
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        // 3. Command Line Calculator
        if (args.length == 3) {
            int num1 = Integer.parseInt(args[0]);
            String operator = args[1];
            int num2 = Integer.parseInt(args[2]);

            switch (operator) {
                case "+":
                    System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Product of " + num1 + " and " + num2 + " is " + (num1 * num2));
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }

        // 4. Check if Number is Positive, Negative, or Zero
        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // 5. Greatest of Three Numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println("Greatest number is: " + num1);
            } else {
                System.out.println("Greatest number is: " + num3);
            }
        } else {
            if (num2 >= num3) {
                System.out.println("Greatest number is: " + num2);
            } else {
                System.out.println("Greatest number is: " + num3);
            }
        }

        // 6. Day of the Week
        System.out.print("Enter a number (1-7) for the day of the week: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input. Enter a number between 1 and 7.");
        }
    }
}

