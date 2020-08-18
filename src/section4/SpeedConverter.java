package section4;

// Return rounded value of type long
public class SpeedConverter {

    public static void main(String[] args) {

        boolean test1 = toMilesPerHour(1.5) == 1;
        boolean test2 = toMilesPerHour(10.25) == 6;
        boolean test3 = toMilesPerHour(-5.6) == -1;
        boolean test4 = toMilesPerHour(25.42) == 16;
        boolean test5 = toMilesPerHour(75.114) == 47;



        System.out.println("test 1 - " + test1);
        System.out.println("test 2 - " + test2);
        System.out.println("test 3 - " + test3);
        System.out.println("test 4 - " + test4);
        System.out.println("test 5 - " + test5);

        printConversion(1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour)
    {
        //1 mile = 1.609km
        double conversionRate = 1.609;

        if(kilometersPerHour < 0)
        {
            return -1;
        }

        long result = Math.round(kilometersPerHour / conversionRate);

        return result;
    }

    public static void printConversion(double kilometersPerHour)
    {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if(kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }
}
