package section8;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> myContacts;

    public MobilePhone() {
        this.myContacts = new ArrayList<>();
    }

    public boolean addContact(Contacts aContact)
    {
        if(doesContactExist(aContact))
        {
            System.out.println("Contact already exists!!!");
            return false;
        }

        myContacts.add(aContact);
        System.out.println("Contact " + aContact.getName() + " added");
        return true;
    }

    private boolean doesContactExist(Contacts aContact)
    {
        return this.myContacts.contains(aContact);
    }

    public void printContacts()
    {
        for(int i = 0; i < myContacts.size(); i++)
        {
            System.out.println(myContacts.get(i).getName() + " " +  myContacts.get(i).getPhoneNumber());
        }
    }


}
