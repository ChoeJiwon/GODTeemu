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
	private JComboBox comboBox;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lbljanggi,lblintro,lblSound,lblColor;
	private JButton btnset;
	private JRadioButton rdbtnOff,rdbtnOn;
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
		Pane.setBackground(JanggiApp.c);
		Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Pane);
		Pane.setLayout(null);
		
		lbljanggi = new JLabel("OOP WITH JANGGI");
		lbljanggi.setForeground(new Color(160, 82, 45));
		lbljanggi.setFont(new Font("±¼¸²", Font.PLAIN, 50));
		lbljanggi.setBounds(14, 12, 548, 71);
		lbljanggi.setHorizontalAlignment(SwingConstants.CENTER);
		Pane.add(lbljanggi);
		
		lblintro = new JLabel("PRODUCTION BY TEEMU WARRIOUS");
		lblintro.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblintro.setForeground(new Color(169, 169, 169));
		lblintro.setBounds(121, 459, 326, 18);
		Pane.add(lblintro);
		
		btnset = new JButton("SETTING");
		btnset.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btnset.setForeground(new Color(160, 82, 45));
		btnset.setBackground(JanggiApp.c);
		btnset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().equals("GRAY")==true)
				{
					
					JanggiApp.c=Color.LIGHT_GRAY;
					Pane.setBackground(JanggiApp.c);
					rdbtnOn.setBackground(JanggiApp.c);
					rdbtnOff.setBackground(JanggiApp.c);
					btnset.setBackground(JanggiApp.c);
					dispose();
					JanggiApp ja=new JanggiApp();
					ja.go();
				}
				if (comboBox.getSelectedItem().equals("PINK")==true)
				{
					
					JanggiApp.c=Color.PINK;
					Pane.setBackground(JanggiApp.c);
					rdbtnOn.setBackground(JanggiApp.c);
					rdbtnOff.setBackground(JanggiApp.c);
					btnset.setBackground(JanggiApp.c);
					dispose();
					JanggiApp ja=new JanggiApp();
					ja.go();
				}
				if (comboBox.getSelectedItem().equals("BLUE")==true)
				{
					
					JanggiApp.c=new Color(0,206,209);
					Pane.setBackground(JanggiApp.c);
					rdbtnOn.setBackground(JanggiApp.c);
					rdbtnOff.setBackground(JanggiApp.c);
					btnset.setBackground(JanggiApp.c);
					dispose();
					JanggiApp ja=new JanggiApp();
					ja.go();
				}
				if (comboBox.getSelectedItem().equals("WHITE")==true)
				{
					
					JanggiApp.c=Color.WHITE;
					Pane.setBackground(JanggiApp.c);
					rdbtnOn.setBackground(JanggiApp.c);
					rdbtnOff.setBackground(JanggiApp.c);
					btnset.setBackground(JanggiApp.c);
					dispose();
					JanggiApp ja=new JanggiApp();
					ja.go();
				}
				if (comboBox.getSelectedItem().equals("YELLOW")==true)
				{
					
					JanggiApp.c=Color.YELLOW;
					Pane.setBackground(JanggiApp.c);
					rdbtnOn.setBackground(JanggiApp.c);
					rdbtnOff.setBackground(JanggiApp.c);
					btnset.setBackground(JanggiApp.c);
					dispose();
					JanggiApp ja=new JanggiApp();
					ja.go();
				}
				if (comboBox.getSelectedItem().equals("GREEN")==true)
				{
					
					JanggiApp.c=new Color(154,205,50);
					Pane.setBackground(JanggiApp.c);
					rdbtnOn.setBackground(JanggiApp.c);
					rdbtnOff.setBackground(JanggiApp.c);
					btnset.setBackground(JanggiApp.c);
					dispose();
					JanggiApp ja=new JanggiApp();
					ja.go();
				}
				if (comboBox.getSelectedItem().equals("BEIGE")==true)
				{

					JanggiApp.c=new Color(255,218,185);
					Pane.setBackground(JanggiApp.c);
					rdbtnOn.setBackground(JanggiApp.c);
					rdbtnOff.setBackground(JanggiApp.c);
					btnset.setBackground(JanggiApp.c);
					dispose();
					JanggiApp ja=new JanggiApp();
					ja.go();
				}
			}
		});
		btnset.setBounds(198, 314, 178, 64);
		Pane.add(btnset);
		
		lblSound = new JLabel("SOUND");
		lblSound.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lblSound.setBounds(149, 156, 113, 47);
		Pane.add(lblSound);
		
		lblColor = new JLabel("COLOR");
		lblColor.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lblColor.setBounds(149, 215, 113, 35);
		Pane.add(lblColor);
		
		rdbtnOff = new JRadioButton("OFF");
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setBackground(JanggiApp.c);
		rdbtnOff.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		rdbtnOff.setBounds(336, 156, 66, 47);
		Pane.add(rdbtnOff);
		
		rdbtnOn = new JRadioButton("ON");
		buttonGroup.add(rdbtnOn);
		rdbtnOn.setBackground(JanggiApp.c);
		rdbtnOn.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		rdbtnOn.setBounds(272, 156, 58, 47);
		Pane.add(rdbtnOn);
		
		comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"GRAY", "PINK", "GREEN", "BLUE", "BEIGE", "YELLOW", "WHITE"}));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(277, 220, 123, 24);
		Pane.add(comboBox);
	}
}