import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;
import java.util.*;

public class GameScreen extends JPanel implements MouseListener,ActionListener,Runnable{

    private Random r = new Random(1);
    private int bowlnum = 1;
    private int trial = 1;
    private int handicap = 0;
    private boolean enter = true;   

    private PinSpace pinSpace = new PinSpace(this);
    private ScoreBoard scoreBoard = new ScoreBoard();
    private ButtonScreen buttonScreen = new ButtonScreen();

    private int[][]scores = new int[10][2];

    private int a = 0;
    private int b = 0;

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

/**
 * Constructor for the main playing screen of the game.
 */
    public GameScreen(){
	setBackground(new Color(255,215,0));
	setBounds(75,0,250,495);
	addMouseListener(this);
	enter = true;
	ballX = 130;
	ballY = 425;
	t.start();
    }

/**
 * Adds a ButtonScreen object so that the GameScreen object may alter elements in the other JPanel.
 */ 
    public void addButtons(ButtonScreen b){
	buttonScreen = b;
    }
    
/**
 * Adds a PinSpace object so that the GameScreen object may alter elements in the other JPanel.
 */ 
    public void addPins(PinSpace p){
	pinSpace = p;
    }
    
/**
 * Adds a ScoreBoard object so that the GameScreen object may alter elements in the other JPanel.
 */ 
    public void addScore(ScoreBoard s){
	scoreBoard = s;
    }

/**
 * Get method for hte 2D array scores, which has the bowling scores stored inside.
 */
    public int[][] getScores(){
	return scores;
    }

/**
 * Paints the bowling pins and the bowling ball according to predetermined coordinates, which have already been declared in other functions.
 * @param Graphics g the graphics on which the object will be painted upon.
 */
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
	    g2d.drawOval(ballX,ballY,40 + handicap,40 + handicap);
	    g2d.fillOval(ballX,ballY,40 + handicap,40 + handicap);
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

	    g2d.setColor(Color.BLUE);
	    g2d.drawOval(ballX,ballY,40 + handicap,40 + handicap);
	    g2d.fillOval(ballX,ballY,40 + handicap,40 + handicap);
	}
    }	    
  
/**
 * Counts the number of pins still standing after each bowl, then adds it into the 2D array with the given index.
 * @param int a1 the index of the first layered array that the pin number will be added into.
 * @param int b1 the index of the second layered array that the pin number will be added into.
 */ 
    public int[][] countPoints(int a1, int b1){
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
	if (b == 1 && counter == 10){
	    scores[a1][b1] = 10;
	}else if (b1 == 0 && counter == 10){
	    scores[a1][b1] = 10;
	    scores[a1][b1 + 1] = 0;
	    b+= 1;
	}else{
	scores[a1][b1] = counter;
	}
	if (b1 == 0){
	    b += 1;
	    stage = "aim";
	}else if (b1 == 1){
	    b = 0;
	    a+= 1;
	    draw1 = true;
	    draw2 = true;
	    draw3 = true;
	    draw4 = true;
	    draw5 = true;
	    draw6 = true;
	    draw7 = true;
	    draw8 = true;
	    draw9 = true;
	    draw10 = true;
	    
	    pin1Dx = 0;
	    pin1Dy = 0;
	    pin1X = 40;
	    pin1Y = 10;
	    
	    pin2Dx = 0;
	    pin2Dy = 0;
	    pin2X = 95;
	    pin2Y = 10;
	    
	    pin3Dx = 0;
	    pin3Dy = 0;
	    pin3X = 150;
	    pin3Y = 10;
	    
	    pin4Dx = 0;
	    pin4Dy = 0;
	    pin4X = 205;
	    pin4Y = 10;
	    
	    pin5Dx = 0;
	    pin5Dy = 0;
	    pin5X = 68;
	    pin5Y = 40;

	    pin6Dx = 0;
	    pin6Dy = 0;
	    pin6X = 123;
	    pin6Y = 40;
	    
	    pin7Dx = 0;
	    pin7Dy = 0;
	    pin7X = 178;
	    pin7Y = 40;
	    
	    pin8Dx = 0;
	    pin8Dy = 0;
	    pin8X = 95;
	    pin8Y = 70;
	    
	    pin9Dx = 0;
	    pin9Dy = 0;
	    pin9X = 150;
	    pin9Y = 70;
	    
	    pin10Dx = 0;
	    pin10Dy = 0;
	    pin10X = 123;
	    pin10Y = 100;
	}
	    stage = "aim";
	    return scores;
    }

