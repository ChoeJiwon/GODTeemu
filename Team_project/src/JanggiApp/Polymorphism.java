package JanggiApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Polymorphism extends JFrame {

   private JPanel contentPane;

   /**
    * Launch the application.
    */
   public void go() {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Polymorphism frame = new Polymorphism();
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
   public Polymorphism() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 919, 646);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setBackground(KoreanChess.c);
      
      JLabel lblPolymorphism = new JLabel("Polymorphism");
      lblPolymorphism.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 24));
      lblPolymorphism.setForeground(Color.BLUE);
      lblPolymorphism.setBackground(KoreanChess.c);
      
      JButton btnNewButton = new JButton("Start Janggi!");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            dispose();
            Board i=new Board();
            i.go();
         }
      });
      
      JTextArea txtrInProgrammingLanguages = new JTextArea();
      txtrInProgrammingLanguages.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
      txtrInProgrammingLanguages.setBackground(KoreanChess.c);
      txtrInProgrammingLanguages.setText("In programming languages and type theory, polymorphism (from Greek polys, \\\"many, much\\\" and, morphe, \\\"form, shape\\\") is the provision of a single interface to entities of different types. A polymorphic type is one whose operations can also be applied to values of some other type, or types. There are several fundamentally different kinds of polymorphism.");
      txtrInProgrammingLanguages.setLineWrap(true);
      txtrInProgrammingLanguages.setEditable(false);
      
      JPanel imagePanel = new JPanel();
      imagePanel.setBackground(KoreanChess.c);
      
      BufferedImage myPicture;
      BufferedImage myPicture2;
      try {
         myPicture = ImageIO.read(new File("polymorphism1.png"));
         myPicture2 = ImageIO.read(new File("polymorphism2.png"));
         
         JLabel picLabel = new JLabel(new ImageIcon(myPicture));
         JLabel picLabel2 = new JLabel(new ImageIcon(myPicture2));
         imagePanel.add(picLabel);
         imagePanel.add(picLabel2);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      GroupLayout gl_contentPane = new GroupLayout(contentPane);
      gl_contentPane.setHorizontalGroup(
         gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
               .addContainerGap(268, Short.MAX_VALUE)
               .addComponent(lblPolymorphism)
               .addGap(213)
               .addComponent(btnNewButton)
               .addGap(40))
            .addComponent(txtrInProgrammingLanguages, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imagePanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
      );
      gl_contentPane.setVerticalGroup(
         gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
               .addContainerGap()
               .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                  .addComponent(btnNewButton)
                  .addComponent(lblPolymorphism))
               .addGap(18)
               .addComponent(txtrInProgrammingLanguages, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
               .addContainerGap())
      );
      contentPane.setLayout(gl_contentPane);
   }
}