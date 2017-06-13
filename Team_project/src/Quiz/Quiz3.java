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

public class Quiz3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Answer a = new Answer();
	private JPanel imagePanel;

	/**
	 * Launch the application.
	 */
	/*Quiz3 is about inheritance*/
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
		 /*Frame setting*/
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 783, 785);
		
		
		/*Make Panel in Quiz1 Frame and decorate Panel(contentPane)*/
		contentPane = new JPanel();
		contentPane.setBackground(KoreanChess.c);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		/*Make label in Panel(contentPane)*/
		JLabel lblQuiz = new JLabel("Quiz3");
		lblQuiz.setForeground(Color.BLUE);
		lblQuiz.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 24));

		JLabel lblNewLabel = new JLabel(", Subclasses extend a Superclass. What is ");

		JLabel lblIn = new JLabel("In");

		JLabel label = new JLabel("?");

		JLabel lblNewLabel_1 = new JLabel("1. composition");

		JLabel lblInterface = new JLabel("2. interface");

		JLabel lblInheritance = new JLabel("3. inheritance");

		JLabel lblGui = new JLabel("4. gui");

		JLabel lblAnswer = new JLabel("Answer :");
		
		
		/*Make TextField in Panel(contentPane)*/
		textField = new JTextField();
		textField.setColumns(10);
		textField.setEditable(false);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setEditable(false);

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		
		/*Make Button in Panel(contentPane)*/
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					a.setAnswer(Integer.parseInt(textField_2.getText()));
					if (a.getAnswer() == 3) {  //You select correct answer
						JOptionPane.showMessageDialog(null, "Your answer is correct!");
						dispose();
					} else {  //You select wrong answer
						JOptionPane.showMessageDialog(null, "Your answer is wrong");
					}
				} catch (NumberFormatException e2) { //You don't write number 
					JOptionPane.showMessageDialog(null, "Answer must be written in number!!");
				}
			}
		});
		
		JButton btnHint = new JButton("Hint");
		btnHint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imagePanel.setVisible(true);  //When you push "Hint" button, imagePanel is setVisble!
			}
		});
		
		
		 /*Make Panel in Quiz1 Frame and decorate,set Panel(imagePanel)*/
		  imagePanel = new JPanel();
	      imagePanel.setBackground(KoreanChess.c);
	      BufferedImage myPicture;
	      try {
			myPicture = ImageIO.read(new File("Quiz\\inheritance4.png"));
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
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(48)
								.addComponent(lblIn)
								.addGap(6)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(lblNewLabel)
								.addGap(6)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(label))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(24)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_1)
									.addComponent(lblInterface)
									.addComponent(lblInheritance)
									.addComponent(lblGui))
								.addGap(18)
								.addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE))
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(lblAnswer)
								.addGap(18)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(btnHint)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnCheck)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(305)
							.addComponent(lblQuiz)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addComponent(lblQuiz)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblIn))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label)))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(18)
							.addComponent(lblInterface)
							.addGap(18)
							.addComponent(lblInheritance)
							.addGap(18)
							.addComponent(lblGui))
						.addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAnswer))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCheck)
						.addComponent(btnHint))
					.addGap(31))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
