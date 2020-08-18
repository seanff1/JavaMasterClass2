package section5;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        sumFirstAndLastDigit(5);
    }

    public static int sumFirstAndLastDigit(int number)
    {
        int first = 0;
        int last = number % 10;

        if(number < 0)
        {
            return -1;
        }

        while(number > 0)
        {
            if(number > 0 && number < 10)
            {
                first = number;
            }
            number = number / 10;
        }

        System.out.println(first);
        System.out.println(last);

        return first + last;
    }
}
