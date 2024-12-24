import java.util.Scanner;

public class string {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Strings
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is : "+ name);
        // Concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName.length());
        // CharAt
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
        // Compare
        String name1 = "Tony";
        String name2 = "Tony";
        if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        
    }

    }

