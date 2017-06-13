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
      setBounds(100, 100, 919, 650);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setBackground(KoreanChess.c);
      
      JPanel imagePanel = new JPanel();
      imagePanel.setBackground(KoreanChess.c);
      
      BufferedImage myPicture;
      try {
         myPicture = ImageIO.read(new File("polymorphism.png"));
         
         JLabel picLabel = new JLabel(new ImageIcon(myPicture));
         imagePanel.add(picLabel);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      JButton btnNewButton = new JButton("Start Janggi!");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            dispose();
            Board i=new Board();
            i.go();
         }
      });
      GroupLayout gl_contentPane = new GroupLayout(contentPane);
      gl_contentPane.setHorizontalGroup(
      	gl_contentPane.createParallelGroup(Alignment.TRAILING)
      		.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
      			.addGap(386)
      			.addComponent(btnNewButton)
      			.addContainerGap(403, Short.MAX_VALUE))
      		.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
      			.addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
      			.addGap(12))
      );
      gl_contentPane.setVerticalGroup(
      	gl_contentPane.createParallelGroup(Alignment.LEADING)
      		.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
      			.addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
      			.addGap(18)
      			.addComponent(btnNewButton)
      			.addContainerGap())
      );
      contentPane.setLayout(gl_contentPane);
   }
}