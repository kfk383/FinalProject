import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;


public class buttonScreen extends JPanel{
    private int tiltSpeed = 10; 
    private String tiltDirection = "Center";
    private int mass = 30;

    private JPanel tiltP = new JPanel();
    private JTextField tilt = new JTextField(8);

    private JPanel tiltDP = new JPanel();
    private JTextField tiltD = new JTextField(10);

    private JPanel massWP = new JPanel();
    private JTextField massW = new JTextField(8);

    public buttonScreen(){
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
	massW.setText("Mass: " + mass + "kg");
	massW.setEditable(false);
	massWP.add(massW);

	add(tiltP);
	add(tiltDP);
	add(massWP);
    }

    public void setSpeed(int s){
	tiltSpeed = s;
	tilt.setText("Speed: " + tiltSpeed + "mph");
	revalidate();
    }
    public int getSpeed(){
	return tiltSpeed;
    }

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
    public String getDirection(){
	return tiltDirection;
    }

    public void setMass(int m){
	mass = m;
	massW.setText("Mass: " + mass + "kg");
	revalidate();
    }
    public int getMass(){
	return mass;
    }
}
