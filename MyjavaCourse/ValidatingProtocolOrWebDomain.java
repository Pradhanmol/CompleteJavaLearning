import java.util.Scanner;

public class ValidatingProtocolOrWebDomain {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the url for let it contains which type of protocol & website : ");
         String url = in.nextLine();
         String protocol = url.substring(0,url.indexOf(":"))

    }
}
