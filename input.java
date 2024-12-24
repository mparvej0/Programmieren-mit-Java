import java.util.*;

public class input {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Enter the first number: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the second number: ");
        int b = Integer.parseInt(sc.nextLine());
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}
