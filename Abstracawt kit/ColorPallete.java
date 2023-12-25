import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.*;
public class ColorPallete {
    public static void main(String[] args) {
        MyFrame7 frame7 = new MyFrame7();
        frame7.setSize(500,500);
        frame7.setVisible(true);
        
    }
}
    /**
     * Myframe7
     */
     class MyFrame7 extends Frame implements AdjustmentListener {
        Scrollbar red,green,blue;
        TextField tf;
        MyFrame7(){
            super("Color demo");
            red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
            green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
            blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
            tf = new TextField(20);

            tf.setBounds(50,50,300,50);
            red.setBounds(50,150,300,30);
            green.setBounds(50,200,300,30);
            blue.setBounds(50,250,300,30);
            
            setLayout(null);
            add(tf);
            add(red);
            add(green);
            add(blue);
            red.addAdjustmentListener(this);
            green.addAdjustmentListener(this);
            blue.addAdjustmentListener(this);
        }
        public void adjustmentValueChanged(AdjustmentEvent e) {
            tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
            
        }
    }
