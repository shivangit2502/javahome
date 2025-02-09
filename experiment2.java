// 1. Sum of Digits
import java.util.Scanner;

public class experiment2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);

        // 2. Fibonacci Series
        System.out.print("Enter number of Fibonacci terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();

        // 3. Prime Numbers between 1 and 1000
        int count = 0;
        System.out.println("Prime numbers between 1 and 1000:");
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal prime numbers: " + count);

        // 4. Count Occurrences in Array
        int[] arr = {2, 3, 2, 5, 2, 6};
        int target = 2;
        int occurrence = 0;
        for (int numInArray : arr) {
            if (numInArray == target) {
                occurrence++;
            }
        }
        System.out.println("Occurrences of " + target + ": " + occurrence);

        // 5. Second Largest Element
        int[] array = {12, 35, 1, 10, 34, 1};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int number : array) {
            if (number > first) {
                second = first;
                first = number;
            } else if (number > second && number != first) {
                second = number;
            }
        }
        System.out.println("Second largest element: " + second);

        // 6. Pattern Printing
        int rows = 5; // Adjust for more rows
        for (int i = 1; i <= rows; i++) {
            char symbol = (i % 2 == 1) ? '?' : '#';
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

