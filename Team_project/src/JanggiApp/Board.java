package JanggiApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseMotionAdapter;

public class Board extends JFrame {
	private JButton rjol1 = new JButton(new ImageIcon("red_jol.png"));
	private JButton rjol2 = new JButton(new ImageIcon("red_jol.png"));
	private JButton rjol3 = new JButton(new ImageIcon("red_jol.png"));
	private JButton rjol4 = new JButton(new ImageIcon("red_jol.png"));
	private JButton rjol5 = new JButton(new ImageIcon("red_jol.png"));
	private JButton bjol1 = new JButton(new ImageIcon("blue_jol.png"));
	private JButton bjol2 = new JButton(new ImageIcon("blue_jol.png"));
	private JButton bjol3 = new JButton(new ImageIcon("blue_jol.png"));
	private JButton bjol4 = new JButton(new ImageIcon("blue_jol.png"));
	private JButton bjol5 = new JButton(new ImageIcon("blue_jol.png"));
	
	private JButton rjang = new JButton(new ImageIcon("red_jang.png"));
	private JButton bjang = new JButton(new ImageIcon("blue_jang.png"));
	
	private JButton bcha1 = new JButton(new ImageIcon("blue_cha.png"));
	private JButton bcha2 = new JButton(new ImageIcon("blue_cha.png"));
	private JButton rcha1 = new JButton(new ImageIcon("red_cha.png"));
	private JButton rcha2 = new JButton(new ImageIcon("red_cha.png"));
	
	private JButton rsa1 = new JButton(new ImageIcon("red_sa.png"));
	private JButton rsa2 = new JButton(new ImageIcon("red_sa.png"));
	private JButton bsa1 = new JButton(new ImageIcon("blue_sa.png"));
	private JButton bsa2 = new JButton(new ImageIcon("blue_sa.png"));
	
