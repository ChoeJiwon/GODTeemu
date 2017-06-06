package JanggiApp;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Player extends JFrame implements ActionListener {

	private JPanel contentPane;

	private JTextField p1text;
	private JTextField p2text;
	private JLabel lblgame, lblPlayer1, lblPlayer2, labelintro;
	private JButton btnStart;
	private Board board;

	public void go() {
		try {
			Player frame = new Player();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Player() {
		setTitle("Player");
		setBounds(100, 100, 594, 568);
		contentPane = new JPanel();
		contentPane.setBackground(KoreanChess.c);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblgame = new JLabel("OOP WITH GAME");
		lblgame.setForeground(new Color(160, 82, 45));
		lblgame.setFont(new Font("±¼¸²", Font.PLAIN, 50));

		lblPlayer1 = new JLabel("Player1 :");
		lblPlayer1.setForeground(new Color(169, 169, 169));

		p1text = new JTextField();
		p1text.setColumns(10);

		lblPlayer2 = new JLabel("Player2 :");
		lblPlayer2.setForeground(new Color(169, 169, 169));

		p2text = new JTextField();
		p2text.setColumns(10);

		btnStart = new JButton("START");
		btnStart.setForeground(new Color(160, 82, 45));
		btnStart.setBackground(KoreanChess.c);
		btnStart.addActionListener(this);

		labelintro = new JLabel("PRODUCTION BY TEEMU WARRIORS");
		labelintro.setForeground(new Color(169, 169, 169));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup().addGap(149)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblPlayer1)
								.addComponent(lblPlayer2))
						.addGap(37)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(p1text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(p2text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(78).addComponent(lblgame))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(204).addComponent(btnStart))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(176).addComponent(labelintro)))
				.addContainerGap(138, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(52)
				.addComponent(lblgame, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE).addGap(85)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblPlayer1).addComponent(
						p1text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(33)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblPlayer2).addComponent(
						p2text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(52).addComponent(btnStart).addGap(84).addComponent(labelintro).addGap(48)));
		contentPane.setLayout(gl_contentPane);
	}

	public void actionPerformed(ActionEvent e) {
		if (p1text.getText().length() != 0 && p2text.getText().length() != 0) {
			if (!(p1text.getText().equals(p2text.getText()))) {
				dispose();
				board = new Board();
				board.go();
			}
		}
	}

}