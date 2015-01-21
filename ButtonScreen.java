import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class ButtonScreen extends JPanel{
    private int tiltSpeed = 10; 
    private String tiltDirection = "Center";
    private int mass = 30;

    private JPanel tiltP = new JPanel();
    private JTextField tilt = new JTextField(8);

    private JPanel tiltDP = new JPanel();
    private JTextField tiltD = new JTextField(10);

    private JPanel massWP = new JPanel();
    private JTextField massW = new JTextField(8);

/**
 * Constructor for the buttonScreen (bottom left corner of the game screen)
 */
    public ButtonScreen(){
	setBackground(new Color(255,204,153));
	setBounds(400,400,386,95);

	tilt.setHorizontalAlignment(SwingConstants.CENTER);
	tilt.setText("Speed: " + tiltSpeed + "mph");
	tilt.setEditable(false);
	tiltP.add(tilt);

	tiltD.setHorizontalAlignment(SwingConstants.CENTER);
	if (tiltDirection.equals("Right")){
	    tiltD.setText("Direction: To Right");
	}else if (tiltDirection.equals("Left")){
	    tiltD.setText("Direction: To Left");
	}else if (tiltDirection.equals("Center")){
	    tiltD.setText("Direction: No Tilt");
	}
	tiltD.setEditable(false);
	tiltDP.add(tiltD);

	massW.setHorizontalAlignment(SwingConstants.CENTER);
	massW.setText("Mass: " + mass + "lb");
	massW.setEditable(false);
	massWP.add(massW);

	add(tiltP);
	add(tiltDP);
	add(massWP);
    }

/**
 * Set method for the speed of the ball
 * @param int s the desired speed of the ball
 */ 
    public void setSpeed(int s){
	tiltSpeed = s;
	tilt.setText("Speed: " + tiltSpeed + "mph");
	revalidate();
    }
/**
 * Get method for the speed of the bowling ball
 */
    public int getSpeed(){
	return tiltSpeed;
    }

/**
 * Set method for the direction of the ball's tilt
 * @param String d the desired direction of tilt
 */
    public void setDirection(String d){
	tiltDirection = d;
	if (tiltDirection.equals("Right")){
	    tiltD.setText("Direction: To Right");
	}else if (tiltDirection.equals("Left")){
	    tiltD.setText("Direction: To Left");
	}else if (tiltDirection.equals("Center")){
	    tiltD.setText("Direction: No Tilt");
	}
	revalidate();
    }
/**
 * Get method for the direction of the ball's tilt
 */
    public String getDirection(){
	return tiltDirection;
    }

/**
 * Set method for the mass of the bowling ball
 * @param int m the desired mass of the bowling ball
 */
    public void setMass(int m){
	mass = m;
	massW.setText("Mass: " + mass + "lb");
	revalidate();
    }
    
/**
 * Get method for the mass of the bowling ball
 */
    public int getMass(){
	return mass;
    }
}
