import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class FinalProject extends JFrame implements ActionListener{
    private Container pane;
    private JLabel title;

    public StartWindow(){
	this.setTitle("Lucky Strike");
	this.setSize(500,1000);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

<<<<<<< HEAD
    public void JPanelWithBackground(String fileName) throws IOException{
	File f = new File(fileName);
	backgroundImage = ImageIO.read(f);
=======
	title = new ImageIcon("mainmenu.jpg");
	pane.add(title);
>>>>>>> c6bbf39cdf90b41f77ccc159fb3f19a9ff4d57da
    }
    
    public void actionPerformed(ActionEvent e){
<<<<<<< HEAD
	String action = e.getActionCommand();
    }

    public void paint(Graphics g) {
	g.drawImage(backgroundImage, 0, 0, this);
    }

    public static void main(String[]args){
	try{
	    FinalProject a = new FinalProject();
	    Graphics g = a.getGraphics();
	    a.JPanelWithBackground("mainmenu.jpg");
	    a.paint(g);
	    a.setVisible(true);
	}
	catch (IOException e){
	    e.printStackTrace();
	}
=======
    }
 
    public static void main(String[] args){
	FinalProject a = new FinalProject();
	a.setVisible(true);
>>>>>>> c6bbf39cdf90b41f77ccc159fb3f19a9ff4d57da
    }
}

    
