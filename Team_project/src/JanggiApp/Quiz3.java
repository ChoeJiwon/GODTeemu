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

public class Quiz3 extends JFrame {

   private JPanel contentPane;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private Answer a=new Answer();
   /**
    * Launch the application.
    */
   public void go() {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Quiz3 frame = new Quiz3();
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
   public Quiz3() {
      setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      setBounds(100, 100, 642, 505);
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
      
      JLabel lblNewLabel = new JLabel(", Subclasses extend a Superclass. What is ");
      
      JLabel lblIn = new JLabel("In");
      
      textField_1 = new JTextField();
      textField_1.setColumns(10);
      textField_1.setEditable(false);
      
      JLabel label = new JLabel("?");
      
      JLabel lblNewLabel_1 = new JLabel("1. composition");
      
      JLabel lblInterface = new JLabel("2. interface");
      
      JLabel lblInheritance = new JLabel("3. inheritance");
      
      JLabel lblGui = new JLabel("4. gui");
      
      JLabel lblAnswer = new JLabel("Answer :");
      
      textField_2 = new JTextField();
      textField_2.setColumns(10);
      
      JButton btnCheck = new JButton("Check");
      btnCheck.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 try{
              	  a.setAnswer(Integer.parseInt(textField_1.getText()));
              	  if(a.getAnswer()==3){
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
      GroupLayout gl_contentPane = new GroupLayout(contentPane);
      gl_contentPane.setHorizontalGroup(
         gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
               .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                  .addGroup(gl_contentPane.createSequentialGroup()
                     .addGap(24)
                     .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addComponent(lblInterface)
                        .addComponent(lblNewLabel_1)
                        .addComponent(lblInheritance)
                        .addComponent(lblGui)))
                  .addGroup(gl_contentPane.createSequentialGroup()
                     .addGap(265)
                     .addComponent(lblQuiz))
                  .addGroup(gl_contentPane.createSequentialGroup()
                     .addGap(48)
                     .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                           .addComponent(lblIn)
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addComponent(textField, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addComponent(lblNewLabel)
                           .addPreferredGap(ComponentPlacement.RELATED)
                           .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                        .addGroup(gl_contentPane.createSequentialGroup()
                           .addComponent(lblAnswer)
                           .addGap(18)
                           .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                              .addComponent(btnCheck)
                              .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))))
                     .addPreferredGap(ComponentPlacement.RELATED)
                     .addComponent(label)))
               .addContainerGap(50, Short.MAX_VALUE))
      );
      gl_contentPane.setVerticalGroup(
         gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
               .addGap(30)
               .addComponent(lblQuiz)
               .addGap(29)
               .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                  .addComponent(lblIn)
                  .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(lblNewLabel)
                  .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(label))
               .addGap(32)
               .addComponent(lblNewLabel_1)
               .addGap(18)
               .addComponent(lblInterface)
               .addGap(18)
               .addComponent(lblInheritance)
               .addGap(18)
               .addComponent(lblGui)
               .addGap(81)
               .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                  .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(lblAnswer))
               .addGap(18)
               .addComponent(btnCheck)
               .addContainerGap(30, Short.MAX_VALUE))
      );
      contentPane.setLayout(gl_contentPane);
   }
}
