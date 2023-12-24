import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.io.Serializable;

class Account implements Serializable {
    String accountNumber;
    String accountName;
    double accountBalance;

    //declared private constructor for intializing the value    
    public Account(String accountNumber, String accountName, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
    //declaring the getter setter properties for members of class
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Account No:"+accountNumber+"\nName :"+accountName+"\nBalance :"+accountBalance  +"\n";
    }
}


public class MenuDriverRelatedToAccount {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Account acc = null;
        HashMap<String, Account> hm = new HashMap<>();
        try {
            //using for reading the file if data is there
            FileInputStream fis = new FileInputStream("Account.txt");
            //using this ois for achieving the serialization it means it help us to save the data as it is form of members.
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            //checking the count of the object 
            int count = ois.readInt();
            //iterate over the data i.e present in file 
            for (int i = 0; i < count; i++) {
                acc = (Account) ois.readObject();
                System.out.println(acc);
                hm.put(acc.accountNumber, acc);
            }
            fis.close();
            ois.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }

        FileOutputStream fos = new FileOutputStream("Account.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("Menu Driver For Account");

        //for menu purpose we need few members

        int choice;
        String accNumber, accName;
        double accBalance;
        do{
            System.out.println("1. Create account");
            System.out.println("2. Delete account");
            System.out.println("3. View account");
            System.out.println("4. View all accounts");
            System.out.println("5. Save account");
            System.out.println("6. Exit");

            System.out.println("Enter Choice");

            choice = sc.nextInt();

            switch (choice) {
                case 1:System.out.println("Enter Account no. : ");
                accNumber = sc.next();
                System.out.println("Enter Account name : ");
                accName = sc.next();
                System.out.println("Enter the balance : ");
                accBalance = sc.nextDouble();
                acc = new Account(accNumber, accName, accBalance);
                hm.put(accNumber, acc);
                 break;
                 case 2 : System.out.println("Enter the account number which you wan to delete : ");
                 accNumber = sc.next();
                 hm.remove(accNumber);
                 break;
                 case 3 : System.out.println("Enter the account number which you want to see the details : ");
                 accNumber = sc.next();
                 acc = hm.get(accNumber);
                 System.out.println(acc);
                 break;
                 case 4 : System.out.println("Viewing all account : ");
                 for (Account a : hm.values()) {
                    System.out.println(a);
                 }
                 break;
                 case 5 : 
                 case 6 : oos.writeInt(hm.size());
                 for (Account a : hm.values()) {
                    oos.writeObject(a);
                 }
            }
        }while(choice!=6);

        oos.flush();
        oos.close();
        fos.close();
    }
}
