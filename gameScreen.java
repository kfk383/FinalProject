import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class GameScreen extends JPanel implements MouseListener,ActionListener{

    private boolean enter = true;
    
    private int speed;
    private int mass;
    
    private int ballDx;
    private int ballDy;
    
    private int ballX = 130;
    private int ballY = 400;
    
    private Timer clock = new Timer(100,this);

    private String stage = "aim";

    public GameScreen(){
	setBackground(new Color(255,244,77));
	setBounds(75,0,250,495);
	addMouseListener(this);
	enter = true;
	ballX = 130;
	ballY = 425;
	clock.start();
    }

    public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.setColor(Color.BLACK);
	if (enter == true){
	    ballX = 115;
	    ballY = 425;
	    g.drawOval(40,10,12,12);
	    g.drawOval(95,10,12,12);
	    g.drawOval(150,10,12,12);
	    g.drawOval(205,10,12,12);
	    g.drawOval(68,40,12,12);
	    g.drawOval(123,40,12,12);
	    g.drawOval(178,40,12,12);
	    g.drawOval(95,70,12,12);
	    g.drawOval(150,70,12,12);
	    g.drawOval(123,100,12,12);

	    g.setColor(Color.RED);
	    g.fillOval(40,10,12,12);
	    g.fillOval(95,10,12,12);
	    g.fillOval(150,10,12,12);
	    g.fillOval(205,10,12,12);
	    g.fillOval(68,40,12,12);
	    g.fillOval(123,40,12,12);
	    g.fillOval(178,40,12,12);
	    g.fillOval(95,70,12,12);
	    g.fillOval(150,70,12,12);
	    g.fillOval(123,100,12,12);
	    g.setColor(Color.BLUE);
	    g.drawOval(ballX,ballY,30,30);
	    g.fillOval(ballX,ballY,30,30);
	    enter = false;
	}else{
	    g.drawOval(40,10,12,12);
	    g.drawOval(95,10,12,12);
	    g.drawOval(150,10,12,12);
	    g.drawOval(205,10,12,12);
	    g.drawOval(68,40,12,12);
	    g.drawOval(123,40,12,12);
	    g.drawOval(178,40,12,12);
	    g.drawOval(95,70,12,12);
	    g.drawOval(150,70,12,12);
	    g.drawOval(123,100,12,12);

	    g.setColor(Color.RED);
	    g.fillOval(40,10,12,12);
	    g.fillOval(95,10,12,12);
	    g.fillOval(150,10,12,12);
	    g.fillOval(205,10,12,12);
	    g.fillOval(68,40,12,12);
	    g.fillOval(123,40,12,12);
	    g.fillOval(178,40,12,12);
	    g.fillOval(95,70,12,12);
	    g.fillOval(150,70,12,12);
	    g.fillOval(123,100,12,12);
	    
	    g.setColor(Color.BLUE);
	    g.drawOval(ballX,ballY,30,30);
	    g.fillOval(ballX,ballY,30,30);
	}
    }	    

    public void setSpeed(int x){
	speed = x;
    }

    public void setMass(int x){
	mass = x;
    }

    public void updateVectors(){
	ballX -= ballDx;
	ballY -= ballDy;
    }

    public void setDxDy(){
        ballDx = speed/10 + 1;
	ballDy = 8 - (mass / 10);
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
	int x = ballX;
	int y = ballY;
	if (stage.equals("roll")){
	    if (y > 0 && (x > 0 && x < 250)){
		setDxDy();
		updateVectors();
		repaint();
	    }else{
		stage = "aim";
	    }
	}
    }


    public void actionPerformed(ActionEvent e){
	animate();
	String action = e.getActionCommand();
	if (action.equals("bowl")){
	    stage = "roll";
	}
    }

    public void mouseClicked(MouseEvent e){

    }
    public void mousePressed(MouseEvent e){
	int x = e.getX();
	int y = e.getY();
	if (stage.equals("aim")){
	    if (x <= 200 && x >= 25){
		setX(x);
		repaint();
	    }
	}else if (stage.equals("roll")){
	    if (ballX < x){
		ballDx += 2;
	    }else if (ballX > x){
		ballDx -= 2;
	    }
	    repaint();
	}
    }
    public void mouseReleased(MouseEvent e){
	int x = e.getX();
	int y = e.getY();
	if (stage.equals("aim")){
	    if (x <= 200 && x >= 25){
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
