import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float area,base,height;
        System.out.println("Enter the base of triangle : \n");
        base = sc.nextFloat();
        System.out.println("Enter the height of triangle : \n");
        height = sc.nextFloat();
        area = (base*height)/2;
        System.out.println("Area of rectangle is : "+area);
    }
}
