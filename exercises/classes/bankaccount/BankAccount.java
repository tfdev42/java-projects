package classes.bankaccount;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    // Constructor
    public BankAccount(){
        // 'this' must be #1 line
        this("001", 2.5, "Default Name", "Default email", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }    

    public BankAccount(String customerName, String customerEmail, String phoneNumber) {
        this("99999", 100.55, customerName, customerEmail, phoneNumber);
    }

    // Setters / Getters
    public void setCustomerName(String name){
        this.customerName = name;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setBalance(long balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // METHODS
    public double deposit(double funds){
        if (funds < 0) {
            System.out.println("Deposit must be positive");            
        }
        else balance += funds;
        System.out.printf("New Balance after depositing %.2f : %.2f%n", funds, balance);
        return balance;
    }
    public double withdraw(double funds){
        if (balance < funds) {
            System.out.printf("Can't withdraw %.2f, balance is %.2f%n", funds, getBalance());
        }
        else {
            balance -= funds;
            System.out.printf("New Balance after withdrawing %.2f: %.2f%n", funds, balance);
        }
        return balance;
    }
    public void showInfo(){
        System.out.printf("Customer name: %s%n", getCustomerName());
        System.out.printf("Customer Account number: %s%n", getAccountNumber());
        System.out.printf("Account balance: %.2f%n", getBalance());
        System.out.printf("Customer Email: %s%n", getCustomerEmail());
        System.out.printf("Customer Phone: %s%n", getPhoneNumber());
        System.out.println();
    }



}
