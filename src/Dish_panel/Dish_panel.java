package Dish_panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dish_panel extends JPanel {
    private JLabel il,rl;
    private JTextField name_dish;
    private JButton ok;

    public Dish_panel(){
        il=new JLabel("Введите название блюда:");
        rl=new JLabel("Ваше блюдо:");
        name_dish=new JTextField(20);
        ok=new JButton("OK");
        ok.addActionListener(new ButtonListener());
        add(il);
        add(name_dish);
        add(ok);
        add(rl);
        setPreferredSize(new Dimension(700,300));
        setBackground(Color.GREEN);


    }
    public String search(){
        Dishh_w d1=new Dishh_w("Olivie","Russian salat","1.jpg",120);
        return d1.getName();
    }
    public String searchOp(){
        Dishh_w d1=new Dishh_w("Olivie","Russian salat","1.jpg",120);
        return d1.getOp();
    }
    public int searchPr(){
        Dishh_w d1=new Dishh_w("Olivie","Russian salat","1.jpg",120);
        return d1.getPrice();
    }
    public String searchIm(){
        Dishh_w d1=new Dishh_w("Olivie","Russian salat","1.jpg",120);
        return d1.getIm();


    }
    protected class Dishh_w implements Dishh{
        private int price;
        private String name;
        private String op;
        private String im;

        public Dishh_w(String name, String op, String picture, int price){
            this.name=name;
            this.price=price;
            this.op=op;
            this.im=picture;
        }
        public void setIcon(String im){this.im=im;}
        public  void setPrice(int price){this.price=price;}

        public  void setName(String name){this.name=name;}

        public void setOp(String op){this.op=op;}
        public  int getPrice(){return price;}
        public String getName(){return name;}
        public String getOp(){return op;}
        public String getIm() {return im;}
    }
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            String text=name_dish.getText();
            String text2=search();
            ImageIcon image=new ImageIcon(searchIm());
            int sr=text.compareTo(text2);


            if (sr==0) {
                JLabel rlm=new JLabel("Ваше блюдо",image, SwingConstants.CENTER);
                add(rlm);
                rl.setText(text2+" "+searchOp()+"  "+searchIm()+"  "+searchPr());
            }
            else rl.setText("Такого блюда у нас нет :("+text2);

        }
    }
}
