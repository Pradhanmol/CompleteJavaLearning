import java.util.Scanner;

public class SwapingByBitMasking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a : ");
        a = in.nextInt();
        System.out.println("Enter the value of b : ");
        b = in.nextInt();
        System.out.println("====Using BitMasking====");
        swapByBitMasking(a,b);
        System.out.println("====Using without third variable====");
        swapBywithoutThirdVariable(a,b);
    }

    private static void swapBywithoutThirdVariable(int a, int b) {
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap value of a is "+a);
        System.out.println("After swap value of b is : "+b);
    }

    private static void swapByBitMasking(int a, int b) {
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swap value of a is "+a);
        System.out.println("After swap value of b is : "+b);
    }
    
}
