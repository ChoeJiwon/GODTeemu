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

public class Inheritance {
	JFrame frame;
	JTextArea txt_area;
	JPanel contentPanel;
	JPanel imagePanel;
	String content_string = "In object-oriented programming, inheritance is when an object or class is based on another object (prototypal inheritance) or class (class-based inheritance), using the same implementation (inheriting from an object or class: inheriting behavior, programming by difference) or specifying a new implementation to maintain the same behavior (realizing an interface). Such an inherited class is called a subclass of its parent class or super class. It is a mechanism for code reuse and to allow independent extensions of the original software via public classes and interfaces. The relationships of objects or classes through inheritance give rise to a hierarchy.";	
	
	public void inheritance()
	{
		frame = new JFrame("Inheritance");
		frame.setBounds(100, 100, 700, 700);
		
		contentPanel = new JPanel();
		contentPanel.setBorder(new TitledBorder(null, "Inheritance"));
		
		txt_area = new JTextArea();
		txt_area.setFont(new Font("±¼¸²", Font.PLAIN, 18));	
		txt_area.setText(content_string);
		txt_area.setLineWrap(true);
		txt_area.setSize(440, 300);
		txt_area.setBackground(KoreanChess.c);
		
		contentPanel.setBackground(KoreanChess.c);
		contentPanel.add(txt_area);
				
		imagePanel = new JPanel();
		imagePanel.setBackground(KoreanChess.c);
		ImageIcon myPicture;
		JLabel picLabel = new JLabel();
		
		try {
			myPicture = new ImageIcon(new ImageIcon("inheritance.png").getImage().getScaledInstance(450,320, Image.SCALE_DEFAULT));
			
			
			picLabel.setIcon(myPicture);
			
			imagePanel.add(picLabel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		frame.getContentPane().add(contentPanel, BorderLayout.NORTH);
		frame.add(imagePanel, BorderLayout.CENTER);
		frame.setBackground(Color.WHITE);
		
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Inheritance tool_tip = new Inheritance();
		tool_tip.inheritance();
	}
}
