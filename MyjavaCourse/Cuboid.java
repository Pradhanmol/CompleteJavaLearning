import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, breadth, height;
        double area, volume;
        System.out.println("Enter the length, breadth, height below : ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
        volume = length*breadth*height;
        int frontAndBack = length*height;
        int leftAndRight = height*breadth;
        int topAndBottom = length*breadth;
        area = 2*(frontAndBack+leftAndRight+topAndBottom);
        System.out.println("Area of cuboid  : " + area);
        System.out.println("Volume of cuboid : "+ volume);        
    }
}
