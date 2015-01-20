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
    private int counter = 0;
    
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
<<<<<<< HEAD
	    if (draw1 || stage.equals("aim")) g2d.fillOval(pin1X,pin1Y,12,12);
	    if (draw2 || stage.equals("aim")) g2d.fillOval(pin2X,pin2Y,12,12);
	    if (draw3 || stage.equals("aim")) g2d.fillOval(pin3X,pin3Y,12,12);
	    if (draw4 || stage.equals("aim")) g2d.fillOval(pin4X,pin4Y,12,12);
	    if (draw5 || stage.equals("aim")) g2d.fillOval(pin5X,pin5Y,12,12);
	    if (draw6 || stage.equals("aim")) g2d.fillOval(pin6X,pin6Y,12,12);
	    if (draw7 || stage.equals("aim")) g2d.fillOval(pin7X,pin7Y,12,12);
	    if (draw8 || stage.equals("aim")) g2d.fillOval(pin8X,pin8Y,12,12);
	    if (draw9 || stage.equals("aim")) g2d.fillOval(pin9X,pin9Y,12,12);
	    if (draw10 || stage.equals("aim")) g2d.fillOval(pin10X,pin10Y,12,12);
=======
	    if (draw1) g2d.fillOval(pin1X,pin1Y,12,12);
	    if (draw2) g2d.fillOval(pin2X,pin2Y,12,12);
	    if (draw3) g2d.fillOval(pin3X,pin3Y,12,12);
	    if (draw4) g2d.fillOval(pin4X,pin4Y,12,12);
	    if (draw5) g2d.fillOval(pin5X,pin5Y,12,12);
	    if (draw6) g2d.fillOval(pin6X,pin6Y,12,12);
	    if (draw7) g2d.fillOval(pin7X,pin7Y,12,12);
	    if (draw8) g2d.fillOval(pin8X,pin8Y,12,12);
	    if (draw9) g2d.fillOval(pin9X,pin9Y,12,12);
	    if (draw10) g2d.fillOval(pin10X,pin10Y,12,12);
