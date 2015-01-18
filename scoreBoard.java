import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;


public class scoreBoard extends JPanel{

    private String[][] scores;

    private Box top0 = Box.createHorizontalBox();
    private Box top1 = Box.createHorizontalBox();
    private Box top2 = Box.createHorizontalBox();
    private Box top3 = Box.createHorizontalBox();
	
    private Box round1 = Box.createVerticalBox();
    private Box round2 = Box.createVerticalBox();
    private Box round3 = Box.createVerticalBox();
    private Box round4 = Box.createVerticalBox();
    private Box round5 = Box.createVerticalBox();
    private Box round6 = Box.createVerticalBox();
    private Box round7 = Box.createVerticalBox();
    private Box round8 = Box.createVerticalBox();
    private Box round9 = Box.createVerticalBox();
    private Box round10 = Box.createVerticalBox();
    private Box total = Box.createVerticalBox();


    private JLabel name1 = new JLabel("    Round 1    ");
    private JLabel display1 = new JLabel("    0    ");

    private JLabel name2 = new JLabel("    Round 2    ");
    private JLabel display2 = new JLabel("    0    ");

    private JLabel name3 = new JLabel("    Round 3    ");
    private JLabel display3 = new JLabel("    0    ");

    private JLabel name4 = new JLabel("    Round 4    ");
    private JLabel display4 = new JLabel("    0    ");

    private JLabel name5 = new JLabel("    Round 5    ");
    private JLabel display5 = new JLabel("    0    ");
    
    private JLabel name6 = new JLabel("     Round 6    ");
    private JLabel display6 = new JLabel("     0    ");
    
    private JLabel name7 = new JLabel("    Round 7    ");
    private JLabel display7 = new JLabel("    0    ");
    
    private JLabel name8 = new JLabel("    Round 8    ");
    private JLabel display8 = new JLabel("    0    ");
    
    private JLabel name9 = new JLabel("    Round 9    ");
    private JLabel display9 = new JLabel("    0    ");
    
    private JLabel name10 = new JLabel("    Round 10    ");
    private JLabel display10 = new JLabel("    0    ");

    private JLabel nameT = new JLabel("    Total    ");
    private JLabel displayT = new JLabel("    0    ");

    public scoreBoard(){
	setBackground(new Color(0,77,204));
	setBounds(400,0,386,150);

	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	
	name1.setHorizontalAlignment(SwingConstants.CENTER);
	round1.add(name1);

	display1.setHorizontalAlignment(SwingConstants.CENTER);
	round1.add(display1);

	name2.setHorizontalAlignment(SwingConstants.CENTER);
	round2.add(name2);

	display2.setHorizontalAlignment(SwingConstants.CENTER);
	round2.add(display2);

	name3.setHorizontalAlignment(SwingConstants.CENTER);
	round3.add(name3);

	display3.setHorizontalAlignment(SwingConstants.CENTER);
	round3.add(display3);

	name4.setHorizontalAlignment(SwingConstants.CENTER);
	round4.add(name4);

	display4.setHorizontalAlignment(SwingConstants.CENTER);
	round4.add(display4);

	name5.setHorizontalAlignment(SwingConstants.CENTER);
	round5.add(name5);

	display5.setHorizontalAlignment(SwingConstants.CENTER);
	round5.add(display5);

	name6.setHorizontalAlignment(SwingConstants.CENTER);
	round6.add(name6);

	display6.setHorizontalAlignment(SwingConstants.CENTER);
	round6.add(display6);

	name7.setHorizontalAlignment(SwingConstants.CENTER);
	round7.add(name7);

	display7.setHorizontalAlignment(SwingConstants.CENTER);
	round7.add(display7);

	name8.setHorizontalAlignment(SwingConstants.CENTER);
	round8.add(name8);

	display8.setHorizontalAlignment(SwingConstants.CENTER);
	round8.add(display8);

	name9.setHorizontalAlignment(SwingConstants.CENTER);
	round9.add(name9);

	display9.setHorizontalAlignment(SwingConstants.CENTER);
	round9.add(display9);

	name10.setHorizontalAlignment(SwingConstants.CENTER);
	round10.add(name10);

	display10.setHorizontalAlignment(SwingConstants.CENTER);
	round10.add(display10);

	nameT.setHorizontalAlignment(SwingConstants.CENTER);
	total.add(nameT);
	
	displayT.setHorizontalAlignment(SwingConstants.CENTER);
	total.add(displayT);

	top0.add(new JLabel(" "));
	top1.add(round1);
	top1.add(round2);
	top1.add(round3);
	top1.add(round4);
	top1.add(round5);
	top2.add(round6);
	top2.add(round7);
	top2.add(round8);
	top2.add(round9);
	top2.add(round10);
	top3.add(total);

	add(top0);
	add(top1);
	add(top2);
	add(top3);
	
	scores = new String[10][3];
	for (int i = 0; i < 10; i++){
	    for (int x = 0; x < 3; x++){
		scores[i][x] = "0";
	    }
	}
    }

    public void score(int bowlnum, int x, String num){
	int holder = 0;
	if (scores[bowlnum - 1][0].equals("X") || (scores[bowlnum - 2][0].equals("X"))){
	    if (scores[bowlnum - 1][0].equals("X")){
		holder = bowlnum - 1;
		scores[holder][0] = "" + (Integer.parseInt(scores[holder][0]) + Integer.parseInt(scores[holder][0]));
	    }else{
		holder = bowlnum - 2;
	    }
	    scores[holder][2] = "" + (Integer.parseInt(scores[holder][2]) + Integer.parseInt(num));
	}else if (scores[bowlnum - 1][1].equals("/")){
	    scores[bowlnum - 1][2] = "" + (Integer.parseInt(scores[bowlnum - 1][2]) + Integer.parseInt(num));
	}
	if (num.equals("X")){
	    scores[bowlnum][x] = "X";
	}else if (num.equals("/")){
	    scores[bowlnum][x] = "/";
	}else{
	    scores[bowlnum][x] = "" + (Integer.parseInt(num));
	}insert();
    }

    public void insert(){
	display1.setText("    " + scores[0][2] + "    ");
	display2.setText("    " + scores[1][2] + "    ");
	display3.setText("    " + scores[2][2] + "    ");
	display4.setText("    " + scores[3][2] + "    ");
	display5.setText("    " + scores[4][2] + "    ");
	display6.setText("    " + scores[5][2] + "    ");
	display7.setText("    " + scores[6][2] + "    ");
	display8.setText("    " + scores[7][2] + "    ");
	display9.setText("    " + scores[8][2] + "    ");
	display10.setText("    " + scores[9][2] + "    ");
	
    }

}
