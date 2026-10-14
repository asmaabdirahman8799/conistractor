public class Account {

    String accountHolder;
    double balance;

    Account(String a, double b) {
        accountHolder = a;
        balance = b;
    }

    void showBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        Account account1 = new Account("Asma", 500.0);
        Account account2 = new Account("Abdirahman", 1000.0);

        account1.showBalance();
        account2.showBalance();
    }
}