package section4;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes)
    {
            long orignalMinutes = minutes;

            if(minutes < 0)
            {
                System.out.println("Invalid Value");
                return;
            }

            long years = minutes / 525600;
            minutes = minutes % 525600;

            long days = minutes / 1440;
            minutes = minutes % 1440;

            long hours = minutes / 60;
            minutes = minutes % 60;

            System.out.println(orignalMinutes + " min = " + years + " y and " + days + " d");

        }
}
