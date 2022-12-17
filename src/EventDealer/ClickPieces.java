package EventDealer;

import Pieces.*;

public class ClickPieces {
    public static void click(Piece a, int i, int j) {
        if (a.IsReversal == false) {
            a.IsReversal = true;
            System.out.println("reverse!!!");
            a.visible(i, j);
            Player.click_times += 2;
        }// TODO: 2022/12/18 完善条件
        else if (a.IsSelected == false && Player.isFirstClick() == true) {
            a.IsSelected = true;
            System.out.println("Selected!!!");
            Player.click_times += 1;
            a.visible(i,j);
        }
        else if(a.IsSelected == true){
            a.IsSelected = false;
            System.out.println("Unselected!!!");
            Player.click_times -= 1;
            a.visible(i,j);
        }

    }
}
