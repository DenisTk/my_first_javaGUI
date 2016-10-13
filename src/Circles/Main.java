package Circles;

import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String [] arg) {
        JFrame frame=new JFrame("Splat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Panel());
        frame.pack();
        frame.setVisible(true);
    }
}
