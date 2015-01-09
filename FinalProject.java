import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class FinalProject extends JFrame implements ActionListener{

    JFrame frame;
    ImagePanel background;

    private JButton start;
    private JButton instructions;
    private JButton settings;
    private JButton difficulty;

    private boolean titlescreen;
 
    public FinalProject(){
	frame = new JFrame();
	background = new ImagePanel(new ImageIcon("mainmenu.jpg").getImage());
	
	frame.getContentPane().add(background);
	frame.pack();
	
	start = new JButton("Start");
	instructions = new JButton("Instructions");
	settings = new JButton("Settings");
	difficulty = new JButton("Difficulty");

	titlescreen = true;
	
	frame.add(start);
	frame.add(instructions);
	frame.add(settings);
	frame.add(difficulty);
    }

    public static void main(String[] args){	
	FinalProject a = new FinalProject();
	a.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if (titlescreen){
	    if(action.contains("Mouse Entered: ")){
		System.out.println(action);
	    }else if (action.contains("Mouse Clicked: ")){
		System.out.println(action);
	    }   
	}
    } 

    class CustomMouseListener implements MouseListener{
	public void mouseClicked(MouseEvent e){
	    //  statusLabel.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")"); */
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
	    //  ("Mouse Entered: (" + e.getX() + ", " + e.getY() + ")"); */
	}
	public void mouseExited(MouseEvent e){
	}
    }

}

class ImagePanel extends JPanel{
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