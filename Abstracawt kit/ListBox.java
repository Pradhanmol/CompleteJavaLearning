import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;

public class ListBox {
    public static void main(String[] args) {
        MyFrame6 f = new MyFrame6();
        f.setSize(200, 300);
        f.setVisible(true);
        }
    }
/**
 *  MyFrame6
 */
class  MyFrame6 extends Frame {
    List l;
    Choice c;
    TextArea ta;
    MyFrame6(){
        super("ListBox Demo");
        l = new List(4, true);
        c = new Choice();
        ta = new TextArea(20,30);
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wedensday");
        l.add("Thrusday");
        l.add("Friday");
        l.add("Saturday"); 
        l.add("Sunday");
        
        c.add("January");
        c.add("Feb");
        c.add("Mar");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);
    }
}
