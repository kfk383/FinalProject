import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import java.util.*;

import javax.swing.*;
import javax.imageio.ImageIO;

public class FinalProject extends JFrame implements ActionListener{

    private JFrame frame;
    private ImagePanel background;

    private int bowlnum;

    private Random r = new Random();

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

    private int bgSet = 1;
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
    private boolean gameOn = true;

    private GameScreen gameScreen1 = new GameScreen();
    private ScoreBoard scoreBoard1 = new ScoreBoard();
    private PinSpace pinSpace1 = new PinSpace(gameScreen1);
    private ButtonScreen buttonScreen1 = new ButtonScreen();

    private JPanel gutter1 = new JPanel();
    private JPanel gutter2 = new JPanel();

    private JButton gameBackButton = new JButton("Main Menu");

/**
 * Constructor for the final project as a whole.
 * Lays out the main menu screen with buttons for game start, settings, difficulty, and instructions.
 */
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
	PlaySong.play("Fireflies.wav");
    }
/**
 * Main function that creates the GUI in which the project will be executed.
 */
    public static void main(String[] args) throws InterruptedException{
	FinalProject a = new FinalProject();
	while (a.gameOn){
	    if ((a.gameScreen1.getCommand()).equals("end all")){
		a.frame.dispose();
	    }
	}
    }

/**
 * Removes all elements of the JFrame and adds in an image as a background.
 * @param String imageName the filepath of the image that will be added as the background.
 */
    public void menuSelection(String imageName){
	frame.getContentPane().removeAll();
	frame.getContentPane().repaint();
	
	background = new ImagePanel(new ImageIcon(imageName).getImage());
	frame.getContentPane().add(background);

	frame.pack();
    }

/**
 * Sets the screen for the instructions option
 * Is called on after pressing the "instructions" button on the main menu screen
 */
    public void instructions(){
	menuSelection("instructions.jpg");
	
	instructionsBackButton.setPreferredSize(new Dimension(130, 20));
	instructionsBack.add(instructionsBackButton);
	instructionsBackButton.setActionCommand("mainmenu");
	instructionsBackButton.addActionListener(this);
	instructionsBack.setBounds(600,420,175,125);
	
	frame.add(instructionsBack);
	frame.pack();
    }

/**
 * Sets the screen for the settings option
 * Is called on after pressing the "settings" button on the main menu screen
 */
    public void settings(){
	if (bgSet == 1){
	    menuSelection("settings1.jpg");
	}else if (bgSet == 2){
	    menuSelection("settings2.jpg");
	}
	
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

/**
 * Sets the screen for the difficulty option
 * Is called on after pressing the "difficulty" button on the main menu screen
 */
    public void difficulty(){
	if (diffSet.equals("Normal")){
	    menuSelection("difficultyN.jpg");
	}else if (diffSet.equals("Hard")){
	    menuSelection("difficultyH.jpg");
	}else if (diffSet.equals("Easy")){
	    menuSelection("difficultyE.jpg");
	}
	
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

/** 
 * Overriding the function actionPerformed in abstract class ActionListener
 * Provides function for the buttons and other features in the GUI of the final project
 * @param ActionEvent e the event that is output from the activation of features in the GUI
 */ 
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	SoundEffects.play("Options.wav");

	if (action.equals("start")){
	    game();
	}
	if (action.equals("instructions")){
	    instructions();
	}
	if (action.equals("settings")){
	    settings();
	}
	if (action.equals("difficulty")){
	    difficulty();
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
	    diffSet = "Easy";
	    buttonScreen1.setSpeed(0);
	    buttonScreen1.setMass(10);
	    gameScreen1.setMass(10);
	    gameScreen1.setSpeed(0);
	}else if (difficultyNormal.isSelected()){
	    diffSet = "Normal";	    
	    buttonScreen1.setSpeed(10);
	    buttonScreen1.setMass(30);
	    gameScreen1.setMass(30);
	    gameScreen1.setSpeed(10);
	}else if (difficultyHard.isSelected()){
	    diffSet = "Hard";
	    buttonScreen1.setSpeed(20);
	    buttonScreen1.setMass(50);
	    gameScreen1.setMass(50);
	    gameScreen1.setSpeed(20);
	}
	if (settingsBG1.isSelected()){
	    bgSet = 1;
	    gameScreen1.setBackground(new Color(255,215,0));
	    pinSpace1.setBackground(new Color(255,140,0));
	}else if (settingsBG2.isSelected()){
	    bgSet = 2;
	    gameScreen1.setBackground(new Color(135,206,235));
	    pinSpace1.setBackground(new Color(0,191,255));
	}
	
    } 

/**
 * Sets up the GUI for the game
 * Adds individual JPanels that cut up the screen into four separate parts for the game's execution
 * Factors in the settings to initialize the four subpanels of the screen.
 */
    public void game(){
	frame.getContentPane().removeAll();
	frame.getContentPane().repaint();

	gutter1.setBackground(new Color(0,100,0));
	gutter1.setBounds(0,0,75,495);

	gutter2.setBackground(new Color(0,100,0));
	gutter2.setBounds(325,0,75,495);

	gameBackButton.setPreferredSize(new Dimension(130, 20));
	gameBackButton.setActionCommand("mainmenu");
	gameBackButton.addActionListener(this);
	
	buttonScreen1.add(gameBackButton);

	if (diffSet.equals("Easy")){
	    gameScreen1.setSpeed(10);
	    gameScreen1.setMass(10);
	    gameScreen1.setTilt(0);
	    gameScreen1.setHandicap(8);
	    buttonScreen1.setSpeed(0);
	    buttonScreen1.setMass(10);
	    buttonScreen1.setDirection("Center");
	}else if (diffSet.equals("Normal")){
	    int num = r.nextInt(15) + 5;
	    int num1 = r.nextInt(5) - 2;
	    gameScreen1.setSpeed(num);
	    gameScreen1.setMass(15);
	    buttonScreen1.setSpeed(num);
	    buttonScreen1.setMass(15);
	    String direction = "";
	    if (num1 < 0){
		direction = "Right";
	    }else if (num1 > 0){
		direction = "Left";
	    }else direction = "Center";
	    buttonScreen1.setDirection(direction);
	    gameScreen1.setHandicap(4);
	}else if (diffSet.equals("Hard")){
	    int num = r.nextInt(20) + 5;
	    int num1 = r.nextInt(9) - 4;
	    gameScreen1.setSpeed(num);
	    gameScreen1.setMass(20);
	    buttonScreen1.setSpeed(num);
	    buttonScreen1.setMass(20);
	    String direction = "";
	    if (num1 < 0){
		direction = "Right";
	    }else if (num1 > 0){
		direction = "Left";
	    }else direction = "Center";
	    buttonScreen1.setDirection(direction);
	    gameScreen1.setHandicap(0);
	}

	gameScreen1.addButtons(buttonScreen1);
	gameScreen1.addScore(scoreBoard1);
	gameScreen1.addPins(pinSpace1);

	frame.add(gameScreen1);
	frame.add(scoreBoard1);
	frame.add(pinSpace1);
	frame.add(buttonScreen1);
	frame.add(gutter1);
	frame.add(gutter2);

	frame.setVisible(true);
    }
}
