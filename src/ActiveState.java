public class ActiveState implements AccountState {
    @Override
    public void deposit(Account account, double amount) {
        System.out.println("Deposit " + amount + " to account " + account.getAccountNumber());
        account.setBalance(account.getBalance() + amount);
        System.out.println(account + "\n");
    }

    @Override
    public void withdraw(Account account, double amount) {
        System.out.println("Withdraw " + amount + " from account " + account.getAccountNumber());
        account.setBalance(account.getBalance() - amount);
        System.out.println(account + "\n");
    }

    @Override
    public void activate(Account account) {
        System.out.println(account + " is already Active\n");
    }

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println(account + " is now Suspended\n");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println(account + " is now Closed\n");
    }
}