import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class PinSpace extends JPanel implements MouseListener,ActionListener{

    private Timer clock = new Timer(1000, this);

    private JPanel bowl = new JPanel();
    private JButton bowlButton = new JButton("LAUNCH");

    private String stage = "aim";

    public PinSpace(GameScreen a){
	setBackground(new Color(255,140,0));
	setBounds(400,151,386,250);
	addMouseListener(this);
	repaint();
	stage = "aim";
	clock.start();
        bowlButton.setActionCommand("bowl");
	bowlButton.addActionListener(a);
	bowlButton.setPreferredSize(new Dimension (110,20));
	bowl.add(bowlButton);
	bowl.setBounds(193,530,120,30);
	add(bowl);
    }

    public void paintComponent(Graphics g){
	super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			     RenderingHints.VALUE_ANTIALIAS_ON); 

	g2d.setColor(Color.BLACK);
	g2d.drawOval(90,70,18,18);
	g2d.drawOval(150,70,18,18);
	g2d.drawOval(210,70,18,18);
	g2d.drawOval(270,70,18,18);
	g2d.drawOval(120,110,18,18);
	g2d.drawOval(180,110,18,18);
	g2d.drawOval(240,110,18,18);
	g2d.drawOval(150,150,18,18);
	g2d.drawOval(210,150,18,18);
	g2d.drawOval(180,190,18,18);
	
	g2d.setColor(Color.RED);
	g2d.fillOval(90,70,18,18);
	g2d.fillOval(150,70,18,18);
	g2d.fillOval(210,70,18,18);
	g2d.fillOval(270,70,18,18);
	g2d.fillOval(120,110,18,18);
	g2d.fillOval(180,110,18,18);
	g2d.fillOval(240,110,18,18);
	g2d.fillOval(150,150,18,18);
	g2d.fillOval(210,150,18,18);
	g2d.fillOval(180,190,18,18);

    }	    

    public void actionPerformed(ActionEvent e){
	repaint();
	String action = e.getActionCommand();
	try{
	    if (action.equals("bowl")){
		System.out.println("bowl");
	    }
	}catch(NullPointerException a){
	    
	}
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
