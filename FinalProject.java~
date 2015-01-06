import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.BufferedImage.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.lang.Object;
import javax.imageio.ImageIO;
import java.io.IOException;

public class FinalProject extends JFrame implements ActionListener{
    private Container pane;
    private JButton b,clear;
    private JLabel l;
    private JTextField text;
    private Container buttons;
    private Container textyStuff;
    private Image backgroundImage;

    public FinalProject() throws IOException{
	this.setTitle("2D Bowling -- Fall 2014 APCS Final Project");
	this.setSize(1000,1000);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.JPanelWithBackground(".//mainmenu.jpg");
    }

    public void JPanelWithBackground(String fileName) throws IOException{
	File mainmenu = new File(fileName);
	backgroundImage = ImageIO.read(mainmenu);
    }

    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
    }

    public void paintComponent(Graphics g) {
	paintComponent(g);
	g.drawImage(backgroundImage, 0, 0, this);
    }

    public static void main(String[]args){
	try{
	    FinalProject a = new FinalProject();
	    a.setVisible(true);
	}
	catch (IOException e){
	    System.out.println("error");
	}
    }



}

