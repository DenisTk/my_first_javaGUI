package Dish_panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dish_w {
    private int price;
    private String name;
    private String op;
    private ImageIcon im;

    public Dish_w(String name, String op, ImageIcon im, int price){
        this.name=name;
        this.price=price;
        this.op=op;
        this.im=im;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setOp(String op){
        this.op=op;
    }
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public String getOp() {return op;}
}
