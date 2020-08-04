package section8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MobilePhone {

    private ArrayList<Contacts> myContacts;
    private HashSet<String> contactNames;

    public MobilePhone() {
        this.myContacts = new ArrayList<>();
        this.contactNames = new HashSet<>();
    }


    public HashSet<String> getContactNames() {
        return contactNames;
    }

    public boolean addContact(Contacts aContact)
    {
        if(contactNames.add(aContact.getName()) == true)
        {
            myContacts.add(aContact);
            System.out.println("Contact " + aContact.getName() + " added");
            return true;
        }

        System.out.println("Contact " + aContact.getName() + " already saved - please choose a different name");
        return false;
    }

    public int doesContactExist(Contacts aContact)
    {
        return this.myContacts.indexOf(aContact);
    }

    public int doesContactExist(String aString)
    {
        for(int i = 0; i < myContacts.size(); i++)
        {
            if(myContacts.get(i).getName().equals(aString))
            {
                return i;
            }
        }
        return -1;
    }

    

    public void printContacts()
    {
        System.out.println("\n" + "Following contacts are stored: ");
        for(int i = 0; i < myContacts.size(); i++)
        {
            System.out.println(myContacts.get(i).getName() + " " +  myContacts.get(i).getPhoneNumber());
        }
    }

    public void printNames()
    {
        System.out.println(contactNames.toString());
    }

    public void removeContact(String name)
    {
        int pos = doesContactExist(name);

        if(pos >= 0)
        {
            String nameToRemove = myContacts.get(pos).getName();
            myContacts.remove(myContacts.get(pos));
            contactNames.remove(nameToRemove);

            System.out.println("\n" + "Removing: " + nameToRemove);
        }
    }

    public void editContact(String nameToEdit, String newName, String newNumber)
    {
        int pos = doesContactExist(nameToEdit);

        if(pos >= 0)
        {
            System.out.println("\n" +  "Updating " + nameToEdit + " to " + newName + " " + newNumber);
            Contacts aContact = new Contacts(newName, newNumber);
            myContacts.set(pos, aContact);
            contactNames.remove(nameToEdit);
            contactNames.add(newName);
        }

    }






}
