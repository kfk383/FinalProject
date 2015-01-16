import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
 
/*
 * W7R.blogspot.com
 * Brian R. H.
 */
 
public class MyPanel extends JPanel implements ActionListener{
 int ovalX=400,ovalY=400,ovalWidth=50,ovalHeight=30;
 int rectX = 200, rectY = 200, rectWidth = 20, rectHeight = 10;
 int rectDx=10,  rectDy=0; //change in Y
 int ovalDx=-20, ovalDy=0;
 
 //        1 tick/second
 Timer clock = new Timer(1000,this);
 
 MyPanel(){
  setSize(800,600);
  clock.start();
 }
 @Override
 public void paint(Graphics g){
  //  paint occurs when the method repaint() is called (see actionPerformed method )
  Graphics2D g2d = (Graphics2D) g;
  g2d.drawRoundRect(rectX, rectY, rectWidth, rectHeight, 10, 10);
  g2d.setColor(Color.blue);
  g2d.drawOval(ovalX, ovalY, ovalWidth, ovalHeight);
 }
 public static void main(String[] args) {
  JFrame j = new JFrame("Title");
  JPanel p = new MyPanel();
  j.setContentPane(p);
  j.setSize(800,600);
  j.setVisible(true);
  p.setVisible(true);
 }
 private void updateVectors() {
  rectX+=rectDx;
  rectY+=rectDy;
  ovalX+=ovalDx;
  ovalY+=ovalDy;
 }
 @Override
 public void actionPerformed(ActionEvent arg0) {
  repaint();
  updateVectors();
 }
}
// See more at: http://w7r.blogspot.com/2012/05/how-to-create-animations-with-jpanels.html#sthash.WKVlXJHF.dpuf