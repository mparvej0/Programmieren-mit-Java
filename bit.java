import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        // Get Bit
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        if((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }

        // Set Bit
        int n1 = 5;
        int pos1 = 1;
        int bitMask1 = 1<<pos1;
        int newNumber = bitMask1 | n1;
        System.out.println(newNumber);

        // Clear Bit
        int n2 = 5;
        int pos2 = 1;
        int bitMask2 = 1<<pos2;
        int notBitMask = ~(bitMask2);
        int newNumber1 = notBitMask & n2;
        System.out.println(newNumber1);

        // Update Bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n3 = 5;
        int pos3 = 1;
        if(oper == 1) {
            int bitMask3 = 1<<pos3;
            int newNumber2 = bitMask3 | n;
            System.out.println(newNumber2);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber2 = newBitMask & n3;
            System.out.println(newNumber2);
        }
    }
}
