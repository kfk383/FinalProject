import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class FinalProject{
    
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

    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
    }

    class CustomMouseListener implements MouseListener{
	public void mouseClicked(MouseEvent e){
	}
	public void mousePressed(MouseEvent e){
	}
	public void mouseReleased(MouseEvent e){
	}
	public void mouseEntered(MouseEvent e){
	}
	public void mouseExited(MouseEvent e){
	}
    }
}
	
	
