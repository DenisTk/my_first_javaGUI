package Labbel_Buttons_extra;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel_b_l_ex extends JPanel{
    private JLabel iLabel, oLabel, rLabel;
    private JTextField farengeit;

    public Panel_b_l_ex() {
        iLabel=new JLabel("Enter temperature in farengeit:");
        oLabel=new JLabel("Temperature in Celsius:");
        rLabel=new JLabel("--");
        farengeit=new JTextField(10);
        farengeit.addActionListener(new TempListener());
        add(iLabel);
        add(farengeit);
        add(oLabel);
        add(rLabel);
        setPreferredSize(new Dimension(350, 75));
        setBackground(Color.orange);
    }
    private class TempListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            int farengeitTemp, celsiusTemp;
            String text=farengeit.getText();
            farengeitTemp=Integer.parseInt(text);
            celsiusTemp=(farengeitTemp-32)*5/9;
            rLabel.setText(Integer.toString(celsiusTemp));

        }
    }


}
