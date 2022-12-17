package view;
/*
游戏主窗体。
 */

import Calculate.*;
import Pieces.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ChessGameFrame extends JFrame {
    private int GameFrameWidth = 720;

    private int GameFrameHeight = 720;

    public int Click_x;
    public int Click_y;

    public ChessGameFrame() {

        setTitle("Dark Chess");
        setSize(GameFrameWidth, GameFrameHeight);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new Chessboard());
        setLayout(null);
        setLocationRelativeTo(null);
        //addMouseListener();

        addRestartButton();
        DrawPieces();


    }


    //获取鼠标点击坐标
    public void addMouseListener() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getID() == MouseEvent.MOUSE_CLICKED) {
                    Click_x = Coordinate.calculateX(e.getX());
                    Click_y = Coordinate.calculateY(e.getY());
                    System.out.println(Click_x + "," + Click_y);
                }
            }
        });
    }

    //重新开始按钮
    public void addRestartButton() {
        JButton restart = new JButton("Restart");
        restart.setLocation(500, 100);
        restart.setSize(100, 50);
        restart.setVisible(true);
        restart.addActionListener(e -> {
            // TODO: 2022/12/17  
            System.out.println("Restart");

        });

        add(restart);
    }

    public void DrawPieces(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                add(Information_of_Location.chessboard[i][j].visible(i,j));
            }
        }
    }


}







