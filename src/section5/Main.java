package section5;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main app = new Main();

//        app.swtichValue(1);
//        app.swtichChallenge17('A');
//        app.swtichChallenge17('a');
//        app.swtichChallenge17('Q');
//        app.swtichChallenge17('q');
//
//        app.printNumberInWordChallenge19(0);
//        app.printNumberInWordChallenge19(5);
//        app.printNumberInWordChallenge19(9);
//        app.printNumberInWordChallenge19(10);
//        app.printNumberInWordChallenge19(-1);
//        System.out.println("10,000 at 2% interest = " +
//                calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " +
//                calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " +
//                calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " +
//                calculateInterest(10000.0, 5.0));
//
//        app.calculateInterest(10, 10000.0, 2.0);

//        app.calculateInterestChallenge20(8.0,2.0);
//        app.sumOf3And5Challenge21();
//        isOddChallenge22(1);
//        isOddChallenge22(2);
//        sumOddChallenge22(1,5);
//        loopPractise();
//        doWhileLoopPractise();
//        palindromeNumberChallenge23(-1221);
//        palindromeNumberChallenge23(707);
//        palindromeNumberChallenge23(11212);
//        firstAndLastDigitSumChallenge24(252);
//        firstAndLastDigitSumChallenge24(257);
//        firstAndLastDigitSumChallenge24(0);
//        firstAndLastDigitSumChallenge24(5);
//        firstAndLastDigitSumChallenge24(-10);
//        getEvenDigitSumChallenge25(123456789);
//        getEvenDigitSumChallenge25(252);
//        getEvenDigitSumChallenge25(-22);
//        getEvenDigitSumChallenge25(1344);
//        hasSharedDigitChallenge26(12,23);
//        hasSharedDigitChallenge26(9, 99);
//        hasSharedDigitChallenge26(15, 55);
//        readUserInput();






    }

    public void swtichValue(int switchValue)
    {
        switch(switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("Value was 2");

            case 3: case 4: case 5:
                System.out.println("Value was 3,4 or 5");
                break;

            default:
                System.out.println("Value was not 1 - 5");
                break;
        }
    }

    public void swtichChallenge17(char aChar)
    {
        aChar = Character.toUpperCase(aChar);
        switch(aChar)
        {
            case 'A': case'B': case'C': case'D': case'E':
            System.out.println("You have entered a valid value betwen A-E, You entered " + aChar);
            break;

            default:
                System.out.println("invalid value entered");
                break;
        }
    }

    public void dayOfTheWeekChallenge18(int day)
    {
        switch(day)
        {
            case 0:
                System.out.println("Monday");
                break;

            case 1:
                System.out.println("Tuesday");
                break;

            case 2:
                System.out.println("Wednesday");
                break;

            case 3:
                System.out.println("Thursday");
                break;

            case 4:
                System.out.println("Friday");
                break;

            case 5:
                System.out.println("Saturday");
                break;

            case 6:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Incorrect value entered");
                break;
        }
    }

    public void printNumberInWordChallenge19(int number)
    {
        switch(number)
        {
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("Five");
                break;

            case 6:
                System.out.println("Six");
                break;

            case 7:
                System.out.println("Seven");
                break;

            case 8:
                System.out.println("Eight");
                break;

            case 9:
                System.out.println("Nine");
                break;

            default:
                System.out.println("Incorrect value entered");
                break;
        }
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return(amount * (interestRate/100));
    }

    public void calculateInterest(int times, double amount, double interestRate)
    {
        for(int i = 0; i < times; i++)
        {
            System.out.println(amount + " at " + (i + interestRate) + "% interest = " +
                    calculateInterest(amount, i + interestRate));
        }
    }
    public void calculateInterestChallenge20(double startingPoint, double finishPoint)
    {
        for(int i = (int) startingPoint; i >= (int) finishPoint; i--)
        {
            System.out.println("10000.0 at " + i + "% interest = " +
                    calculateInterest(10000.0, i ));
        }
    }

    public void sumOf3And5Challenge21()
    {
        int total = 0;
        int count = 0;

        for(int i = 1; i <= 1000; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i + " can be divided by both 3 & 5");
                total += i;
                count += 1;
            }
            if(count == 5)
            {
                break;
            }
        }
        System.out.println("The sum of all the numbers is: " + total);
    }

    public static boolean isOddChallenge22(int number)
    {
        if(number <= 0)
        {
            System.out.println("Invalid value entered");
            return false;
        }

        if(number % 2 == 0)
        {
            System.out.println(number + " is not odd");
            return false;
        }

        System.out.println(number + " is odd");
        return true;
    }

    public static int sumOddChallenge22(int start, int end)
    {
        int total = 0;
        if(end < start || (start <= 0 && end <= 0))
        {
            System.out.println("Incorrect values entered");
            return -1;
        }

        for(int i = start; i <= end; i++)
        {
            if(isOddChallenge22(i) == true)
            {
                total += i;
            }
        }
        System.out.println("Sum of all odd numbers found = " + total);


        //NEED TO UPDATE
        return 1;
    }

    public static void loopPractise()
    {
        boolean test = false;
        int count = 1;

        while(!test)
        {
            for(int i = count; i <= count; i++)
            {
                System.out.println("test");
                if(isOddChallenge22(i) == false)
                {
                    test = true;
                }
            }
            count += 1;
        }
    }

    public static void doWhileLoopPractise()
    {
        boolean test = true;
        int count = 1;

        do {
            test = isOddChallenge22(count);
            count++;
        }
        while(test == true);
    }

    public static void palindromeNumberChallenge23(int number)
    {
        int orignalNumber = number;
        int reverse = 0;

        //1. Captures last digit of the desired number
        //2. Times by ten then add digit form above step
        //3. Do reminder % 10 to cut off the last value of the orginal number to repeat the above processes over and over
        //3.. until the number reaches zero

        //ie 253...... 3 is taking then multiplied by 10 to give 30 then add five to get 35.
        // 35 is multiplied by 10 again to give 350 then add 2 to give 352.
        // this gives you the reverse of 253.
        // while this above process is happening the orignal number losses a digit each time dividing by 10 to go from
        // 253 to 25 to 2 to 0 before the loop stops.
        while (orignalNumber != 0)
        {
            int digit = orignalNumber % 10;
            reverse = reverse * 10 + digit;
            orignalNumber /= 10;
        }
        System.out.println(number == reverse);
    }

    public static void firstAndLastDigitSumChallenge24(int number)
    {
        if(number < 0)
        {
            System.out.println("-1");
            return;

        }
        int orignalNumber = number;
        int firstAndLast = 0;
        int numberLength = String.valueOf(number).length();
        int numberLengthBackup = numberLength;


        while (orignalNumber != 0)
        {
            int digit = orignalNumber % 10;

            if(numberLengthBackup == numberLength || numberLength == 1)
            {
                firstAndLast += digit;
                if(numberLengthBackup == 1)
                {
                    firstAndLast += digit;
                }
            }

            orignalNumber /= 10;
            numberLength -= 1;
        }

        System.out.println(firstAndLast);

    }

    public static void getEvenDigitSumChallenge25(int number)
    {
        int sum = 0;

        if(number < 0)
        {
            System.out.println("-1");
            return;
        }

        String numberContainer = Integer.toString(number);
        int numberLength = numberContainer.length();

        for(int i=0; i < numberLength; i++)
        {
            if(Character.getNumericValue(numberContainer.charAt(i)) % 2 == 0)
            {
                sum += Character.getNumericValue(numberContainer.charAt(i));
            }

        }
        System.out.println(sum);
    }

    public static boolean hasSharedDigitChallenge26(int aNumber, int bNumber)
    {
        if((aNumber < 10 || aNumber > 99) || (bNumber < 10 || bNumber > 99))
        {
            System.out.println("invalid value");
            return false;
        }

        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        while (aNumber != 0)
        {
            aList.add(aNumber % 10);
            aNumber /= 10;
        }

        while (bNumber != 0)
        {
            bList.add(bNumber % 10);
            bNumber /= 10;
        }

        for(int i = 0; i < aList.size(); i++)
        {
            if(bList.contains(aList.get(i)) == true)
            {
                System.out.println("Match found in both lists - " + aList.get(i));
                return true;
            }
        }

        System.out.println("No match found");
        return false;
    }

    public static void readUserInput()
    {
        Scanner aScanner = new Scanner(System.in);
        int yearOfBirth;
        int age;

        //int - year of birth -  scanned in from user
        //nextLine() called after each nextInt()
        System.out.println("Enter your year of birth");
        yearOfBirth = aScanner.nextInt(); aScanner.nextLine();

        //text - name -  scanned in from user
        System.out.println("Enter your name: ");
        String name = aScanner.nextLine();

        //work out users age
        age = 2020 - yearOfBirth;

        //Text printed and scanner closed
        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old");
        aScanner.close();
    }









    




}
