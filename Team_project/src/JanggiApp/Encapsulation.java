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

public class Encapsulation extends JFrame {
	public Encapsulation() {
	}

	JFrame frame;
	JTextArea txt_area;
	JPanel contentPanel;
	JPanel imagePanel;
	String content_string = "Encapsulation is a process of binding or wrapping the data and the codes that operates on the data into a single entity. This keeps the data safe from outside interface and misuse. One way to understand encapsulation is as a protective wrapper that prevents code and data from being arbitrarily accessed by other code defined outside the wrapper.";

	public void encapsulation() {
		frame = new JFrame("Encapsulation");
		setBounds(0, 0, 450, 650);

		contentPanel = new JPanel();
		contentPanel.setBorder(new TitledBorder(null, "Encapsulation"));

		txt_area = new JTextArea();
		txt_area.setText(content_string);
		txt_area.setLineWrap(true);
		txt_area.setSize(440, 300);
		txt_area.setBackground(Color.WHITE);
		txt_area.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 18));
		contentPanel.setBackground(Color.WHITE);
		contentPanel.add(txt_area);

		imagePanel = new JPanel();

		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("encapsulation.png"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			imagePanel.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		frame.getContentPane().add(contentPanel, BorderLayout.NORTH);
		frame.getContentPane().add(imagePanel, BorderLayout.CENTER);
		frame.setBackground(Color.WHITE);

		frame.setSize(450, 650);
		frame.setVisible(true);
	}

	public void go() {
		Encapsulation tool_tip = new Encapsulation();
		tool_tip.encapsulation();
	}
}
