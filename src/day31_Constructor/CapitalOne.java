package day31_Constructor;

public class CapitalOne {
    public static void main(String[] args) {

        BankAcoount account1 = new BankAcoount();
        account1.setInfo("Koray Basoglu", 1241651);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);

        account1.checkBalance();

        account1.deposit(900);

        account1.checkBalance();

        System.out.println("--------------------------------------");

        BankAcoount account2 = new BankAcoount();
        account2.setInfo("Aygun", 987456123);

        account2.deposit(10000);

        account2.checkBalance();




















    }
}