/**
 * Sets the increase on the diameter of the bowling ball to make it easier to bowl down pins.
 * @param int a the number that will be added to the original diameter of the ball
 */ 
    public void setHandicap(int a){
	handicap = a;
    }

/**
 * Get method for the bowling round
 */
    public int getBowlnumA(){
	return a;
    }

/**
 * Get method for the bowling try number
 */ 
    public int getBowlnumB(){
	return b;
    }

/**
 * Sets the speed of the bowling ball for the bowl.
 * @param int x the desired speed of the ball.
 */ 
    public void setSpeed(int x){
	speed = x;
    }

/**
 * Sets the mass of the bowling ball, which will factor into the speed of the ball.
 * @param int x the desired mass of the ball.
 */ 
    public void setMass(int x){
	mass = x;
    }

/**
 * Sets the tilt amount for the ball, which will affect the amount the ball moves from side to side.
 * @param int x the desired tilt of the ball.
 */
 
    public void setTilt(int x){
	tilt = x;
    }

/**
 * Changes the location of each object by a set amount, altering their x- and y-coordinates.
 */ 
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

/**
 * Sets the change of the x and y coordinates of the bowling ball, factoring in the speed, mass, and tilt.
 */
    public void setDxDy(){
	int curve = r.nextInt(3) - 1;
        ballDx  = 2 * tilt + curve;
	ballDy = speed/10 + 10 - mass/10;
    }

/**
 * Sets the stage of the ball to either aiming or rolling the ball.
 * @param String x the desired stage of the ball.
 */
    public void setStage(String x){
	if (x.equals("aim") || x.equals("roll")){
	    stage = x;
	}
    }

/**
 * Get method for the ball's stage as either aiming or rolling
 */
    public String getStage(){
	return stage;
    }

/**
 * Sets the change of the x-coordinate of the bowling ball in animations.
 * @param int x the change of the x-coordinate of the ball in animations.
 */ 
    public void setDx(int x){
	ballDx = x;
    }

/**
 * Sets the change of the y-coordinate of the bowling ball in animations.
 * @param int x the change of the y-coordinate of the ball in animations.
 */     
    public void setDy(int x){
	ballDy = x;
    }

/**
 * Sets the x-coordinate of the bowling ball.
 * @param int x the desired x-coordinate of the bowling ball
 */
    public void setX(int x){
	ballX = x;
    }

/**
 * Sets the y-coordinate of the bowling ball.
 * @param int x the desired y-coordinate of the bowling ball
 */
    public void setY(int x){
	ballY = x;
    }

