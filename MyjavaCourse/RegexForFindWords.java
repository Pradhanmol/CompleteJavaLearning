import java.util.Scanner;

public class RegexForFindWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = in.nextLine();
        String splitIntoWords[] = str.split("\\s+");
        System.out.println("No. of words in a sentence is : "+splitIntoWords.length);
    }
}
