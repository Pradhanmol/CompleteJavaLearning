import java.util.Scanner;

/**
 * FindFirstIndexOfTargetValue
 */
public class FindFirstIndexOfTargetValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int arr[] = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr][i] = in.nextInt();
        }
        int targetValue = in.nextInt();
        int fi = firstIndexValueOfArray(arr,0,targetValue);
        System.out.println(fi);
        
    }

    private static int firstIndexValueOfArray(int[] arr, int i, int targetValue) {

        int fiisa = firstIndexValueOfArray(arr, i+1, targetValue);
        
        return 0;
    }
}