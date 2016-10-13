package BMI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BMI_main {
    public static void main(String [] arg){

        JFrame frame=new JFrame("BMI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BMI_panel panel=new BMI_panel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);


    }

}
