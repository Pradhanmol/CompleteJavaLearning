import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.*;

public class TextAreaOperation {
    public static void main(String[] args) {
        MyFrame5 frame5 = new MyFrame5();
        frame5.setSize(400, 400);
        frame5.setVisible(true);
    }
}
/**
 * InnerTextAreaOperation
 */
class MyFrame5 extends Frame implements ActionListener{
    Label l;
    TextField tf;
    TextArea ta;
    Button b;
    MyFrame5(){
        super("Test area operation demo : ");
            // creating one label 
        l = new Label("Text Operation demo");
        ta = new TextArea(10,30);
        tf = new TextField(20);
        b = new Button("Click");

        // Handler h = new Handler();
        
        // b.addTextListener(h);

        setLayout(new FlowLayout());
        add(l);
        add(ta);
        add(tf);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
            l.setText(ta.append(tf.getText()));
        }
    // class Handler implements ActionListener, TextListener{
        
    // }
    
}