/**
 * Animates the bowling ball and bowling pins according to their respective dy and dx values.
 */
    public void animate(){
	if (stage.equals("roll")){
	    while (ballY > 0 && ballX > 0 && ballX < 250){
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
	    setY(400);
	    setX(130);
	    stage = "aim";
	    repaint();
	}
	stage = "aim";
    }

/**
 * Accounts for the movement of the bowling pins upon collision with the bowling ball.
 * @param int i the bowling pin that is moving upon its collision with the bowling ball.
 */ 
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
		pin4Dx = r.nextInt(16) - 8;
		pin4Dy = r.nextInt(6) + 5;
	    }draw4 = false;
	}else if (i == 5){
	    if (ballDx > 0){
		pin5Dx = ballDx + 2;
		pin5Dy = r.nextInt(6) + 5;
	    }else if (ballDx < 0){
		pin5Dx = ballDx - 2;
		pin5Dy = r.nextInt(6) + 5;
	    }else{
		pin5Dx = r.nextInt(16) - 8;
		pin5Dy = r.nextInt(6) + 5;
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

/** 
 * Returns the bounds of the bowling ball on the GUI
 */
    public Rectangle ballBounds(){
	return new Rectangle(ballX, ballY, 40,40);
    }
 /** 
 * Returns the bounds of the first bowling pin on the GUI
 */
    public Rectangle getBounds1(){
	return new Rectangle(pin1X,pin1Y,12,12);
    }
/** 
 * Returns the bounds of the second bowling pin on the GUI
 */    
    public Rectangle getBounds2(){
	return new Rectangle(pin2X,pin2Y,12,12);
    }
/** 
 * Returns the bounds of the third bowling pin on the GUI
 */    
    public Rectangle getBounds3(){
	return new Rectangle(pin3X,pin3Y,12,12);
    }
 /** 
 * Returns the bounds of the fourth bowling pin on the GUI
 */
    public Rectangle getBounds4(){
	return new Rectangle(pin4X,pin4Y,12,12);
    }
 /** 
 * Returns the bounds of the fifth bowling pin on the GUI
 */
    public Rectangle getBounds5(){
	return new Rectangle(pin5X,pin5Y,12,12);
    }
/** 
 * Returns the bounds of the sixth bowling pin on the GUI
 */    
    public Rectangle getBounds6(){
	return new Rectangle(pin6X,pin6Y,12,12);
    }
/** 
 * Returns the bounds of the seventh bowling pin on the GUI
 */    
    public Rectangle getBounds7(){
	return new Rectangle(pin7X,pin7Y,12,12);
    }
/** 
 * Returns the bounds of the eighth bowling pin on the GUI
 */    
    public Rectangle getBounds8(){
	return new Rectangle(pin8X,pin8Y,12,12);
    }
/** 
 * Returns the bounds of the ninth bowling pin on the GUI
 */    
    public Rectangle getBounds9(){
	return new Rectangle(pin9X,pin9Y,12,12);
    }
/** 
 * Returns the bounds of the tenth bowling pin on the GUI
 */    
    public Rectangle getBounds10(){
	return new Rectangle(pin10X,pin10Y,12,12);
    }

/**
 * Checks if the bowling ball hits bowling pin 1
 */ 
    public Boolean collision1(){
	return ballBounds().intersects(getBounds1());
    }
/**
 * Checks if the bowling ball hits bowling pin 2
 */     
    public Boolean collision2(){
	return ballBounds().intersects(getBounds2());
    }  
/**
 * Checks if the bowling ball hits bowling pin 3
 */     
    public Boolean collision3(){
	return ballBounds().intersects(getBounds3());
    }   
/**
 * Checks if the bowling ball hits bowling pin 4
 */     
    public Boolean collision4(){
	return ballBounds().intersects(getBounds4());
    }   
/**
 * Checks if the bowling ball hits bowling pin 5
 */     
    public Boolean collision5(){
	return ballBounds().intersects(getBounds5());
    }    
/**
 * Checks if the bowling ball hits bowling pin 6
 */     
    public Boolean collision6(){
	return ballBounds().intersects(getBounds6());
    }    
/**
 * Checks if the bowling ball hits bowling pin 7
 */     
    public Boolean collision7(){
	return ballBounds().intersects(getBounds7());
    }   
/**
 * Checks if the bowling ball hits bowling pin 8
 */     
    public Boolean collision8(){
	return ballBounds().intersects(getBounds8());
    }   
/**
 * Checks if the bowling ball hits bowling pin 9
 */     
    public Boolean collision9(){
	return ballBounds().intersects(getBounds9());
    }    
/**
 * Checks if the bowling ball hits bowling pin 10
 */     
    public Boolean collision10(){
	return ballBounds().intersects(getBounds10());
    }

/**
 * Gives function to buttons and other features on the game screen
 * @param ActionEvent e the action event that comes from the utilization of features on the game screen.
 */ 
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if (action.equals("bowl")){
	    stage = "roll";
	    animate();
	    int[][]data = countPoints(a,b);
	    scoreBoard.score(data);
	    pinSpace.setDraw1(draw1);
	    pinSpace.setDraw2(draw2);
	    pinSpace.setDraw3(draw3);	    
	    pinSpace.setDraw4(draw4);	    
	    pinSpace.setDraw5(draw5);	    
	    pinSpace.setDraw6(draw6);	   
	    pinSpace.setDraw7(draw7);	
	    pinSpace.setDraw8(draw8);	  
	    pinSpace.setDraw9(draw9);	  
	    pinSpace.setDraw10(draw10);
	    pinSpace.repaint();
	}
        paintComponent(this.getGraphics());
    }
/**
 * Override of the mouseClicked function in MouseListener class
 * @param MouseEvent e events that are triggered by actions of the mouse.
 */
    public void mouseClicked(MouseEvent e){

    }
 /**
 * Changes the coordinates of the ball if the mouse is pressed and the stage is in "aim
 * @param MouseEvent e events that are triggered by actions of the mouse.
 */
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
 /**
 * Changes the coordinates of the ball if the mouse is released and the stage is in "aim
 * @param MouseEvent e events that are triggered by actions of the mouse.
 */
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
/**
 * Override of the mouseEntered function in MouseListener class
 * @param MouseEvent e events that are triggered by actions of the mouse.
 */
    public void mouseEntered(MouseEvent e){
    }
/**
 * Override of the mouseExited function in MouseListener class
 * @param MouseEvent e events that are triggered by actions of the mouse.
 */
    public void mouseExited(MouseEvent e){
    }
/**
 * Override of the run() function in class Runnable
 */
    public void run(){

    }
}
