import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;

public class FinalProject extends JFrame implements ActionListener{

    private JFrame frame;
    private ImagePanel background;

    private int bowlnum;
    private int[][]scores = new int[10][2];

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

    //Instructions Features
    private JPanel instructionsBack = new JPanel();

    private JButton instructionsBackButton = new JButton("Main Menu");

    //Settings Features */
    private JPanel settingsMenu = new JPanel();
    private JPanel settingsBack = new JPanel();

    private ButtonGroup settingsOptions = new ButtonGroup();
    private JRadioButton settingsBG1 = new JRadioButton("Background 1");
    private JRadioButton settingsBG2 = new JRadioButton("Background 2");

    private String bgSet = "";
    private JButton settingsBackButton = new JButton("Main Menu");

    //Difficulty Features */
    private String diffSet = "Normal";
    private JPanel difficultyMenu = new JPanel();
    private JPanel difficultyBack = new JPanel();

    private ButtonGroup difficultyOptions = new ButtonGroup();
    private JRadioButton difficultyEasy = new JRadioButton("Easy    ");
    private JRadioButton difficultyNormal = new JRadioButton("Normal");
    private JRadioButton difficultyHard = new JRadioButton("Hard    ");

    private JButton difficultyBackButton = new JButton("Main Menu");

    //Starting the Game! */
    private gameScreen gameScreen1 = new gameScreen();
    private scoreBoard scoreBoard1 = new scoreBoard();
    private mouseSpace mouseSpace1 = new mouseSpace();
    private buttonScreen buttonScreen1 = new buttonScreen();

    private JButton gameBackButton = new JButton("Main Menu");

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
	frame.setLocation(0,0);
	frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	settingsBG1.setSelected(true);
	difficultyNormal.setSelected(true);
    }

    public static void main(String[] args) throws InterruptedException{
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
	    game();
	}
	if (action.equals("instructions")){
	    menuSelection("instructions.jpg");

	    instructionsBackButton.setPreferredSize(new Dimension(130, 20));
	    instructionsBack.add(instructionsBackButton);
	    instructionsBackButton.setActionCommand("mainmenu");
	    instructionsBackButton.addActionListener(this);
	    instructionsBack.setBounds(600,420,175,125);

	    frame.add(instructionsBack);
	    frame.pack();
	}
	if (action.equals("settings")){
	    menuSelection("settings.jpg");

	    settingsOptions.add(settingsBG1);
	    settingsOptions.add(settingsBG2);
	    settingsMenu.add(settingsBG1);
	    settingsMenu.add(settingsBG2);
	    settingsMenu.setBounds(300,200,200,200);

	    settingsBackButton.setPreferredSize(new Dimension(130,20));
	    settingsBack.add(settingsBackButton);
	    settingsBackButton.setActionCommand("mainmenu");
	    settingsBackButton.addActionListener(this);
	    settingsBack.setBounds(328,350,150,100);

       	    frame.add(settingsMenu);
	    frame.add(settingsBack);
	    frame.pack();
	}
	if (action.equals("difficulty")){
	    menuSelection("difficulty.jpg");

	    difficultyOptions.add(difficultyEasy);
	    difficultyOptions.add(difficultyNormal);
	    difficultyOptions.add(difficultyHard);
	    difficultyMenu.add(difficultyEasy);
	    difficultyMenu.add(difficultyNormal);
	    difficultyMenu.add(difficultyHard);
	    difficultyMenu.setBounds(340,180,100,200);

	    difficultyBackButton.setPreferredSize(new Dimension(130,20));
	    difficultyBackButton.setActionCommand("mainmenu");
	    difficultyBackButton.addActionListener(this);
	    difficultyBack.add(difficultyBackButton);
	    difficultyBack.setBounds(315,350,150,100);

	    frame.add(difficultyMenu);
	    frame.add(difficultyBack);
	    frame.pack();
	}
	if (action.equals("mainmenu")){
	    menuSelection("mainmenu.jpg");
	    frame.add(start);
	    frame.add(difficulty);
	    frame.add(settings);
	    frame.add(instructions);
	    frame.pack();
	}
	if (difficultyEasy.isSelected()){
	    diffSet = "easy";
	}else if (difficultyNormal.isSelected()){
	    diffSet = "normal";
	}else if (difficultyHard.isSelected()){
	    diffSet = "hard";
	}
	if (settingsBG1.isSelected()){
	    bgSet = "1";
	}else if (settingsBG2.isSelected()){
	    bgSet = "2";
	}
	
    } 

    public void game(){
	frame.getContentPane().removeAll();
	frame.getContentPane().repaint();

	gameBackButton.setPreferredSize(new Dimension(130, 20));
	gameBackButton.setActionCommand("mainmenu");
	gameBackButton.addActionListener(this);
	
	buttonScreen1.add(gameBackButton);

	frame.add(gameScreen1);
	frame.add(scoreBoard1);
	frame.add(mouseSpace1);
	frame.add(buttonScreen1);

	frame.setVisible(true);
			 
	bowlnum = 1;
	scores = new int[10][2];
	while (bowlnum <= 10){
	    if (diffSet.equals("easy")){	
		score(bowlnum);
	    }else if (diffSet.equals("normal")){;
		score(bowlnum);
	    }else if (diffSet.equals("hard")){
		score(bowlnum);
	    }
	    bowlnum+=1;
	}
    }

    public void score(int bowl){	
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
	    //  ("Mouse Entered: (" + e.getX() + ", " + e.getY() + ")");
	}
	public void mouseExited(MouseEvent e){
	}
    }
}
