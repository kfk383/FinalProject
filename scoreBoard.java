import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.ImageIO;


public class scoreBoard extends JPanel{
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

    public scoreBoard(){
	setBackground(new Color(0,77,204));
	setBounds(400,0,386,150);

	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	
	Box top1 = Box.createHorizontalBox();
	Box top2 = Box.createHorizontalBox();
	
	Box round1 = Box.createVerticalBox();
	Box round2 = Box.createVerticalBox();
	Box round3 = Box.createVerticalBox();
	Box round4 = Box.createVerticalBox();
	Box round5 = Box.createVerticalBox();
	Box round6 = Box.createVerticalBox();
	Box round7 = Box.createVerticalBox();
	Box round8 = Box.createVerticalBox();
	Box round9 = Box.createVerticalBox();
	Box round10 = Box.createVerticalBox();

	JTextField name1 = new JTextField(30);
	name1.setHorizontalAlignment(SwingConstants.CENTER);
	name1.setText("Round 1");
	round1.add(name1);

	JTextField display1 = new JTextField(30);
	display1.setHorizontalAlignment(SwingConstants.CENTER);
	display1.setText(score1 + "");
	round1.add(display1);

	JTextField name2 = new JTextField(30);
	name2.setHorizontalAlignment(SwingConstants.CENTER);
	name2.setText("Round 2");
	round2.add(name2);

	JTextField display2 = new JTextField(30);
	display2.setHorizontalAlignment(SwingConstants.CENTER);
	display2.setText(score2 + "");
	round2.add(display2);

	JTextField name3 = new JTextField(30);
	name3.setHorizontalAlignment(SwingConstants.CENTER);
	name3.setText("Round 3");
	round3.add(name3);

	JTextField display3 = new JTextField(30);
	display3.setHorizontalAlignment(SwingConstants.CENTER);
	display3.setText(score3 + "");
	round3.add(display3);

	JTextField name4 = new JTextField(30);
	name4.setHorizontalAlignment(SwingConstants.CENTER);
	name4.setText("Round 4");
	round4.add(name4);

	JTextField display4 = new JTextField(30);
	display4.setHorizontalAlignment(SwingConstants.CENTER);
	display4.setText(score4 + "");
	round4.add(display4);

	JTextField name5 = new JTextField(30);
	name5.setHorizontalAlignment(SwingConstants.CENTER);
	name5.setText("Round 5");
	round5.add(name5);

	JTextField display5 = new JTextField(30);
	display5.setHorizontalAlignment(SwingConstants.CENTER);
	display5.setText(score5 + "");
	round5.add(display5);

	JTextField name6 = new JTextField(30);
	name6.setHorizontalAlignment(SwingConstants.CENTER);
	name6.setText("Round 6");
	round6.add(name6);

	JTextField display6 = new JTextField(30);
	display6.setHorizontalAlignment(SwingConstants.CENTER);
	display6.setText(score6 + "");
	round6.add(display6);

	JTextField name7 = new JTextField(30);
	name7.setHorizontalAlignment(SwingConstants.CENTER);
	name7.setText("Round 7");
	round7.add(name7);

	JTextField display7 = new JTextField(30);
	display7.setHorizontalAlignment(SwingConstants.CENTER);
	display7.setText(score7 + "");
	round7.add(display7);

	JTextField name8 = new JTextField(30);
	name8.setHorizontalAlignment(SwingConstants.CENTER);
	name8.setText("Round 8");
	round8.add(name8);

	JTextField display8 = new JTextField(30);
	display8.setHorizontalAlignment(SwingConstants.CENTER);
	display8.setText(score8 + "");
	round8.add(display8);

	JTextField name9 = new JTextField(30);
	name9.setHorizontalAlignment(SwingConstants.CENTER);
	name9.setText("Round 9");
	round9.add(name9);

	JTextField display9 = new JTextField(30);
	display9.setHorizontalAlignment(SwingConstants.CENTER);
	display9.setText(score9 + "");
	round9.add(display9);

	JTextField name10 = new JTextField(30);
	name10.setHorizontalAlignment(SwingConstants.CENTER);
	name10.setText("Round 10");
	round10.add(name10);

	JTextField display10 = new JTextField(30);
	display10.setHorizontalAlignment(SwingConstants.CENTER);
	display10.setText(score10 + "");
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
    }

    public void setScore1(int s){
	score1 = s;
    }
    public int getScore1(){
	return score1;
    }

    public void setScore2(int s){
	score2 = s;
    }
    public int getScore2(){
	return score2;
    }

    public void setScore3(int s){
	score3 = s;
    }
    public int getScore3(){
	return score3;
    }

    public void setScore4(int s){
	score4 = s;
    }
    public int getScore4(){
	return score4;
    }

    public void setScore5(int s){
	score5 = s;
    }
    public int getScore5(){
	return score5;
    }
    public void setScore6(int s){
	score6 = s;
    }
    public int getScore6(){
	return score6;
    }

    public void setScore7(int s){
	score7 = s;
    }
    public int getScore7(){
	return score7;
    }
    public void setScore8(int s){
	score8 = s;
    }
    public int getScore8(){
	return score8;
    }

    public void setScore9(int s){
	score9 = s;
    }
    public int getScore9(){
	return score9;
    }
    public void setScore10(int s){
	score10 = s;
    }
    public int getScore10(){
	return score10;
    }
}