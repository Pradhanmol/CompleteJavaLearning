import java.util.Scanner;

public class UsingBitWiseOperatorStoreTwo4BitNumInOneVariable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte c;
        System.out.println("Enter the value of a : ");
        byte a = in.nextByte();
        System.out.println("Enter the value of b : ");
        byte b = in.nextByte();
        c = (byte) (a<<4);
        c = (byte) (c||a);
        System.out.println("====Printing the variable after bitmasking : ");
        System.out.println();

    }
}
