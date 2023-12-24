import java.awt.*;

/**
 * FirstApp
 */
public class FirstApp {
    public static void main(String[] args) {
        Frame f = new Frame("My first app");
        f.setLayout(new FlowLayout()); // setting the layout of frame 
        Label l = new Label("Name"); 
        TextField tf = new TextField(20);// need to create the label first 
        Button b = new Button("Ok");

     f.add(l);
     f.add(tf);
     f.add(b);  
        f.setSize(400,400);
        f.setVisible(true);
    }
}