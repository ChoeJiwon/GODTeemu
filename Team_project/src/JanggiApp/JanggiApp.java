package JanggiApp;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;

public class JanggiApp extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanggiApp frame = new JanggiApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanggiApp() {
		setTitle("JANGGI APP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 568);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbljanggi = new JLabel("OOP WITH JANGGI");
		lbljanggi.setForeground(new Color(160, 82, 45));
		lbljanggi.setFont(new Font("±¼¸²", Font.PLAIN, 50));
		lbljanggi.setBounds(14, 12, 548, 71);
		lbljanggi.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbljanggi);
		
		JButton btnstart = new JButton("START");
		buttonGroup.add(btnstart);
		btnstart.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btnstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnstart.setForeground(new Color(221, 160, 221));
		btnstart.setBackground(new Color(255, 218, 185));
		btnstart.setBounds(193, 182, 179, 64);
		contentPane.add(btnstart);
		
		JLabel lblintro = new JLabel("PRODUCTION BY TEEMU WARRIOUS");
		lblintro.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblintro.setForeground(new Color(169, 169, 169));
		lblintro.setBounds(121, 459, 326, 18);
		contentPane.add(lblintro);
		
		JButton btnset = new JButton("SETTING");
		buttonGroup.add(btnset);
		btnset.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btnset.setForeground(new Color(221, 160, 221));
		btnset.setBackground(new Color(255, 218, 185));
		btnset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SettingFrame set = new SettingFrame();
				set.go();
			}
		});
		btnset.setBounds(194, 275, 178, 64);
		contentPane.add(btnset);
	}
}