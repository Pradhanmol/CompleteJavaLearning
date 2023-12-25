import java.util.Scanner;

public class RegexForRemoveSpace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = in.nextLine();
        String removeSpace = str.replaceAll("\\s+", " ");
        System.out.println(removeSpace);

    }
}
