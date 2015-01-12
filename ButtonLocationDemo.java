import javax.swing.*;
import java.awt.*;
public class ButtonLocationDemo extends JFrame{

 private JButton button;
 public ButtonLocationDemo(){
      JPanel p = new JPanel();
      button = new JButton("Button");
      p.setLayout(null);
      button.setBounds(40,100,100,60);
      p.add(button);

      getContentPane().add(p);
      //setLayout(null);
      setDefaultCloseOperation(3);
      setSize(400,400);
      setVisible(true);

     }
   public static void main(String...args){
       new ButtonLocationDemo();
       }
}