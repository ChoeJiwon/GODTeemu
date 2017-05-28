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

public class Menu extends JFrame {
	static Color c=new Color(255, 218, 185);
	private JPanel contentPane;
	private JLabel lblintro;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public void go() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 568);
		contentPane = new JPanel();
		contentPane.setBackground(c);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblgame = new JLabel("OOP WITH GAME");
		lblgame.setForeground(new Color(160, 82, 45));
		lblgame.setFont(new Font("±¼¸²", Font.PLAIN, 50));
		lblgame.setBounds(14, 12, 548, 71);
		lblgame.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblgame);
		
		JButton btnscore = new JButton("SCORE");
		buttonGroup.add(btnscore);
		btnscore.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btnscore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Player ps = new Player();
				ps.go();
			}
		});
		btnscore.setForeground(new Color(160, 82, 45));
		btnscore.setBackground(c);
		btnscore.setBounds(193, 182, 179, 64);
		contentPane.add(btnscore);
		
		lblintro = new JLabel("PRODUCTION BY TEEMU WARRIOUS");
		lblintro.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblintro.setForeground(new Color(169, 169, 169));
		lblintro.setBounds(121, 459, 326, 18);
		contentPane.add(lblintro);
		
		JButton btnset = new JButton("SETTING");
		buttonGroup.add(btnset);
		btnset.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btnset.setForeground(new Color(160, 82, 45));
		btnset.setBackground(c);
		btnset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Setting set = new Setting();
				set.go();
			}
		});
		btnset.setBounds(194, 275, 178, 64);
		contentPane.add(btnset);
	}
}