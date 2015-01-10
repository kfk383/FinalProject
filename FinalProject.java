import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class FinalProject extends JFrame implements ActionListener{

    private JFrame frame;
    private ImagePanel background;

    private JPanel start = new JPanel();
    private JPanel instructions = new JPanel();
    private JPanel settings = new JPanel();
    private JPanel difficulty = new JPanel();

    private JButton start1;
    private JButton instructions1;
    private JButton settings1;
    private JButton difficulty1;

    private boolean titlescreen;
 
    public FinalProject(){
	frame = new JFrame();
	background = new ImagePanel(new ImageIcon("mainmenu.jpg").getImage());
	
	frame.setLayout(null);
	frame.setPreferredSize(new Dimension(background.getWidth(), background.getHeight()));
       	frame.getContentPane().add(background);
	frame.pack();
	
	start1 = new JButton("Start");
	start1.setPreferredSize(new Dimension(150,50));
	start.setBounds(60,300,150,100);
	start.add(start1);

	instructions1 = new JButton("Instructions");
	instructions1.setPreferredSize(new Dimension(150,50));
	instructions.setBounds(540,300,150,100);
	instructions.add(instructions1);

	settings1 = new JButton("Settings");
	settings1.setPreferredSize(new Dimension(150,50));
	settings.setBounds(450,375,150,100);
	settings.add(settings1);
	
	difficulty1 = new JButton("Difficulty");
	difficulty1.setPreferredSize(new Dimension(150,50));
	difficulty.setBounds(150,375,150,100);
	difficulty.add(difficulty1);

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
