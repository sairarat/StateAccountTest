public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("1105", 24000.0);

        myAccount.activate();
        myAccount.suspend();
        myAccount.activate();

        myAccount.deposit(500.0);
        myAccount.withdraw(100.0);

        myAccount.close();

        myAccount.activate();
        myAccount.suspend();

        myAccount.withdraw(500.0);
        myAccount.deposit(1500.0);
    }
}