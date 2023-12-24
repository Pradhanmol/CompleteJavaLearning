import java.util.Scanner;

/**
 * DisplayReverseArrayUsingRecursion
 */
public class DisplayReverseArrayUsingRecursion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        displayReverseArray(arr,0);
    }

    private static void displayReverseArray(int[] arr, int i) {
        if(i == arr.length){
            return;
        }
        displayReverseArray(arr, i+1);
        System.out.println(arr[i]);
    }
}