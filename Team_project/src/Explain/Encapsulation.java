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
   JTextArea txt_area;
   JPanel contentPanel;
   JPanel imagePanel;
   JLabel labelEncapsulation;
   final String content_string = "Encapsulation is a process of binding or wrapping the data and the codes that operates on the data into a single entity. This keeps the data safe from outside interface and misuse. One way to understand encapsulation is as a protective wrapper that prevents code and data from being arbitrarily accessed by other code defined outside the wrapper.";

   public void encapsulation() {
      frame = new JFrame("Encapsulation");
      setBounds(0, 0, 1000, 1000);

      contentPanel = new JPanel();
      labelEncapsulation=new JLabel();
      labelEncapsulation.setText("Encapsulation");
      labelEncapsulation.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 24));
      labelEncapsulation.setForeground(Color.BLUE);
      labelEncapsulation.setBackground(KoreanChess.c);
      contentPanel.add(labelEncapsulation);

      txt_area = new JTextArea();
      txt_area.setText(content_string);
      txt_area.setLineWrap(true);
      txt_area.setSize(440, 300);
      txt_area.setBackground(KoreanChess.c);
      txt_area.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
      txt_area.setEditable(false);
      
      contentPanel.setBackground(KoreanChess.c);
      contentPanel.add(txt_area);
      imagePanel = new JPanel();
      imagePanel.setBackground(KoreanChess.c);

      BufferedImage myPicture;
      try {
         myPicture = ImageIO.read(new File("reencapsulation.png"));
         JLabel picLabel = new JLabel(new ImageIcon(myPicture));
         imagePanel.add(picLabel);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      frame.getContentPane().add(contentPanel, BorderLayout.NORTH);
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