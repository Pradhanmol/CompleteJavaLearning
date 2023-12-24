import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.*;
import java.awt.*;



public class TextFieldListenerDemo {
    public static void main(String[] args) {
            MyFrame3 f3 = new MyFrame3();
            f3.setSize(400,400);
            f3.setVisible(true);
    }
}


/**
 * MyFrame3
 */
class MyFrame3 extends Frame{
    Label l1, l2;
    TextField tf;

    MyFrame3()
    {
        super("Text Field Demo");
        l1 = new Label("No text is entered yet");
        l2 = new Label("Eneter key is not hit yet");
        tf = new TextField(20);

        Handler h = new Handler();
        tf.addTextListener(h);
        tf.addActionListener(h);

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }
/**
 *  Handler
 */
class Handler implements TextListener, ActionListener {
    public void textValueChanged(TextEvent te){
        l1.setText(tf.getText());
    }
    public void actionPerformed(ActionEvent ae){
        l2.setText(tf.getText());
    }

}
}




