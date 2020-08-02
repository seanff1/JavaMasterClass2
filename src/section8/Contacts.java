package section8;

import java.util.ArrayList;

public class Contacts {

    private String name;
    private String phoneNumber;

    //store , modify, remove, query


    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts addNewContact(String name, String phoneNumber)
    {
        return new Contacts(name, phoneNumber);
    }


}

