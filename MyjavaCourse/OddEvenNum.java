import java.util.Scanner;

public class OddEvenNum {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = in.nextInt();
    if(num%2==0){
        System.out.println("Number is even "+num);
    }
    else{
        System.out.println("Number is odd "+num);
    }

    }
}
