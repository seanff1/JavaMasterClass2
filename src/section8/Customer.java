package section8;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions;
    private String name;

    public Customer(String aName, double transactionAmount) {
        this.transactions = new ArrayList<>();
        this.name = aName;
        this.transactions.add(transactionAmount);
    }

    public Customer(String aName) {
        this.transactions = new ArrayList<>();
        this.name = aName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTransaction(double transactionAmount)
    {
        this.transactions.add(transactionAmount);
    }
}
