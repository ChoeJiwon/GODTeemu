package JanggiApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Board extends JFrame {
	private JButton bjol1, bjol2, bjol3, bjol4, bjol5,rjol1, rjol2, rjol3, rjol4, rjol5;
	private JPanel contentPane, boardpiece;

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
		final int BJANG = 1, BCHA = 2, BPO = 3, BSANG = 4, BMA = 5, BJOL = 6, BSA = 7, RJANG = 11, RCHA = 12, RPO = 13,
				RSANG = 14, RMA = 15, RJOL = 16, RSA = 17;
		int i, j;
		int[][] location = { { BCHA, 0, 0, BJOL, 0, 0, RJOL, 0, 0, RCHA }, { BSANG, 0, BPO, 0, 0, 0, 0, RPO, 0, RMA },
				{ BMA, 0, 0, BJOL, 0, 0, RJOL, 0, 0, RSANG }, { BSA, 0, 0, 0, 0, 0, 0, 0, 0, RSA },
				{ 0, BJANG, 0, BJOL, 0, 0, RJOL, 0, RJANG, 0 }, { BSA, 0, 0, 0, 0, 0, 0, 0, 0, RSA },
				{ BSANG, 0, 0, BJOL, 0, 0, RJOL, 0, 0, RSANG }, { BMA, 0, BPO, 0, 0, 0, 0, RPO, 0, RMA },
				{ BCHA, 0, 0, BJOL, 0, 0, RJOL, 0, 0, RCHA }

		};
		setBounds(10, 10, 719, 489);
		setSize(1000, 1000);
		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {
				Image img = new ImageIcon("board.png").getImage();
				g.drawImage(img, 0, 0, null);
			}
		};

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		rjol1 = new JButton(new ImageIcon("red_jol.png"));
		rjol1.setBackground(Color.RED);
		rjol1.setBorderPainted(false);
		rjol1.setContentAreaFilled(false);
		rjol1.setFocusPainted(false);
		rjol1.setSize(50, 50);
		rjol1.setLocation(95, 315);
		contentPane.add(rjol1);

		rjol2 = new JButton(new ImageIcon("red_jol.png"));
		rjol2.setBackground(Color.RED);
		rjol2.setBorderPainted(false);
		rjol2.setContentAreaFilled(false);
		rjol2.setFocusPainted(false);
		rjol2.setSize(50, 50);
		rjol2.setLocation(285, 315);
		contentPane.add(rjol2);

		rjol3 = new JButton(new ImageIcon("red_jol.png"));
		rjol3.setBackground(Color.RED);
		rjol3.setBorderPainted(false);
		rjol3.setContentAreaFilled(false);
		rjol3.setFocusPainted(false);
		rjol3.setSize(50, 50);
		rjol3.setLocation(475, 315);
		contentPane.add(rjol3);

		rjol4 = new JButton(new ImageIcon("red_jol.png"));
		rjol4.setBackground(Color.RED);
		rjol4.setBorderPainted(false);
		rjol4.setContentAreaFilled(false);
		rjol4.setFocusPainted(false);
		rjol4.setSize(50, 50);
		rjol4.setLocation(665, 315);
		contentPane.add(rjol4);

		rjol5 = new JButton(new ImageIcon("red_jol.png"));
		rjol5.setBackground(Color.RED);
		rjol5.setBorderPainted(false);
		rjol5.setContentAreaFilled(false);
		rjol5.setFocusPainted(false);
		rjol5.setSize(50, 50);
		rjol5.setLocation(855, 315);
		contentPane.add(rjol5);

		bjol1 = new JButton(new ImageIcon("blue_jol.png"));
		bjol1.setBackground(Color.BLUE);
		bjol1.setBorderPainted(false);
		bjol1.setContentAreaFilled(false);
		bjol1.setFocusPainted(false);
		bjol1.setSize(50, 50);
		bjol1.setLocation(95, 315);
		contentPane.add(bjol1);

		bjol2 = new JButton(new ImageIcon("blue_jol.png"));
		bjol2.setBackground(Color.BLUE);
		bjol2.setBorderPainted(false);
		bjol2.setContentAreaFilled(false);
		bjol2.setFocusPainted(false);
		bjol2.setSize(50, 50);
		bjol2.setLocation(285, 315);
		contentPane.add(bjol2);

		bjol3 = new JButton(new ImageIcon("blue_jol.png"));
		bjol3.setBackground(Color.BLUE);
		bjol3.setBorderPainted(false);
		bjol3.setContentAreaFilled(false);
		bjol3.setFocusPainted(false);
		bjol3.setSize(50, 50);
		bjol3.setLocation(475, 315);
		contentPane.add(bjol3);

		bjol4 = new JButton(new ImageIcon("blue_jol.png"));
		bjol4.setBackground(Color.BLUE);
		bjol4.setBorderPainted(false);
		bjol4.setContentAreaFilled(false);
		bjol4.setFocusPainted(false);
		bjol4.setSize(50, 50);
		bjol4.setLocation(665, 315);
		contentPane.add(bjol4);

		bjol5 = new JButton(new ImageIcon("blue_jol.png"));
		bjol5.setBackground(Color.BLUE);
		bjol5.setBorderPainted(false);
		bjol5.setContentAreaFilled(false);
		bjol5.setFocusPainted(false);
		bjol5.setSize(50, 50);
		bjol5.setLocation(855, 315);
		contentPane.add(bjol5);
	}
}