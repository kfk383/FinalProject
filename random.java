import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;


public class scoreBoard extends JPanel{

    private Box top1 = Box.createHorizontalBox();
    private Box top2 = Box.createHorizontalBox();
	
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

    private int score1 = 0;
    private int score2 = 0;
    private int score3 = 0;
    private int score4 = 0 ;
    private int score5 = 0;
    private int score6 = 0;
    private int score7 = 0;
    private int score8 = 0;
    private int score9 = 0;
    private int score10 = 0;

    private JTextField name1 = new JTextField(30);
    private JTextField display1 = new JTextField(30);

    private JTextField name2 = new JTextField(30);
    private JTextField display2 = new JTextField(30);

    private JTextField name3 = new JTextField(30);
    private JTextField display3 = new JTextField(30);

    private JTextField name4 = new JTextField(30);
    private JTextField display4 = new JTextField(30);

    private JTextField name5 = new JTextField(30);
    private JTextField display5 = new JTextField(30);
    
    private JTextField name6 = new JTextField(30);
    private JTextField display6 = new JTextField(30);
    
    private JTextField name7 = new JTextField(30);
    private JTextField display7 = new JTextField(30);
    
    private JTextField name8 = new JTextField(30);
    private JTextField display8 = new JTextField(30);
    
    private JTextField name9 = new JTextField(30);
    private JTextField display9 = new JTextField(30);
    
    private JTextField name10 = new JTextField(30);
    private JTextField display10 = new JTextField(30);

    public scoreBoard(){
	setBackground(new Color(0,77,204));
	setBounds(400,0,386,150);

	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	
	name1.setHorizontalAlignment(SwingConstants.CENTER);
	name1.setText("Round 1");
	name1.setEditable(false);
	round1.add(name1);

	display1.setHorizontalAlignment(SwingConstants.CENTER);
	display1.setText(score1 + "");
	display1.setEditable(false);
	round1.add(display1);

	name2.setHorizontalAlignment(SwingConstants.CENTER);
	name2.setText("Round 2");
	name2.setEditable(false);
	round2.add(name2);

	display2.setHorizontalAlignment(SwingConstants.CENTER);
	display2.setText(score2 + "");
	display2.setEditable(false);
	round2.add(display2);

	name3.setHorizontalAlignment(SwingConstants.CENTER);
	name3.setText("Round 3");
	name3.setEditable(false);
	round3.add(name3);

	display3.setHorizontalAlignment(SwingConstants.CENTER);
	display3.setText(score3 + "");
	display3.setEditable(false);
	round3.add(display3);

	name4.setHorizontalAlignment(SwingConstants.CENTER);
	name4.setText("Round 4");
	name4.setEditable(false);
	round4.add(name4);

	display4.setHorizontalAlignment(SwingConstants.CENTER);
	display4.setText(score4 + "");
	display4.setEditable(false);
	round4.add(display4);

	name5.setHorizontalAlignment(SwingConstants.CENTER);
	name5.setText("Round 5");
	name5.setEditable(false);
	round5.add(name5);

	display5.setHorizontalAlignment(SwingConstants.CENTER);
	display5.setText(score5 + "");
	display5.setEditable(false);
	round5.add(display5);

	name6.setHorizontalAlignment(SwingConstants.CENTER);
	name6.setText("Round 6");
	name6.setEditable(false);
	round6.add(name6);

	display6.setHorizontalAlignment(SwingConstants.CENTER);
	display6.setText(score6 + "");
	display6.setEditable(false);
	round6.add(display6);

	name7.setHorizontalAlignment(SwingConstants.CENTER);
	name7.setText("Round 7");
	name7.setEditable(false);
	round7.add(name7);

	display7.setHorizontalAlignment(SwingConstants.CENTER);
	display7.setText(score7 + "");
	display7.setEditable(false);
	round7.add(display7);

	name8.setHorizontalAlignment(SwingConstants.CENTER);
	name8.setText("Round 8");
	name8.setEditable(false);
	round8.add(name8);

	display8.setHorizontalAlignment(SwingConstants.CENTER);
	display8.setText(score8 + "");
	display8.setEditable(false);
	round8.add(display8);

	name9.setHorizontalAlignment(SwingConstants.CENTER);
	name9.setText("Round 9");
	name9.setEditable(false);
	round9.add(name9);

	display9.setHorizontalAlignment(SwingConstants.CENTER);
	display9.setText(score9 + "");
	display9.setEditable(false);
	round9.add(display9);

	name10.setHorizontalAlignment(SwingConstants.CENTER);
	name10.setText("Round 10");
	name10.setEditable(false);
	round10.add(name10);

	display10.setHorizontalAlignment(SwingConstants.CENTER);
	display10.setText(score10 + "");
	display10.setEditable(false);
	round10.add(display10);

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

	add(top1);
	add(top2);

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

    public void setScore1(int s){
	score1 = s;
	display1.setText(score1 + "");
	revalidate();
    }
    public int getScore1(){
	return score1;
    }

    public void setScore2(int s){
	score2 = s;
	display2.setText(score2 + "");
	revalidate();
    }
    public int getScore2(){
	return score2;
    }

    public void setScore3(int s){
	score3 = s;
	display3.setText(score3 + "");
	revalidate();
    }
    public int getScore3(){
	return score3;
    }

    public void setScore4(int s){
	score4 = s;
	display4.setText(score4 + "");
	revalidate();
    }
    public int getScore4(){
	return score4;
    }

    public void setScore5(int s){
	score5 = s;
	display5.setText(score5 + "");
	revalidate();
    }
    public int getScore5(){
	return score5;
    }
    public void setScore6(int s){
	score6 = s;
	display6.setText(score6 + "");
	revalidate();
    }
    public int getScore6(){
	return score6;
    }

    public void setScore7(int s){
	score7 = s;
	display7.setText(score7 + "");
	revalidate();
    }
    public int getScore7(){
	return score7;
    }
    public void setScore8(int s){
	score8 = s;
	display8.setText(score8 + "");
	revalidate();
    }
    public int getScore8(){
	return score8;
    }

    public void setScore9(int s){
	score9 = s;
	display9.setText(score9 + "");
	revalidate();
    }
    public int getScore9(){
	return score9;
    }
    public void setScore10(int s){
	score10 = s;
	display10.setText(score10 + "");
	revalidate();
    }
    public int getScore10(){
	return score10;
    }
}