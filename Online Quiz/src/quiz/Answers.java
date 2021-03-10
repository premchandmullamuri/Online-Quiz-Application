/**
 * 
 */
package quiz;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import quiz.Questions;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import quiz.Connect;
import quiz.Start;
/**
 * @author Mullamuri Premchand
 *
 */

public class Answers extends JFrame
{
	private JPanel contentPane; 

	private JButton Exit;
	int j=0;
	String[][] NumberStorage;
	String[][] ans;
	public static String results;
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/quiz";
	

	static final String USER = "root";
	static final String PASS = "Password";
	protected static final String String = null;
	
	public static void main(String[] args) 
	{		Connect.main(null);

		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try  
				{
					Answers frame = new Answers();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	

	public Answers() {
		setTitle("Answers for QUIZ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Questions qusobj = new Questions();
		String[][] qusarray = qusobj.qarray();
		Questions ansobj = new Questions();
		String[][] ansarray = ansobj.ansarray();
		System.out.println(qusarray[1][0]);
		for(int i=0,j=0;i<=9;i++) {
		
		JLabel quest = new JLabel((i+1)+") "+qusarray[i][0]);
		quest.setBounds(185, 10+j, 200, 200);
		contentPane.add(quest);
		
		JLabel ans = new JLabel("Ans) "+ansarray[i][1]);
		ans.setBounds(190, 30+j, 200, 200);
		contentPane.add(ans);
		j=j+40;
		
		}
		Exit = new JButton("Exit");
		Exit.setBounds(270, 530, 89, 23);
		contentPane.add(Exit);
		Exit.addActionListener(new ActionListener() 
                {
		                public void actionPerformed(ActionEvent e) 
                                {				
                                
		                	System.exit(0);
                                }
		});
	
	
	
		
}
	
}
