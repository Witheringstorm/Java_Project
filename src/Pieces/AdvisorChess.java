package Pieces;

import javax.swing.*;

import Calculate.*;

public class AdvisorChess extends Piece {

    //棋子：仕


    public AdvisorChess() {
        type = 6;
        points = 10;
    }

    public JLabel visible(int i, int j) {
        System.out.println("visible!!!");
        Icon advisor = new ImageIcon("image/advisor.png");
        if(this.IsReversal){
            PieceLabel.setIcon(advisor);
        }else{PieceLabel.setIcon(unreversed);}

        PieceLabel.setSize(60, 60);
        PieceLabel.setLocation(Coordinate.reverse_calculateX(j + 1) - 10, Coordinate.reverse_calculateY(i + 1) - 10);
        return PieceLabel;
    }

}


