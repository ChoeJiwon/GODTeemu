package JanggiApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class Score extends JFrame {

	private JPanel contentPane;
	private JLabel lblgame,lblintro;
	private JLabel lblPlayer_1;
	private JLabel label;
	JButton btnCheckScore;
	JButton btnNewButton;
	JTextArea textArea,textArea_1;

	/**
	 * Launch the application.
	 */
	public void go(){
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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(KoreanChess.c);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblgame = new JLabel("OOP WITH GAME");
		lblgame.setForeground(new Color(160, 82, 45));
		lblgame.setFont(new Font("����", Font.PLAIN, 50));
		lblgame.setBounds(14, 12, 548, 71);
		lblgame.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblintro = new JLabel("PRODUCTION BY TEEMU WARRIOUS");
		lblintro.setFont(new Font("����", Font.PLAIN, 20));
		lblintro.setForeground(new Color(169, 169, 169));
		lblintro.setBounds(121, 459, 326, 18);
		
		JLabel lblPlayer = new JLabel("Player1");
		lblPlayer.setFont(new Font("����", Font.PLAIN, 25));
		lblPlayer.setForeground(Color.DARK_GRAY);
		
		lblPlayer_1 = new JLabel("Player2");
		lblPlayer_1.setFont(new Font("����", Font.PLAIN, 25));
		lblPlayer_1.setForeground(Color.DARK_GRAY);
		
		label = new JLabel(":");
		label.setFont(new Font("����", Font.PLAIN, 23));
		
		btnCheckScore = new JButton("Check Score");
		btnCheckScore.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFileChooser fc=new JFileChooser();
				int result=fc.showOpenDialog(Score.this);           
				
				if(result==JFileChooser.APPROVE_OPTION){
					File f=fc.getSelectedFile();
					
					try {
						FileInputStream fis=new FileInputStream(f);
						ObjectInputStream ois=new ObjectInputStream(fis);
						
						Object o=ois.readObject();
						
						if(o instanceof PlayerScore){
							PlayerScore ps=(PlayerScore) o;
							
							textArea.setText(Integer.toString(ps.getPlayer1score()));
							textArea_1.setText(Integer.toString(ps.getPlayer2score()));
							
						}
						
					} catch (FileNotFoundException fe) {
						// TODO Auto-generated catch block
						fe.printStackTrace();
					} catch (IOException fe) {
						// TODO Auto-generated catch block
						fe.printStackTrace();
					} catch (ClassNotFoundException fe) {
						// TODO Auto-generated catch block
						fe.printStackTrace();
					}
				}
			}
		});
		
		textArea = new JTextArea();
		
		textArea_1 = new JTextArea();
		
		btnNewButton = new JButton("Save Score");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc=new JFileChooser();
				int result=fc.showSaveDialog(Score.this);
				PlayerScore s=new PlayerScore();
				
				if(result==JFileChooser.APPROVE_OPTION)
				{
					File f=fc.getSelectedFile();
					s.setPlayer1score(Integer.parseInt(textArea.getText()));
					s.setPlayer2score(Integer.parseInt(textArea_1.getText()));
					
					try {
						FileOutputStream fos=new FileOutputStream(f);
						ObjectOutputStream oos = new ObjectOutputStream(fos);
						oos.writeObject(s);
						oos.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			}
			
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(9)
							.addComponent(lblgame, GroupLayout.PREFERRED_SIZE, 548, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(116)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(31)
									.addComponent(btnCheckScore)
									.addGap(44)
									.addComponent(btnNewButton))
								.addComponent(lblintro))))
					.addContainerGap(9, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(38)
					.addComponent(lblPlayer, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
					.addComponent(lblPlayer_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(41))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addComponent(lblgame, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(label, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
								.addComponent(textArea, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
								.addComponent(lblPlayer, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
								.addComponent(textArea_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
							.addGap(67)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton)
								.addComponent(btnCheckScore))
							.addGap(126))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblPlayer_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(214)))
					.addComponent(lblintro, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	
	
	}

