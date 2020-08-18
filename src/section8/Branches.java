package section8;

import java.util.ArrayList;

public class Branches {

    private ArrayList<Customer> customers;

    public Branches() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer aCustomer)
    {
        customers.add(aCustomer);
    }

    public void printCustomerInfo()
    {
        for(int i = 0; i < customers.size(); i++)
        {
            System.out.println(customers.get(i).getName());
            System.out.println(customers.get(i).getTransactions());
        }
    }

    public void addTransaction(Customer aCustomer, double transactionAmount)
    {
        aCustomer.addTransaction(transactionAmount);
    }


}
