class BankAccount {
    private static int nextAccountNumber = 1000;
    private String name;
    private String address;
    private String accountType;
    private double balance;
    private int numberOfTransactions;
    private String accountNumber;

    // Constructor
    public BankAccount(String name, String address, String accountType, double balance) {
        this.name = name;
        this.address = address;
        this.accountType = accountType;
        this.balance = balance;
        this.numberOfTransactions = 0;
        this.accountNumber = "BA" + nextAccountNumber++;
    }

    // Method to display information and balance of depositor
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    // Method to deposit more amount
    public void deposit(double amount) {
        balance += amount;
        numberOfTransactions++;
    }

    // Method to withdraw some amount
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            numberOfTransactions++;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to change address
    public void changeAddress(String newAddress) {
        this.address = newAddress;
    }

    // Getter for numberOfTransactions
    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }
}

public class BankAccountData {
    public static void main(String[] args) {
        // Sample input
        BankAccount account1 = new BankAccount("Ratul", "Trishal", "Savings", 1000);
        account1.displayInfo();

        // Deposit and display final information
        account1.deposit(500);
        System.out.println("\nAfter deposit:");
        account1.displayInfo();

        // Withdraw and display final information
        account1.withdraw(200);
        System.out.println("\nAfter withdrawal:");
        account1.displayInfo();

        // Change address and display final information
        account1.changeAddress("Mymensingh");
        System.out.println("\nAfter address change:");
        account1.displayInfo();

        // Total number of transactions
        int totalTransactions = account1.getNumberOfTransactions();
        System.out.println("\nTotal number of transactions: " + totalTransactions);
    }
}