	private JPanel contentPane;
	static int turn=0;
	final static int BJANG = 1, BCHA = 2, BJOL = 3, BSA = 4, RJANG = 11, RCHA = 12, RJOL = 13, RSA = 14;
	int[][] location = { { RCHA, 0, 0, RJOL, 0, 0, BJOL, 0, 0, BCHA }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, RJOL, 0, 0, BJOL, 0, 0, 0 }, { RSA, 0, 0, 0, 0, 0, 0, 0, 0, BSA },
			{ 0, RJANG, 0, RJOL, 0, 0, BJOL, 0, BJANG, 0 }, { RSA, 0, 0, 0, 0, 0, 0, 0, 0, BSA },
			{ 0, 0, 0, RJOL, 0, 0, BJOL, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ RCHA, 0, 0, RJOL, 0, 0, BJOL, 0, 0, BCHA }

	};
	PieceMove jm = new JolMove();
	PieceMove cm = new ChaMove();
	PieceMove jsm = new JangSaMove();

	/**
	 * Launch the application.
	 */
	public void go() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board frame = new Board();
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
	public Board() {

		setBounds(10, 10, 719, 489);
		setSize(890, 1000);
		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {
				Image img = new ImageIcon("board.png").getImage();
				g.drawImage(img, 0, 0, null);
			}
		};

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rjol1.setBackground(Color.RED);
		rjol1.setBorderPainted(false);
		rjol1.setContentAreaFilled(false);
		rjol1.setFocusPainted(false);
		rjol1.setSize(50, 50);
		rjol1.setLocation(30, 315);
		contentPane.add(rjol1);
		new MoveAndRemove().Drag(rjol1, jm);
		new MoveAndRemove().RRemove(rjol1, jm, location, contentPane, bjol1, bjol2
				, bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);

		
		rjol2.setBackground(Color.RED);
		rjol2.setBorderPainted(false);
		rjol2.setContentAreaFilled(false);
		rjol2.setFocusPainted(false);
		rjol2.setSize(50, 50);
		rjol2.setLocation(220, 315);
		contentPane.add(rjol2);
		new MoveAndRemove().Drag(rjol2, jm);
		new MoveAndRemove().RRemove(rjol2, jm, location, contentPane, bjol1, bjol2
				, bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
		
		rjol3.setBackground(Color.RED);
		rjol3.setBorderPainted(false);
		rjol3.setContentAreaFilled(false);
		rjol3.setFocusPainted(false);
		rjol3.setSize(50, 50);
		rjol3.setLocation(410, 315);
		contentPane.add(rjol3);
		new MoveAndRemove().Drag(rjol3, jm);
		new MoveAndRemove().RRemove(rjol3, jm, location, contentPane, bjol1, bjol2
				, bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
		
		rjol4.setBackground(Color.RED);
		rjol4.setBorderPainted(false);
		rjol4.setContentAreaFilled(false);
		rjol4.setFocusPainted(false);
		rjol4.setSize(50, 50);
		rjol4.setLocation(600, 315);
		contentPane.add(rjol4);
		new MoveAndRemove().Drag(rjol4, jm);
		new MoveAndRemove().RRemove(rjol4, jm, location, contentPane, bjol1, bjol2
				, bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
		
		rjol5.setBackground(Color.RED);
		rjol5.setBorderPainted(false);
		rjol5.setContentAreaFilled(false);
		rjol5.setFocusPainted(false);
		rjol5.setSize(50, 50);
		rjol5.setLocation(790, 315);
		contentPane.add(rjol5);
		new MoveAndRemove().Drag(rjol5, jm);
		new MoveAndRemove().RRemove(rjol5, jm, location, contentPane, bjol1, bjol2
				, bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
		
		bjol1.setBackground(Color.BLUE);
		bjol1.setBorderPainted(false);
		bjol1.setContentAreaFilled(false);
		bjol1.setFocusPainted(false);
		bjol1.setSize(50, 50);
		bjol1.setLocation(30, 600);
		contentPane.add(bjol1);
		new MoveAndRemove().Drag(bjol1, jm);
		new MoveAndRemove().BRemove(bjol1, jm, location, contentPane, rjol1, rjol2
				, rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
				
		bjol2.setBackground(Color.BLUE);
		bjol2.setBorderPainted(false);
		bjol2.setContentAreaFilled(false);
		bjol2.setFocusPainted(false);
		bjol2.setSize(50, 50);
		bjol2.setLocation(220, 600);
		contentPane.add(bjol2);
		new MoveAndRemove().Drag(bjol2, jm);
		new MoveAndRemove().BRemove(bjol2, jm, location, contentPane, rjol1, rjol2
				, rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
		
		bjol3.setBackground(Color.BLUE);
		bjol3.setBorderPainted(false);
		bjol3.setContentAreaFilled(false);
		bjol3.setFocusPainted(false);
		bjol3.setSize(50, 50);
		bjol3.setLocation(410, 600);
		contentPane.add(bjol3);
		new MoveAndRemove().Drag(bjol3, jm);
		new MoveAndRemove().BRemove(bjol3, jm, location, contentPane, rjol1, rjol2
				, rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
		
		bjol4.setBackground(Color.BLUE);
		bjol4.setBorderPainted(false);
		bjol4.setContentAreaFilled(false);
		bjol4.setFocusPainted(false);
		bjol4.setSize(50, 50);
		bjol4.setLocation(600, 600);
		contentPane.add(bjol4);
		new MoveAndRemove().Drag(bjol4, jm);
		new MoveAndRemove().BRemove(bjol4, jm, location, contentPane, rjol1, rjol2
				, rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
				
		bjol5.setBackground(Color.BLUE);
		bjol5.setBorderPainted(false);
		bjol5.setContentAreaFilled(false);
		bjol5.setFocusPainted(false);
		bjol5.setSize(50, 50);
		bjol5.setLocation(790, 600);
		contentPane.add(bjol5);
		new MoveAndRemove().Drag(bjol5, jm);
		new MoveAndRemove().BRemove(bjol5, jm, location, contentPane, rjol1, rjol2
				, rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
		
		rjang.setBackground(Color.RED);
		rjang.setBorderPainted(false);
		rjang.setContentAreaFilled(false);
		rjang.setFocusPainted(false);
		rjang.setSize(50, 50);
		rjang.setLocation(410, 125);
		contentPane.add(rjang);
		new MoveAndRemove().Drag(rjang, jsm);
		new MoveAndRemove().RRemove(rjang, jsm, location, contentPane, bjol1, bjol2
				, bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
		
			
		bjang.setBackground(Color.BLUE);
		bjang.setBorderPainted(false);
		bjang.setContentAreaFilled(false);
		bjang.setFocusPainted(false);
		bjang.setSize(50, 50);
		bjang.setLocation(410, 790);
		contentPane.add(bjang);
		new MoveAndRemove().Drag(bjang, jsm);
		new MoveAndRemove().BRemove(bjang, jsm, location, contentPane, rjol1, rjol2
				, rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
		
		rcha1.setBackground(Color.RED);
		rcha1.setBorderPainted(false);
		rcha1.setContentAreaFilled(false);
		rcha1.setFocusPainted(false);
		rcha1.setSize(50, 50);
		rcha1.setLocation(30, 30);
		contentPane.add(rcha1);
		new MoveAndRemove().Drag(rcha1, cm);
		new MoveAndRemove().RRemove(rcha1, cm, location, contentPane, bjol1, bjol2
				, bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
		
		rcha2.setBackground(Color.RED);
		rcha2.setBorderPainted(false);
		rcha2.setContentAreaFilled(false);
		rcha2.setFocusPainted(false);
		rcha2.setSize(50, 50);
		rcha2.setLocation(790, 30);
		contentPane.add(rcha2);
		new MoveAndRemove().Drag(rcha2, cm);
		new MoveAndRemove().RRemove(rcha2, cm, location, contentPane, bjol1, bjol2
				, bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
		
	

		
		bcha1.setBackground(Color.BLUE);
		bcha1.setBorderPainted(false);
		bcha1.setContentAreaFilled(false);
		bcha1.setFocusPainted(false);
		bcha1.setSize(50, 50);
		bcha1.setLocation(30, 885);
		contentPane.add(bcha1);
		new MoveAndRemove().Drag(bcha1, cm);
		new MoveAndRemove().BRemove(bcha1, cm, location, contentPane, rjol1, rjol2
				, rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
	
		
		bcha2.setBackground(Color.BLUE);
		bcha2.setBorderPainted(false);
		bcha2.setContentAreaFilled(false);
		bcha2.setFocusPainted(false);
		bcha2.setSize(50, 50);
		bcha2.setLocation(790, 885);
		contentPane.add(bcha2);
		new MoveAndRemove().Drag(bcha2, cm);
		new MoveAndRemove().BRemove(bcha2, cm, location, contentPane, rjol1, rjol2
				, rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
	
		
		rsa1.setBackground(Color.RED);
		rsa1.setBorderPainted(false);
		rsa1.setContentAreaFilled(false);
		rsa1.setFocusPainted(false);
		rsa1.setSize(50, 50);
		rsa1.setLocation(315, 30);
		contentPane.add(rsa1);
		new MoveAndRemove().Drag(rsa1, jsm);
		new MoveAndRemove().RRemove(rsa1, jsm, location, contentPane, bjol1, bjol2
				, bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
				
		rsa2.setBackground(Color.RED);
		rsa2.setBorderPainted(false);
		rsa2.setContentAreaFilled(false);
		rsa2.setFocusPainted(false);
		rsa2.setSize(50, 50);
		rsa2.setLocation(505, 30);
		contentPane.add(rsa2);
		new MoveAndRemove().Drag(rsa2, jsm);
		new MoveAndRemove().RRemove(rsa2, jsm, location, contentPane, bjol1, bjol2
				, bjol3, bjol4, bjol5, bcha1, bcha2, bjang, bsa1, bsa2);
				
		bsa1.setBackground(Color.BLUE);
		bsa1.setBorderPainted(false);
		bsa1.setContentAreaFilled(false);
		bsa1.setFocusPainted(false);
		bsa1.setSize(50, 50);
		bsa1.setLocation(315, 885);
		contentPane.add(bsa1);
		new MoveAndRemove().Drag(bsa1, jsm);
		new MoveAndRemove().BRemove(bsa1, jsm, location, contentPane, rjol1, rjol2
				, rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
	
		
		
		bsa2.setBackground(Color.BLUE);
		bsa2.setBorderPainted(false);
		bsa2.setContentAreaFilled(false);
		bsa2.setFocusPainted(false);
		bsa2.setSize(50, 50);
		bsa2.setLocation(505, 885);
		contentPane.add(bsa2);
		new MoveAndRemove().Drag(bsa2, jsm);
		new MoveAndRemove().BRemove(bsa2, jsm, location, contentPane, rjol1, rjol2
				, rjol3, rjol4, rjol5, rcha1, rcha2, rjang, rsa1, rsa2);
	
	}
}