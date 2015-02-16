/**
 * This is a calculator for java
 */
import java.awt.*;
import java.awt.event.*;

import javax.script.*;
import javax.swing.*;
/**
 * @author Tommy
 *
 */
public class calculator extends JTabbedPane{
/**

	 * 
	 */
	private static final long serialVersionUID = -8440557206392171727L;

//Buttons for the calculator
JButton zero = new JButton("0"), one = new JButton("1"), two = new JButton("2"), 
three = new JButton("3"), four = new JButton("4"), five = new JButton("5"), 
six = new JButton("6"), seven = new JButton("7"), eight = new JButton("8"), nine = new JButton("9"), 
plus = new JButton("+"), sub = new JButton("_"), div = new JButton("/"), multi = new JButton("*"), submit = new JButton("="),
clear = new JButton("clear"), ans = new JButton("ans"), backspace = new JButton("delete");

//Components to evaluate the string
ScriptEngineManager mgr = new ScriptEngineManager();
ScriptEngine engine = mgr.getEngineByName("JavaScript");

//variable for answer, and equation
Object answers = 0;
String equation = "";

//label for answer
JLabel answer = new JLabel("Answer: ");

//Where the calculations go
JTextField calc = new JTextField();
//color for background
Color color = new Color(0x99FF66);

//Panels for the tabs
JPanel help = new JPanel(), math = new JPanel();

JFrame frame = new JFrame("Calculator");

//The help menu
JTextArea area = new JTextArea();

Icon icon = null;

public void helpsetup(){
	help.setBackground(color);
	area.setText("Welcome to my calculator\n");
	area.append("This works like a normal calculator, but a little different\n");
	area.append("* is multiplication and / is division");
	help.add(area);
	this.addTab("Help", icon, help, "Refer to this tab for help");
}
public void calcsetup() throws ScriptException{
	math.setBackground(color);
	math.setLayout(null);
	answer.setBounds(300, 70, 150, 40);
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
	backspace.setBounds(500, 500, 100, 50);
	
	
	
	calcactions();
	
	math.add(calc);
	math.add(answer);
	math.add(zero);
	math.add(one);
	math.add(two);
	math.add(three);
	math.add(four);
	math.add(five);
	math.add(six);
	math.add(seven);
	math.add(eight);
	math.add(nine);
	math.add(plus);
	math.add(sub);
	math.add(multi);
	math.add(div);
	math.add(submit);
	math.add(clear);
	math.add(ans);
	math.add(backspace);
	this.addTab("Calculate", math);
}
public void calcactions() throws ScriptException
{
	zero.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			calc.setText(calc.getText() + "0");
		}
		
	});
	one.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			calc.setText(calc.getText() + "1");
		}
		
	});
	two.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			calc.setText(calc.getText() + "2");
		}
		
	});
	three.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			calc.setText(calc.getText() + "3");
		}
		
	});
	four.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			calc.setText(calc.getText() + "4");
		}
		
	});
	five.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			calc.setText(calc.getText() + "5");
		}
		
	});
	six.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		    calc.setText(calc.getText() + "6");	
		}
		
	});
	seven.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			calc.setText(calc.getText() + "7");
		}
		
	});
	eight.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			calc.setText(calc.getText() + "8");
		}
		
	});
	nine.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		    calc.setText(calc.getText() + "9");	
		}
		
	});
	plus.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		    calc.setText(calc.getText() + "+");	
		}
		
	});
	sub.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		    calc.setText(calc.getText() + "-");
		}
		
	});
	multi.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		    calc.setText(calc.getText() + "*");
		}
		
	});
	div.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			calc.setText(calc.getText() + "/");
		}
		
	});
	submit.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		   equation = calc.getText();
		   try {
			answers = engine.eval(equation);
			answer.setText("Answer: " + answers);
			
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	});
	clear.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		    calc.setText("");	
		}
		
	});
	ans.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			calc.setText(calc.getText() + answers);
		}
		
	});
	backspace.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			equation = calc.getText();
			calc.setText(equation.substring(0, equation.length() - 1));
		}
		
	});
}
public calculator() throws ScriptException{
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setSize(900, 900);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(this);
	helpsetup();
	calcsetup();
}
	/**
	 * @param args
	 * @throws ScriptException 
	 */
	public static void main(String[] args) throws ScriptException {
		// TODO Auto-generated method stub
		new calculator();
	}



}
