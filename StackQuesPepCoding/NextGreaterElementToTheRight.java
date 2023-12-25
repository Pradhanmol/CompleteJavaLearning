import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementToTheRight {
    public static void main(String[] args) {
        // scanner object for taking input from keyboard
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of array input");
        int size = in.nextInt();
        Long arr[] = new Long[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLong();
        }
        // after taking input we need to find the next greater element to the right 
        Long resultNge[] = NextGreaterElementToTheRight.findNextGreaterElementToTheRight(arr);
    }

    private static Long findNextGreaterElementToTheRight(Long[] arr) {
        // first we need to push all value in stack
        int nge[] = new int[arr.length];// creating resultant array size of next greater element array from input array length 
        // creating stack where the array is store & compute
        Stack<Long> st = new Stack<>();
        //push last element of array in stack 
        st.push(arr[arr.length-1]);
        // setting last index of resultant array as -1;
        nge[arr.length-1] = -1;
        // traverse the array in reverse fashion & do the push pop accordingly
        for (int i = arr.length-2; i >=0; i--) {
            //i need to see the first element in stack & compare it with present one if it was not compaitable with elements 
            while()
        }
        return
    }
}
