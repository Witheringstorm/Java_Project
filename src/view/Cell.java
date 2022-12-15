package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Cell extends JPanel {
    Image test;

    public Cell() {
        try {
            test = ImageIO.read(new File("image/test.jpg"));
        } catch (
                IOException e) {
            e.printStackTrace();

        }
    }
    public void test(){
        Label cell11 = new Label();
        cell11.setBounds(100,50,75,75);

    }
}


