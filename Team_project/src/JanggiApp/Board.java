package JanggiApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Board extends JFrame {
   private JButton jol1,jol2,jol3,jol4,jol5;
   private JPanel contentPane,boardpiece;

   /**
    * Launch the application.
    */
   public void go(){
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Board frame = new Board();
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
   public Board() {
	  final int BJANG = 1,BCHA=2,BPO=3,BSANG=4,BMA=5,BJOL=6,BSA=7,RJANG = 11,RCHA=12,RPO=13,RSANG=14,RMA=15,RJOL=16,RSA=17;
	  int i,j;
	  int[][] location = {
				{ BCHA, 0, 0, BJOL, 0, 0, RJOL, 0, 0, RCHA },
				{ BSANG, 0, BPO, 0, 0, 0, 0, RPO, 0, RMA },
				{ BMA, 0, 0, BJOL, 0, 0, RJOL, 0, 0, RSANG },
				{ BSA, 0, 0, 0, 0, 0, 0, 0, 0, RSA },
				{ 0, BJANG, 0, BJOL, 0, 0, RJOL, 0, RJANG, 0 },
				{ BSA, 0, 0, 0, 0, 0, 0, 0, 0, RSA },
				{ BSANG, 0, 0, BJOL, 0, 0, RJOL, 0, 0, RSANG },
				{ BMA, 0, BPO, 0, 0, 0, 0, RPO, 0, RMA },
				{ BCHA, 0, 0, BJOL, 0, 0, RJOL, 0, 0, RCHA }

		};
	  setBounds(10, 10, 719, 489);
      setSize(1000,1000);
      contentPane = new JPanel(){
    	  public void paintComponent(Graphics g)
    	   {
    		   Image img=new ImageIcon("board.png").getImage();
    		   g.drawImage(img, 0 ,0, null);
    	   }
      };
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      jol1=new JButton(new ImageIcon("red_byung.png"));
 	  jol1.setBackground(Color.BLUE);
 	  jol1.setBorderPainted(false);
 	  jol1.setContentAreaFilled(false);
 	  jol1.setFocusPainted(false);
 	  jol1.setSize(50,50);
 	  jol1.setLocation(95,315);
 	  contentPane.add(jol1);
  
      jol2=new JButton(new ImageIcon("red_byung.png"));
  	  jol2.setBackground(Color.RED);
  	  jol2.setBorderPainted(false);
  	  jol2.setContentAreaFilled(false);
  	  jol2.setFocusPainted(false);
  	  jol2.setSize(50,50);
  	  jol2.setLocation(285,315);
 	  contentPane.add(jol2);
  
      jol3=new JButton(new ImageIcon("red_byung.png"));
  	  jol3.setBackground(Color.RED);
  	  jol3.setBorderPainted(false);
  	  jol3.setContentAreaFilled(false);
  	  jol3.setFocusPainted(false);
  	  jol3.setSize(50,50);
  	  jol3.setLocation(475,315);
 	  contentPane.add(jol3);
 
      jol4=new JButton(new ImageIcon("red_byung.png"));
  	  jol4.setBackground(Color.RED);
  	  jol4.setBorderPainted(false);
  	  jol4.setContentAreaFilled(false);
  	  jol4.setFocusPainted(false);
  	  jol4.setSize(50,50);
  	  jol4.setLocation(665,315);
 	  contentPane.add(jol4);

      jol5=new JButton(new ImageIcon("red_byung.png"));
  	  jol5.setBackground(Color.RED);
  	  jol5.setBorderPainted(false);
  	  jol5.setContentAreaFilled(false);
  	  jol5.setFocusPainted(false);
  	  jol5.setSize(50,50);
  	  jol5.setLocation(855,315);
 	  contentPane.add(jol5);

   }
}