package section8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner aScanner = new Scanner(System.in);

    public static void main(String[] args) {

       // arrays();
//        getUserInput();
//        printIntegers();
//        findMin();
//        reverse();
//        reverse2();
//        UpdateGroceryList();


//        ArrayLists groceries = new ArrayLists();
//        groceries.popualteGroceryList();
//        groceries.printGroceryList();
//        groceries.addItemToList("Koppaerberg");
//        groceries.printGroceryList();
//        groceries.replaceItemOnList(0,"Biscuits");
//        groceries.printGroceryList();
//        groceries.removeItem(1);
//        groceries.removeItem("Biscuits");
//        groceries.printGroceryList();
//        groceries.findItem("Carrots");
//        groceries.findItem("Pokemon Cards");

//        ArrayLists groceries = new ArrayLists();
//        Scanner aScanner = new Scanner(System.in);

//        boolean stop = false;
//        int choice = 0;
//
//
////        groceries.printInstructions();
//        while(!stop)
//        {
//            System.out.println("Choose your option between 1-4:" + "\n" + "\n");
//            groceries.printInstructions();
//
//            choice = aScanner.nextInt();
//            aScanner.nextLine();
//
//            switch(choice)
//            {
//                case 1:
//                    groceries.printInstructions();
//                    break;
//
//                case 2:
//                    groceries.popualteGroceryList();
//                    break;
//
//                case 3:
//                    groceries.printGroceryList();
//                    break;
//
//                case 4:
//                    stop = true;
//                    break;
//
//                default:
//                    System.out.println("Enter a valid value");
//                    break;
//            }
//
//        }


//        ArrayLists groceries = new ArrayLists();
//        groceries.popualteGroceryList();
//        groceries.convertToArray();

//        MobilePhone aMobilePhone = new MobilePhone();
//        Contacts aContact =
//                new Contacts("Steve", "02890 YEOOOOO");
//
//        Contacts bContact =
//                new Contacts("Jim", "02874 TIMMMM");
//
//        Contacts cContact =
//                new Contacts("Jim", "02874 TIMMMM");
//
//        aMobilePhone.addContact(aContact);
//        aMobilePhone.addContact(bContact);
//        aMobilePhone.addContact(cContact);
//        aMobilePhone.printContacts();
//        aMobilePhone.printNames();
//        aMobilePhone.removeContact("Steve");
//        aMobilePhone.removeContact("Jill");
//        aMobilePhone.printContacts();
//        aMobilePhone.printNames();
//        aMobilePhone.editContact("Jim","Jenny","1337");
//        aMobilePhone.printContacts();
//        aMobilePhone.printNames();




    }

    //Tutorial 98
    public static void arrays()
    {

        //1) 1st way to initiate
        int[] myIntArray = new int[10];

        //Sets 6th element to 50. Is 6th element as zero counts as 1
        myIntArray[5] = 50;

        //2) 2nd way to initiate
        int[] myIntArray2 = {1,2,3,4,5};
        double[] myDoubleArray = new double[5];

        System.out.println(myIntArray[0]);
        System.out.println(myDoubleArray[0]);

        int[] myIntArray3 = new int[10];
        //3) 3rd way to initiate
        for(int i = 0; i < 10; i++)
        {
            myIntArray3[i] = i + 1;
        }

        for(int i =0; i<myIntArray3.length; i++)
        {
            System.out.println(myIntArray3[i]);
        }

    }

    public static void getUserInput()
    {
        Scanner aScanner = new Scanner(System.in);
        int[] anArray = new int[10];

        //Loop 10 times asking user each time to input value to add to array
        for(int i = 0; i < anArray.length; i++)
        {
            System.out.println("input value " + (i + 1) + "\r");
            anArray[i] = aScanner.nextInt();
            aScanner.nextLine();
        }
        aScanner.close();

        for(int i = 0; i < anArray.length; i++)
        {
            System.out.println(anArray[i]);
        }
    }


    //Tutorial 99 - Challenge - get,sort,print integers in array
    public static int[] getIntegers()
    {
        ArrayList<Integer> aList = new ArrayList<>();
        Scanner aScanner = new Scanner(System.in);
        boolean stop = false;

        System.out.println("Enter value");

        while(!stop)
        {
            int anInt = aScanner.nextInt();
            if(anInt == 0){stop=true;}
            else{ aList.add(anInt); aScanner.nextLine();}
        }
        aScanner.close();

        int[] anArray = new int[aList.size()];

        for (int i = 0; i < aList.size(); i++)
        {
            anArray[i] = aList.get(i);
        }

        return anArray;
    }

    //Tutorial 99 - Challenge - get,sort,print integers in array
    public static int[] sortIntegers()
    {
        int[] anArray = getIntegers();

        for(int i = 0; i < anArray.length; i++)
        {
            for(int ii=0; ii < anArray.length; ii++)
            {
                if(anArray[ii] < anArray[i])
                {
                    int spare = anArray[i];
                    anArray[i] = anArray[ii];
                    anArray[ii] = spare;
                }
            }
        }

        return anArray;
    }

    //Tutorial 99 - Challenge - get,sort,print integers in array
    public static void printIntegers()
    {
        int[] anArray = sortIntegers();

        for (int i = 0; i < anArray.length; i++)
        {
            System.out.println(anArray[i]);
        }
    }

    ////Tutorial 102 - Challenge - Min element challenge
    public static int howManyInts()
    {
        System.out.println("How many values would you like in your array?");
        int size = aScanner.nextInt();
        aScanner.nextLine();

        return size;
    }

    //Tutorial 102 - Challenge - Min element challenge
    public static int[] readIntegers()
    {
        int size = howManyInts();
        int[] anArray = new int[size];

        System.out.println("Enter your " + size + " values: ");
        for(int i = 0; i < size; i++)
        {
            anArray[i] = aScanner.nextInt();
            aScanner.nextLine();
        }
        aScanner.close();

        return anArray;
    }

    //Tutorial 102 - Challenge - Min element challenge
    public static int findMin()
    {
        int[] anArray = readIntegers();

        int lowestValue = Integer.MAX_VALUE;

        for (int i = 0; i < anArray.length; i++)
        {
            if(anArray[i] < lowestValue)
            {
                lowestValue = anArray[i];
            }
        }
        System.out.println("The lowest value is: " + lowestValue);
        return lowestValue;
    }

    public static void reverse()
    {
        int[] anArray = readIntegers();
        int[] bArray = anArray.clone();
        int size = anArray.length;

        for(int i = 0; i < size; i++)
        {
            anArray[i] = bArray[size - i - 1];
        }

        for(int i = 0; i < size; i++)
        {
            System.out.println(anArray[i]);
        }

    }

    public static void reverse2()
    {
        int[] anArray = readIntegers();

        int size = anArray.length;
        int maxIndex = size - 1;
        int halfLength = size / 2;

        for(int i = 0; i < halfLength; i++)
        {
            int temp = anArray[i];
            anArray[i] = anArray[maxIndex - i];
            anArray[maxIndex - i] = temp;
        }

        for(int i = 0; i < size; i++)
        {
            System.out.println(anArray[i]);
        }

    }

    public static void saveAnArray(int[] arrayToBeSaved)
    {
        int[] orignal = arrayToBeSaved;

        arrayToBeSaved = new int[12];

        for(int i = 0; i < orignal.length; i++)
        {
            arrayToBeSaved[i] = orignal[i];
        }
    }

    //104 tutorial
    //Overwrites element in list at specific position
    public static void listSet(List aList, int pos, String toBeAdded)
    {
        aList.set(pos, toBeAdded);

        for(int i = 0; i < aList.size(); i++)
        {
            System.out.println(aList.get(i));
        }
    }

    public static ArrayList startGroceryList()
    {
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Bananas");
        groceryList.add("Crisps");
        groceryList.add("Juice");

        return groceryList;
    }

    public static ArrayList printOldGroceryList()
    {
        ArrayList<String> groceryList = startGroceryList();

        System.out.println("Old Grocery List: ");
        for(int i = 0; i < groceryList.size(); i++)
        {
            System.out.println(groceryList.get(i));
        }

        return groceryList;
    }

    public static void UpdateGroceryList()
    {
        ArrayList<String> groceryList = printOldGroceryList();

        groceryList.set(0, "Anime DVD");

        System.out.println("New Grocery List");

        for(int i = 0; i < groceryList.size(); i++)
        {
            System.out.println(groceryList.get(i));
        }
    }

    ///111 - Autoboxing

    public static void autoboxExample()
    {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        //ArrayList doesn't accept primitive data types - needs to be a class
        ArrayList<Integer> test = new ArrayList<>();


    }









}
