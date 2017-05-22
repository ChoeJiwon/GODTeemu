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

public class PlayerScreen extends JFrame implements ActionListener {

	private JPanel contentPane;

	private JTextField p1text;
	private JTextField p2text;
	private JLabel lblOopWithJanggi,lblPlayer1,lblPlayer2,labelintro;
	private JButton btnStart;

	public void go() {
		try {
			PlayerScreen frame = new PlayerScreen();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public PlayerScreen() {
		setBounds(100, 100, 688, 533);
		contentPane = new JPanel();
		contentPane.setBackground(JanggiApp.c);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblOopWithJanggi = new JLabel("OOP WITH JANGGI");
		lblOopWithJanggi.setForeground(new Color(160, 82, 45));
		lblOopWithJanggi.setFont(new Font("����", Font.PLAIN, 50));

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
		btnStart.setBackground(JanggiApp.c);
		btnStart.addActionListener(this);

		labelintro = new JLabel("PRODUCTION BY TEEMU WARRIORS");
		labelintro.setForeground(new Color(169, 169, 169));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane.createSequentialGroup()
										.addGap(100).addComponent(lblOopWithJanggi))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(293).addComponent(btnStart))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(198).addGroup(gl_contentPane
								.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(18).addComponent(lblPlayer1)
										.addGap(18).addComponent(p1text, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(18).addGroup(gl_contentPane
										.createParallelGroup(Alignment.LEADING).addComponent(labelintro)
										.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblPlayer2)
												.addGap(18).addComponent(p2text, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))))
				.addContainerGap(113, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(44)
						.addComponent(lblOopWithJanggi, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addGap(93)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(p1text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPlayer1))
						.addGap(33)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(p2text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPlayer2))
						.addGap(51).addComponent(btnStart).addGap(86).addComponent(labelintro).addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(p1text.getText().length()!=0 && p2text.getText().length()!=0)
		{
			dispose();
			MainFrame mf=new MainFrame();
			mf.go();
		}
	}

}
