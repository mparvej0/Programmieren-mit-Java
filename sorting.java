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

        // Selection Sort
        for(int i=0; i<arr.length-1; i++) {
            int samllest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[samllest] > arr[j]) {
                    samllest = j;
                }
            }
            int temp = arr[samllest];
            arr[samllest] = arr[i];
            arr[i] = temp;
        }

        // // Insertiion sort
        // for(int i=1; i<arr.length; i++) {
        //     int current = arr[i];
        //     int j = i-1;
        //     while(j >= 0 && arr[current] < arr[j]) {
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     // Placement
        //     arr[j+1] = current;
        // }

        printArray(arr);

    }
}
