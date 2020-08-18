package section5;

public class GreatestCommonDivsior {

    public static int getGreatestCommonDivisor(int first, int second)
    {
        if(first < 10 || second < 10)
        {
            return -1;
        }
        ArrayList<Integer> aList = new ArrayList<>();

        for(int i = 1; i <= first; i++)
        {

            if(first % i == 0)
            {
                aList.add(i);
            }
        }

        for(int i = aList.size() - 1; i >= 1; i--)
        {
            if(second % aList.get(i) == 0)
            {
                return aList.get(i);
            }
        }

        return -1;
    }
}
