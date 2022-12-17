package Pieces;

import javax.swing.*;

import Calculate.*;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AdvisorChess extends Piece {

    //棋子：仕


    public AdvisorChess() {
        type = 6;
        points = 10;
    }

    public JLabel visible(int i, int j) {
        Icon advisor = new ImageIcon("image/advisor.png");
        JLabel label = new JLabel();
        label.setIcon(advisor);
        label.setSize(60, 60);
        label.setLocation(Coordinate.reverse_calculateX(j + 1) - 10, Coordinate.reverse_calculateY(i + 1) - 10);
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // 这里是点击 JLabel 后要执行的代码
                System.out.println("Click!" + (i + 1) + "," + (j + 1));
            }
        });
        return label;
    }

}


