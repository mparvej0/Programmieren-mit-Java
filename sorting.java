import java.util.*;
public class sorting {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        // Buble sort
        for(int j = 0; j<arr.length-j-1; j++) {
            if(arr[j] >arr[j+1]) {
                // Swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        printArray(arr);
    }
}
