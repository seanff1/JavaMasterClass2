package section5;

public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        int sum = (bigCount * 5) + smallCount;

        if(bigCount < 0 || smallCount < 0 || goal < 0)
        {
            return false;
        }

        if(goal > sum)
        {
            return false;
        }

        if(smallCount == 0)
        {
            for(int i = 1; i <= bigCount; i++)
            {
                if(i * 5 == goal)
                {
                    System.out.println("Flag1");
                    return true;
                }
            }
            return false;
        }

        if(smallCount > goal)
        {
            return true;
        }

        while(bigCount > 0 && goal > 0)
        {
            System.out.println("Test");
            if(goal >= 5 && bigCount > 0)
            {
                System.out.println("Test2");
                goal = goal - 5;
                bigCount--;
                if(goal == 0)
                {
                    return true;
                }
            }
            else
            {
                break;
            }
        }

        while(smallCount > 0 && goal > 0)
        {
            if(goal > 0 && smallCount > 0)
            {
                goal--;
                smallCount--;
            }
        }

        if(goal == 0)
        {
            System.out.println("Flag2");
            return true;
        }

        System.out.println("Flag3");
        return false;

    }
}
