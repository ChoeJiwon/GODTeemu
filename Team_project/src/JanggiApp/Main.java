package JanggiApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

   private JPanel contentPane;

   /**
    * Launch the application.
    */
   public void go(){
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Main frame = new Main();
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
   public Main() {
      setBounds(10, 10, 719, 489);
      setSize(1000,1000);
      contentPane = new JPanel(){
    	  public void paintComponent(Graphics g)
    	   {
    		   Image img=new ImageIcon("board.jpg").getImage();
    		   g.drawImage(img, 0 ,0, null);
    	   }
      };
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(new BorderLayout(0, 0));
      setContentPane(contentPane);
   }

}
