import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;


public class buttonScreen extends JPanel{
    private int windSpeed = 10;
    private String windDirection = "Center";
    private int mass = 30;

    JPanel windP = new JPanel();
    JTextField wind = new JTextField(8);

    JPanel windDP = new JPanel();
    JTextField windD = new JTextField(10);

    JPanel massWP = new JPanel();
    JTextField massW = new JTextField(8);

    public buttonScreen(){
	setBackground(new Color(255,204,153));
	setBounds(400,400,386,95);

	wind.setHorizontalAlignment(SwingConstants.CENTER);
	wind.setText("Speed: " + windSpeed + "mph");
	windP.add(wind);

	windD.setHorizontalAlignment(SwingConstants.CENTER);
	if (windDirection.equals("Right")){
	    windD.setText("Direction: To Right");
	}else if (windDirection.equals("Left")){
	    windD.setText("Direction: To Left");
	}else if (windDirection.equals("Center")){
	    windD.setText("Direction: No Wind");
	}
	windDP.add(windD);

	massW.setHorizontalAlignment(SwingConstants.CENTER);
	massW.setText("Mass: " + mass + "kg");
	massWP.add(massW);

	add(windP);
	add(windDP);
	add(massWP);
    }

    public void setSpeed(int s){
	windSpeed = s;
	wind.setText("Speed: " + windSpeed + "mph");
	revalidate();
    }
    public int getSpeed(){
	return windSpeed;
    }

    public void setDirection(String d){
	windDirection = d;
	if (windDirection.equals("Right")){
	    windD.setText("Direction: To Right");
	}else if (windDirection.equals("Left")){
	    windD.setText("Direction: To Left");
	}else if (windDirection.equals("Center")){
	    windD.setText("Direction: No Wind");
	}
	revalidate();
    }
    public String getDirection(){
	return windDirection;
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