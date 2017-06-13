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
// frame has score and settin button
public class Menu extends JFrame {
	private JPanel contentPane;
	private JLabel lblintro;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Score score;
	private Setting set;

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
		contentPane.setBackground(KoreanChess.c);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblgame = new JLabel("OOP WITH GAME");
		lblgame.setForeground(new Color(160, 82, 45));
		lblgame.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 50));
		lblgame.setBounds(14, 12, 548, 71);
		lblgame.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblgame);
		
		JButton btnscore = new JButton("SCORE");
		buttonGroup.add(btnscore);
		btnscore.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 30));
		btnscore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				score=new Score();
				score.go();
			}
		});
		btnscore.setForeground(new Color(160, 82, 45));
		btnscore.setBackground(KoreanChess.c);
		btnscore.setBounds(193, 182, 179, 64);
		contentPane.add(btnscore);
		
		lblintro = new JLabel("PRODUCTION BY TEEMU WARRIORS");
		lblintro.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 20));
		lblintro.setForeground(new Color(169, 169, 169));
		lblintro.setBounds(88, 459, 388, 18);
		contentPane.add(lblintro);
		
		JButton btnset = new JButton("SETTING");
		buttonGroup.add(btnset);
		btnset.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 30));
		btnset.setForeground(new Color(160, 82, 45));
		btnset.setBackground(KoreanChess.c);
		btnset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				set = new Setting();
				set.go();
			}
		});
		btnset.setBounds(194, 275, 178, 64);
		contentPane.add(btnset);
	}
}