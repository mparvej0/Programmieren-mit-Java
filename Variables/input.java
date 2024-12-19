package Variables;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // Single Scanner object
        Scanner sc = new Scanner(System.in);

        // Read name
        System.out.println("Enter your name:");
        String name = sc.nextLine(); // Use nextLine() to read the full line
        System.out.println("Hello, " + name);

        // Read two integers
        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calculate and print the sum
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Close Scanner
        sc.close();
    }
}
