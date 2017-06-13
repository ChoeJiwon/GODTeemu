package JanggiApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz1 extends JFrame {

   private JPanel contentPane;
   private JTextField textField;
   private JLabel lblIs;
   private JLabel lblInheritance;
   private JLabel lblNewLabel;
   private JLabel lblEncapsulation;
   private JLabel lblJanggi;
   private JLabel lblanswerMustBe;
   private JTextField textField_1;
   private JButton btnCheck;
   private Answer a = new Answer();

   /**
    * Launch the application.
    */
   public void go() {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Quiz1 frame = new Quiz1();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public Quiz1() {
      setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      setBounds(100, 100, 696, 478);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setBackground(KoreanChess.c);
      setContentPane(contentPane);
      
      JLabel lblQuiz = new JLabel("Quiz1");
      lblQuiz.setForeground(Color.BLUE);
      lblQuiz.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 24));
      
      textField = new JTextField();
      textField.setColumns(10);
      textField.setEditable(false);
      
      lblIs = new JLabel("means that a reference variable and the object it refers to can be different types.");
      
      lblInheritance = new JLabel("1. inheritance");
      
      lblNewLabel = new JLabel("2. polymorphism");
      
      lblEncapsulation = new JLabel("3. encapsulation");
      
      lblJanggi = new JLabel("4. Janggi");
      
      lblanswerMustBe = new JLabel("(Answer must be written in number!!)");
      
      textField_1 = new JTextField();
      textField_1.setColumns(10);
      JLabel lblAnswer = new JLabel("Answer :");
      
      btnCheck = new JButton("Check");
      btnCheck.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 try{
           	  a.setAnswer(Integer.parseInt(textField_1.getText()));
           	  if(a.getAnswer()==2){
           		  JOptionPane.showMessageDialog(null, "Your answer is correct!");
           		  dispose();
           	  }
           	  else{
           		JOptionPane.showMessageDialog(null, "Your answer is wrong");
           	  }
             }catch(NumberFormatException e2){
           	  JOptionPane.showMessageDialog(null, "Answer must be written in number!!");
             }
         }
      });
      
      JButton btnHint = new JButton("Hint");
      btnHint.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      	}
      });
      
      GroupLayout gl_contentPane = new GroupLayout(contentPane);
      gl_contentPane.setHorizontalGroup(
      	gl_contentPane.createParallelGroup(Alignment.TRAILING)
      		.addGroup(gl_contentPane.createSequentialGroup()
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addContainerGap()
      					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
      					.addPreferredGap(ComponentPlacement.UNRELATED)
      					.addComponent(lblIs))
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addGap(281)
      					.addComponent(lblQuiz))
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addGap(32)
      					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      						.addComponent(lblanswerMustBe)
      						.addComponent(lblJanggi)
      						.addComponent(lblEncapsulation)
      						.addComponent(lblNewLabel)
      						.addComponent(lblInheritance))))
      			.addContainerGap(20, Short.MAX_VALUE))
      		.addGroup(gl_contentPane.createSequentialGroup()
      			.addContainerGap(424, Short.MAX_VALUE)
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addComponent(lblAnswer)
      					.addGap(18))
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addComponent(btnHint)
      					.addPreferredGap(ComponentPlacement.UNRELATED)))
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      				.addComponent(btnCheck)
      				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
      			.addGap(52))
      );
      gl_contentPane.setVerticalGroup(
      	gl_contentPane.createParallelGroup(Alignment.LEADING)
      		.addGroup(gl_contentPane.createSequentialGroup()
      			.addContainerGap()
      			.addComponent(lblQuiz)
      			.addGap(34)
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
      				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
      				.addComponent(lblIs))
      			.addGap(9)
      			.addComponent(lblanswerMustBe)
      			.addGap(25)
      			.addComponent(lblInheritance)
      			.addGap(18)
      			.addComponent(lblNewLabel)
      			.addGap(18)
      			.addComponent(lblEncapsulation)
      			.addGap(18)
      			.addComponent(lblJanggi)
      			.addPreferredGap(ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
      				.addComponent(lblAnswer)
      				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
      			.addGap(27)
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
      				.addComponent(btnCheck)
      				.addComponent(btnHint))
      			.addContainerGap())
      );
      contentPane.setLayout(gl_contentPane);
   }
}