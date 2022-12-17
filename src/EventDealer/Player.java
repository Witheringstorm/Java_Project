package EventDealer;

public class Player {
    boolean firstClick = true;
    static int click_times = 0;

    public static boolean isFirstClick(){
        if(click_times % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
