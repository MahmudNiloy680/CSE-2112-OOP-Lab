import java.util.Scanner;
class BankAccount {
    private double balance = 0;
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: Tk." + amount);
        } else {
            System.out.println("Invalid amount! Cannot deposit negative value.");
        }
    }
    public void showBalance() {
        System.out.println("Current Balance: Tk." + balance);
    }
}
public class Experiment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();
        sc.close();
        acc.deposit(amt);
        acc.showBalance();
    }
}