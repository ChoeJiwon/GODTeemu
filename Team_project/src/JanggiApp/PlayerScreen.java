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
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */

	public void go() {
		try {
			PlayerScreen frame = new PlayerScreen();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public PlayerScreen() {
		setBounds(100, 100, 688, 533);
		contentPane = new JPanel();
		contentPane.setBackground(JanggiApp.c);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblOopWithJanggi = new JLabel("OOP WITH JANGGI");
		lblOopWithJanggi.setForeground(new Color(160, 82, 45));
		lblOopWithJanggi.setFont(new Font("±¼¸²", Font.PLAIN, 50));

		JLabel lblPlayer = new JLabel("Player1 :");
		lblPlayer.setForeground(new Color(169, 169, 169));

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblPlayer_1 = new JLabel("Player2 :");
		lblPlayer_1.setForeground(new Color(169, 169, 169));

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JButton btnStart = new JButton("START");
		btnStart.setForeground(new Color(160, 82, 45));
		btnStart.setBackground(JanggiApp.c);
		btnStart.addActionListener(this);

		JLabel lblNewLabel = new JLabel("PRODUCTION BY TEEMU WARRIORS");
		lblNewLabel.setForeground(new Color(169, 169, 169));
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
								.addGroup(gl_contentPane.createSequentialGroup().addGap(18).addComponent(lblPlayer)
										.addGap(18).addComponent(textField, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(18).addGroup(gl_contentPane
										.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel)
										.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblPlayer_1)
												.addGap(18).addComponent(textField_1, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))))
				.addContainerGap(113, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(44)
						.addComponent(lblOopWithJanggi, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addGap(93)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPlayer))
						.addGap(33)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPlayer_1))
						.addGap(51).addComponent(btnStart).addGap(86).addComponent(lblNewLabel).addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
