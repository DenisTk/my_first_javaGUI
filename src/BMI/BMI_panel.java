package BMI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BMI_panel extends JPanel{
    JLabel il1,il2,rl;
    JTextField rost, ves;
    JButton ok;
    double bmi;
    public BMI_panel(){
        il1=new JLabel("Введите свой рост в сантиметрах:");
        il2=new JLabel("Введите свой вес:");
        rl=new JLabel("Ваш BMI:"+bmi);
        rost=new JTextField(4);
        ves=new JTextField(4);
        ok=new JButton("OK");
        ok.addActionListener(new ButtonList());
        bmi=0.0;
        add(il1);
        add(rost);
        add(il2);
        add(ves);
        add(ok);
        add(rl);
        setPreferredSize(new Dimension(500,200));
        setBackground(Color.CYAN);
    }
    private class ButtonList implements ActionListener{
        public void actionPerformed(ActionEvent event){
            double rostt, massa;
            String text1=rost.getText();
            rostt=Double.parseDouble(text1)/100;
            String text2=ves.getText();
            massa=Double.parseDouble(text2);
            bmi=massa/(rostt*rostt);
            if (bmi<=16.0)
            {
                rl.setText("Ваш BMI:"+Double.toString(bmi)+" , вам нужно набирать вес!");

            }
            else if (bmi>16&&bmi<25){
                rl.setText("Ваш BMI:"+Double.toString(bmi)+" , у вас все в норме!");

            }
            else if (bmi>=25) {
                rl.setText("Ваш BMI:"+Double.toString(bmi)+" , вам нужно худеть!");

            }



        }
    }
}
