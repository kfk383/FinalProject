import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;
import java.util.*;

public class GameScreen extends JPanel implements MouseListener,ActionListener,Runnable{

    private Random r = new Random();

    private boolean enter = true;    

    private Boolean draw1 = true;
    private Boolean draw2 = true;
    private Boolean draw3 = true;
    private Boolean draw4 = true;
    private Boolean draw5 = true;
    private Boolean draw6 = true;
    private Boolean draw7 = true;
    private Boolean draw8 = true;
    private Boolean draw9 = true;
    private Boolean draw10 = true;

    private int speed = 10;
    private int mass= 10;
    private int tilt = 0;
    
    private int ballDx;
    private int ballDy;

    private int pin1Dx = 0;
    private int pin1Dy = 0;
    private int pin1X = 40;
    private int pin1Y = 10;

    private int pin2Dx = 0;
    private int pin2Dy = 0;
    private int pin2X = 95;
    private int pin2Y = 10;

    private int pin3Dx = 0;
    private int pin3Dy = 0;
    private int pin3X = 150;
    private int pin3Y = 10;

    private int pin4Dx = 0;
    private int pin4Dy = 0;
    private int pin4X = 205;
    private int pin4Y = 10;

    private int pin5Dx = 0;
    private int pin5Dy = 0;
    private int pin5X = 68;
    private int pin5Y = 40;

    private int pin6Dx = 0;
    private int pin6Dy = 0;
    private int pin6X = 123;
    private int pin6Y = 40;

    private int pin7Dx = 0;
    private int pin7Dy = 0;
    private int pin7X = 178;
    private int pin7Y = 40;

    private int pin8Dx = 0;
    private int pin8Dy = 0;
    private int pin8X = 95;
    private int pin8Y = 70;

    private int pin9Dx = 0;
    private int pin9Dy = 0;
    private int pin9X = 150;
    private int pin9Y = 70;

    private int pin10Dx = 0;
    private int pin10Dy = 0;
    private int pin10X = 123;
    private int pin10Y = 100;
    
    private int ballX = 130;
    private int ballY = 400;

    private String stage = "aim";
    
    public Thread t = new Thread();
    public Thread t2 = new Thread();

    public GameScreen(){
	setBackground(new Color(255,215,0));
	setBounds(75,0,250,495);
	addMouseListener(this);
	enter = true;
	ballX = 130;
	ballY = 425;
	t.start();
    }

