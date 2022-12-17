package Pieces;

import javax.swing.*;

import Calculate.*;

public class AdvisorChess extends Piece {

    //棋子：仕


    public AdvisorChess(char side) {
        type = 6;
        points = 10;
        this.side = side;
    }

    public JLabel visible(int i, int j) {
        System.out.println("visible!!!");
        if (this.IsReversal == false) {
            PieceLabel.setIcon(unreversed);
        } else {
            if (this.side == 'r' && IsSelected == false)
                PieceLabel.setIcon(red_advisor);

            if (this.side == 'r' && IsSelected == true) {
                PieceLabel.setIcon(red_advisor_select);
            }
        }

        PieceLabel.setSize(75, 75);
        PieceLabel.setLocation(Coordinate.reverse_calculateX(j + 1) -10, Coordinate.reverse_calculateY(i + 1) - 17);
        return PieceLabel;
    }

}


