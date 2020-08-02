package section7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main(String[] args) {

//        // Composition Example
//        Motherboard motherboard = new Motherboard();
//        GraphicsCard graphicsCard = new GraphicsCard();
//        RAM ram = new RAM();
//        PC pc = new PC(graphicsCard, motherboard,ram);
//        System.out.println(pc.getGraphicsCard().getRAM());
//        System.out.println(pc.getGraphicsCard().getType());


        // Arrays start from 0 - so this will allow me 0 - 9 array slots for a total of 10 slots.

        //3 different examples of initialising an array with data
        int[] initialise1 = new int[10];
        int[] initialise2 = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i<10; i++)
        {
            initialise1[i] = i;
        }

        sortArrayDescending(initialise2);


    }

    public static void sortArrayDescending(int[] anArray)
    {
        int arrayLength = anArray.length;
        int lowest;
        int spare;

        for (int i = 0; i < arrayLength; i++)
        {
            for (int ii = 0; ii < arrayLength; ii++)
            {
                if(anArray[ii] < anArray[i])
                {
                    lowest = ii;
                    spare = anArray[i];
                    anArray[i] = anArray[lowest];
                    anArray[lowest] = spare;
                }
            }

        }
    }

    public static void valueVsReference()
    {
        //Our two int values are stored seperately meaning we can manipulate
        // one int without affecting the other but the two array statements
        // reference the same array meaning there is only one array created
        // but two references to manipulate that one array.
        int anInt = 1;
        int bInt = anInt;

        int[] anIntArray = new int[10];
        int[] bIntArray = anIntArray;
    }
}
