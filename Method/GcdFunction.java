package Method;

import java.util.Scanner;

public class GcdFunction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("GCD of "+num1+", "+num2+" is "+GcdCalculation(num1, num2));
    }
    public static int GcdCalculation(int n1, int n2) {
        while (n1!=n2) {
            if (n1>n2) {
                n1 = n1-n2;
            } else {
                n2 = n2-n1;
            }
        }  
        return n1;
    }
}
