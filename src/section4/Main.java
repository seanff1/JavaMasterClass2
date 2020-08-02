package section4;

public class Main {

    public static void main(String[] args) {

        Main app = new Main();

//        app.gameOverBoolean(true);
//        app.gameOverBoolean(false);
//        app.highScoreChallenge5("Steve", 1500);
//        app.highScoreChallenge5("Steve",  900);
//        app.highScoreChallenge5("Steve",  400);
//        app.highScoreChallenge5("Steve",  50);
//        app.speedConverterChallenge6(1.5);
//        app.speedConverterChallenge6(10.25);
//        app.speedConverterChallenge6(-5.6);
//        app.speedConverterChallenge6(25.42);
//        app.speedConverterChallenge6(75.114);
//        app.printMegaBytesAndKiloBytesChallenge7(2500);
//        app.printMegaBytesAndKiloBytesChallenge7(-1024);
//        app.printMegaBytesAndKiloBytesChallenge7(5000);
//        app.shouldWakeUpChallenge8(true,1);
//        app.shouldWakeUpChallenge8(false,2);
//        app.shouldWakeUpChallenge8(true,8);
//        app.shouldWakeUpChallenge8(true,-1);
//        app.isLeapYearChallenge9(-1600);
//        app.isLeapYearChallenge9(1600);
//        app.isLeapYearChallenge9(2017);
//        app.isLeapYearChallenge9(2000);
//        app.areEqualByThreeDecimalPlacesChallenge10(-3.1756, -3.175);
//        app.areEqualByThreeDecimalPlacesChallenge10(3.175, 3.176);
//        app.areEqualByThreeDecimalPlacesChallenge10(3.0, 3.0);
//        app.areEqualByThreeDecimalPlacesChallenge10(-3.123, 3.123);
//        app.hasTeenChallenge11(9,99,19);
//        app.hasTeenChallenge11(23,15,42);
//        app.hasTeenChallenge11(22,23,34);
//        app.calcFeetAndInchestToCentimetersChallenge12(8,12);
//        app.calcFeetAndInchestToCentimetersChallenge12(37);
//        app.doubleCheck();
//        app.areEqualByThreeDecimalPlacesChallenge10(5.0,5.0);
//        app.areEqualByThreeDecimalPlacesChallenge10(505.0,505.0);
//        app.areEqualByThreeDecimalPlacesChallenge10(575.0,535.0);
//        app.getDurationStringChallenge13(100,40);
//        app.getDurationStringChallenge13(182401);
        app.areaChallenge14(5.0);
        app.areaChallenge14(-1);
        app.areaChallenge14(5.0,4.0);
        app.areaChallenge14(-1.0,4.0);


        app.printYearsAndDaysChallenge15(525600);
        app.printYearsAndDaysChallenge15(1051200);
        app.printYearsAndDaysChallenge15(561600);




    }

    public void gameOverBoolean(boolean gameOver)
    {
        if(gameOver)
        {
            System.out.println("gameover bud");
        }
        if(!gameOver)
        {
            System.out.println("Carry on playing!");
        }
    }

    public void displayHighScorePosition(String name, int position)
    {
        System.out.println(name + " got to number " + position + " in the high score table!");
    }

    public int calculateHighScorePosition(int playerScore)
    {
        if(playerScore >= 1000)
        {
            return 1;
        }

        if(playerScore >= 500)
        {
            return 2;
        }

        if(playerScore >= 100)
        {
            return 3;
        }

        return 4;
    }

    public void highScoreChallenge5(String name, int playerScore)
    {
        int anInt = calculateHighScorePosition(playerScore);
        displayHighScorePosition(name,anInt);
    }

