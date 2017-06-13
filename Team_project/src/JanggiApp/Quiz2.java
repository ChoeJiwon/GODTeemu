package JanggiApp;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz2 extends JFrame {

   private JPanel contentPane;
   private JTextField textField;
   private JLabel lblEncapsulation;
   private JLabel lblObject;
   private JLabel lblcomposition;
   private JLabel lblGui;
   private JTextField textField_1;
   private JLabel lblAnswer;
   private JButton btnCheck;
   private JLabel lblanswerMustBe;
   private Answer a=new Answer();
   /**
    * Launch the application.
    */
   public void go() {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Quiz2 frame = new Quiz2();
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
   public Quiz2() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 757, 505);
      contentPane = new JPanel();
      contentPane.setBackground(KoreanChess.c);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      
      JLabel lblQuiz = new JLabel("Quiz2");
      lblQuiz.setForeground(Color.BLUE);
      lblQuiz.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 24));
      
      textField = new JTextField();
      textField.setColumns(10);
      textField.setEditable(false);
      
      JLabel lblNewLabel = new JLabel("means that we hide instance variables and provide methods for accessing and changing them.");
      
      lblEncapsulation = new JLabel("1. encapsulation");
      
      lblObject = new JLabel("2. object");
      
      lblcomposition = new JLabel("3. composition");
      
      lblGui = new JLabel("4. gui");
      
      textField_1 = new JTextField();
      textField_1.setColumns(10);
      
      lblAnswer = new JLabel("Answer: ");
      
      btnCheck = new JButton("Check");
      btnCheck.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 try{
              	  a.setAnswer(Integer.parseInt(textField_1.getText()));
              	  if(a.getAnswer()==1){
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
      
      lblanswerMustBe = new JLabel("(Answer must be written in number!!)");
      GroupLayout gl_contentPane = new GroupLayout(contentPane);
      gl_contentPane.setHorizontalGroup(
         gl_contentPane.createParallelGroup(Alignment.TRAILING)
            .addGroup(gl_contentPane.createSequentialGroup()
               .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                  .addGroup(gl_contentPane.createSequentialGroup()
                     .addGap(324)
                     .addComponent(lblQuiz))
                  .addGroup(gl_contentPane.createSequentialGroup()
                     .addGap(28)
                     .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addComponent(lblGui)
                        .addComponent(lblcomposition)
                        .addComponent(lblObject)
                        .addComponent(lblEncapsulation))
                     .addPreferredGap(ComponentPlacement.RELATED))
                  .addGroup(gl_contentPane.createSequentialGroup()
                     .addContainerGap()
                     .addComponent(textField, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(lblNewLabel)))
               .addContainerGap())
            .addGroup(gl_contentPane.createSequentialGroup()
               .addContainerGap(549, Short.MAX_VALUE)
               .addComponent(lblAnswer)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
               .addGap(55))
            .addGroup(gl_contentPane.createSequentialGroup()
               .addContainerGap(637, Short.MAX_VALUE)
               .addComponent(btnCheck)
               .addGap(32))
            .addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
               .addGap(37)
               .addComponent(lblanswerMustBe)
               .addContainerGap(465, Short.MAX_VALUE))
      );
      gl_contentPane.setVerticalGroup(
         gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
               .addContainerGap()
               .addComponent(lblQuiz)
               .addGap(34)
               .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                  .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(lblNewLabel))
               .addGap(17)
               .addComponent(lblanswerMustBe)
               .addGap(40)
               .addComponent(lblEncapsulation)
               .addGap(18)
               .addComponent(lblObject)
               .addGap(18)
               .addComponent(lblcomposition)
               .addGap(18)
               .addComponent(lblGui)
               .addGap(56)
               .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                  .addComponent(lblAnswer)
                  .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(31)
               .addComponent(btnCheck)
               .addContainerGap())
      );
      contentPane.setLayout(gl_contentPane);
   }
}
