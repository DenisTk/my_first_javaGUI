package Labbel_Buttons;


import javax.swing.*;

public class Main_but_lab {
    public static void main(String [] arg){
        JFrame frame= new JFrame("Programochka");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Panel_but_lab());
        frame.pack();
        frame.setVisible(true);

    }
}
