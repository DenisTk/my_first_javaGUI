package Circles;
import javax.swing.*;
import java.awt.*;


public class Panel extends JPanel{
    //private Circle c1,c2,c3,c4;
    private Circle [] c;
    private int count;
    public  Panel(){
       /* c1=new Circle(30, Color.red,70,35);
        c2=new Circle(50, Color.green, 30,20);
        c3=new Circle(100, Color.darkGray, 120, 30);
        c4=new Circle(70, Color.cyan, 200,45);*/
       count=7;
        c=new Circle[count];
        for(int i=0; i<c.length;i++)
            c[i]=new Circle(50,Color.blue, 70*(i), 20*i);
        setPreferredSize(new Dimension(400,200));
        setBackground(Color.lightGray);
    }
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);

        for(int i=0; i<c.length; i++)
            c[i].draw(page);
    }

}
