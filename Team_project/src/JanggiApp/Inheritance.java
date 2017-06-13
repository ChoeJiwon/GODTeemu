package JanggiApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Inheritance extends JFrame{
	public Inheritance() {
	}
   JFrame frame;
   JTextArea txt_area;
   JPanel contentPanel;
   JPanel imagePanel;
   JLabel picLabel;
   //final String content_string = "In object-oriented programming, inheritance is when an object or class is based on another object (prototypal inheritance) or class (class-based inheritance), using the same implementation (inheriting from an object or class: inheriting behavior, programming by difference) or specifying a new implementation to maintain the same behavior (realizing an interface). Such an inherited class is called a subclass of its parent class or super class. It is a mechanism for code reuse and to allow independent extensions of the original software via public classes and interfaces. The relationships of objects or classes through inheritance give rise to a hierarchy.";
   JButton btnNext;
   Polymorphism p;
   ImageIcon myPicture1;
   ImageIcon myPicture2;
   ImageIcon myPicture3;
   
   public void inheritance()
   {
      frame = new JFrame("Inheritance");
      frame.setBounds(100, 100, 920, 650);
      
      contentPanel = new JPanel();
      
      txt_area = new JTextArea();
      txt_area.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));   
      //txt_area.setText(content_string);
      txt_area.setLineWrap(true);
      txt_area.setSize(440, 300);
      txt_area.setBackground(KoreanChess.c);
      txt_area.setEditable(false);
      
      btnNext=new JButton();
      btnNext.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	frame.dispose();
            p=new Polymorphism();
            p.go();
         }
      });
      btnNext.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
      btnNext.setText("Next");
      btnNext.setSize(50, 50);
      btnNext.setBackground(Color.lightGray);
      
      contentPanel.setBackground(KoreanChess.c);
      contentPanel.add(btnNext);
            
      imagePanel = new JPanel();
      imagePanel.setBackground(KoreanChess.c);
      
      
      BufferedImage myPicture;
      
      try {
         
            myPicture = ImageIO.read(new File("inheritance.png"));
            
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            imagePanel.add(picLabel);
      
         
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      
      frame.getContentPane().add(contentPanel, BorderLayout.NORTH);
      frame.getContentPane().add(imagePanel, BorderLayout.CENTER);
      frame.setBackground(Color.WHITE);
      
      
      frame.setVisible(true);
   }
   
   public void go()
   {
      Inheritance tool_tip = new Inheritance();
      tool_tip.inheritance();
   }
}