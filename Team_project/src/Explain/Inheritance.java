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
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Inheritance extends JFrame {

   private JPanel contentPane;
   private Polymorphism p;

   /**
    * Launch the application.
    */
   
   /*Running GUI*/
   public void go(){
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Inheritance frame = new Inheritance();
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
   public Inheritance() {
      
      /*Make Panel in Inheritance Frame and decorate Panel(contentPane)*/
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 920, 737);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setBackground(KoreanChess.c);
      
      /*Make Panel in Inheritance Frame and decorate Panel(imagePanel) to insert an image*/
      JPanel imagePanel = new JPanel();
      imagePanel.setBackground(KoreanChess.c);
      
      
      /*image to explain inheritance and insert an image*/
      BufferedImage myPicture;
      try {
         myPicture = ImageIO.read(new File("inheritance.png"));
         
         JLabel picLabel = new JLabel(new ImageIcon(myPicture));
         imagePanel.add(picLabel);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      
      JButton btnNewButton = new JButton("Next"); //button to start Janggi game
      
      /*button action listener to go over to Polymorphism explainment screen*/
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            dispose();
            p=new Polymorphism();
            p.go();
         }
      });
      
      /*set contentpane layout(group layout) and add button in contentpane*/
      GroupLayout gl_contentPane = new GroupLayout(contentPane);
      gl_contentPane.setHorizontalGroup(
         gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
               .addGap(386)
               .addComponent(btnNewButton)
               .addContainerGap(404, Short.MAX_VALUE))
            .addGroup(gl_contentPane.createSequentialGroup()
               .addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
               .addGap(12))
      );
      gl_contentPane.setVerticalGroup(
         gl_contentPane.createParallelGroup(Alignment.TRAILING)
            .addGroup(gl_contentPane.createSequentialGroup()
               .addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(btnNewButton)
               .addContainerGap())
      );
      contentPane.setLayout(gl_contentPane);
   }
}