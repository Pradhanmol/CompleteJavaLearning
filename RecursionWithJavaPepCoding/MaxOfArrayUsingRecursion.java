import java.util.Scanner;

public class MaxOfArrayUsingRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int max = maxOfArray(arr , 0); //so our expectation that this function fight each of our element & give the max whoseevr
        System.out.println(max);
    }

    private static int maxOfArray(int[] arr, int idx) {
        if(idx == arr.length-1){
            return arr[idx];        
        }
        int misa = maxOfArray(arr, idx+1); // so our faith is that function call from the index+1 means from 1th idx to till the array length fight & give the max element & store in misa variable i.e max in small array because are fight the index element array from 1 till the idx
        if (arr[idx]>misa){ // so we need the max in whole array for that we are compare the misa element from array 0th idx
            return arr[idx]; 
        }
        else{
            return misa;
        }
    }   

    // so let's understand the stack frame in above method call in firts time the call happen with 0 idx but call fall on same own method but this time increment of idx get 
    // so again call happen til the edge case breach if you not put the edge case then the call get infinte so call till the edge case
    // after the call completion till the arraylength or edge case then start falling on stack & check what store in the stack & call happen from last call stop & execute for all method call next work accordingly the logic 
}
