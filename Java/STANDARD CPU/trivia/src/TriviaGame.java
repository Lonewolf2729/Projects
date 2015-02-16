import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TriviaGame extends JTabbedPane {
/**
	 this is a trivia game to test the substring() and indexOf() methods
	 * 
	 */
	private static final long serialVersionUID = 1L;
final int Q1 = 1, Q2 = 2, Q3 = 3;
final int HELP = 0, TRIVIA = 1, ANSWERS = 2;
int state = 1, correct = 0;
int finalize;
String correct1 = "bill gates", correct2 = "steve jobs", correct3 = "george boole", correct4 = "ada lovelace";
String[] questions = {"Who founded Microsoft?", "Who founded Apple?", "Who invented Boolean logic?", "Who was the first programmer?", "done"};
String answers = "";
String answer1 = "", answer2 = "", answer3 = "", answer4 = "";
String txt = "<html>" + "Question: " + state + "<br />" + "Click for next question";
JFrame frame = new JFrame("Programming Trivia Game");
JPanel pane = new JPanel(), help = new JPanel(), end = new JPanel();
JButton button = new JButton(txt), restart = new JButton("Would you like to play again?");
JTextArea area = new JTextArea(), results = new JTextArea();
JLabel question =  new JLabel(questions[state - 1]);
static JTextField input  = new JTextField();

public void changetabto(int tab)
{
	this.setSelectedIndex(tab);
}
public void helpsetup(){
	help.setBackground(Color.CYAN);
	area.append("Welcome to the Programming Trivia game\n");
	area.append("Lets Test your programming knowledge\n");
	area.append("Put the correct answer in the textbox and then click the button for the next question\n");
	area.append("Click the trivia tab to begin");
	help.add(area);
	this.addTab("Help/Setup", help);
}



public void results()
{
	    check(answer1, correct1);
	    check(answer2, correct2);
	    check(answer3, correct3);
	    check(answer4, correct4);
	    results.setText("");
		results.append("Answer 1: " + correct1 + "\n");
		results.append("Your answer: " + answer1 + "\n");
		results.append("Answer 2: " + correct2 + "\n");
		results.append("Your answer: " + answer2 + "\n");
		results.append("Answer 3: " + correct3 + "\n");
		results.append("Your answer: " + answer3 + "\n");
		results.append("Answer 4: " + correct4 + "\n");
		results.append("Your Answer: " +answer4 + "\n");
		results.append("You got: " + correct + " right");
		restart.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			changetabto(0);
			results.setText("results");
			state = 1;
			button.setText(txt);
			question.setText(questions[state - 1]);
			answers = ""; 
			answer1 = "";
			answer2 = "";
			answer3 = "";
			answer4 = "";
			
			}
			
		});
		
		
}
public void check(String answer, String input){
	if(answer.indexOf(input) >= 0){
		++correct;
	}
}
public void triviasetup()
{
	this.addTab("Trivia Game", pane);
	results.append("results");
	end.add(results);
	this.addTab("Results", end);
	end.add(restart);
	pane.setLayout(null);
	pane.add(question);
	question.setBounds(150, 5, 200, 100);
	pane.add(input);
	input.setLocation(145, 100);
	input.setSize(200, 50);
	button.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			answers += input.getText().toString().toLowerCase() + ",";
				input.setText("");
				question.setText(questions[state]);
				state++;
				button.setText("<html>" + "Question: " + state + "<br />" + "Click for next question");
			
		    if(state == 5)
			{
		    		answer1 = answers.substring(0, answers.indexOf(","));
		    		answers = answers.substring(answers.indexOf(",") + 1, answers.length());
		    		answer2 = answers.substring(0, answers.indexOf(","));
		    		answers = answers.substring(answers.indexOf(",") + 1, answers.length());
		    		answer3 = answers.substring(0, answers.indexOf(","));
		    		answers = answers.substring(answers.indexOf(",") + 1, answers.length());
		    		answer4 = answers.substring(0, answers.indexOf(","));
		    		results();
		    	
		    	
			}
				
			
		}
	});
	pane.add(button);
	button.setLocation(145, 200);
	button.setSize(200, 100);
	
	
}
public TriviaGame()
{
	frame.setSize(600, 400);
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	helpsetup();
	triviasetup();
	frame.add(this);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TriviaGame();
	}

}
