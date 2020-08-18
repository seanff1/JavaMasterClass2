package section4;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double aDouble, double bDouble)
    {
        aDouble = aDouble * 1000;
        bDouble = bDouble * 1000;

        int firstValue = (int) aDouble;
        int secondvalue = (int) bDouble;

        if(firstValue == secondvalue)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
