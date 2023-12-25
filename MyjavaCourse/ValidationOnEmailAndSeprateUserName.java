import java.util.Scanner;

import javax.swing.text.Style;

public class ValidationOnEmailAndSeprateUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
       Boolean result = validationOnEmail(str);
       System.out.println("Result is true/false : "+result);
       getUserNameFromEmail(str);
    }

    private static void getUserNameFromEmail(String str) {
        String userName = str.substring(0, str.length()-10);
        System.out.println("User name of user is : "+userName);
    }

    private static Boolean validationOnEmail(String str) {
        boolean result = str.endsWith("@gmail.com");
        return result;
    }
}
