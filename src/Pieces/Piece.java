package Pieces;

import java.util.ArrayList;

public abstract class Piece {
    public boolean exist = true;
    public boolean IsReversal = false;
    public boolean IsSelected = false;
    public int type;
    public int side;

    public void reverse() {
        IsReversal = true;
    }

    public void select() {
        if (IsReversal && exist && !IsSelected) {
            IsSelected = true;
        }
        if (IsSelected) {
            IsSelected = false;
        }
    }
}
