import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string");
        String num = in.nextLine();
        if(num.matches("[01]+")){
            System.out.println("Num is "+num+" a binary, Radix is 2");
        }else if(num.matches("[0-7]*")){
            System.out.println("Num is "+num+" a ocatal, Radix is 8");
        }else if(num.matches("[0-9]+")){
            System.out.println("Num is "+num+" a decimal, Radix is 10");
        }else if(num.matches("[0-9A-F]+")){
            System.out.println("Num is "+num+" a hexadecimal, Radix is 16");
        }else{
            System.out.println("Not a number might be ther is special characte");
        }
    }
}
