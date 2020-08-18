package section8;


import java.util.ArrayList;

public class Bank {

    private ArrayList<Branches> branches;

    public Bank() {
        this.branches = new ArrayList<>();
    }

    public void addBranch(Branches aBranch)
    {
        branches.add(aBranch);
    }

    public void addCustomerToBranch(Branches aBranch, Customer aCustomer)
    {
        aBranch.addCustomer(aCustomer);
    }

    public void addTransaction(Branches aBranch, Customer aCustomer, double transactionAmount)
    {
        aBranch.addTransaction(aCustomer, transactionAmount);
    }



}
