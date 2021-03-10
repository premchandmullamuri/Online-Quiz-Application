package quiz;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import quiz.Questions;
import quiz.Start;
/**
 * @author Mullamuri Premchand
 *
 */

public class Results extends JFrame 
{
	private JPanel contentPane;
	private JButton Exit;
	private JButton Answers;
	public static String results;
	

	static final String DB_URL = "jdbc:mysql://localhost:3306/quiz";
	
	static final String USER = "root";
	static final String PASS = "Password";
	protected static final String String = null;
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try  
				{
					Results frame = new Results();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}


	public Results()
	{	
		setTitle("QUIZ:Results");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		int results=Questions.score;
		String result=String.valueOf(results);
		
	
	
		results=10-results;
		String wrong=String.valueOf(results);
		
		JLabel finalresult = new JLabel("<html>Your FinalScore is:<html>"+result+"<html><br>Total Right Answers: <html>"+result+"<html><br>Total Wrong Answers: <html>"+wrong);
		finalresult.setBounds(200, 90, 200, 200);
		contentPane.add(finalresult);
		
		
		Exit = new JButton("Exit");
		Exit.setBounds(270, 251, 89, 23);
		contentPane.add(Exit);
		Exit.addActionListener(new ActionListener() 
                {
		                public void actionPerformed(ActionEvent e) 
                                {				
                                
		                	System.exit(0);
                                }
		});
	
	
	
		
		
		Answers = new JButton("Answers");
		Answers.setBounds(150, 251, 89, 23);
		contentPane.add(Answers);	
		Answers.addActionListener(new ActionListener() 
		{

		    public void actionPerformed(ActionEvent e) {
		        
		        new Answers().setVisible(true); 
		        dispose();
		    }

		});
			
		
}}
