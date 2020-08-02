package section8;

import java.util.ArrayList;

public class ArrayLists {

    private ArrayList<String> groceryList = new ArrayList<>();
    //print
    //add
    //set
    //remove


    public void popualteGroceryList()
    {
        groceryList.add("Carrots");
        groceryList.add("Beans");
        groceryList.add("Red Sauce");

    }

    public void printGroceryList( )
    {
        for (int i = 0; i < groceryList.size(); i++)
        {
            System.out.println(groceryList.get(i));
        }
    }

    public void addItemToList(String item)
    {
        groceryList.add(item);
    }

    public void replaceItemOnList(int pos, String item)
    {
        groceryList.set(pos, item);
    }

    public String removeItem(int pos)
    {
        String removed = groceryList.remove(pos);

        System.out.println("item removed - " + removed);

        return removed;
    }

    public String removeItem(String item)
    {
        int pos = groceryList.indexOf(item);
        String removed = groceryList.remove(pos);
        System.out.println("item removed - " + removed);

        return removed;
    }

    public boolean findItem(String itemToFind)
    {
        boolean itemFound = groceryList.contains(itemToFind);

        if(itemFound)
        {
            int numberOnList = groceryList.indexOf(itemToFind);
            System.out.println(itemToFind + " is on the list. It is number " +
                    numberOnList + " on the list");

        }
        else
        {
            System.out.println(itemToFind + " is NOT on the list");
        }

        return itemFound;
    }

    public void printInstructions()
    {
        System.out.println("1 - Re-print instructions");
        System.out.println("2 - populate list");
        System.out.println("3 - print list");
        System.out.println("4 - to stop");
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void copyArray(ArrayList newArray)
    {
        newArray.addAll(getGroceryList());

        ArrayList<String> newArrayExample = new ArrayList<>(getGroceryList());
    }

    public void convertToArray()
    {
        String[] example = new String[groceryList.size()];
        example = groceryList.toArray(example);

        for(int i = 0; i < example.length; i++)
        {
            System.out.println(example[i]);
        }
    }
}
