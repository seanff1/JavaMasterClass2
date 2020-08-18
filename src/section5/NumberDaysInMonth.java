package section5;

public class NumberDaysInMonth {

    public static boolean isLeapYear(int year)
    {
        if(year < 1 || year > 9999)
        {
            return false;
        }

        if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            return true;
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year)
    {
        if( (month < 1 || month > 12) || ( year < 1 || year > 9999) )
        {
            return -1;
        }

        boolean isLeapYear = isLeapYear(year);

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            return 31;
        }

        if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            return 30;
        }

        if(month == 2) {
            if (isLeapYear == true) {
                return 29;
            } else {
                return 28;
            }
        }
        return -1;
    }
}
