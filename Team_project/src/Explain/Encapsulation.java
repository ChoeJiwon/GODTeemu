package Explain;

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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Encapsulation extends JFrame {

   private JPanel contentPane;

   /**
    * Launch the application.
    */
   
   /*Running GUI*/
   public void go(){
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Encapsulation frame = new Encapsulation();
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
   public Encapsulation() {
      
      /*Make Panel in Encapsulation Frame and decorate Panel(contentPane)*/
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 920, 737);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setBackground(KoreanChess.c);
      
      /*Make Panel in Encapsulation Frame and decorate Panel(imagePanel) to insert an image*/
      JPanel imagePanel = new JPanel();
      imagePanel.setBackground(KoreanChess.c);
      
      
      /*image to explain Encapsulation and insert an image*/
      BufferedImage myPicture;
      try {
         myPicture = ImageIO.read(new File("Explain\\encapsulation.png"));
         
         JLabel picLabel = new JLabel(new ImageIcon(myPicture));
         imagePanel.add(picLabel);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      /*set contentpane layout(group layout)*/
      GroupLayout gl_contentPane = new GroupLayout(contentPane);
      gl_contentPane.setHorizontalGroup(
         gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
               .addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
               .addGap(12))
      );
      gl_contentPane.setVerticalGroup(
         gl_contentPane.createParallelGroup(Alignment.TRAILING)
            .addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
               .addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
               .addContainerGap())
      );
      contentPane.setLayout(gl_contentPane);
   }
}