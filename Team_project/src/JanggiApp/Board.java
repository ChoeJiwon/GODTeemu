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
	private JButton bjol1, bjol2, bjol3, bjol4, bjol5,rjol1, rjol2, rjol3, rjol4, rjol5,rpo1,rpo2;
	private JButton bpo1,bpo2,rjang,bjang,rcha1,rcha2,bcha1,bcha2,rsang1,rsang2,bsang1,bsang2,rma1,rma2,bma1,bma2;
	private JButton rsa1,rsa2,bsa1,bsa2;
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
		bjol1.setLocation(95, 600);
		contentPane.add(bjol1);

		bjol2 = new JButton(new ImageIcon("blue_jol.png"));
		bjol2.setBackground(Color.BLUE);
		bjol2.setBorderPainted(false);
		bjol2.setContentAreaFilled(false);
		bjol2.setFocusPainted(false);
		bjol2.setSize(50, 50);
		bjol2.setLocation(285, 600);
		contentPane.add(bjol2);

		bjol3 = new JButton(new ImageIcon("blue_jol.png"));
		bjol3.setBackground(Color.BLUE);
		bjol3.setBorderPainted(false);
		bjol3.setContentAreaFilled(false);
		bjol3.setFocusPainted(false);
		bjol3.setSize(50, 50);
		bjol3.setLocation(475, 600);
		contentPane.add(bjol3);

		bjol4 = new JButton(new ImageIcon("blue_jol.png"));
		bjol4.setBackground(Color.BLUE);
		bjol4.setBorderPainted(false);
		bjol4.setContentAreaFilled(false);
		bjol4.setFocusPainted(false);
		bjol4.setSize(50, 50);
		bjol4.setLocation(665, 600);
		contentPane.add(bjol4);

		bjol5 = new JButton(new ImageIcon("blue_jol.png"));
		bjol5.setBackground(Color.BLUE);
		bjol5.setBorderPainted(false);
		bjol5.setContentAreaFilled(false);
		bjol5.setFocusPainted(false);
		bjol5.setSize(50, 50);
		bjol5.setLocation(855, 600);
		contentPane.add(bjol5);
		
		rpo1=new JButton(new ImageIcon("red_po.png"));
		rpo1.setBackground(Color.RED);
		rpo1.setBorderPainted(false);
		rpo1.setContentAreaFilled(false);
		rpo1.setFocusPainted(false);
		rpo1.setSize(50,50);
		rpo1.setLocation(190,220);
		contentPane.add(rpo1);

		rpo2=new JButton(new ImageIcon("red_po.png"));
		rpo2.setBackground(Color.RED);
		rpo2.setBorderPainted(false);
		rpo2.setContentAreaFilled(false);
		rpo2.setFocusPainted(false);
		rpo2.setSize(50,50);
		rpo2.setLocation(760,220);
		contentPane.add(rpo2);
		
		bpo1=new JButton(new ImageIcon("blue_po.png"));
		bpo1.setBackground(Color.BLUE);
		bpo1.setBorderPainted(false);
		bpo1.setContentAreaFilled(false);
		bpo1.setFocusPainted(false);
		bpo1.setSize(50,50);
		bpo1.setLocation(190,695);
		contentPane.add(bpo1);

		bpo2=new JButton(new ImageIcon("blue_po.png"));
		bpo2.setBackground(Color.BLUE);
		bpo2.setBorderPainted(false);
		bpo2.setContentAreaFilled(false);
		bpo2.setFocusPainted(false);
		bpo2.setSize(50,50);
		bpo2.setLocation(760,695);
		contentPane.add(bpo2);
		
		rjang=new JButton(new ImageIcon("red_jang.png"));
		rjang.setBackground(Color.RED);
		rjang.setBorderPainted(false);
		rjang.setContentAreaFilled(false);
		rjang.setFocusPainted(false);
		rjang.setSize(50,50);
		rjang.setLocation(475,125);
		contentPane.add(rjang);
		
		bjang=new JButton(new ImageIcon("blue_jang.png"));
		bjang.setBackground(Color.BLUE);
		bjang.setBorderPainted(false);
		bjang.setContentAreaFilled(false);
		bjang.setFocusPainted(false);
		bjang.setSize(50,50);
		bjang.setLocation(475,795);
		contentPane.add(bjang);
		
		rcha1=new JButton(new ImageIcon("red_cha.png"));
		rcha1.setBackground(Color.RED);
		rcha1.setBorderPainted(false);
		rcha1.setContentAreaFilled(false);
		rcha1.setFocusPainted(false);
		rcha1.setSize(50,50);
		rcha1.setLocation(95,30);
		contentPane.add(rcha1);

		rcha2=new JButton(new ImageIcon("red_cha.png"));
		rcha2.setBackground(Color.RED);
		rcha2.setBorderPainted(false);
		rcha2.setContentAreaFilled(false);
		rcha2.setFocusPainted(false);
		rcha2.setSize(50,50);
		rcha2.setLocation(855,30);
		contentPane.add(rcha2);

		bcha1=new JButton(new ImageIcon("blue_cha.png"));
		bcha1.setBackground(Color.BLUE);
		bcha1.setBorderPainted(false);
		bcha1.setContentAreaFilled(false);
		bcha1.setFocusPainted(false);
		bcha1.setSize(50,50);
		bcha1.setLocation(95,885);
		contentPane.add(bcha1);

		bcha2=new JButton(new ImageIcon("blue_cha.png"));
		bcha2.setBackground(Color.BLUE);
		bcha2.setBorderPainted(false);
		bcha2.setContentAreaFilled(false);
		bcha2.setFocusPainted(false);
		bcha2.setSize(50,50);
		bcha2.setLocation(855,885);
		contentPane.add(bcha2);
		
		rsang1=new JButton(new ImageIcon("red_sang.png"));
		rsang1.setBackground(Color.RED);
		rsang1.setBorderPainted(false);
		rsang1.setContentAreaFilled(false);
		rsang1.setFocusPainted(false);
		rsang1.setSize(50,50);
		rsang1.setLocation(190,30);
		contentPane.add(rsang1);
		
		rsang2=new JButton(new ImageIcon("red_sang.png"));
		rsang2.setBackground(Color.RED);
		rsang2.setBorderPainted(false);
		rsang2.setContentAreaFilled(false);
		rsang2.setFocusPainted(false);
		rsang2.setSize(50,50);
		rsang2.setLocation(760,30);
		contentPane.add(rsang2);
		
		bsang1=new JButton(new ImageIcon("blue_sang.png"));
		bsang1.setBackground(Color.BLUE);
		bsang1.setBorderPainted(false);
		bsang1.setContentAreaFilled(false);
		bsang1.setFocusPainted(false);
		bsang1.setSize(50,50);
		bsang1.setLocation(190,885);
		contentPane.add(bsang1);
		
		bsang2=new JButton(new ImageIcon("blue_sang.png"));
		bsang2.setBackground(Color.BLUE);
		bsang2.setBorderPainted(false);
		bsang2.setContentAreaFilled(false);
		bsang2.setFocusPainted(false);
		bsang2.setSize(50,50);
		bsang2.setLocation(760,885);
		contentPane.add(bsang2);
		
		rma1=new JButton(new ImageIcon("red_ma.png"));
		rma1.setBackground(Color.RED);
		rma1.setBorderPainted(false);
		rma1.setContentAreaFilled(false);
		rma1.setFocusPainted(false);
		rma1.setSize(50,50);
		rma1.setLocation(285,30);
		contentPane.add(rma1);
		
		rma2=new JButton(new ImageIcon("red_ma.png"));
		rma2.setBackground(Color.RED);
		rma2.setBorderPainted(false);
		rma2.setContentAreaFilled(false);
		rma2.setFocusPainted(false);
		rma2.setSize(50,50);
		rma2.setLocation(665,30);
		contentPane.add(rma2);
		
		bma1=new JButton(new ImageIcon("blue_ma.png"));
		bma1.setBackground(Color.BLUE);
		bma1.setBorderPainted(false);
		bma1.setContentAreaFilled(false);
		bma1.setFocusPainted(false);
		bma1.setSize(50,50);
		bma1.setLocation(285,885);
		contentPane.add(bma1);
		
		bma2=new JButton(new ImageIcon("blue_ma.png"));
		bma2.setBackground(Color.BLUE);
		bma2.setBorderPainted(false);
		bma2.setContentAreaFilled(false);
		bma2.setFocusPainted(false);
		bma2.setSize(50,50);
		bma2.setLocation(665,885);
		contentPane.add(bma2);
		
		rsa1=new JButton(new ImageIcon("red_sa.png"));
		rsa1.setBackground(Color.RED);
		rsa1.setBorderPainted(false);
		rsa1.setContentAreaFilled(false);
		rsa1.setFocusPainted(false);
		rsa1.setSize(50,50);
		rsa1.setLocation(380,30);
		contentPane.add(rsa1);
		
		rsa2=new JButton(new ImageIcon("red_sa.png"));
		rsa2.setBackground(Color.RED);
		rsa2.setBorderPainted(false);
		rsa2.setContentAreaFilled(false);
		rsa2.setFocusPainted(false);
		rsa2.setSize(50,50);
		rsa2.setLocation(570,30);
		contentPane.add(rsa2);
		
		bsa1=new JButton(new ImageIcon("blue_sa.png"));
		bsa1.setBackground(Color.BLUE);
		bsa1.setBorderPainted(false);
		bsa1.setContentAreaFilled(false);
		bsa1.setFocusPainted(false);
		bsa1.setSize(50,50);
		bsa1.setLocation(380,885);
		contentPane.add(bsa1);
		
		bsa2=new JButton(new ImageIcon("blue_sa.png"));
		bsa2.setBackground(Color.BLUE);
		bsa2.setBorderPainted(false);
		bsa2.setContentAreaFilled(false);
		bsa2.setFocusPainted(false);
		bsa2.setSize(50,50);
		bsa2.setLocation(570,885);
		contentPane.add(bsa2);
	}
}