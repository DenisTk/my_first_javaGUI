package Dz_141016; 

import javax.swing.*;

public class WinTest {
    public static void main(String [] arg) {
        JFrame frame=new JFrame("Rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new WinPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
