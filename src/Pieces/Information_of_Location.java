package Pieces;

public class Information_of_Location {
    public static Piece[][] chessboard = new Piece[8][4];

    public void initialize(){
        for (int i = 0; i<8;i++){
            for(int j = 0; j< 4;j++){
                chessboard[i][j] = new AdvisorChess();
            }
        }
    }




}
