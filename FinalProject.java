import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class StartWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel title;

    public StartWindow(){
	this.setTitle("Lucky Strike");
	this.setSize(500,1000);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	title = new ImageIcon("Name.png");
	pane.add(title);
    }
    
    public void actionPerformed(ActionEvent e){
    }
 
    public static void main(String[] args){
	StartWindow a = new StartWindow();
	a.setVisible(true);
    }
}

    
