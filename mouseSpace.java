import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class mouseSpace extends JPanel implements ActionListener, MouseListener{

    private Timer clock = new Timer(1000, this);

    public mouseSpace(){
	setLayout(null);
	setOpaque(true);
	setBackground(new Color(204,153,0));
	setBounds(400,150,386,250);
	addMouseListener(this);
	repaint();
	clock.start();
    }

    public void paintComponent(Graphics g){
	super.paintComponent(g);

	g.setColor(Color.BLACK);
	g.drawOval(420,160,15,15);
	g.drawOval(475,160,15,15);
	g.drawOval(530,10,15,15);
	g.drawOval(585,10,15,15);
	g.drawOval(448,40,15,15);
	g.drawOval(503,40,15,15);
	g.drawOval(558,40,15,15);
	g.drawOval(475,70,15,15);
	g.drawOval(530,70,15,15);
	g.drawOval(503,100,15,15);
	
	g.setColor(Color.RED);
	g.fillOval(420,10,15,15);
	g.fillOval(475,10,15,15);
	g.fillOval(530,10,15,15);
	g.fillOval(585,10,15,15);
	g.fillOval(448,40,15,15);
	g.fillOval(503,40,15,15);
	g.fillOval(558,40,15,15);
	g.fillOval(475,70,15,15);
	g.fillOval(530,70,15,15);
	g.fillOval(503,100,15,15);
    }	    

    public void actionPerformed(ActionEvent e){
	repaint();
    }
    public void mouseClicked(MouseEvent e){

    }
    public void mousePressed(MouseEvent e){

    }
    public void mouseReleased(MouseEvent e){

    }
    public void mouseEntered(MouseEvent e){

    }
    public void mouseExited(MouseEvent e){

    }
}
