import java.util.Date;
import java.util.Scanner;

class AccountNumber{
    private String accountname;
    private String regionName;
    private String panNumber;
    private String accountNum;
    private String assignAccountNumber()
    {
        Date d = new Date();
        
        String accNum = accountname.substring(0,3)+panNumber+regionName.substring(0,3);
        return accNum;
    }

    AccountNumber(String name, String region, String pan){
        this.accountname = name;
        this.regionName = region;
        this.panNumber = pan;
        this.accountNum = assignAccountNumber();
    }

    public String getAccountNum(){
        return accountNum;
    }

}


public class Account {
    public static void main(String[] args) {
        String name, pan, region;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Account name : -");
        name = in.nextLine();
        System.out.println("Enter region name : - ");
        region = in.nextLine();
        System.out.println("Enter PAN number :-");
        pan = in.nextLine();
        AccountNumber ac1 = new AccountNumber(name, region, pan);

        System.out.println("Generated ACcount number is : - "+ac1.getAccountNum() );
    }
}