    public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.setColor(Color.BLACK);
	Graphics2D g2d = (Graphics2D) g;
	
	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			     RenderingHints.VALUE_ANTIALIAS_ON); 

	if (enter == true){
	    ballX = 115;
	    ballY = 425;
	    g2d.drawOval(pin1X,pin1Y,12,12);
	    g2d.drawOval(pin2X,pin2Y,12,12);
	    g2d.drawOval(pin3X,pin3Y,12,12);
	    g2d.drawOval(pin4X,pin4Y,12,12);
	    g2d.drawOval(pin5X,pin5Y,12,12);
	    g2d.drawOval(pin6X,pin6Y,12,12);
	    g2d.drawOval(pin7X,pin7Y,12,12);
	    g2d.drawOval(pin8X,pin8Y,12,12);
	    g2d.drawOval(pin9X,pin9Y,12,12);
	    g2d.drawOval(pin10X,pin10Y,12,12);

	    g2d.setColor(Color.RED);
	    g2d.fillOval(pin1X,pin1Y,12,12);
	    g2d.fillOval(pin2X,pin2Y,12,12);
	    g2d.fillOval(pin3X,pin3Y,12,12);
	    g2d.fillOval(pin4X,pin4Y,12,12);
	    g2d.fillOval(pin5X,pin5Y,12,12);
	    g2d.fillOval(pin6X,pin6Y,12,12);
	    g2d.fillOval(pin7X,pin7Y,12,12);
	    g2d.fillOval(pin8X,pin8Y,12,12);
	    g2d.fillOval(pin9X,pin9Y,12,12);
	    g2d.fillOval(pin10X,pin10Y,12,12);

	    g2d.setColor(Color.BLUE);
	    g2d.drawOval(ballX,ballY,30,30);
	    g2d.fillOval(ballX,ballY,30,30);
	    enter = false;
	}else{
	    g2d.drawOval(pin1X,pin1Y,12,12);
	    g2d.drawOval(pin2X,pin2Y,12,12);
	    g2d.drawOval(pin3X,pin3Y,12,12);
	    g2d.drawOval(pin4X,pin4Y,12,12);
	    g2d.drawOval(pin5X,pin5Y,12,12);
	    g2d.drawOval(pin6X,pin6Y,12,12);
	    g2d.drawOval(pin7X,pin7Y,12,12);
	    g2d.drawOval(pin8X,pin8Y,12,12);
	    g2d.drawOval(pin9X,pin9Y,12,12);
	    g2d.drawOval(pin10X,pin10Y,12,12);

	    g2d.setColor(Color.RED);
	    if (draw1) g2d.fillOval(pin1X,pin1Y,12,12);
	    if (draw2) g2d.fillOval(pin2X,pin2Y,12,12);
	    if (draw3) g2d.fillOval(pin3X,pin3Y,12,12);
	    if (draw4) g2d.fillOval(pin4X,pin4Y,12,12);
	    if (draw5) g2d.fillOval(pin5X,pin5Y,12,12);
	    if (draw6) g2d.fillOval(pin6X,pin6Y,12,12);
	    if (draw7) g2d.fillOval(pin7X,pin7Y,12,12);
	    if (draw8) g2d.fillOval(pin8X,pin8Y,12,12);
	    if (draw9) g2d.fillOval(pin9X,pin9Y,12,12);
	    if (draw10) g2d.fillOval(pin10X,pin9Y,12,12);

	    g2d.setColor(Color.BLUE);
	    g2d.drawOval(ballX,ballY,30,30);
	    g2d.fillOval(ballX,ballY,30,30);
	}
    }	    
    
    public void setDraw1(Boolean x){
	draw1 = x;
    }
    public void setDraw2(Boolean x){
	draw2 = x;
    }   
    public void setDraw3(Boolean x){
	draw3 = x;
    }   
    public void setDraw4(Boolean x){
	draw4 = x;
    }    
    public void setDraw5(Boolean x){
	draw5 = x;
    }   
    public void setDraw6(Boolean x){
	draw6 = x;
    }    
    public void setDraw7(Boolean x){
	draw7 = x;
    }    
    public void setDraw8(Boolean x){
	draw8 = x;
    }    
    public void setDraw9(Boolean x){
	draw9 = x;
    }   
    public void setDraw10(Boolean x){
	draw10 = x;
    }

    public void setSpeed(int x){
	speed = x;
    }

    public void setMass(int x){
	mass = x;
    }

    public void setTilt(int x){
	tilt = x;
    }

    public void updateVectors(){
	ballX -= ballDx;
	ballY -= ballDy;
    }

    public void setDxDy(){
        ballDx  = 2 * tilt;
	ballDy = speed/10 + 6 - mass/10;
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
	    while (ballY > 10 && ballX > 0 && ballX < 250){
		setDxDy();
		updateVectors();
	        paintComponent(this.getGraphics());
		try{
		    t.sleep(100);
		}catch(InterruptedException e){

		}
	    }
	    setStage("aim");
	    setY(400);
	    setX(130);
	    repaint();
	}
    }


    public void actionPerformed(ActionEvent e){
	animate();
	String action = e.getActionCommand();
	if (action.equals("bowl")){
	    stage = "roll";
	}
        paintComponent(this.getGraphics());
    }

    public void mouseClicked(MouseEvent e){

    }
    public void mousePressed(MouseEvent e){
	System.out.println("a");
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
    public void run(){

    }
}
