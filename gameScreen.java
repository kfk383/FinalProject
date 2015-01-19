import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class gameScreen extends JPanel implements MouseListener,ActionListener{

    private boolean enter = true;

    private int speed;
    private int mass;
    
    private int ballDx;
    private int ballDy;
    
    private int ballX = 130;
    private int ballY = 400;
    
    private String stage = "aim";
    
    private Timer clock = new Timer(1000, this);

    public gameScreen(){
	setBackground(new Color(255,244,77));
<<<<<<< HEAD
<<<<<<< HEAD
	setBounds(75,0,250,495);
	addMouseListener(this);
	enter = true;
=======
	setBounds(50,0,300,495);
>>>>>>> bee4767c24dcfb4b2bdb9f4923444868759f3cf7
=======
	setBounds(75,0,250,495);
	addMouseListener(this);
	enter = true;
>>>>>>> ee021e3f1f8308227d2297b7374285561c4786f6
	ballX = 130;
	ballY = 425;
    }

    public void paintComponent(Graphics g){
	super.paintComponent(g);
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ee021e3f1f8308227d2297b7374285561c4786f6
	g.setColor(Color.BLACK);
	if (enter == true){
	    ballX = 115;
	    ballY = 425;
	    g.drawOval(40,10,10,10);
	    g.drawOval(95,10,10,10);
	    g.drawOval(150,10,10,10);
	    g.drawOval(205,10,10,10);
	    g.drawOval(68,40,10,10);
	    g.drawOval(123,40,10,10);
	    g.drawOval(178,40,10,10);
	    g.drawOval(95,70,10,10);
	    g.drawOval(150,70,10,10);
	    g.drawOval(123,100,10,10);

	    g.setColor(Color.RED);
	    g.fillOval(40,10,10,10);
	    g.fillOval(95,10,10,10);
	    g.fillOval(150,10,10,10);
	    g.fillOval(205,10,10,10);
	    g.fillOval(68,40,10,10);
	    g.fillOval(123,40,10,10);
	    g.fillOval(178,40,10,10);
	    g.fillOval(95,70,10,10);
	    g.fillOval(150,70,10,10);
	    g.fillOval(123,100,10,10);

	    g.setColor(Color.BLUE);
	    g.drawOval(ballX,ballY,30,30);
	    g.fillOval(ballX,ballY,30,30);
	    enter = false;
	}else{
	    g.drawOval(40,10,10,10);
	    g.drawOval(95,10,10,10);
	    g.drawOval(150,10,10,10);
	    g.drawOval(205,10,10,10);
	    g.drawOval(68,40,10,10);
	    g.drawOval(123,40,10,10);
	    g.drawOval(178,40,10,10);
	    g.drawOval(95,70,10,10);
	    g.drawOval(150,70,10,10);
	    g.drawOval(123,100,10,10);

	    g.setColor(Color.RED);
	    g.fillOval(40,10,10,10);
	    g.fillOval(95,10,10,10);
	    g.fillOval(150,10,10,10);
	    g.fillOval(205,10,10,10);
	    g.fillOval(68,40,10,10);
	    g.fillOval(123,40,10,10);
	    g.fillOval(178,40,10,10);
	    g.fillOval(95,70,10,10);
	    g.fillOval(150,70,10,10);
	    g.fillOval(123,100,10,10);
	    
	    g.setColor(Color.BLUE);
	    g.drawOval(ballX,ballY,30,30);
	    g.fillOval(ballX,ballY,30,30);
	}
<<<<<<< HEAD
=======
	g.setColor(Color.BLUE);
	g.drawOval(ballX,ballY,40,40);
	g.fillOval(ballX,ballY,40,40);
>>>>>>> bee4767c24dcfb4b2bdb9f4923444868759f3cf7
=======
>>>>>>> ee021e3f1f8308227d2297b7374285561c4786f6
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
