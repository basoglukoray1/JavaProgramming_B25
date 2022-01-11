package day30_CustomClass;

public class BankAccount {

        /*
          BanckAccount:
    Attributes:
        accountName, AccountNumber, Balcance

    Actions:
        setInfo, withdraw, deposist, checkAvailableBalance
         */

    public String accountName;
    public int    accountNumber;
    public long   balance;


    public void setInfo(String accountName, int accountNumber, long balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountName='" + accountName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void withdraw(){
        System.out.println(accountName+" withdrawing amount of money");
    }

    public void deposit(){
        System.out.println(accountName+" with "+accountNumber+" making deposit amount of money");
    }
















}
