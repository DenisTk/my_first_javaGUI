package Labbel_Buttons_extra;

import javax.swing.*;
public class Main_b_l_ex {
    public static void main(String [] arg){
        JFrame frame=new JFrame("Temperaturka");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel_b_l_ex panel=new Panel_b_l_ex();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }


}
