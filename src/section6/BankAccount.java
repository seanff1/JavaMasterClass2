package section6;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount() {
        this("123", 1.0, "Steve-o", "123@email.com", "02890");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean depositFunds(double amount)
    {
        if (amount > 0)
        {
            this.balance += amount;
            System.out.println("Balance increased by " + amount + ". New balance is - " + getBalance());
            return true;
        }
        return false;
    }

    public boolean withdrawFunds(double amount)
    {
        if(amount < 0 || amount > this.balance)
        {
            System.out.println("Amount below zero or higher than balance");
            return false;
        }
        this.balance -= amount;
        return true;
    }
}
