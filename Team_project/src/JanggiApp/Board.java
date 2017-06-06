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
	private JButton bjol1, bjol2, bjol3, bjol4, bjol5, rjol1, rjol2, rjol3, rjol4, rjol5, rpo1, rpo2;
	private JButton bpo1, bpo2, rjang, bjang, rcha1, rcha2, bcha1, bcha2, rsang1, rsang2, bsang1, bsang2, rma1, rma2,
			bma1, bma2;
	private JButton rsa1, rsa2, bsa1, bsa2;
	private JPanel contentPane;
	private static int xx, mx;
	private static int yy, my;
	private static int temp_x;
	private static int temp_y;
	private static int x, y;
	final static int BJANG = 1, BCHA = 2, BJOL = 3, BSA = 4, RJANG = 11, RCHA = 12, RJOL = 13, RSA = 14;
	int[][] location = { 
			{ RCHA, 0, 0, RJOL, 0, 0, BJOL, 0, 0, BCHA }, 
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, RJOL, 0, 0, BJOL, 0, 0, 0 }, 
			{ RSA, 0, 0, 0, 0, 0, 0, 0, 0, BSA },
			{ 0, RJANG, 0, RJOL, 0, 0, BJOL, 0, BJANG, 0 }, 
			{ RSA, 0, 0, 0, 0, 0, 0, 0, 0, BSA },
			{ 0, 0, 0, RJOL, 0, 0, BJOL, 0, 0, 0 }, 
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ RCHA, 0, 0, RJOL, 0, 0, BJOL, 0, 0, BCHA }

	};
	PieceMove jm = new JolMove();
	CheckPiece cp= new CheckPiece();
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

		rjol1 = new JButton(new ImageIcon("red_jol.png"));
		rjol1.setBackground(Color.RED);
		rjol1.setBorderPainted(false);
		rjol1.setContentAreaFilled(false);
		rjol1.setFocusPainted(false);
		rjol1.setSize(50, 50);
		rjol1.setLocation(30, 315);
		x = rjol1.getLocation().x;
		y = rjol1.getLocation().y;
		contentPane.add(rjol1);
		rjol1.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				xx = e.getX() - temp_x + rjol1.getLocation().x;
				yy = e.getY() - temp_y + rjol1.getLocation().y;
				mx = jm.movex(x, xx);
				my = jm.movey(y, yy);
			}
		});
		rjol1.addMouseListener(new MouseAdapter() {
	
			public void mousePressed(MouseEvent e) {
				temp_x = e.getX();
				temp_y = e.getY();
			}
			public void mouseReleased(MouseEvent arg0) {
				if (jm.move(location, mx, my, x / 95, y / 95,rjol1.getBackground()) == true)
				{
					if (location[mx][my]!=0) 
					{
						int dx,dy;
						dx=mx*95+30;
						dy=my*95+30;
						if (location[mx][my]==BJOL)
						{
							if (dx==bjol1.getLocation().x && dy==bjol1.getLocation().y)
							{
								contentPane.remove(bjol1);
								contentPane.repaint();
							}
							if (dx==bjol2.getLocation().x && dy==bjol2.getLocation().y)
							{
								contentPane.remove(bjol2);
								contentPane.repaint();
							}
							if (dx==bjol3.getLocation().x && dy==bjol3.getLocation().y)
							{
								contentPane.remove(bjol3);
								contentPane.repaint();
							}
							if (dx==bjol4.getLocation().x && dy==bjol4.getLocation().y)
							{
								contentPane.remove(bjol4);
								contentPane.repaint();
							}
							if (dx==bjol5.getLocation().x && dy==bjol5.getLocation().y)
							{
								contentPane.remove(bjol5);
								contentPane.repaint();
							}	
						}
						else if (location[mx][my]==BCHA)
						{
							if (dx==bcha1.getLocation().x && dy==bcha1.getLocation().y)
							{
								contentPane.remove(bcha1);
								contentPane.repaint();
							}
							if (dx==bcha2.getLocation().x && dy==bcha2.getLocation().y)
							{
								contentPane.remove(bcha2);
								contentPane.repaint();
							}
						}
						else if (location[mx][my]==BJANG)
						{
							if (dx==bjang.getLocation().x && dy==bjang.getLocation().y)
							{
								contentPane.remove(bjang);
								contentPane.repaint();
							}
						}
						else 
						{
							if (dx==bsa1.getLocation().x && dy==bsa1.getLocation().y)
							{
								contentPane.remove(bsa1);
								contentPane.repaint();
							}
							if (dx==bsa2.getLocation().x && dy==bsa2.getLocation().y)
							{
								contentPane.remove(bsa2);
								contentPane.repaint();
							}
						}
					}	
					location[mx][my]=RJOL;
					location[x/95][y/95]=0;
					rjol1.setLocation(mx*95+30,my*95+30);
					x = rjol1.getLocation().x;
					y = rjol1.getLocation().y;
					
				}
			}
		});

		rjol2 = new JButton(new ImageIcon("red_jol.png"));
		rjol2.setBackground(Color.RED);
		rjol2.setBorderPainted(false);
		rjol2.setContentAreaFilled(false);
		rjol2.setFocusPainted(false);
		rjol2.setSize(50, 50);
		rjol2.setLocation(220, 315);
		contentPane.add(rjol2);

		rjol3 = new JButton(new ImageIcon("red_jol.png"));
		rjol3.setBackground(Color.RED);
		rjol3.setBorderPainted(false);
		rjol3.setContentAreaFilled(false);
		rjol3.setFocusPainted(false);
		rjol3.setSize(50, 50);
		rjol3.setLocation(410, 315);
		contentPane.add(rjol3);

		rjol4 = new JButton(new ImageIcon("red_jol.png"));
		rjol4.setBackground(Color.RED);
		rjol4.setBorderPainted(false);
		rjol4.setContentAreaFilled(false);
		rjol4.setFocusPainted(false);
		rjol4.setSize(50, 50);
		rjol4.setLocation(600, 315);
		contentPane.add(rjol4);

		rjol5 = new JButton(new ImageIcon("red_jol.png"));
		rjol5.setBackground(Color.RED);
		rjol5.setBorderPainted(false);
		rjol5.setContentAreaFilled(false);
		rjol5.setFocusPainted(false);
		rjol5.setSize(50, 50);
		rjol5.setLocation(790, 315);
		contentPane.add(rjol5);

		bjol1 = new JButton(new ImageIcon("blue_jol.png"));
		bjol1.setBackground(Color.BLUE);
		bjol1.setBorderPainted(false);
		bjol1.setContentAreaFilled(false);
		bjol1.setFocusPainted(false);
		bjol1.setSize(50, 50);
		bjol1.setLocation(30, 600);
		contentPane.add(bjol1);

		bjol2 = new JButton(new ImageIcon("blue_jol.png"));
		bjol2.setBackground(Color.BLUE);
		bjol2.setBorderPainted(false);
		bjol2.setContentAreaFilled(false);
		bjol2.setFocusPainted(false);
		bjol2.setSize(50, 50);
		bjol2.setLocation(220, 600);
		contentPane.add(bjol2);

		bjol3 = new JButton(new ImageIcon("blue_jol.png"));
		bjol3.setBackground(Color.BLUE);
		bjol3.setBorderPainted(false);
		bjol3.setContentAreaFilled(false);
		bjol3.setFocusPainted(false);
		bjol3.setSize(50, 50);
		bjol3.setLocation(410, 600);
		contentPane.add(bjol3);

		bjol4 = new JButton(new ImageIcon("blue_jol.png"));
		bjol4.setBackground(Color.BLUE);
		bjol4.setBorderPainted(false);
		bjol4.setContentAreaFilled(false);
		bjol4.setFocusPainted(false);
		bjol4.setSize(50, 50);
		bjol4.setLocation(600, 600);
		contentPane.add(bjol4);

		bjol5 = new JButton(new ImageIcon("blue_jol.png"));
		bjol5.setBackground(Color.BLUE);
		bjol5.setBorderPainted(false);
		bjol5.setContentAreaFilled(false);
		bjol5.setFocusPainted(false);
		bjol5.setSize(50, 50);
		bjol5.setLocation(790, 600);
		contentPane.add(bjol5);

		rjang = new JButton(new ImageIcon("red_jang.png"));
		rjang.setBackground(Color.RED);
		rjang.setBorderPainted(false);
		rjang.setContentAreaFilled(false);
		rjang.setFocusPainted(false);
		rjang.setSize(50, 50);
		rjang.setLocation(410, 125);
		contentPane.add(rjang);

		bjang = new JButton(new ImageIcon("blue_jang.png"));
		bjang.setBackground(Color.BLUE);
		bjang.setBorderPainted(false);
		bjang.setContentAreaFilled(false);
		bjang.setFocusPainted(false);
		bjang.setSize(50, 50);
		bjang.setLocation(410, 795);
		contentPane.add(bjang);

		rcha1 = new JButton(new ImageIcon("red_cha.png"));
		rcha1.setBackground(Color.RED);
		rcha1.setBorderPainted(false);
		rcha1.setContentAreaFilled(false);
		rcha1.setFocusPainted(false);
		rcha1.setSize(50, 50);
		rcha1.setLocation(30, 30);
		contentPane.add(rcha1);

		rcha2 = new JButton(new ImageIcon("red_cha.png"));
		rcha2.setBackground(Color.RED);
		rcha2.setBorderPainted(false);
		rcha2.setContentAreaFilled(false);
		rcha2.setFocusPainted(false);
		rcha2.setSize(50, 50);
		rcha2.setLocation(790, 30);
		contentPane.add(rcha2);

		bcha1 = new JButton(new ImageIcon("blue_cha.png"));
		bcha1.setBackground(Color.BLUE);
		bcha1.setBorderPainted(false);
		bcha1.setContentAreaFilled(false);
		bcha1.setFocusPainted(false);
		bcha1.setSize(50, 50);
		bcha1.setLocation(30, 885);
		contentPane.add(bcha1);

		bcha2 = new JButton(new ImageIcon("blue_cha.png"));
		bcha2.setBackground(Color.BLUE);
		bcha2.setBorderPainted(false);
		bcha2.setContentAreaFilled(false);
		bcha2.setFocusPainted(false);
		bcha2.setSize(50, 50);
		bcha2.setLocation(790, 885);
		contentPane.add(bcha2);

		rsa1 = new JButton(new ImageIcon("red_sa.png"));
		rsa1.setBackground(Color.RED);
		rsa1.setBorderPainted(false);
		rsa1.setContentAreaFilled(false);
		rsa1.setFocusPainted(false);
		rsa1.setSize(50, 50);
		rsa1.setLocation(315, 30);
		contentPane.add(rsa1);

		rsa2 = new JButton(new ImageIcon("red_sa.png"));
		rsa2.setBackground(Color.RED);
		rsa2.setBorderPainted(false);
		rsa2.setContentAreaFilled(false);
		rsa2.setFocusPainted(false);
		rsa2.setSize(50, 50);
		rsa2.setLocation(505, 30);
		contentPane.add(rsa2);

		bsa1 = new JButton(new ImageIcon("blue_sa.png"));
		bsa1.setBackground(Color.BLUE);
		bsa1.setBorderPainted(false);
		bsa1.setContentAreaFilled(false);
		bsa1.setFocusPainted(false);
		bsa1.setSize(50, 50);
		bsa1.setLocation(315, 885);
		contentPane.add(bsa1);

		bsa2 = new JButton(new ImageIcon("blue_sa.png"));
		bsa2.setBackground(Color.BLUE);
		bsa2.setBorderPainted(false);
		bsa2.setContentAreaFilled(false);
		bsa2.setFocusPainted(false);
		bsa2.setSize(50, 50);
		bsa2.setLocation(505, 885);
		contentPane.add(bsa2);
	}
}