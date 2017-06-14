package Quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Menu.KoreanChess;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
   private JPanel imagePanel;

   /**
    * Launch the application.
    */
   /*Quiz1 is about polymorphism*/
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
	  /*Frame setting*/
      setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      setBounds(100, 100, 696, 478);
      
      /*Make Panel in Quiz1 Frame and decorate Panel(contentPane)*/
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setBackground(KoreanChess.c);
      setContentPane(contentPane);
      
      /*Make label in Panel(contentPane)*/
      JLabel lblQuiz = new JLabel("Quiz1");
      lblQuiz.setForeground(Color.BLUE);
      lblQuiz.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 24));
      
      
      lblIs = new JLabel("means that a reference variable and the object ,it refers to can be different types.");
      
      lblInheritance = new JLabel("1. inheritance");
      
      lblNewLabel = new JLabel("2. polymorphism");
      
      lblEncapsulation = new JLabel("3. encapsulation");
      
      lblJanggi = new JLabel("4. Janggi");
      
      lblanswerMustBe = new JLabel("(Answer must be written in number!!)");
      
      
      /*Make TextField in Panel(contentPane)*/
      textField = new JTextField();
      textField.setColumns(10);
      textField.setEditable(false);
      
      textField_1 = new JTextField();
      textField_1.setColumns(10);
      JLabel lblAnswer = new JLabel("Answer :");
      
      
      /*Make Button in Panel(contentPane)*/
      btnCheck = new JButton("Check");
      btnCheck.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try{
                a.setAnswer(Integer.parseInt(textField_1.getText()));
                if(a.getAnswer()==2){   //You select correct answer
                   JOptionPane.showMessageDialog(null, "Your answer is correct!");
                   dispose();
                }
                else{ //You select wrong answer
                 JOptionPane.showMessageDialog(null, "Your answer is wrong");
                }
             }catch(NumberFormatException e2){  //You don't write number
                JOptionPane.showMessageDialog(null, "Answer must be written in number!!");
             }
         }
      });
      
      JButton btnHint = new JButton("Hint");
      btnHint.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		imagePanel.setVisible(true);         //When you push "Hint" button, imagePanel is setVisble!
      	}
      });
      

      /*Make Panel in Quiz1 Frame and decorate,set Panel(imagePanel)*/
	  imagePanel = new JPanel();
      imagePanel.setBackground(KoreanChess.c);
      BufferedImage myPicture;
      try {
		myPicture = ImageIO.read(new File("Quiz\\polymorphism1.png"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
         imagePanel.add(picLabel);
      
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
      imagePanel.setVisible(false);
      
      
      /*Add label,textField,Button to Panel*/
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
      						.addGroup(gl_contentPane.createSequentialGroup()
      							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      								.addComponent(lblJanggi)
      								.addComponent(lblEncapsulation)
      								.addComponent(lblNewLabel)
      								.addComponent(lblInheritance))
      							.addPreferredGap(ComponentPlacement.RELATED)
      							.addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)))))
      			.addGap(20))
      		.addGroup(gl_contentPane.createSequentialGroup()
      			.addContainerGap(472, Short.MAX_VALUE)
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
      				.addComponent(btnHint)
      				.addComponent(lblAnswer))
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addGap(27)
      					.addComponent(btnCheck))
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addGap(18)
      					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)))
      			.addGap(39))
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
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addGap(25)
      					.addComponent(lblInheritance)
      					.addGap(18)
      					.addComponent(lblNewLabel)
      					.addGap(18)
      					.addComponent(lblEncapsulation)
      					.addGap(18)
      					.addComponent(lblJanggi))
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addPreferredGap(ComponentPlacement.UNRELATED)
      					.addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
      			.addPreferredGap(ComponentPlacement.RELATED)
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
      				.addComponent(lblAnswer)
      				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
      			.addPreferredGap(ComponentPlacement.UNRELATED)
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
      				.addComponent(btnCheck)
      				.addComponent(btnHint)))
      );
      contentPane.setLayout(gl_contentPane);
   }
}