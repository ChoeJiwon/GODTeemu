package Game;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Board extends JFrame {      
   private JButton rjol1 = new JButton(new ImageIcon("red_jol.png"));
   private JButton rjol2 = new JButton(new ImageIcon("red_jol.png"));
   private JButton rjol3 = new JButton(new ImageIcon("red_jol.png"));
   private JButton rjol4 = new JButton(new ImageIcon("red_jol.png"));
   private JButton rjol5 = new JButton(new ImageIcon("red_jol.png"));
   
   private JButton bjol1 = new JButton(new ImageIcon("blue_jol.png"));
   private JButton bjol2 = new JButton(new ImageIcon("blue_jol.png"));
   private JButton bjol3 = new JButton(new ImageIcon("blue_jol.png"));
   private JButton bjol4 = new JButton(new ImageIcon("blue_jol.png"));
   private JButton bjol5 = new JButton(new ImageIcon("blue_jol.png"));
   
   private JButton rjang = new JButton(new ImageIcon("red_jang.png"));
   private JButton bjang = new JButton(new ImageIcon("blue_jang.png"));
   
   private JButton bcha1 = new JButton(new ImageIcon("blue_cha.png"));
   private JButton bcha2 = new JButton(new ImageIcon("blue_cha.png"));
   
   private JButton rcha1 = new JButton(new ImageIcon("red_cha.png"));
   private JButton rcha2 = new JButton(new ImageIcon("red_cha.png"));
   
   private JButton rsa1 = new JButton(new ImageIcon("red_sa.png"));
   private JButton rsa2 = new JButton(new ImageIcon("red_sa.png"));
   
   private JButton bsa1 = new JButton(new ImageIcon("blue_sa.png"));
   private JButton bsa2 = new JButton(new ImageIcon("blue_sa.png"));
   
   private JPanel contentPane;
   
   static int cnt = 0;
   static int cnt2 = 0;
   //Making Janggi Board and Locating each pieces
   
   


static int turn=0;         //variable for Checking turn
   
   final static int BJANG = 1, BCHA = 2, BJOL = 3, BSA = 4, RJANG = 11, RCHA = 12, RJOL = 13, RSA = 14;
   int[][] location = { { RCHA, 0, 0, RJOL, 0, 0, BJOL, 0, 0, BCHA }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, RJOL, 0, 0, BJOL, 0, 0, 0 }, { RSA, 0, 0, 0, 0, 0, 0, 0, 0, BSA },
         { 0, RJANG, 0, RJOL, 0, 0, BJOL, 0, BJANG, 0 }, { RSA, 0, 0, 0, 0, 0, 0, 0, 0, BSA },
         { 0, 0, 0, RJOL, 0, 0, BJOL, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         { RCHA, 0, 0, RJOL, 0, 0, BJOL, 0, 0, BCHA }

   };      //For finding where each piece is located.
   
   
   PieceMove jm = new JolMove();
   PieceMove cm = new ChaMove();
   PieceMove jsm = new JangSaMove();
         //Using Polymorphism for each piece moving
   
   
   /**
    * Launch the application.
    */
   public void go() {
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
   }      //Running GUI
   
   
   public static void MalDesign(JButton j, Color c, int xloca, int yloca,JPanel jp ){
      j.setBackground(c);
      j.setBorderPainted(false);
      j.setContentAreaFilled(false);
      j.setSize(50, 50);
      j.setLocation(30+95*(xloca-1), 30+95*(yloca-1));
      jp.add(j);
   }      //Designing each piece(ex. team, coordinate, where pieces added)

   /**
    * Create the frame.
    */
   public Board() {         //Board Constructor

      setBounds(10, 10, 719, 489);
      setSize(890, 1000);
      contentPane = new JPanel() {
         public void paintComponent(Graphics g) {
            Image img = new ImageIcon("board.png").getImage();
            g.drawImage(img, 0, 0, null);
         }
      };

      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      /*
       * MalDesign : Designing and locating each pieces 
       * MoveAndRemove().Red(Blue)MoveAndRemove : While Checking every pieces, Remove special piece that is eaten up.
       * 										: And move clicked piece
       */
      MalDesign(rjol1,Color.RED,1,4,contentPane);
      new MoveAndRemove().RedMoveAndRemove(rjol1, "rjol", jm, location, contentPane, bjol1, bjol2
            , bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);

      
      MalDesign(rjol2,Color.RED,3,4,contentPane);
      new MoveAndRemove().RedMoveAndRemove(rjol2,"rjol", jm, location, contentPane, bjol1, bjol2
            , bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
      
      
      MalDesign(rjol3,Color.RED,5,4,contentPane);
      new MoveAndRemove().RedMoveAndRemove(rjol3,"rjol", jm, location, contentPane, bjol1, bjol2
            , bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
      
      
      MalDesign(rjol4,Color.RED,7,4,contentPane);
      new MoveAndRemove().RedMoveAndRemove(rjol4,"rjol", jm, location, contentPane, bjol1, bjol2
            , bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
      
      
      MalDesign(rjol5,Color.RED,9,4,contentPane);
      new MoveAndRemove().RedMoveAndRemove(rjol5, "rjol",jm, location, contentPane, bjol1, bjol2
            , bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
      
      
      MalDesign(bjol1,Color.BLUE,1,7,contentPane);
      new MoveAndRemove().BlueMoveAndRemove(bjol1, "bjol",jm, location, contentPane, rjol1, rjol2
            , rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
            
      
      MalDesign(bjol2,Color.BLUE,3,7,contentPane);
      new MoveAndRemove().BlueMoveAndRemove(bjol2,"bjol", jm, location, contentPane, rjol1, rjol2
            , rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
      
      
      MalDesign(bjol3,Color.BLUE,5,7,contentPane);
      new MoveAndRemove().BlueMoveAndRemove(bjol3,"bjol", jm, location, contentPane, rjol1, rjol2
            , rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
      
      
      MalDesign(bjol4,Color.BLUE,7,7,contentPane);
      new MoveAndRemove().BlueMoveAndRemove(bjol4,"bjol", jm, location, contentPane, rjol1, rjol2
            , rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
            
      
      MalDesign(bjol5,Color.BLUE,9,7,contentPane); 
      new MoveAndRemove().BlueMoveAndRemove(bjol5,"bjol", jm, location, contentPane, rjol1, rjol2
            , rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
      
      
      MalDesign(rjang,Color.RED,5,2,contentPane);
      new MoveAndRemove().RedMoveAndRemove(rjang, "rjang", jsm, location, contentPane, bjol1, bjol2
            , bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
      
         
      MalDesign(bjang,Color.BLUE,5,9,contentPane);
      new MoveAndRemove().BlueMoveAndRemove(bjang,"bjang", jsm, location, contentPane, rjol1, rjol2
            , rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
      
      
      MalDesign(rcha1,Color.RED,1,1,contentPane);
      new MoveAndRemove().RedMoveAndRemove(rcha1,"rcha", cm, location, contentPane, bjol1, bjol2
            , bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
      
      
      MalDesign(rcha2,Color.RED,9,1,contentPane);
      new MoveAndRemove().RedMoveAndRemove(rcha2,"rcha", cm, location, contentPane, bjol1, bjol2
            , bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
   
      
      MalDesign(bcha1,Color.BLUE,1,10,contentPane);
      new MoveAndRemove().BlueMoveAndRemove(bcha1,"bcha", cm, location, contentPane, rjol1, rjol2
            , rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
   
      
      MalDesign(bcha2,Color.BLUE,9,10,contentPane);
      new MoveAndRemove().BlueMoveAndRemove(bcha2,"bcha", cm, location, contentPane, rjol1, rjol2
            , rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
   
      
      MalDesign(rsa1,Color.RED,4,1,contentPane); 
      new MoveAndRemove().RedMoveAndRemove(rsa1,"rsa", jsm, location, contentPane, bjol1, bjol2
            , bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
            
      
      MalDesign(rsa2,Color.RED,6,1,contentPane); 
      new MoveAndRemove().RedMoveAndRemove(rsa2,"rsa", jsm, location, contentPane, bjol1, bjol2
            , bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
            
      
      MalDesign(bsa1,Color.BLUE,4,10,contentPane);
      new MoveAndRemove().BlueMoveAndRemove(bsa1,"bsa", jsm, location, contentPane, rjol1, rjol2
            , rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
      
      
      MalDesign(bsa2,Color.BLUE,6,10,contentPane);
      new MoveAndRemove().BlueMoveAndRemove(bsa2,"bsa", jsm, location, contentPane, rjol1, rjol2
            , rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
   }
}