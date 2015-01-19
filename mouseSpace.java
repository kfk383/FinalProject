import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;


public class mouseSpace extends JPanel{

    public mouseSpace(){
	setBackground(new Color(204,153,0));
	setBounds(400,150,386,250);
    }

    public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.setColor(Color.BLACK);
	g.drawOval(420,170,15,15);

	g.fillOval(420,170,15,15);
    }
}
