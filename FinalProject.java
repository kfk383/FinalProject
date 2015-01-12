import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class FinalProject extends JFrame implements ActionListener{

    private JFrame frame;
    private ImagePanel background;

    //Main Menu Options */
    private JPanel start = new JPanel();
    private JPanel instructions = new JPanel();
    private JPanel settings = new JPanel();
    private JPanel difficulty = new JPanel();
    private JPanel headerS = new JPanel();

    private JButton start1;
    private JButton instructions1;
    private JButton settings1;
    private JButton difficulty1;
    private JLabel header;

    //Settings Options */
    private JPanel settingsMenu = new JPanel();
    private JPanel settingsBack = new JPanel();

    private ButtonGroup settingsOptions = new ButtonGroup();
    private JRadioButton settingsBG1;
    private JRadioButton settingsBG2;

    private JButton settingsBackButton;

    //Difficulty Options */
    private JPanel difficultyMenu = new JPanel();
    private JPanel difficultyBack = new JPanel();

    private ButtonGroup difficultyOptions = new ButtonGroup();
    private JRadioButton difficultyEasy;
    private JRadioButton difficultyNormal;
    private JRadioButton difficultyHard;

    private JButton difficultyBackButton;

    public FinalProject(){
	frame = new JFrame();
	background = new ImagePanel(new ImageIcon("mainmenu.jpg").getImage());
	
	frame.setLayout(null);
	frame.setPreferredSize(new Dimension(background.getWidth(), background.getHeight()));
       	frame.getContentPane().add(background);
	frame.pack();
	
	start1 = new JButton("Start");
	start1.setPreferredSize(new Dimension(150,50));
	start1.setActionCommand("start");
	start1.addActionListener(this);
	start.setBounds(60,300,150,100);
	start.add(start1);

	instructions1 = new JButton("Instructions");
	instructions1.setPreferredSize(new Dimension(150,50));
	instructions1.setActionCommand("instructions");
	instructions1.addActionListener(this);
	instructions.setBounds(540,300,150,100);
	instructions.add(instructions1);

	settings1 = new JButton("Settings");
	settings1.setPreferredSize(new Dimension(150,50));
	settings1.setActionCommand("settings");
	settings1.addActionListener(this);
	settings.setBounds(450,375,150,100);
	settings.add(settings1);
	
	difficulty1 = new JButton("Difficulty");
	difficulty1.setPreferredSize(new Dimension(150,50));
	difficulty1.setActionCommand("difficulty");
	difficulty1.addActionListener(this);
	difficulty.setBounds(150,375,150,100);
        difficulty.add(difficulty1);

	frame.add(start);
	frame.add(instructions);
	frame.add(settings);
	frame.add(difficulty);

	frame.setResizable(false);
	frame.setVisible(true);
	frame.setLocation(100, 100);
	frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
	FinalProject a = new FinalProject();
    }

    public void menuSelection(String imageName){
	frame.getContentPane().removeAll();
	frame.getContentPane().repaint();
	
	background = new ImagePanel(new ImageIcon(imageName).getImage());
	frame.getContentPane().add(background);

	frame.pack();
    }

    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();

	if (action.equals("start")){
	    frame.getContentPane().removeAll();
	    frame.getContentPane().repaint();

	    frame.getContentPane().setBackground(new Color(255, 051, 051));
	    //ADD IN GAME COMPONENTS HERE
	    frame.pack();
	}else if (action.equals("instructions")){
	    menuSelection("instructions.jpg");

	    frame.pack();
	}else if (action.equals("settings")){
	    menuSelection("settings.jpg");

	    settingsBG1 = new JRadioButton("Background 1");
	    settingsBG2 = new JRadioButton("Background 2");

	    settingsOptions.add(settingsBG1);
	    settingsOptions.add(settingsBG2);
	    settingsMenu.add(settingsBG1);
	    settingsMenu.add(settingsBG2);
	    settingsMenu.setBounds(300,200,200,200);

	    settingsBackButton = new JButton("Main Menu");
	    settingsBackButton.setPreferredSize(new Dimension(100,20));
	    settingsBack.add(settingsBackButton);
	    settingsBack.setBounds(328,350,150,100);

       	    frame.add(settingsMenu);
	    frame.add(settingsBack);
	    frame.pack();
	}else if (action.equals("difficulty")){
	    menuSelection("difficulty.jpg");

	    difficultyEasy = new JRadioButton("Easy    ");
	    difficultyNormal = new JRadioButton("Normal");
	    difficultyHard = new JRadioButton("Hard    ");

	    difficultyOptions.add(difficultyEasy);
	    difficultyOptions.add(difficultyNormal);
	    difficultyOptions.add(difficultyHard);
	    difficultyMenu.add(difficultyEasy);
	    difficultyMenu.add(difficultyNormal);
	    difficultyMenu.add(difficultyHard);
	    difficultyMenu.setBounds(340,180,100,200);

	    difficultyBackButton = new JButton("Main Menu");
	    difficultyBackButton.setPreferredSize(new Dimension(100,20));
	    difficultyBack.add(difficultyBackButton);
	    difficultyBack.setBounds(315,350,150,100);

	    frame.add(difficultyMenu);
	    frame.add(difficultyBack);
	    frame.pack();
	}
    } 
    class CustomMouseListener implements MouseListener{
	public void mouseClicked(MouseEvent e){
	    //  statusLabel.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
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
	    //  ("Mouse Entered: (" + e.getX() + ", " + e.getY() + ")");
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
