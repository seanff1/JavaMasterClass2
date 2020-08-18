package section4;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temp)
    {
        if(summer == true && ( temp >= 25 && temp <= 45))
        {
            return true;
        }

        if( temp >= 25 && temp <= 35)
        {
            return true;
        }

        return false;
    }
}