    public long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour <= 0)
        {
            System.out.println("Invalid Value Entered");
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public void printConversion(double kilometersPerHour)
    {
        double milesPerHours = toMilesPerHour(kilometersPerHour);
        if(milesPerHours < 0)
        {
            System.out.println("Invalid Value Entered");
            return;
        }
        System.out.println(kilometersPerHour + " km/h =  " + milesPerHours + " mi/h");
    }

    public void speedConverterChallenge6(double kilometersPerHour)
    {
        printConversion(kilometersPerHour);
    }

    public void printMegaBytesAndKiloBytesChallenge7(int kiloBytes)
    {
        if(kiloBytes <= 0)
        {
            System.out.println("Invalid Value");
            return;
        }
        int mega = kiloBytes / 1024;
        int kilo = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + mega + " MB and " + kilo + " KB");
    }

    public boolean shouldWakeUpChallenge8(boolean barking, int hourOfDay)
    {
        if(hourOfDay < 0 || hourOfDay > 23 )
        {
            System.out.println("Invalid Hour of Day provided - False");
            return false;
        }
        if(barking)
        {
            if(hourOfDay < 8 || hourOfDay > 22)
            {
                System.out.println("Wake up! Dog Barking! - True");
                return true;
            }
        }
        System.out.println("Don't worry about it - False");
        return false;
    }

    public boolean isLeapYearChallenge9(int year)
    {
        if(year < 1 || year > 9999)
        {
            System.out.println("Invalid year entered");
            return false;
        }

        if((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
        {
            System.out.println("366 days - LEAP YEAR! - True");
            return true;
        }

        System.out.println("365 days - NO leap year - False");
        return false;
    }

    public boolean areEqualByThreeDecimalPlacesChallenge10(Double aDouble, Double bDouble)
    {
        int aInt = (int) (aDouble * 1000);
        int bInt = (int) (bDouble * 1000);

        return aInt == bInt;
    }

    public boolean hasTeenChallenge11(int aAge,int bAge,int cAge)
    {
        if((aAge >= 13 && aAge <= 19) || (bAge >= 13 && bAge <= 19)  || (cAge >= 13 && cAge <= 19) )
        {
            System.out.println("congrats your a teen");
            return true;
        }
        System.out.println("Your old");
        return false;
    }

    public static double calcFeetAndInchestToCentimetersChallenge12(double feet, double inches)
    {
        if(feet < 0 || ((inches < 0) && (inches > 12)))
        {
            System.out.println("Invalid data entered");
            return -1;
        }

        //convert feet to inches - easier to have all data as one type before convert from inches to cm
        inches = inches + (feet * 12);

        System.out.println(inches * 2.54);
        return inches * 2.54;
    }

    public static double calcFeetAndInchestToCentimetersChallenge12(double inches)
    {
        if(inches < 0)
        {
            System.out.println("invalid data entered");
            return -1;
        }

        double feet = (int) inches / 12;
        inches = (int) inches % 12;

        return calcFeetAndInchestToCentimetersChallenge12(feet,inches);
    }

    public String getDurationStringChallenge13(int minutes, int seconds)
    {
        if((minutes < 0) || (seconds < 0 || seconds > 59))
        {
            System.out.println("invalid value");
            return "invalid value";
        }

        int hours = minutes / 60;
        minutes = minutes % 60;

        System.out.println(hours + "h "+ minutes + "m " + seconds + "s");
        return hours + "h "+ minutes + "m " + seconds + "s";
    }

    public String getDurationStringChallenge13(int seconds)
    {
        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationStringChallenge13(minutes,seconds);
    }

    public double areaChallenge14(double radius)
    {
        if(radius < 0)
        {
            System.out.println("Invalid radius entered");
            return -1;
        }

        System.out.println("areaChallenge14 of the circle is - " + radius * radius * Math.PI);
        return radius * radius * Math.PI;
    }

    public double areaChallenge14(double x, double y)
    {
        if(x < 0 || y < 0)
        {
            System.out.println("invalid angles entered for x or y");
            return -1;
        }

        System.out.println("areaChallenge14 of rectangle is - " + x * y);

        return x * y;

    }

    public void printYearsAndDaysChallenge15(long minutes)
    {
        if(minutes < 0)
        {
            System.out.println("Invalid minutes entered");
            return;
        }

        int years = 0;
        int hours = 0;
        int days = (int) minutes / 1440;
        minutes = minutes % 1440;

        if(days > 364)
        {
            years = days / 365;
            days = days % 365;
        }

        if(minutes > 59)
        {
            hours = (int) minutes / 60;
            minutes = minutes % 60;
        }

        System.out.println("Years - " + years);
        System.out.println("Days - " + days);
        System.out.println("Hours - " + hours);
        System.out.println("Minutes - " + minutes + "\n" + "\n");


    }

    public void overloadedMethod()
    {
        System.out.println("No values to find here!");
    }

    public void overloadedMethod(int aValue)
    {
        System.out.println("I got a number! it is - " + aValue);
    }




    
    

}
