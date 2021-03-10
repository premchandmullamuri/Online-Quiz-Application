/**
 * 
 */
package quiz;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
/**
 * @author Mullamuri Premchand
 *
 */

public class Questions extends JFrame 
{
	
	private JPanel contentPane; 
	private JButton Next;
	private ButtonGroup opg;
	private JRadioButton op1;
	private JRadioButton op2;
	private JRadioButton op3;
	private JRadioButton op4;
	private JLabel question;
	private JLabel username;
	private JSeparator separator;
	 String[][] a;
	 String[][] q;
	static int score=0;
	int count=0;
	int c=0;
	
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run()
			{
				try 
				{
					Questions frame = new Questions();
					frame.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			
		});
		
	}
	
	public Questions() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        score=0;
        
        Game();
      q =new String[10][5];
      //Questions are stored in q[][]
      q[0][0]="1.How many days in an year?";/*Questions*/
      q[0][1]="360";
      q[0][2]="365";
      q[0][3]="330";
      q[0][4]="380";
      
      q[1][0]="2.Who Invented C?";
      q[1][1]="Microsoft";
      q[1][2]="Bell";
      q[1][3]="Dennis Ritchie";
      q[1][4]="Sun Micros";
      
      q[2][0]="3.Who is the current pm of india?";
      q[2][1]="Nehuru";
      q[2][2]="Modi";
      q[2][3]="Abdul kalam";
      q[2][4]="Andy Rubins";
      
      q[3][0]="4.Who Invented Google?";
      q[3][1]="Larry Page";
      q[3][2]="Bell";
      q[3][3]="Dell";
      q[3][4]="Sun Micros";
      
      q[4][0]="5.In which year 2000 rupess notes came into use?";
      q[4][1]="2017";
      q[4][2]="2016";
      q[4][3]="2014";
      q[4][4]="2020";
      
      q[5][0]="6.CEO of Google?";
      q[5][1]="Sundar Pichai";
      q[5][2]="Satyam Nadella";
      q[5][3]="Steve Jobs";
      q[5][4]="Larry Page";
      
      q[6][0]="7.What is the capital of india?";
      q[6][1]="New delhi";
      q[6][2]="Hyderabad";
      q[6][3]="Mumbai";
      q[6][4]="Amaravathi";
      
      q[7][0]="8.Sun raises in the east?";
      q[7][1]="TRUE";
      q[7][2]="FALSE";
      q[7][3]="Hypotetical";
      q[7][4]="None";
      
      q[8][0]="9.Who is CEO of TESLA?";
      q[8][1]="Bill Gates";
      q[8][2]="Elon Musk";
      q[8][3]="Jeff Bezos";
      q[8][4]="Warren Buffet";
      
      q[9][0]="10.Who is the CEO of FB?";
      q[9][1]="Billgates";
      q[9][2]="Mark";
      q[9][3]="Rahul gandhi";
      q[9][4]="Elon Musk";
      //Answers are stored in a[][]
      a=new String[10][5];/*Answers Array*/
      a[0][1]="365";
      a[1][1]="Dennis Ritchie";
      a[2][1]="Modi";
      a[3][1]="Larry Page";
      a[4][1]="2016";
      a[5][1]="Sundar Pichai";
      a[6][1]="New delhi";
      a[7][1]="TRUE";
      a[8][1]="Elon Musk";
      a[9][1]="Mark";
     


      start(0);
	}
	 
	 public String[][] qarray() {
	        return q.clone();
	    }
	 public String[][] ansarray() {
	        return a.clone();
	    }
	private void Game()
	{	
		setTitle("QUIZ:Questions");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		opg=new ButtonGroup();
		op1=new JRadioButton();
		op2=new JRadioButton();
		op3=new JRadioButton();
		op4=new JRadioButton();
		question=new JLabel();
		username=new JLabel();
		separator=new JSeparator();
		Next=new JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


     
        opg.add(op1);
        op1.setText("option1");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1Selected(evt);
            }

		
        });

        opg.add(op2);
        op2.setText("option2");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2selected(evt);
            }

		
        });

        opg.add(op3);
        op3.setText("option3");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3selected(evt);
            }

        });

        opg.add(op4);
        op4.setText("option4");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4selected(evt);
            }

			
        });

        question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question.setText("question");
       
        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextClicked(evt);
            }

        });
      
	
	//GUI
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(op1)
                    .addComponent(op3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(op2)
                    .addComponent(op4))
                .addGap(60, 60, 60))
            .addComponent(separator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                    		
                        .addComponent(question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(username)
                        .addGap(642, 642, 642)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Next, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                   )
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(Next))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                	
                    .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                 )
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op1)
                    .addComponent(op2))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op3)
                    .addComponent(op4))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addContainerGap())
        );

	pack();
	}    


	protected void NextClicked(ActionEvent evt) {
		
		
		if(getSelectedButtonText(opg)==a[c][1]) {
			score++;
			count++;
			c++;
		}
		else
		{
			c++;
			count++;
		}
			if(c!=10)
		{
			start(c);
		System.out.println(score);
		}
		else {
			System.out.println(score);
			new Results().setVisible(true);
			this.dispose();
		}
	}
	protected void op4selected(ActionEvent evt) {
	
		
	}
	protected void op3selected(ActionEvent evt) {
	
		
	}
	protected void op2selected(ActionEvent evt) {
		
		
	}
	protected void op1Selected(ActionEvent evt) {
	
		
	}
	String getSelectedButtonText(ButtonGroup buttonGroup) {
		    for (Enumeration buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
		        AbstractButton button = (AbstractButton) buttons.nextElement();

		        if (button.isSelected()) {
		            return button.getText();
		        }
		    }
		    return null;
	}
	public void start(int i) {
		
		 question.setText(q[i][0]);
	        op1.setText(q[i][1]);
	        op2.setText(q[i][2]);
	        op3.setText(q[i][3]);
	        op4.setText(q[i][4]);
	        opg.clearSelection();


		
	}
	private static String format(int i) {
        String result = String.valueOf(i);
        if (result.length() == 1) {
            result = "0" + result;
        }
        return result;
    }
	

		 }

