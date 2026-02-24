public class Account {
    private String accountNumber;
    private Double balance = 0.0;
    private AccountState accountState = new ActiveState();

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }

    public AccountState getAccountState() { return accountState; }

    // Fixed: Added parameter to update the state
    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void deposit(double amount) {
        accountState.deposit(this, amount);
    }

    public void withdraw(double amount) {
        accountState.withdraw(this, amount);
    }

    public void activate() {
        accountState.activate(this); // Fixed typo 'activtate'
    }

    public void suspend() {
        accountState.suspend(this);
    }

    public void close() { // Fixed: Added missing 'void'
        accountState.close(this);
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance + ", Account State: " + accountState.getClass().getSimpleName();
    }
}