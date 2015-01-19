import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class gameScreen extends JPanel implements ActionListener{

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
	setBounds(50,0,300,495);
	ballX = 130;
	ballY = 400;
    }

    public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.setColor(Color.BLUE);
	g.drawOval(ballX,ballY,40,40);
	g.fillOval(ballX,ballY,40,40);
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
}
