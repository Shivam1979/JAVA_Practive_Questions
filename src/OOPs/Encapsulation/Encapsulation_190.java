package OOPs.Encapsulation;
import java.util.Scanner;
/**
 * 190. *Encapsulation:* 🔒 Create a class "BankAccount" with private attributes
 * like account number and balance. Provide public methods for deposit and
 * withdrawal, Add getter and setter  :   and implement if anyone  want to
 * change the private member value by getter and setter the ask with the password ,
 * if password  is = "ayushi". then only change the value else show the message
 * "you are not admin"  💰
 */
class BankAccount {
    Scanner sc = new Scanner(System.in);
    private long account_number = 545605602;
    private long balance = 1750000;//Rs
    public long getAccount_number() {
        return account_number;
    }
    public void setAccount_number(long account_number) {
        System.out.println("Enter a Password");
        String pass = sc.nextLine();
        if (pass.equals("ayushi")) {
            this.account_number = account_number;
            System.out.println("Account number  set succesfully ");
        } else System.out.println("You are not admin ");
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        System.out.println("Enter a Password");
        String pass = sc.nextLine();
        if (pass.equals("ayushi")) {
            this.balance = balance;
            System.out.println("Balance set succesfully ");
        } else System.out.println("You are not admin ");
    }
}
public class Encapsulation_190 {
    public static void main(String[] args) {
        BankAccount ob = new BankAccount();
        System.out.println("Current balance : "+ob.getBalance());
        System.out.println("Account number : "+ob.getAccount_number());
        ob.setBalance(200000);
        ob.setAccount_number(898945);
    }

}
