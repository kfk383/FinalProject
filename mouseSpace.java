import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;


public class mouseSpace extends JPanel implements MouseListener,ActionListener{

    private boolean enter = true;

    private int speed;
    private int mass;
    
    private int ballDx;
    private int ballDy;
    
    private int ballX = 175;
    private int ballY = 100;
    
    private String stage = "aim";
    
    private Timer clock = new Timer(1000, this);

    public mouseSpace(){
	setBackground(new Color(77,153,77));
	setBounds(400,150,386,250);
	addMouseListener(this);
	enter = true;
	ballX = 175;
	ballY = 100;
    }

    public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.setColor(Color.BLUE);
	if (enter == true){
	    ballX = 175;
	    ballY = 100;
	    g.drawOval(ballX,ballY,40,40);
	    g.fillOval(ballX,ballY,40,40);
	    enter = false;
	}else{
	g.drawOval(ballX,ballY,40,40);
	g.fillOval(ballX,ballY,40,40);
	}
    }	

    public void setSpeed(int x){
	speed = x;
    }

    public void setMass(int x){
	mass = x;
    }

    public void updateVectors(){
	ballX += ballDx;
	ballY += ballDy;
    }

    public void setDxDy(){
        ballDx = speed + 1;
	ballDy = 10 - (mass / 10);
    }

    public void setStage(String x){
	if (x.equals("aim") || x.equals("roll")){
	    stage = x;
	}
    }

    public void setDx(int x){
	ballDx = x;
    }

    public void setDy(int x){
	ballDy = x;
    }

    public void setX(int x){
	ballX = x;
    }

    public void setY(int x){
	ballY = x;
    }

    public void animate(){
	if (stage.equals("roll")){
	    setDxDy();
	    updateVectors();
	    repaint();
	}
    }

    public void actionPerformed(ActionEvent e){

    }

    public void mouseClicked(MouseEvent e){
    }
    public void mousePressed(MouseEvent e){
	int x = e.getX();
	int y = e.getY();
	if (stage.equals("aim")){
	    if (x <= 250 && x >= 25){
		setX(x);
		repaint();
	    }
	}else if (stage.equals("roll")){
	    if (ballX < x){
		ballDx += 2;
	    }else if (ballX > x){
		ballDx -= 2;
	    }
	}
    }

    public void mouseReleased(MouseEvent e){
	int x = e.getX();
	int y = e.getY();
	if (stage.equals("aim")){
	    if (x <= 250 && x >= 25){
		setX(x);
		repaint();
	    }
	}else if (stage.equals("roll")){
	    if (ballX < x){
		ballDx += 2;
	    }else if (ballX > x){
		ballDx -= 2;
	    }
	}
    }
    public void mouseEntered(MouseEvent e){
	int x = e.getX();
	int y = e.getY();
	if (stage.equals("roll")){
	    if (ballX < x){
		ballDx += 1;
	    }else if (ballX > x){
		ballDx -= 1;
	    }
	}
    }

    public void mouseExited(MouseEvent e){
    }
}