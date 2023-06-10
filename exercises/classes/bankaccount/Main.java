package classes.bankaccount;

public class Main {
    public static void main(String[] args) {
        
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber("AT098172340987210987123");
        bankAccount.setCustomerName("Testy McTestface");
        bankAccount.setCustomerEmail("email@email.com");
        bankAccount.setPhoneNumber("321 - 321656216");
        bankAccount.setBalance(0);

        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(45.54);
        bankAccount.deposit(9876.1234);
        bankAccount.withdraw(6137.57);
        bankAccount.deposit(15);
        bankAccount.withdraw(3753.56);
        System.out.println();

        BankAccount bobsBankAccount = new BankAccount("DE32065465635016540654", 0.00, "Bob McBobface", "bob@bob.bob", "+49 654065 6103-01");
        bobsBankAccount.showInfo();
        System.out.println();

        BankAccount defBankAccount = new BankAccount();
        defBankAccount.showInfo();
        System.out.println();

        BankAccount tomsBankAccount = new BankAccount("Tom", "tom@tom.tom", "(tom) 1954 3547");
        tomsBankAccount.showInfo();

        VipCustomer vipCustomer = new VipCustomer();
        vipCustomer.showInfo();
        System.out.println();

        VipCustomer vipCustomer2 = new VipCustomer("Cust2 Name", 50000.00);
        vipCustomer2.showInfo();
        System.out.println();

        VipCustomer vipCustomer3 = new VipCustomer("Cust3 Name", 1000000.00, "Cust3 Email");
        vipCustomer3.showInfo();
        System.out.println();


    }
}
