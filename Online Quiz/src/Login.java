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



public class Login extends JFrame
{
	static final String DB_URL = "jdbc:mysql://localhost:3306/bookstoredb";
	
	
	static final String USER = "root";
	static final String PASS = "Password";
	protected static final String String = null;
	Connect Conn=new Connect();
	
	public static void main(String[] args) {
		 JFrame f=new JFrame("");
		     JLabel l1;  
		    l1=new JLabel("<html><h1>Welcome To Online Quiz</h1></html>");  
		    l1.setBounds(50,50, 300,30);  
		    f.add(l1);
		    JButton b=new JButton("Start");  
		    b.setBounds(125,200,95,30);  
		    f.add(b);  
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true); 
		    
		    b.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    	           Questions q=new Questions(); 
		    	           q.setVisible(true);
		    	        }  
		    	    });  
	}
	}
	
		