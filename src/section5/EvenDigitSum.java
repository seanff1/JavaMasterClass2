package section5;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number)
    {
        if(number < 0)
        {
            return -1;
        }

        int sum = 0;

        while(number > 0)
        {
            int value = number % 10;
            number = number / 10;

            if(value % 2 == 0)
            {
                sum += value;
            }

        }

        return sum;
    }
}
