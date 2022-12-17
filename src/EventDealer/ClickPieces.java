package EventDealer;

import Pieces.*;

public class ClickPieces {
    public static void click(Piece a,int i,int j){
        if(a.IsReversal == false){
            a.IsReversal = true;
            System.out.println("reverse!!!");
            a.visible(i,j);
        }
    }
}
