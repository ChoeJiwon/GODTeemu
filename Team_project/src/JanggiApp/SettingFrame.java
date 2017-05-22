package JanggiApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

public class SettingFrame extends JFrame {

	private JPanel Pane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public void go(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SettingFrame frame2 = new SettingFrame();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SettingFrame() {
		setTitle("Setting");
		setBounds(100, 100, 594, 568);
		Pane = new JPanel();
		Pane.setBackground(new Color(255, 218, 185));
		Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Pane);
		Pane.setLayout(null);
		
		JLabel lbljanggi = new JLabel("OOP WITH JANGGI");
		lbljanggi.setForeground(new Color(160, 82, 45));
		lbljanggi.setFont(new Font("����", Font.PLAIN, 50));
		lbljanggi.setBounds(14, 12, 548, 71);
		lbljanggi.setHorizontalAlignment(SwingConstants.CENTER);
		Pane.add(lbljanggi);
		
		JLabel lblintro = new JLabel("PRODUCTION BY TEEMU WARRIOUS");
		lblintro.setFont(new Font("����", Font.PLAIN, 20));
		lblintro.setForeground(new Color(169, 169, 169));
		lblintro.setBounds(121, 459, 326, 18);
		Pane.add(lblintro);
		
		JButton btnset = new JButton("SETTING");
		btnset.setFont(new Font("����", Font.PLAIN, 30));
		btnset.setForeground(new Color(221, 160, 221));
		btnset.setBackground(new Color(255, 218, 185));
		btnset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnset.setBounds(198, 314, 178, 64);
		Pane.add(btnset);
		
		JLabel lblSound = new JLabel("SOUND");
		lblSound.setFont(new Font("����", Font.PLAIN, 30));
		lblSound.setBounds(149, 156, 113, 47);
		Pane.add(lblSound);
		
		JLabel lblColor = new JLabel("COLOR");
		lblColor.setFont(new Font("����", Font.PLAIN, 30));
		lblColor.setBounds(149, 215, 113, 35);
		Pane.add(lblColor);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setBackground(new Color(255, 218, 185));
		rdbtnOff.setFont(new Font("����", Font.PLAIN, 18));
		rdbtnOff.setBounds(336, 156, 66, 47);
		Pane.add(rdbtnOff);
		
		JRadioButton rdbtnOn = new JRadioButton("ON");
		buttonGroup.add(rdbtnOn);
		rdbtnOn.setBackground(new Color(255, 218, 185));
		rdbtnOn.setFont(new Font("����", Font.PLAIN, 18));
		rdbtnOn.setBounds(272, 156, 58, 47);
		Pane.add(rdbtnOn);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"GRAY", "RED", "GREEN", "BULE", "BEIGE", "YELLOW"}));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(277, 220, 123, 24);
		Pane.add(comboBox);
	}
}