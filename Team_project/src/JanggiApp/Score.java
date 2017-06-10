package JanggiApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Score extends JFrame {

   private JPanel contentPane;
   private JLabel lblgame,lblintro;
   private JLabel label;
   JButton btnCheckScore;
   JTextArea textArea,textArea_1;
   private JTextField textField;
   private JTextField textField_1;

   /**
    * Launch the application.
    */
   public void go(){
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Score frame = new Score();
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
   public Score() {
      Player p=new Player();
      setTitle("Score");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 594, 568);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setBackground(KoreanChess.c);
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      lblgame = new JLabel("OOP WITH GAME");
      lblgame.setForeground(new Color(160, 82, 45));
      lblgame.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 50));
      lblgame.setBounds(14, 12, 548, 71);
      lblgame.setHorizontalAlignment(SwingConstants.CENTER);
      
      lblintro = new JLabel("PRODUCTION BY TEEMU WARRIOUS");
      lblintro.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 20));
      lblintro.setForeground(new Color(169, 169, 169));
      lblintro.setBounds(121, 459, 326, 18);
      
      label = new JLabel(":");
      label.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 23));
      
      btnCheckScore = new JButton("Check Name and Score");
      btnCheckScore.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            JFileChooser fc=new JFileChooser();
            int result=fc.showOpenDialog(Score.this);           
            
            if(result==JFileChooser.APPROVE_OPTION){
               File f=fc.getSelectedFile();
               
               try {
                  FileInputStream fis=new FileInputStream(f);
                  ObjectInputStream ois=new ObjectInputStream(fis);
                  
                  Object o1=ois.readObject();
                  
                  if(o1 instanceof PlayerScore){
                     PlayerScore ps=(PlayerScore) o1;
                     
                     textArea.setText(Integer.toString(ps.getPlayer1score()));
                     textArea_1.setText(Integer.toString(ps.getPlayer2score()));
                     textField.setText(ps.getPlayer1Name());
                     textField_1.setText(ps.getPlayer2Name());
                     
                  }
                  
                  
               } catch (FileNotFoundException fe) {
                  // TODO Auto-generated catch block
                  fe.printStackTrace();
               } catch (IOException fe) {
                  // TODO Auto-generated catch block
                  fe.printStackTrace();
               } catch (ClassNotFoundException fe) {
                  // TODO Auto-generated catch block
                  fe.printStackTrace();
               }
            }
         }
      });
      
      textArea = new JTextArea();
      
      textArea_1 = new JTextArea();
      
      textField = new JTextField();
      textField.setColumns(10);
      
      textField_1 = new JTextField();
      textField_1.setColumns(10);
      
         
      GroupLayout gl_contentPane = new GroupLayout(contentPane);
      gl_contentPane.setHorizontalGroup(
      	gl_contentPane.createParallelGroup(Alignment.LEADING)
      		.addGroup(gl_contentPane.createSequentialGroup()
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
      					.addGroup(gl_contentPane.createSequentialGroup()
      						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
      						.addGap(43)
      						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
      						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      							.addGroup(gl_contentPane.createSequentialGroup()
      								.addPreferredGap(ComponentPlacement.RELATED)
      								.addComponent(lblintro))
      							.addGroup(gl_contentPane.createSequentialGroup()
      								.addGap(37)
      								.addComponent(label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
      								.addGap(40)
      								.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))))
      					.addGroup(gl_contentPane.createSequentialGroup()
      						.addGap(9)
      						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
      							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
      							.addComponent(lblgame, GroupLayout.PREFERRED_SIZE, 548, GroupLayout.PREFERRED_SIZE))))
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addGap(197)
      					.addComponent(btnCheckScore)))
      			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      gl_contentPane.setVerticalGroup(
      	gl_contentPane.createParallelGroup(Alignment.LEADING)
      		.addGroup(gl_contentPane.createSequentialGroup()
      			.addGap(7)
      			.addComponent(lblgame, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
      			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
      						.addGroup(gl_contentPane.createSequentialGroup()
      							.addPreferredGap(ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
      							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
      								.addComponent(label, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
      								.addComponent(textArea, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
      								.addComponent(textArea_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
      							.addGap(67))
      						.addGroup(gl_contentPane.createSequentialGroup()
      							.addPreferredGap(ComponentPlacement.RELATED)
      							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
      							.addGap(78)))
      					.addGap(1)
      					.addComponent(btnCheckScore)
      					.addGap(125))
      				.addGroup(gl_contentPane.createSequentialGroup()
      					.addGap(159)
      					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
      			.addComponent(lblintro, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
      );
      contentPane.setLayout(gl_contentPane);
   }
   }
