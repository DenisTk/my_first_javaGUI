package Dz_141016;

import java.awt.*;

public class WinRectangle {
   private int a,b,x,y;
   private Color c1;
   public WinRectangle(int st1, int st2, int x, int y, Color c){
       a=st1;
       b=st2;
       this.x=x;
       this.y=y;
       c1=c;
   }
   public void draw(Graphics page){
       page.setColor(c1);
       page.fillRect(x,y,a,b);

   }

    public Color getC1() {
        return c1;
    }

    public void setC1(Color c1) {
        this.c1 = c1;
    }

    public int getY() {

        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getB() {

        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {

        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
