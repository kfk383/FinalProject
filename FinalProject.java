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
	
	frame.setLayout(new FlowLayout());
       	frame.getContentPane().add(background);
	frame.pack();
	
	start = new JButton("Start");
	start.setBounds(100,200,200,100);
	start.setLocation(300,500);
	instructions = new JButton("Instructions");
	instructions.setBounds(10,20,20,10);
	instructions.setLocation(400,500);
	settings = new JButton("Settings");
	settings.setBounds(10,20,20,10);
	settings.setLocation(300,400);
	difficulty = new JButton("Difficulty");
	difficulty.setBounds(10,20,20,10);
	difficulty.setLocation(400,500);

	titlescreen = true;
	
	frame.add(start);
	frame.add(instructions);
	frame.add(settings);
	frame.add(difficulty);

	frame.setResizable(true);
	frame.setVisible(true);
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

    public ImagePanel(String img){
	this(new ImageIcon(img).getImage());
    }

    public ImagePanel(Image img){
	this.img = img;
	Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
	setPreferredSize(size);
	setMinimumSize(size);
	setMaximumSize(size);
	setSize(size);
	setLayout(null);
    }

    public void paintComponent(Graphics g){
	g.drawImage(img, 0, 0, null);
    }


}
