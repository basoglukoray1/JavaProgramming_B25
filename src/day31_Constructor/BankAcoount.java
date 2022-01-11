package day31_Constructor;

public class BankAcoount {

    public String accountHolder;
    public long   accountNumber;
    public double balance;


    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    public String toString() {
        return "BankAcoount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: "+ balance);
    }

    public void deposit(double amount){
        if (amount<=0){
            System.err.println("Invalid Amount");
            return;//exits the methods
        }
        System.out.println("Your available balance is : "+ balance+ amount);
    }

    public void withdraw(double amount){
        if (amount> balance){
            System.err.println("Insufficient balance");
            return;
        }
        if (amount<=0){
            System.err.println("thee amount can not be negative or zero");
            return;
        }

        balance -= amount;


    }










}
