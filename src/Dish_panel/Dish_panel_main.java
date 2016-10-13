package Dish_panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dish_panel_main {
    public static void main(String [] arg) {

        JFrame frame = new JFrame("Food");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dish_panel panel = new Dish_panel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }


}
