package section3;

public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld mainApp = new HelloWorld();

//        mainApp.helloWorld();
//        mainApp.showMeDataTypeLimits();
//        mainApp.showMeCasting();
//        mainApp.dataTypesChallenge1();
//        mainApp.dataTypesChallenge2();
//        mainApp.poundsToKilosChallenge3(200);
//        mainApp.ifThen(true);
//        mainApp.ifThen(false);
//        mainApp.efficentBooleans(1);
//        mainApp.ternaryOperator();
//        mainApp.operatorChallenge4();



    }

    public void showMeDataTypeLimits()
    {
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        double minDouble = Float.MIN_VALUE;
        double maxDouble = Float.MAX_VALUE;

        System.out.println("byte min/max values:");
        System.out.println("byte MIN value : " + minByte);
        System.out.println("byte MAX value : " + maxByte + "\n");

        System.out.println("char min/max values:");
        System.out.println("char MIN value : " + minChar);
        System.out.println("char MAX value : " + maxChar + "\n");

        System.out.println("short min/max values:");
        System.out.println("short MIN value : " + minShort);
        System.out.println("short MAX value : " + maxShort + "\n");

        System.out.println("int min/max values:");
        System.out.println("int MIN value : " + minInt);
        System.out.println("int MAX value : " + maxInt + "\n");

        System.out.println("long min/max values:");
        System.out.println("long MIN value : " + minLong);
        System.out.println("long MAX value : " + maxLong + "\n");

        System.out.println("float min/max values:");
        System.out.println("float MIN value : " + minFloat);
        System.out.println("float MAX value : " + maxFloat + "\n");

        System.out.println("double min/max values:");
        System.out.println("double MIN value : " + minDouble);
        System.out.println("double MAX value : " + maxDouble + "\n");
    }

    public void helloWorld()
    {
        System.out.println("Hello World" + "\n");
    }

    public void showMeCasting()
    {
        int newInt = (int) 12.99;
        System.out.println("Using the following code ***  int newInt = (int) 12.99  *** we can turn 12.99 which is a double into an int which ends up with the value = " + newInt);
    }

    public void dataTypesChallenge1()
    {
        //Challenge to create:
        //1 - A byte and set it to a valid byte number
        //2 - short - Same as above
        //3 - int - Same as above
        //4 - long - make it equal to 50000 + (10 * byteVariable + shortVariable + intVariable)

        //1-3 complete - Variables set with values
        byte aByte = Byte.MAX_VALUE;
        short aShort = Short.MAX_VALUE;
        int aInt = Integer.MAX_VALUE;

        //4 - Long complete
        long aLong = 5000L + (10L * (aByte + aShort + aInt));

        //Set long to max value for testing purposes
        long bLong = Long.MAX_VALUE;



        //Print all variables
        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(aInt);
        System.out.println(aLong);
        System.out.println(bLong);

    }

    public void dataTypesChallenge2()
    {
        //Challenge - Solve the below issue:
        // float myFloatValue = 5.25;

        // Challenge solved by casting - 2 different ways to cast examples below.
        float float1 =  5.25f;
        float float2  = (float) 5.25;

        System.out.println(float1);
        System.out.println(float2);
    }

    public void poundsToKilosChallenge3(int pounds)
    {
        //Challenge - Convert pounds to kilos
        double conversion = 0.45359237;
        System.out.println(pounds + " pounds = " + (conversion * pounds + " kilos"));

        int myInt = 1;
        myInt++;
        myInt += 1;
        myInt --;
        myInt -= 1;
    }

    public void ifThen(boolean aBoolean)
    {
        if(aBoolean == false)
        {
            System.out.println("Your are not an alien!");
        }
        if(aBoolean == true)
        {
            System.out.println("Take me to the mothership alien!");
        }
    }

    public void efficentBooleans(int anInt)
    {
        boolean isItOver10 = anInt > 10;
        boolean isItEqualTo10 = anInt == 10;
        boolean isItEqualTo10x = anInt == 10 ? true:false;
        boolean isItLessThan10 = anInt < 10;

        System.out.println(isItEqualTo10);
        System.out.println(isItEqualTo10x);


    }

    public void ternaryOperator()
    {
        int anInt = 5;
        int bInt = anInt == 5 ? 1:2;
        System.out.println(bInt);
    }

    public void operatorChallenge4()
    {
        //Operator Challenge
        //1 - Create double variable with value of 20.00
        //2 - double with value 80.00
        //3 - add both doubles together & multiply by 100.00
        //4 - Use the remainder for step 3 as well as if step was 40.00 instead of 100.0
        //5 - boolean that is false if value from step 4 is zero, true otherwise
        //6 - print the boolean
        //7 - if then to print "got some remainder" if the boolean in step 5 is not true

        double aDouble = 20.00;
        double bDouble = 80.00;

        double doublesAddAndMultiply = (aDouble + bDouble) * 100.00;
        double doublesAddAndMultiplyRemainder = (aDouble + bDouble) % 100.00;
        double doublesAddAndMultiplyRemainder2 = (aDouble + bDouble) % 40.00;

        boolean equalsZero1 = doublesAddAndMultiplyRemainder == 0 ? true:false;
        boolean equalsZero2 = doublesAddAndMultiplyRemainder2 == 0 ? true:false;

        System.out.println(doublesAddAndMultiply);
        System.out.println(doublesAddAndMultiplyRemainder);

        System.out.println(doublesAddAndMultiplyRemainder2);

        System.out.println(equalsZero1);
        System.out.println(equalsZero2);
    }

    public void ifElseElseIf()
    {
        int anInt = 5;

        if(anInt >5) { }
        else if (anInt < 5) { }
        else{ }
    }
    
}
