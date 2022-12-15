import view.ChessGameFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChessGameFrame g = new ChessGameFrame();
            g.setVisible(true);
        });
    }
}
