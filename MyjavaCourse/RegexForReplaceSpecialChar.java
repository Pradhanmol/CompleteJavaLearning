import java.util.Scanner;

public class RegexForReplaceSpecialChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string which have a special character :-");
        String str = in.nextLine();
        String replaceSplchar = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(replaceSplchar);
    }
}
