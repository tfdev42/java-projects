package classes.bankaccount;

public class VipCustomer {    
    private String name;
    private double creditLimit;
    private String email;
    
    // Constructors
    public VipCustomer() {
        this("Default VIP Name", 100000.00, "Default VIP Email");
        System.out.println("Empty VIP Constructor called");
    }
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default VIP Email");
        System.out.println("VIP Constructor default Email called");
    }
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Full VIP Constructor called");
    }
    

    // GETTERS
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }

    // METHODS
    public void showInfo(){
        System.out.printf("VIP Customer name: %s%n", getName());
        System.out.printf("VIP Customer Account Limit: %.2f%n", getCreditLimit());
        System.out.printf("VIP Account Email: %s%n", getEmail());
    }


}
