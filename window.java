import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.ThreadPoolExecutor;

public class window {
    private static void GUI () {
        shopping.main(new String[0]);

        JFrame frame = new JFrame("shopping");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel();
        emptyLabel.setPreferredSize(new Dimension(500, 700));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        GUI();
    }
}
