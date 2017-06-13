package Quiz;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

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
   private JButton btnHint;
   private JPanel imagePanel;
   /**
    * Launch the application.
    */
   /*Quiz2 is about encapsulation*/
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
      setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      setBounds(100, 100, 839, 702);
      contentPane = new JPanel();
      contentPane.setBackground(KoreanChess.c);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      
      JLabel lblQuiz = new JLabel("Quiz2");
      lblQuiz.setForeground(Color.BLUE);
      lblQuiz.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 24));
      
      textField = new JTextField();
      textField.setHorizontalAlignment(SwingConstants.CENTER);
      textField.setColumns(10);
      textField.setEditable(false);
      
      JLabel lblNewLabel = new JLabel("means that we hide instance variables and provide methods for accessing and changing them.");
      lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
      
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
      
      JButton btnHint = new JButton("Hint");
      btnHint.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		imagePanel.setVisible(true);
      	}
      });
      

	  imagePanel = new JPanel();
      imagePanel.setBackground(KoreanChess.c);
      BufferedImage myPicture;
      try {
		myPicture = ImageIO.read(new File("reencapsulation.png"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
         imagePanel.add(picLabel);
      
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
         
      imagePanel.setVisible(false);
      GroupLayout gl_contentPane = new GroupLayout(contentPane);
      gl_contentPane.setHorizontalGroup(
      	gl_contentPane.createParallelGroup(Alignment.LEADING)
      		.addGroup(gl_contentPane.createSequentialGroup()
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addGap(324)
      					.addComponent(lblQuiz))
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addContainerGap()
      					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
      					.addPreferredGap(ComponentPlacement.RELATED)
      					.addComponent(lblNewLabel))
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addGap(37)
      					.addComponent(lblanswerMustBe))
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addGap(28)
      					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      						.addComponent(lblEncapsulation)
      						.addComponent(lblObject)
      						.addComponent(lblcomposition)
      						.addComponent(lblGui))
      					.addGap(45)
      					.addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addGap(619)
      					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      						.addGroup(gl_contentPane.createSequentialGroup()
      							.addComponent(btnHint)
      							.addGap(18)
      							.addComponent(btnCheck))
      						.addGroup(gl_contentPane.createSequentialGroup()
      							.addComponent(lblAnswer)
      							.addPreferredGap(ComponentPlacement.UNRELATED)
      							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))))
      			.addContainerGap())
      );
      gl_contentPane.setVerticalGroup(
      	gl_contentPane.createParallelGroup(Alignment.LEADING)
      		.addGroup(gl_contentPane.createSequentialGroup()
      			.addGap(12)
      			.addComponent(lblQuiz)
      			.addGap(34)
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
      				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
      				.addComponent(lblNewLabel))
      			.addGap(7)
      			.addComponent(lblanswerMustBe)
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
      				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
      					.addGap(14)
      					.addComponent(lblEncapsulation)
      					.addGap(18)
      					.addComponent(lblObject)
      					.addGap(18)
      					.addComponent(lblcomposition)
      					.addGap(18)
      					.addComponent(lblGui))
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addPreferredGap(ComponentPlacement.RELATED)
      					.addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)))
      			.addPreferredGap(ComponentPlacement.UNRELATED)
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
      				.addComponent(lblAnswer)
      				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
      			.addGap(31)
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
      				.addComponent(btnHint)
      				.addComponent(btnCheck))
      			.addGap(46))
      );
      contentPane.setLayout(gl_contentPane);
   }
}
