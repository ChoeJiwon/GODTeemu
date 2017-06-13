package JanggiApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Score extends JFrame {

	private JPanel contentPane;
	private JLabel lblgame, lblintro;
	private JLabel label;
	JButton btnCheckScore;
	private JTextField Btext;
	private JTextField Rtext;

	/**
	 * Launch the application.
	 */
	/*Running GUI*/
	public void go() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Score frame = new Score();
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
	public Score() {
	
		setTitle("Score");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 568);
		
		/*Make Panel in Score Frame and decorate Panel(contentPane)*/
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(KoreanChess.c);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*Make label in Panel(contentPane)*/
		lblgame = new JLabel("OOP WITH GAME");
		lblgame.setForeground(new Color(160, 82, 45));
		lblgame.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 50));
		lblgame.setBounds(14, 12, 548, 71);
		lblgame.setHorizontalAlignment(SwingConstants.CENTER);

		lblintro = new JLabel("PRODUCTION BY TEEMU WARRIOUS");
		lblintro.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 20));
		lblintro.setForeground(new Color(169, 169, 169));
		lblintro.setBounds(88, 459, 389, 18);

		label = new JLabel(":");
		label.setBounds(288, 162, 14, 51);
		label.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 23));
		
		JLabel lblRed = new JLabel("RED");
		lblRed.setBounds(88, 179, 29, 18);

		JLabel lblBlue = new JLabel("BLUE");
		lblBlue.setBounds(464, 179, 37, 18);
		
		
		/*Make TextField in Panel(contentPane)*/
		Btext = new JTextField();
		Btext.setBounds(316, 176, 116, 24);
		Btext.setColumns(10);

		Rtext = new JTextField();
		Rtext.setBounds(149, 176, 116, 24);
		Rtext.setColumns(10);
		
		btnCheckScore = new JButton("Check Score");
		btnCheckScore.setBounds(148, 275, 117, 27);
		btnCheckScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ScoreFile sf = new ScoreFile();

				Btext.setText(Integer.toString(sf.readBScore()));
				Rtext.setText(Integer.toString(sf.readRScore()));
				
				System.out.println("B : "+Integer.toString(sf.readBScore())+" R : "+Integer.toString(sf.readRScore()));
			}

		});
		
		
		/*Make Button in Panel(contentPane)*/
		JButton Reset = new JButton("Reset");
		Reset.setBounds(333, 275, 99, 27);
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new ScoreFile().storeScore(0, 0);
				
			}
		});
		
		
		JButton btnStudyJava = new JButton("Study JAVA");
		btnStudyJava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Encapsulation en=new Encapsulation();
				en.go();
			}
		});
		btnStudyJava.setBounds(220, 382, 135, 27);
		
		
		/*Add label,textField,Button to Panel(contentPane)*/
		contentPane.setLayout(null);
		contentPane.add(lblgame);
		contentPane.add(lblRed);
		contentPane.add(Rtext);
		contentPane.add(label);
		contentPane.add(btnCheckScore);
		contentPane.add(Btext);
		contentPane.add(lblBlue);
		contentPane.add(Reset);
		contentPane.add(lblintro);
		contentPane.add(btnStudyJava);
	}
}
