import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;


public class gameScreen extends JPanel{

    public gameScreen(){
	setBackground(new Color(255,244,77));
	setBounds(50,0,300,495);

    }

    public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.setColor(Color.BLUE);
	g.fillOval(130,400,40,40);
    }	    
}
