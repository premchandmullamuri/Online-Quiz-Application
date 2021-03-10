/**
 * 
 */
package quiz;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Wrapper;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import quiz.Connect;

/**
 * @author Mullamuri Premchand
 *
 */

public class Start extends JFrame
{
static final String DB_URL = "jdbc:mysql://localhost:3306/quiz";
	
	
	static final String USER = "root";
	static final String PASS = "Password";
	protected static final String String = null;
	
	public static void main(String[] args) 
	{
		 JFrame f=new JFrame("Online Quiz");  
		    JButton start=new JButton("Start");  
		    start.setBounds(125,225,95,30);  
		    f.add(start);  
		    JLabel label=new JLabel("<html><h2>Welcome to Online Quiz</h2></html>");
		    label.setBounds(90, 100, 250, 28);
		    f.add(label);
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true);   
		

		start.addActionListener(new ActionListener() 
                {
		                public void actionPerformed(ActionEvent e) 
                                {	
		                	Questions que=new Questions();/*Calling the Questions Class 
		                	                                 when start button is Clicked*/
		                           que.setVisible(true);
                                }
		                });
	
	
}}
