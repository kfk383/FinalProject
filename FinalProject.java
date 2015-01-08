import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class FinalProject{
    /**
     *Main function to set up GUI and allow the user to interact with the program
     */
    public static void main(String[] args){
	JFrame frame;
	ImagePanel background;
	
	frame = new JFrame();
	background = new ImagePanel(new ImageIcon("mainmenu.jpg").getImage());

	frame.getContentPane().add(background);
	frame.pack();
	frame.setVisible(true);
    }
}

class ImagePanel extends JPanel implements ActionListener{
    
    private Image img;

    /**
     *Converts the image into an icon that can be added into the GUI container.
     *@param img the file path of the image that will be converted into an icon.
     */    
    public ImagePanel(String img){
	this(new ImageIcon(img).getImage());
    }

    /**
     *Takes the dimensions of an image and constructs a container with those dimensions.
     *@param img the image whose dimensions will be used to set the size of the container.
     */
    public ImagePanel(Image img){
	this.img = img;
	Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
	setPreferredSize(size);
	setMinimumSize(size);
	setMaximumSize(size);
	setSize(size);
	setLayout(null);
    }

    /**
     *Override of the built in paintComponent. This is where the painting code that acts on the container is used.
     *@param g location in the container in which the image is intended to be drawn.
     */
    public void paintComponent(Graphics g){
	g.drawImage(img, 0, 0, null);
    }

    /**
     *Takes actions that have been performed in the GUI and translates it to call on the code for the game.
     *@param e the commands that are coming in from the GUI.
     */
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
    }

    class CustomMouseListener implements MouseListener{
	public void mouseClicked(MouseEvent e){
	    
	}
	public void mousePressed(MouseEvent e){
	    int x = getX();
	    int y = getY();
	}
	public void mouseReleased(MouseEvent e){
	}
	public void mouseEntered(MouseEvent e){
	    int x = getX();
	    int y = getY();
	}
	public void mouseExited(MouseEvent e){
	}
    }
}
	
	
