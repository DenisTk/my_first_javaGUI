package Dz_141016;


import javax.swing.*;
import java.awt.*;

public class WinPanel extends JPanel {
    private WinRectangle [] r;
    private int count;
    public WinPanel(){
        count=7;
        r=new WinRectangle[count];
        for(int i=0; i<r.length; i++)
            r[i]=new WinRectangle(20,40, 70*i, 20*i, Color.cyan);
        setPreferredSize(new Dimension(400,200));
        setBackground(Color.lightGray);

    }
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);

        for(int i=0; i<r.length; i++)
            r[i].draw(page);
    }

}
