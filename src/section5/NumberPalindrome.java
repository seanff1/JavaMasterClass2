package section5;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-555));
    }

    public static boolean isPalindrome(int number)
    {
        int  orignalNumber = number;
        int reversed = 0;


            while(number != 0)
            {
                reversed = reversed + (number % 10);
                reversed = reversed * 10;
                number = number / 10;
            }

        return reversed == (orignalNumber * 10);
    }

}
