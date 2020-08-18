package section5;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c)
    {
        int count = 0;

        if((a < 10 || a > 1000) || (b < 10 || b > 1000) || (c < 10 || c > 1000))
        {
            return false;
        }

        int a1 = a % 10;
        int b1 = b % 10;
        int c1 = c % 10;

        if(a1 == b1 || a1 == c1 || b1 == c1)
        {
            return true;
        }

        return false;
    }

    public static boolean isValid(int a)
    {
        if(a < 10 || a > 1000)
        {
            return false;
        }
        return true;
    }
}
