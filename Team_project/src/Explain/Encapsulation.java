package Explain;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Menu.KoreanChess;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Encapsulation extends JFrame {
   JFrame frame;
   JPanel imagePanel;

   public void encapsulation() {
      frame = new JFrame("Encapsulation");
      setBounds(0, 0, 1000, 1000);

      imagePanel = new JPanel();
      imagePanel.setBackground(KoreanChess.c);

      BufferedImage myPicture;
      try {
         myPicture = ImageIO.read(new File("Explain\\encapsulation.png"));
         JLabel picLabel = new JLabel(new ImageIcon(myPicture));
         imagePanel.add(picLabel);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      frame.getContentPane().add(imagePanel, BorderLayout.CENTER);
      frame.setBackground(KoreanChess.c);

      frame.setSize(1000, 650);
      frame.setVisible(true);
   }

   public void go(){
      Encapsulation tool_tip = new Encapsulation();
      tool_tip.encapsulation();
   }
}