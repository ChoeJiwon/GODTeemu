package JanggiApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Board extends JFrame {

   private JPanel contentPane;

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
      contentPane.setLayout(new BorderLayout(0, 0));
      setContentPane(contentPane);
   }

}
