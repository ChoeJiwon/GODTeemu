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
   String content_string = "In object-oriented programming, inheritance is when an object or class is based on another object (prototypal inheritance) or class (class-based inheritance), using the same implementation (inheriting from an object or class: inheriting behavior, programming by difference) or specifying a new implementation to maintain the same behavior (realizing an interface). Such an inherited class is called a subclass of its parent class or super class. It is a mechanism for code reuse and to allow independent extensions of the original software via public classes and interfaces. The relationships of objects or classes through inheritance give rise to a hierarchy.";
   JButton btnNext;
   
   public void inheritance()
   {
      frame = new JFrame("Inheritance");
      frame.setBounds(100, 100, 1000, 800);
      
      contentPanel = new JPanel();
      JLabel lblInheritance = new JLabel("Inheritance");
      lblInheritance.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 24));
      lblInheritance.setForeground(Color.BLUE);
      lblInheritance.setBackground(KoreanChess.c);
      
      txt_area = new JTextArea();
      txt_area.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));   
      txt_area.setText(content_string);
      txt_area.setLineWrap(true);
      txt_area.setSize(440, 300);
      txt_area.setBackground(KoreanChess.c);
      
      btnNext=new JButton();
      btnNext.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            dispose();
            Polymorphism1 p=new Polymorphism1();
            p.go();
         }
      });
      btnNext.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
      btnNext.setText("Next");
      btnNext.setSize(50, 50);
      btnNext.setBackground(Color.lightGray);
      
      contentPanel.setBackground(KoreanChess.c);
      contentPanel.add(lblInheritance);
      contentPanel.add(txt_area);
      contentPanel.add(btnNext);
            
      imagePanel = new JPanel();
      imagePanel.setBackground(KoreanChess.c);
      ImageIcon myPicture1;
      ImageIcon myPicture2;
      ImageIcon myPicture3;
      JLabel picLabel = new JLabel();
      JLabel picLabel2=new JLabel();
      JLabel picLabel3=new JLabel();
      
      try {
         myPicture1 = new ImageIcon(new ImageIcon("reInheritance1.png").getImage().getScaledInstance(494,50, Image.SCALE_DEFAULT));
         myPicture2=new ImageIcon(new ImageIcon("reInheritance2.png").getImage().getScaledInstance(524,261, Image.SCALE_DEFAULT));
         myPicture3=new ImageIcon(new ImageIcon("reInheritance3.png").getImage().getScaledInstance(534,261, Image.SCALE_DEFAULT));
         
         picLabel.setIcon(myPicture1);
         picLabel2.setIcon(myPicture2);
         picLabel3.setIcon(myPicture3);
         
         imagePanel.add(picLabel);
         imagePanel.add(picLabel2);
         imagePanel.add(picLabel3);
      
         
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