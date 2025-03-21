import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;

public class window {

    private static void GUI () {
        shopping.main(new String[0]);
        int Lfruits = shopping.fruits.toArray().length;


        JFrame frame = new JFrame("shopping");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel frt = new JLabel();
        frt.setLayout(new GridLayout(Lfruits, 1));
        frame.getContentPane().add(frt, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        GUI();
    }
}
