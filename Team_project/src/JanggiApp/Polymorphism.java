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

public class Polymorphism extends JFrame
{
	JFrame frame;
	JTextArea txt_area;
	JPanel contentPanel;
	JPanel imagePanel;
	String content_string = "In programming languages and type theory, polymorphism (from Greek polys, \"many, much\" and, morphe, \"form, shape\") is the provision of a single interface to entities of different types. A polymorphic type is one whose operations can also be applied to values of some other type, or types. There are several fundamentally different kinds of polymorphism.";	
	
	public void polymorphism()
	{
		frame = new JFrame("polymorphism");
		setBounds(0, 0, 450, 650);
		
		contentPanel = new JPanel();
		contentPanel.setBorder(new TitledBorder(null, "polymorphism"));
		
		txt_area = new JTextArea();
		txt_area.setText(content_string);
		txt_area.setLineWrap(true);
		txt_area.setSize(440, 300);
		txt_area.setBackground(Color.WHITE);
		
		contentPanel.setBackground(Color.WHITE);
		contentPanel.add(txt_area);
				
		imagePanel = new JPanel();
		
		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("polymorphism.png"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			imagePanel.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		frame.getContentPane().add(contentPanel, BorderLayout.NORTH);
		frame.add(imagePanel, BorderLayout.CENTER);
		frame.setBackground(Color.WHITE);
		
		frame.setSize(450, 650);
		frame.setVisible(true);
	}
	
	public void go()
	{
		Polymorphism tool_tip = new Polymorphism();
		tool_tip.polymorphism();
	}
}
