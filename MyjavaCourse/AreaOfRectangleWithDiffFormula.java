import java.util.Scanner;

public class AreaOfRectangleWithDiffFormula {
    public static void main(String[] args) {
        int a,b,c;
        float s;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the all three side of triagle : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = (a+b+c)/2f;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the rectangle is : "+area);
    }
}
