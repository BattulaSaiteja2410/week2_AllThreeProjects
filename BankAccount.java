package xenosisweek2;
class BankAccount{
private double balance;
public BankAccount(double initialBalance) {
    balance = initialBalance;
}
public void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited: ₹" + amount);
    System.out.println("Current Balance: ₹" + balance);
}
public void withdraw(double amount) {
    if (balance >= amount) {
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
        System.out.println("Current Balance: ₹" + balance);
    } else {
        System.out.println("Insufficient balance");
    }
}
public void displayBalance() {
System.out.println("Current Balance: ₹" + balance);
}

public static void main(String[] args) {
   
    BankAccount account = new BankAccount(1000.0);


    account.deposit(500.0);

    
    account.withdraw(200.0);

    
    account.displayBalance();
}
}

