package JanggiApp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MoveAndRemove extends JFrame {

	JButton btn;
	PieceMove pm;
	int x, y, xx, yy, temp_x, temp_y, mx, my, Turn;
	int[][] location;
	JPanel pnl;
	JButton J1 = new JButton();
	JButton J2 = new JButton();
	JButton J3 = new JButton();
	JButton J4 = new JButton();
	JButton J5 = new JButton();
	JButton C1 = new JButton();
	JButton C2 = new JButton();
	JButton J = new JButton();
	JButton R1 = new JButton();
	JButton R2 = new JButton();
	ScoreFile sf = new ScoreFile();
	SoundSettingFile ssf = new SoundSettingFile();

	String name;

	public void Drag(JButton b, PieceMove p) {
		this.btn = b;
		this.pm = p;
		b.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				x = btn.getLocation().x;
				y = btn.getLocation().y;
				xx = e.getX() - temp_x + btn.getLocation().x;
				yy = e.getY() - temp_y + btn.getLocation().y;
				mx = pm.movex(x, xx);
				my = pm.movey(y, yy);
			}
		});

	}

	public void RRemove(JButton b, String n, PieceMove p, int[][] arr, JPanel pn, JButton j1, JButton j2, JButton j3,
			JButton j4, JButton j5, JButton c1, JButton c2, JButton j, JButton r1, JButton r2) {
		this.btn = b;
		this.pm = p;
		this.location = arr;
		this.pnl = pn;
		this.J1 = j1;
		this.J2 = j2;
		this.J3 = j3;
		this.J4 = j4;
		this.J5 = j5;
		this.C1 = c1;
		this.C2 = c2;
		this.J = j;
		this.R1 = r1;
		this.R2 = r2;
		this.name = n;
		btn.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				x = btn.getLocation().x;
				y = btn.getLocation().y;
				xx = e.getX() - temp_x + btn.getLocation().x;
				yy = e.getY() - temp_y + btn.getLocation().y;
				mx = pm.movex(x, xx);
				my = pm.movey(y, yy);
			}
		});
		btn.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				temp_x = e.getX();
				temp_y = e.getY();
			}

			public void mouseReleased(MouseEvent arg0) {
				if (pm.move(location, mx, my, x / 95, y / 95, btn.getBackground(), Board.turn) == true) {
					if (location[mx][my] != 0) {
						int dx, dy;
						dx = mx * 95 + 30;
						dy = my * 95 + 30;
						if (location[mx][my] == Board.BJOL) {
							if (dx == J1.getLocation().x && dy == J1.getLocation().y) {
								pnl.remove(J1);
								pnl.repaint();
							}
							if (dx == J2.getLocation().x && dy == J2.getLocation().y) {
								pnl.remove(J2);
								pnl.repaint();
							}
							if (dx == J3.getLocation().x && dy == J3.getLocation().y) {
								pnl.remove(J3);
								pnl.repaint();
							}
							if (dx == J4.getLocation().x && dy == J4.getLocation().y) {
								pnl.remove(J4);
								pnl.repaint();
							}
							if (dx == J5.getLocation().x && dy == J5.getLocation().y) {
								pnl.remove(J5);
								pnl.repaint();
							}
						} else if (location[mx][my] == Board.BCHA) {
							if (dx == C1.getLocation().x && dy == C1.getLocation().y) {
								pnl.remove(C1);
								pnl.repaint();
							}
							if (dx == C2.getLocation().x && dy == C2.getLocation().y) {
								pnl.remove(C2);
								pnl.repaint();
							}
						} else if (location[mx][my] == Board.BJANG) {
							if (dx == J.getLocation().x && dy == J.getLocation().y) {
								pnl.remove(J);
								pnl.repaint();

								int result = JOptionPane.showConfirmDialog(null,
										"You catch king! RED Win!\n\nDo you want to save a result?", "END",
										JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null);

								if (result == JOptionPane.YES_OPTION) {

									sf.storeScore(sf.readBScore(), sf.readRScore() + 1);
									System.out.println("RED " + sf.readRScore() + "Blue " + sf.readBScore());
								}

								System.exit(0);
							}
						} else {
							if (dx == R1.getLocation().x && dy == R1.getLocation().y) {
								pnl.remove(R1);
								pnl.repaint();
							}
							if (dx == R2.getLocation().x && dy == R2.getLocation().y) {
								pnl.remove(R2);
								pnl.repaint();
							}
						}
					}
					if (name.equals("rjol")) {
						location[mx][my] = Board.RJOL;
					} else if (name.equals("rcha")) {
						location[mx][my] = Board.RCHA;
					} else if (name.equals("rsa")) {
						location[mx][my] = Board.RSA;
					} else if (name.equals("jang")) {
						location[mx][my] = Board.RJANG;
					}
					location[x / 95][y / 95] = 0;
					btn.setLocation(mx * 95 + 30, my * 95 + 30);
					x = btn.getLocation().x;
					y = btn.getLocation().y;
					if (ssf.DeconductSerializing() == true)
						new Sound().PlaySound();
				}
			}
		});
	}

	public void BRemove(JButton b, String n, PieceMove p, int[][] arr, JPanel pn, JButton j1, JButton j2, JButton j3,
			JButton j4, JButton j5, JButton c1, JButton c2, JButton j, JButton r1, JButton r2) {
		this.btn = b;
		this.pm = p;
		this.location = arr;
		this.pnl = pn;
		this.J1 = j1;
		this.J2 = j2;
		this.J3 = j3;
		this.J4 = j4;
		this.J5 = j5;
		this.C1 = c1;
		this.C2 = c2;
		this.J = j;
		this.R1 = r1;
		this.R2 = r2;
		this.name = n;

		btn.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				x = btn.getLocation().x;
				y = btn.getLocation().y;
				xx = e.getX() - temp_x + btn.getLocation().x;
				yy = e.getY() - temp_y + btn.getLocation().y;
				mx = pm.movex(x, xx);
				my = pm.movey(y, yy);

			}
		});
		btn.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				temp_x = e.getX();
				temp_y = e.getY();

			}

			public void mouseReleased(MouseEvent arg0) {
				if (pm.move(location, mx, my, x / 95, y / 95, btn.getBackground(), Board.turn) == true) {
					if (location[mx][my] != 0) {
						int dx, dy;
						dx = mx * 95 + 30;
						dy = my * 95 + 30;
						if (location[mx][my] == Board.RJOL) {
							if (dx == J1.getLocation().x && dy == J1.getLocation().y) {
								pnl.remove(J1);
								pnl.repaint();
							}
							if (dx == J2.getLocation().x && dy == J2.getLocation().y) {
								pnl.remove(J2);
								pnl.repaint();
							}
							if (dx == J3.getLocation().x && dy == J3.getLocation().y) {
								pnl.remove(J3);
								pnl.repaint();
							}
							if (dx == J4.getLocation().x && dy == J4.getLocation().y) {
								pnl.remove(J4);
								pnl.repaint();
							}
							if (dx == J5.getLocation().x && dy == J5.getLocation().y) {
								pnl.remove(J5);
								pnl.repaint();
							}
						} else if (location[mx][my] == Board.RCHA) {
							if (dx == C1.getLocation().x && dy == C1.getLocation().y) {
								pnl.remove(C1);
								pnl.repaint();
							}
							if (dx == C2.getLocation().x && dy == C2.getLocation().y) {
								pnl.remove(C2);
								pnl.repaint();
							}
						} else if (location[mx][my] == Board.RJANG) {
							if (dx == J.getLocation().x && dy == J.getLocation().y) {
								pnl.remove(J);
								pnl.repaint();

								int result = JOptionPane.showConfirmDialog(null,
										"You catch king! BLUE Win!\n\nDo you want to save a result?", "END",
										JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
								if (result == JOptionPane.YES_OPTION) {

									sf.storeScore(sf.readBScore() + 1, sf.readRScore());
									System.out.println("RED " + sf.readRScore() + "Blue " + sf.readBScore());
								}

								System.exit(0);
							}
						} else {
							if (dx == R1.getLocation().x && dy == R1.getLocation().y) {
								pnl.remove(R1);
								pnl.repaint();
							}
							if (dx == R2.getLocation().x && dy == R2.getLocation().y) {
								pnl.remove(R2);
								pnl.repaint();
							}
						}
					}
					if (name.equals("bjol")) {
						location[mx][my] = Board.BJOL;
					} else if (name.equals("bcha")) {
						location[mx][my] = Board.BCHA;
					} else if (name.equals("bjang")) {
						location[mx][my] = Board.BJANG;
					} else if (name.equals("bsa")) {
						location[mx][my] = Board.RSA;
					}
					location[x / 95][y / 95] = 0;
					btn.setLocation(mx * 95 + 30, my * 95 + 30);
					x = btn.getLocation().x;
					y = btn.getLocation().y;
					if (ssf.DeconductSerializing() == true)
						new Sound().PlaySound();
				}
			}
		});
	}
}