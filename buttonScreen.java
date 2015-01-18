import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;


public class buttonScreen extends JPanel{
    private int tiltSpeed = 10;
    private String tiltDirection = "Middle";
    private int mass = 30;

    private JPanel tiltP = new JPanel();
    private JLabel tilt = new JLabel("");

    private JPanel tiltDP = new JPanel();
    private JLabel tiltD = new JLabel("");

    private JPanel massWP = new JPanel();
    private JLabel massW = new JLabel("");

    public buttonScreen(){
	setBackground(new Color(255,204,153));
	setBounds(400,400,386,95);

	tilt.setHorizontalAlignment(SwingConstants.CENTER);
	tilt.setText("Tilt: " + tiltSpeed + " to The " + tiltDirection);
	tiltP.add(tilt);

	tiltD.setHorizontalAlignment(SwingConstants.CENTER);
	if (tiltDirection.equals("Right")){
	    tiltD.setText("  Tilt To Right  ");
	}else if (tiltDirection.equals("Left")){
	    tiltD.setText("  Tilt To Left  ");
	}else if (tiltDirection.equals("Center")){
	    tiltD.setText("    No Tilt     ");
	}
	tiltDP.add(tiltD);

	massW.setHorizontalAlignment(SwingConstants.CENTER);
	massW.setText("Mass: " + mass + "kg");
	massWP.add(massW);

	add(tiltP);
	add(tiltDP);
	add(massWP);
    }

    public void setSpeed(int s){
	tiltSpeed = s;
	tilt.setText("Tilt: " + tiltSpeed + " to The " + tiltDirection);
	revalidate();
    }
    public int getSpeed(){
	return tiltSpeed;
    }

    public void setDirection(String d){
	tiltDirection = d;
	if (tiltDirection.equals("Right")){
	    tiltD.setText("  Tilt To Right  ");
	}else if (tiltDirection.equals("Left")){
	    tiltD.setText("  Tilt To Left  ");
	}else if (tiltDirection.equals("Middle")){
	    tiltD.setText("    No Tilt     ");
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