>>>>>>> 6e1e1b3248eb1e0f4558545c11f54a9b702b95ca

	    g2d.setColor(Color.BLUE);
	    g2d.drawOval(ballX,ballY,30,30);
	    g2d.fillOval(ballX,ballY,30,30);
	}
    }	    
  
    public void counter(){
	if (draw1 == false) counter++;
	if (draw2 == false) counter++;
	if (draw3 == false) counter++;
	if (draw4 == false) counter++;
	if (draw5 == false) counter++;
	if (draw6 == false) counter++;
	if (draw7 == false) counter++;
	if (draw8 == false) counter++;
	if (draw9 == false) counter++;
	if (draw10 == false) counter++;
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
	pin1X -= pin1Dx;
	pin1Y -= pin1Dy;
	pin2X -= pin2Dx;
	pin2Y -= pin2Dy;
	pin3X -= pin3Dx;
	pin3Y -= pin3Dy;
	pin4X -= pin4Dx;
	pin4Y -= pin4Dy;
	pin5X -= pin5Dx;
	pin5Y -= pin5Dy;
	pin6X -= pin6Dx;
	pin6Y -= pin6Dy;
	pin7X -= pin7Dx;
	pin7Y -= pin7Dy;
	pin8X -= pin8Dx;
	pin8Y -= pin8Dy;
	pin9X -= pin9Dx;
	pin9Y -= pin9Dy;
	pin10X -= pin10Dx;
	pin10Y -= pin10Dy;
    }

    public void setDxDy(){
        ballDx  = 2 * tilt;
	ballDy = speed/10 + 6 - mass/10;
	if (r.nextInt(8) == 0){
	    ballDx += (r.nextInt(8) - 4);
	}
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
		if (collision1()){
		    collideMove(1);
		}
		if (collision2()){
		    collideMove(2);
		}
		if (collision3()){
		    collideMove(3);
		}
		if (collision4()){
		    collideMove(4);
		}
		if (collision5()){
		    collideMove(5);
		}
		if (collision6()){
		    collideMove(6);
		}
		if (collision7()){
		    collideMove(7);
		}
		if (collision8()){
		    collideMove(8);
		}
		if (collision9()){
		    collideMove(9);
		}
		if (collision10()){
		    collideMove(10);
		}
		try{
		    t.sleep(100);
		}catch(InterruptedException e){

		}
	    }
	    stage = "aim";
	    setY(400);
	    setX(130);
	    repaint();
	}
    }

    public void collideMove(int i){
	if (i == 1){
	    if (ballDx > 0){
		pin1Dx = ballDx + 2;
		pin1Dy = r.nextInt(6) + 5;
	    }else if (ballDx < 0){
		pin1Dx = ballDx - 2;
		pin1Dy = r.nextInt(6) + 5;
	    }else{
		pin1Dx = r.nextInt(16) - 8;
		pin1Dy = r.nextInt(6) + 5;
	    }draw1 = false;
	}else if (i == 2){
	    if (ballDx > 0){
		pin2Dx = ballDx + 2;
		pin2Dy = r.nextInt(6) + 5;
	    }else if (ballDx < 0){
		pin2Dx = ballDx - 2;
		pin2Dy = r.nextInt(6) + 5;
	    }else{
		pin2Dx = r.nextInt(16) - 8;
		pin2Dy = r.nextInt(6) + 5;
	    }draw2 = false;
	}else if (i == 3){
	    if (ballDx > 0){
		pin3Dx = ballDx + 2;
		pin3Dy = r.nextInt(6) + 5;
	    }else if (ballDx < 0){
		pin3Dx = ballDx - 2;
		pin3Dy = r.nextInt(6) + 5;
	    }else{
		pin3Dx = r.nextInt(16) - 8;
		pin3Dy = r.nextInt(6) + 5;
	    }draw3 = false;
	}else if (i == 4){
	    if (ballDx > 0){
		pin4Dx = ballDx + 2;
		pin4Dy = r.nextInt(6) + 5;
	    }else if (ballDx < 0){
		pin4Dx = ballDx - 2;
		pin4Dy = r.nextInt(6) + 5;
	    }else{
		pin5Dx = r.nextInt(16) - 8;
		pin5Dy = r.nextInt(6) + 5;
	    }draw4 = false;
	}else if (i == 5){
	    if (ballDx > 0){
		pin6Dx = ballDx + 2;
		pin6Dy = r.nextInt(6) + 5;
	    }else if (ballDx < 0){
		pin6Dx = ballDx - 2;
		pin6Dy = r.nextInt(6) + 5;
	    }else{
		pin6Dx = r.nextInt(16) - 8;
		pin6Dy = r.nextInt(6) + 5;
	    }draw5 = false;
	}else if (i == 6){
	    if (ballDx > 0){
		pin6Dx = ballDx + 2;
		pin6Dy = r.nextInt(6) + 5;
	    }else if (ballDx < 0){
		pin6Dx = ballDx - 2;
		pin6Dy = r.nextInt(6) + 5;
	    }else{
		pin6Dx = r.nextInt(16) - 8;
		pin6Dy = r.nextInt(6) + 5;
	    }draw6 = false;
	}else if (i == 7){
	    if (ballDx > 0){
		pin7Dx = ballDx + 2;
		pin7Dy = r.nextInt(6) + 5;
	    }else if (ballDx < 0){
		pin7Dx = ballDx - 2;
		pin7Dy = r.nextInt(6) + 5;
	    }else{
		pin7Dx = r.nextInt(16) - 8;
		pin7Dy = r.nextInt(6) + 5;
	    }draw7 = false;
	}else if (i == 8){
	    if (ballDx > 0){
		pin8Dx = ballDx + 2;
		pin8Dy = r.nextInt(6) + 5;
	    }else if (ballDx < 0){
		pin8Dx = ballDx - 2;
		pin8Dy = r.nextInt(6);
	    }else{
		pin8Dx = r.nextInt(16) - 8;
		pin8Dy = r.nextInt(6);
	    }draw8 = false;
	}else if (i == 9){
	    if (ballDx > 0){
		pin9Dx = ballDx + 2;
		pin9Dy = r.nextInt(6) + 5;
	    }else if (ballDx < 0){
		pin9Dx = ballDx - 2;
		pin9Dy = r.nextInt(6) + 5;
	    }else{
		pin9Dx = r.nextInt(16) - 8;
		pin9Dy = r.nextInt(6) + 5;
	    }draw9 = false;
	}else if (i == 10){
	    if (ballDx > 0){
		pin10Dx = ballDx + 2;
		pin10Dy = r.nextInt(6) + 5;
	    }else if (ballDx < 0){
		pin10Dx = ballDx - 2;
		pin10Dy = r.nextInt(6) + 5;
	    }else{
		pin10Dx = r.nextInt(16) - 8;
		pin10Dy = r.nextInt(6) + 5;
	    }draw10 = false;
	}
    }

    public Rectangle ballBounds(){
	return new Rectangle(ballX, ballY, 30,30);
    }
    public Rectangle getBounds1(){
	return new Rectangle(pin1X,pin1Y,12,12);
    }
    public Rectangle getBounds2(){
	return new Rectangle(pin2X,pin2Y,12,12);
    }
    public Rectangle getBounds3(){
	return new Rectangle(pin3X,pin3Y,12,12);
    }
    public Rectangle getBounds4(){
	return new Rectangle(pin4X,pin4Y,12,12);
    }
    public Rectangle getBounds5(){
	return new Rectangle(pin5X,pin5Y,12,12);
    }
    public Rectangle getBounds6(){
	return new Rectangle(pin6X,pin6Y,12,12);
    }
    public Rectangle getBounds7(){
	return new Rectangle(pin7X,pin7Y,12,12);
    }
    public Rectangle getBounds8(){
	return new Rectangle(pin8X,pin8Y,12,12);
    }
    public Rectangle getBounds9(){
	return new Rectangle(pin9X,pin9Y,12,12);
    }
    public Rectangle getBounds10(){
	return new Rectangle(pin10X,pin10Y,12,12);
    }

    public Boolean collision1(){
	return ballBounds().intersects(getBounds1());
    }
    public Boolean collision2(){
	return ballBounds().intersects(getBounds2());
    }    
    public Boolean collision3(){
	return ballBounds().intersects(getBounds3());
    }   
    public Boolean collision4(){
	return ballBounds().intersects(getBounds4());
    }   
    public Boolean collision5(){
	return ballBounds().intersects(getBounds5());
    }    
    public Boolean collision6(){
	return ballBounds().intersects(getBounds6());
    }    
    public Boolean collision7(){
	return ballBounds().intersects(getBounds7());
    }   
    public Boolean collision8(){
	return ballBounds().intersects(getBounds8());
    }   
    public Boolean collision9(){
	return ballBounds().intersects(getBounds9());
    }    
    public Boolean collision10(){
	return ballBounds().intersects(getBounds10());
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
	int x = e.getX();
	int y = e.getY();
	if (stage.equals("aim")){
	    if (x <= 200 && x >= 25){
		setX(x);
		repaint();
	    }
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
	}
    }
    public void mouseEntered(MouseEvent e){
    }
    public void mouseExited(MouseEvent e){
    }
    public void run(){

    }
}
