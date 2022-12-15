package view;
/*
游戏主窗体。
 */

import javax.swing.*;
import java.awt.*;

public class ChessGameFrame extends JFrame{
    private int GameFrameWidth = 720;

    private int GameFrameHeight = 720;

    public ChessGameFrame(){
        setTitle("Dark Chess");
        setSize(GameFrameWidth,GameFrameHeight);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new Chessboard());
    }

}
