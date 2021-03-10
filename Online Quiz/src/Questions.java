import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.SequentialGroup;
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
 * @author SriL3kh@ and G0v@rdhan
 *
 */

public class Questions extends JFrame 
{
	
	private JPanel contentPane; 
	private JButton Next;
	private JButton Back;
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
	static String usernameq;
	
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
      q[0][0]="how many days in an year?";
      q[0][1]="two hundred";
      q[0][2]="threehundred sixtyfive";
      q[0][3]="hundred";
      q[0][4]="four hundred";
      
      q[1][0]="Who Invented C?";
      q[1][1]="Microsoft";
      q[1][2]="Bell";
      q[1][3]="Dennis Ritchie";
      q[1][4]="Sun Micros";
      
      q[2][0]="who is the pm of india?";
      q[2][1]="nehuru";
      q[2][2]="modi";
      q[2][3]="abdul kalam";
      q[2][4]="Andy Rubins";
      
      q[3][0]="Who Invented Google?";
      q[3][1]="Larry Page";
      q[3][2]="Bell";
      q[3][3]="Dell";
      q[3][4]="Sun Micros";
      
      q[4][0]="in which year 2000 rupess notes came into use?";
      q[4][1]="twothousand seventeen";
      q[4][2]="twothousand sixteen";
      q[4][3]="ninteen fiftyfive ";
      q[4][4]="ninteen ninty five";
      
      q[5][0]="CEO of Google?";
      q[5][1]="Sundar Pichai";
      q[5][2]="Satyam";
      q[5][3]="Steeve Jobs";
      q[5][4]="Larry Page";
      
      q[6][0]="what is the capital of india?";
      q[6][1]="new delhi";
      q[6][2]="hyderabad";
      q[6][3]="mumbai";
      q[6][4]="amaravathi";
      
      q[7][0]="sun raises in the east?";
      q[7][1]="TRUE";
      q[7][2]="FALSE";
      q[7][3]="hypotetical";
      q[7][4]="None";
      
      q[8][0]="Who has written this code?";
      q[8][1]="Bill Gates";
      q[8][2]="srilekha";
      q[8][3]="Student";
      q[8][4]="Professor";
      
      q[9][0]="Who is the ceo of fb?";
      q[9][1]="billgates";
      q[9][2]="mark";
      q[9][3]="rahul gandhi";
      q[9][4]="nagarjuna";
      //Answers are stored in a[][]
      a=new String[10][5];
      a[0][1]="threehundred sixtyfive";
      a[1][1]="Dennis Ritchie";
      a[2][1]="modi";
      a[3][1]="Larry Page";
      a[4][1]="twothousand sixteen";
      a[5][1]="Sundar Pichai";
      a[6][1]="new delhi";
      a[7][1]="TRUE";
      a[8][1]="srilekha";
      a[9][1]="mark";
     


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
		setTitle("l3kh@_QUIZ:Questions");
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
	Back=new JButton();
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
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //BackClicked(evt);
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
                    .addComponent(op4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(op2)
                    .addComponent(op3))
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
                  .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(( layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)	
                    .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(Back))
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op2)
                    .addComponent(op4))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op1)
                   .addComponent(op3))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
              .addContainerGap())
       );

	pack();
	}    

	

/*	protected void BackClicked(ActionEvent evt) {
	
		if(c==0) {
			
		}else {
			if(score==c)
			{
		score--;
		c--;
		start(c);
			}
			else {
				c--;
				start(c);
			}
		}
		
	}*/
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
