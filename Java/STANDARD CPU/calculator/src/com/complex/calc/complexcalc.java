/**
 * 
 */
package com.complex.calc;

import java.awt.*;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

import java.awt.event.*;
/**
 * This is a complex calculator to perform many simple math operations
 * @author Tommy
 *
 *
 *
 */
public class complexcalc extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = -38867563833160045L;

	//objects for math evaluations
	ScriptEngineManager mgr = new ScriptEngineManager();
	ScriptEngine engine = mgr.getEngineByName("JavaScript");
	
	//tabpane
	JTabbedPane tab = new JTabbedPane();
	
	//The tab indexes
	final int HELP = 0, SIMPCALC = 1, EXPO = 2, SQRT = 3, TYPE = 4;
    
	//Radio Buttons for Exponenets, bool variable for comparisons
	JRadioButton numforbase = new JRadioButton("Base"), numforpower = new JRadioButton("Power");
	ButtonGroup group = new ButtonGroup();
	boolean basestate = numforbase.isSelected();
	
	//Vars for states
	final int EXPO_BASE = 1, EXPO_POWER = 0;
	
	//TextFields
	JTextField calc = new JTextField(), expobase = new JTextField(), 
    expopower = new JTextField(), squareroots = new JTextField(), 
    types = new JTextField();
	
	//JButtons
	JButton zero = new JButton("0"), one = new JButton("1"), two = new JButton("2"),
			three = new JButton("3"), four = new JButton("4"), five = new JButton("5"),
			six = new JButton("6"), seven = new JButton("7"), eight = new JButton("8"),
	        nine = new JButton("9"), plus = new JButton("+"), sub = new JButton("-"), 
	        multi = new JButton("*"), div = new JButton("/"), 
	        submit = new JButton("="), ans = new JButton("ans"),
	        clear = new JButton("clear"), delete = new JButton("backspace");
    //Elements to hold the answers for the tabs
	Object calcanswer = 0, typeanswer = 0;
	Double expoanswer = 0.0, sqrtanswers = 0.0;
	
	//Labels to display the answers(the number in the object corresponds to the tab it is for
	JLabel answer1 = new JLabel("Answer: "), answer2 = new JLabel("Answers: "), 
		   answer3 = new JLabel("Answers: "), answer4 = new JLabel("Answers: ");
	
	//Label for the exponent
	JLabel base = new JLabel("Base: "), power = new JLabel("Power: "), typelabel = new JLabel("This answer is ");
	
	//Sqrt real or imaginary label
	JLabel real_imag = new JLabel("This is a ");
	
	//TextArea for help tab
	JTextArea thelp = new JTextArea("Welcome to my complex calculator, its like my simple calculator, but more analytic\n");
	
	//Strings for certain tabs
	String simpleequation = "", typeequation = "";
	
	//JPanels
	JPanel help = new JPanel(), simple = new JPanel(), exponent = new JPanel(), 
			squarerroot = new JPanel(), Typepane = new JPanel();
	
	//icon for params of tabs
	Icon icon = null;
	/**
	 * 
	 * @param istrue - state of the selected button bool state
	 * @return 0 if the param is false, 1 if the param is true
	 */
    public int booltoint(boolean istrue){
    	if(istrue){
    		return 1;
    	}
    	else{
    		return 0;
    	}
    }
    
    public boolean isDouble(Object o){
    	String str = o.toString();
        String comparestr = str.substring(str.indexOf("."), str.length());
        int compare = Integer.parseInt(comparestr);
        		
        if(compare > 0){
        	return true;
        }
        else{
        	return false;
        }
    }
	/**
    * Method is called to setup the help tab
    * @see JTabbedPane
    * 
    */
	public void helpsetup()
    {
    	help.setBackground(Color.GREEN);
    	thelp.append("* is for multiplying and / is division\n");
    	thelp.append("Use the exponent tab for exponents, click the corresponding circle button to choose what textbox the program's button affects\n");
    	thelp.append("Use the square root tab to square root numbers, and to see if they are imaginary or not\n");
    	thelp.append("Use the type tab to see the type of number your input is");
    	help.add(thelp);
    	tab.addTab("Help", icon, help, "If you need help, come here");
    	
    }
	/**
	 * This tab is called when you want to use a regular calculator
	 */
	public void simplecalculations(){
		simple.setLayout(null);
		simple.setBackground(Color.GREEN);
		
		answer1.setBounds(300, 70, 150, 40);
		calc.setBounds(300, 10, 250, 50);
		zero.setBounds(250, 125, 100, 50);
		one.setBounds(375, 125, 100, 50);
		two.setBounds(500, 125, 100, 50);
		three.setBounds(250, 200, 100, 50);
		four.setBounds(375, 200, 100, 50);
		five.setBounds(500, 200, 100, 50);
		six.setBounds(250, 275, 100, 50);
		seven.setBounds(375, 275, 100, 50);
		eight.setBounds(500, 275, 100, 50);
		nine.setBounds(250, 350, 100, 50);
		plus.setBounds(375, 350, 100, 50);
		sub.setBounds(500, 350, 100, 50);
		multi.setBounds(250, 425, 100, 50);
		div.setBounds(375, 425, 100, 50);
		submit.setBounds(500, 425, 100, 50);
		clear.setBounds(250, 500, 100, 50);
		ans.setBounds(375, 500, 100, 50);
		delete.setBounds(500, 500, 100, 50);
		
		calc_actions();
		
		simple.add(calc);
		simple.add(answer1);
		simple.add(zero);
		simple.add(one);
		simple.add(two);
		simple.add(three);
		simple.add(four);
		simple.add(five);
		simple.add(six);
		simple.add(seven);
		simple.add(eight);
		simple.add(nine);
		simple.add(plus);
		simple.add(sub);
		simple.add(multi);
		simple.add(div);
		simple.add(submit);
		simple.add(clear);
		simple.add(ans);
		simple.add(delete);
		
		tab.addTab("Standard Calc", icon, simple, "A good old fashion calculator");
	}
	public void exposetup(){
		
	}
	public void sqrtsetup(){
		squarerroot.setLayout(null);
		squarerroot.setBackground(Color.GREEN);
		
		answer2.setBounds(300, 70, 150, 40);
		squareroots.setBounds(300, 10, 250, 50);
		zero.setBounds(250, 125, 100, 50);
		one.setBounds(375, 125, 100, 50);
		two.setBounds(500, 125, 100, 50);
		three.setBounds(250, 200, 100, 50);
		four.setBounds(375, 200, 100, 50);
		five.setBounds(500, 200, 100, 50);
		six.setBounds(250, 275, 100, 50);
		seven.setBounds(375, 275, 100, 50);
		eight.setBounds(500, 275, 100, 50);
		nine.setBounds(250, 350, 100, 50);
		submit.setBounds(375, 350, 100, 50);
		clear.setBounds(500, 350, 100, 50);
		ans.setBounds(250, 500, 100, 50);
		delete.setBounds(500, 500, 100, 50);
		
		calc_actions();
		
		squarerroot.add(squareroots);
		squarerroot.add(answer2);
		squarerroot.add(zero);
		squarerroot.add(one);
		squarerroot.add(two);
		squarerroot.add(three);
		squarerroot.add(four);
		squarerroot.add(five);
		squarerroot.add(six);
		squarerroot.add(seven);
		squarerroot.add(eight);
		squarerroot.add(nine);
		squarerroot.add(submit);
		squarerroot.add(clear);
		squarerroot.add(ans);
		squarerroot.add(delete);
		
		tab.addTab("Square roots", icon, squarerroot, "Here you can square root a number and see if it is real or imaginary");
	}
	public void typesetup(){
		
	}
	
	/**
	 * So this method initializes the actionlisteners for the buttons, the states are SIMPCALC(second tab), EXPO(third tab), SQRT(fourth tab), TYPE(last tab)
	 */
	public void calc_actions(){
		group.add(numforbase);
		group.add(numforpower);
		
		zero.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "0");
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						expopower.setText(expopower.getText() + "0");
					case EXPO_BASE:
						expobase.setText(expobase.getText() + "0");
					}
				case SQRT:
					squareroots.setText(squareroots.getText() + "0");
				case TYPE:
					types.setText(types.getText() + "0");
				}
			}
			
		});
		one.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "1");
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						expopower.setText(expopower.getText() + "1");
					case EXPO_BASE:
						expobase.setText(expobase.getText() + "1");
					}
				case SQRT:
					squareroots.setText(squareroots.getText() + "1");
				case TYPE:
					types.setText(types.getText() + "0");
				}
			}
			
		});
		two.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "2");
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						expopower.setText(expopower.getText() + "2");
					case EXPO_BASE:
						expobase.setText(expobase.getText() + "2");
					}
				case SQRT:
					squareroots.setText(squareroots.getText() + "2");
				case TYPE:
					types.setText(types.getText() + "2");
				}
			}
			
		});
		three.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "3");
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						expopower.setText(expopower.getText() + "3");
					case EXPO_BASE:
						expobase.setText(expobase.getText() + "3");
					}
				case SQRT:
					squareroots.setText(squareroots.getText() + "3");
				case TYPE:
					types.setText(types.getText() + "3");
				}
			}
			
		});
		four.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "4");
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						expopower.setText(expopower.getText() + "4");
					case EXPO_BASE:
						expobase.setText(expobase.getText() + "4");
					}
				case SQRT:
					squareroots.setText(squareroots.getText() + "4");
				case TYPE:
					types.setText(types.getText() + "4");
				}
			}
			
		});
		four.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "4");
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						expopower.setText(expopower.getText() + "4");
					case EXPO_BASE:
						expobase.setText(expobase.getText() + "4");
					}
				case SQRT:
					squareroots.setText(squareroots.getText() + "4");
				case TYPE:
					types.setText(types.getText() + "4");
				}
			}
			
		});
		five.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "5");
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						expopower.setText(expopower.getText() + "5");
					case EXPO_BASE:
						expobase.setText(expobase.getText() + "5");
					}
				case SQRT:
					squareroots.setText(squareroots.getText() + "5");
				case TYPE:
					types.setText(types.getText() + "5");
				}
			}
			
		});
		six.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "6");
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						expopower.setText(expopower.getText() + "6");
					case EXPO_BASE:
						expobase.setText(expobase.getText() + "6");
					}
				case SQRT:
					squareroots.setText(squareroots.getText() + "6");
				case TYPE:
					types.setText(types.getText() + "6");
				}
			}
			
		});
		seven.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "7");
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						expopower.setText(expopower.getText() + "7");
					case EXPO_BASE:
						expobase.setText(expobase.getText() + "7");
					}
				case SQRT:
					squareroots.setText(squareroots.getText() + "7");
				case TYPE:
					types.setText(types.getText() + "7");
				}
			}
			
		});
		eight.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "8");
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						expopower.setText(expopower.getText() + "8");
					case EXPO_BASE:
						expobase.setText(expobase.getText() + "8");
					}
				case SQRT:
					squareroots.setText(squareroots.getText() + "8");
				case TYPE:
					types.setText(types.getText() + "8");
				}
			}
			
		});
		nine.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "9");
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						expopower.setText(expopower.getText() + "9");
					case EXPO_BASE:
						expobase.setText(expobase.getText() + "9");
					}
				case SQRT:
					squareroots.setText(squareroots.getText() + "9");
				case TYPE:
					types.setText(types.getText() + "9");
				}
			}
			
		});
		plus.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "+");
				
				case TYPE:
					types.setText(types.getText() + "+");
				}
			}
			
		});
		sub.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "-");
				
				case TYPE:
					types.setText(types.getText() + "-");
				}
			}
			
		});
		multi.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "*");
				
				case SQRT:
					squareroots.setText(squareroots.getText() + "*");
				case TYPE:
					types.setText(types.getText() + "*");
				}
			}
			
		});
		div.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + "/");
				
				case TYPE:
					types.setText(types.getText() + "/");
				}
			}
		});
		submit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					simpleequation = calc.getText();
					try {
						calcanswer = engine.eval(simpleequation);
						answer1.setText("Answer: " +calcanswer);
					} catch (ScriptException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				case EXPO:
			    expoanswer = Math.pow(Double.parseDouble(expobase.getText()), Double.parseDouble(expopower.getText()));
				answer2.setText("Answer: " +expoanswer);
				case SQRT:
					sqrtanswers = Math.sqrt(Double.parseDouble(squareroots.getText()));
			        answer3.setText("Answer: " +sqrtanswers);
			        if(Double.isNaN(sqrtanswers)){
			        	real_imag.setText("This answer is an imaginary number");
			        }
			        else{
			        	real_imag.setText("This answer is a real number");
			        }
				case TYPE:
					try{
						typeanswer = engine.eval(types.getText().toString());
						answer4.setText("Answer: " +typeanswer);
						if((Integer) typeanswer < 0){
							typelabel.setText("This answer is an integer");
						}
						else if(isDouble(typeanswer)){
							typelabel.setText("This answer a decimal");
						}
						else if((Integer) typeanswer > 0){
							typelabel.setText("This number is an integer, a whole number, and a natural number");
						}
						else if((Integer) typeanswer == 0 ){
							typelabel.setText("Thic number is an integer and a whole number");
						}
						
						
					}
					catch(ScriptException e){
						e.printStackTrace();	
					}
					
				}
			}
			
		});
		clear.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText("");
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						expopower.setText("");
					case EXPO_BASE:
						expobase.setText("");
					}
				case SQRT:
					squareroots.setText("");
				case TYPE:
					types.setText("");
				}
			}
			
		});
		ans.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					calc.setText(calc.getText() + calcanswer);
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						expopower.setText(String.valueOf(expoanswer));
					case EXPO_BASE:
						expobase.setText(String.valueOf(expoanswer));
					}
				case SQRT:
					squareroots.setText(String.valueOf(sqrtanswers));
				case TYPE:
					types.setText(types.getText() + typeanswer);
				}
			}
			
		});
		delete.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				switch(tab.getSelectedIndex()){
				case SIMPCALC:
					simpleequation = calc.getText();
					calc.setText(simpleequation.substring(0, simpleequation.length() - 1));
				case EXPO:
					//Checks to see which text box to set the text
					switch(booltoint(basestate)){
					case EXPO_POWER:
						simpleequation = expopower.getText();
						expopower.setText(simpleequation.substring(0, simpleequation.length() - 1));
					case EXPO_BASE:
						simpleequation = expobase.getText();
						expopower.setText(simpleequation.substring(0, simpleequation.length() - 1));
					}
				case SQRT:
					simpleequation = squareroots.getText();
					squareroots.setText(simpleequation.substring(0, simpleequation.length() - 1));
				case TYPE:
					typeequation = types.getText();
					types.setText(typeequation.substring(0, typeequation.length() - 1));
				}
			}
			
		});
	}
	public complexcalc(){
		this.setTitle("Complex Calculator");
		this.setSize(900, 900);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		helpsetup();
		simplecalculations();
		sqrtsetup();
		
		this.add(tab);
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new complexcalc();   
	}

}