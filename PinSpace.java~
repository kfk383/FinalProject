import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class PinSpace extends JPanel implements MouseListener,ActionListener{

    private Timer clock = new Timer(1000, this);

    public PinSpace(){
	setBackground(new Color(204,153,0));
	setBounds(400,151,386,250);
	addMouseListener(this);
	repaint();
	clock.start();
    }

    public void paintComponent(Graphics g){
	super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

	g2d.setColor(Color.BLACK);
	g2d.drawOval(90,40,18,18);
	g.drawOval(150,40,18,18);
	g.drawOval(210,40,18,18);
	g.drawOval(270,40,18,18);
	g.drawOval(120,80,18,18);
	g.drawOval(180,80,18,18);
	g.drawOval(240,80,18,18);
	g.drawOval(150,120,18,18);
	g.drawOval(210,120,18,18);
	g.drawOval(180,160,18,18);
	
	g.setColor(Color.RED);
	g2d.fillOval(90,40,18,18);
	g.fillOval(150,40,18,18);
	g.fillOval(210,40,18,18);
	g.fillOval(270,40,18,18);
	g.fillOval(120,80,18,18);
	g.fillOval(180,80,18,18);
	g.fillOval(240,80,18,18);
	g.fillOval(150,120,18,18);
	g.fillOval(210,120,18,18);
	g.fillOval(180,160,18,18);
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
