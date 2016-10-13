package Labbel_Buttons;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class Panel_but_lab  extends JPanel {

    private int count;
    private JButton push;
    private JLabel label;
    public Panel_but_lab(){
        count=0;
        push=new JButton("Push me! :)");
        push.addActionListener(new ButtonListener());
        label=new JLabel("Pushes:"+ count);
        add(push);
        add(label);
        setPreferredSize(new Dimension(300,40));
        setBackground(Color.cyan);
    }
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event)
        {
            count++;
            label.setText("Pushes:"+count);
        }
    }


}
