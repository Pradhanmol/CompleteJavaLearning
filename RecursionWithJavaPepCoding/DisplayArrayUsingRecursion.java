import java.util.Scanner;

/**
 * DisplayReverseArrayUsingRecursion
 */
public class DisplayArrayUsingRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        diplayArr(arr,0); // here you are giving first index & expecting that element they print all the value of array
    }
 

    private static void diplayArr(int[] arr, int idx) {
        if(idx == arr.length){ // we put the base case call will not get array out of bound exception or in infinite loop 
            return;
        }
        System.out.println(arr[idx]); // here we print the first index of array 
        diplayArr(arr, idx+1); //here we call the same function with increment no. of +1 with updated idx & call get execute & every time print the increment index value 
    }   
}