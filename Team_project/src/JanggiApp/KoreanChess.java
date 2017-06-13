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

// Start Frame with start, menu button
public class KoreanChess extends JFrame {
	
	static Color c=new Color(255, 218, 185);
	private JPanel contentPane;
	private JLabel lblintro;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Menu menu;
	private Inheritance ih;

	/**
	 * Launch the application.
	 * 
	 */
	public void go() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KoreanChess frame = new KoreanChess();
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
	public KoreanChess() {
		setTitle("KoreanChess APP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 568);
		contentPane = new JPanel();
		contentPane.setBackground(c);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblgame = new JLabel("OOP WITH GAME");
		lblgame.setForeground(new Color(160, 82, 45));
		lblgame.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 50));
		lblgame.setBounds(14, 12, 548, 71);
		lblgame.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblgame);
		
		JButton btnstart = new JButton("START");
		buttonGroup.add(btnstart);
		btnstart.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 30));
		btnstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 dispose();
                 ih = new Inheritance();
                 ih.go();
			}
		});
		btnstart.setForeground(new Color(160, 82, 45));
		btnstart.setBackground(c);
		btnstart.setBounds(193, 182, 179, 64);
		contentPane.add(btnstart);
		
		lblintro = new JLabel("PRODUCTION BY TEEMU WARRIORS");
		lblintro.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 20));
		lblintro.setForeground(new Color(169, 169, 169));
		lblintro.setBounds(93, 459, 397, 18);
		contentPane.add(lblintro);
		
		JButton btnmenu = new JButton("MENU");
		buttonGroup.add(btnmenu);
		btnmenu.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 30));
		btnmenu.setForeground(new Color(160, 82, 45));
		btnmenu.setBackground(c);
		btnmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				menu = new Menu();
				menu.go();
			}
		});
		btnmenu.setBounds(194, 275, 178, 64);
		contentPane.add(btnmenu);
	}

	public static void main(String[] args) {
		KoreanChess kc = new KoreanChess();
		kc.go();
	}

}