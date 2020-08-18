package section4;

public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes < 0)
        {
            System.out.println("Invalid Value");
            return;
        }

        int conversionRate = 1024;
        int mb = kiloBytes / conversionRate;
        int kb = kiloBytes % conversionRate;

        System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
    }
}
