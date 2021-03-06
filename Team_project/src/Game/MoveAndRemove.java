package Game;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Menu.ScoreFile;
import Menu.Sound;
import Menu.SoundSettingFile;
import Quiz.Quiz1;
import Quiz.Quiz3;

public class MoveAndRemove extends JFrame {

	JButton btn;
	PieceMove pm;
	int x, y, xx, yy, temp_x, temp_y, mx, my, Turn;
	int[][] location;
	JPanel pnl;
	JButton J1, J2, J3, J4, J5;
	JButton C1, C2;
	JButton J;
	JButton R1, R2;
	ScoreFile sf = new ScoreFile();
	SoundSettingFile ssf = new SoundSettingFile();
	int temp = 0;
	int temp2 = 0;
	Quiz1 q1 = new Quiz1();
	Quiz3 q3 = new Quiz3();

	String name;

	// If you drag a piece, it moves

	// If a red Piece eat a blue piece, that blue piece get removed
	public void RedMoveAndRemove(JButton b, String n, PieceMove p, int[][] arr, JPanel pn, JButton j1, JButton j2,
			JButton j3, JButton j4, JButton j5, JButton c1, JButton c2, JButton j, JButton r1, JButton r2) {

		this.btn = b; // button red piece : jol or jang or sa or cha
		this.pm = p; // red piece move : jolmove of jangmove or samove or
						// chamove
		this.location = arr; // red piece location : jol or jang or sa or cha
		this.pnl = pn; // panel which pieces is located
		this.J1 = j1; // blue piece jol1
		this.J2 = j2; //
		this.J3 = j3;
		this.J4 = j4;
		this.J5 = j5;
		this.C1 = c1; // blue piece cha1
		this.C2 = c2;
		this.J = j; // blue piece jang
		this.R1 = r1; // blue piece sa1
		this.R2 = r2;
		this.name = n; // string red piece : jol or jang or sa or cha

		btn.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				x = btn.getLocation().x;
				y = btn.getLocation().y;
				xx = e.getX() - temp_x + btn.getLocation().x;
				yy = e.getY() - temp_y + btn.getLocation().y; // when drag
																// piece, its
																// coordinate is
																// assigned.
				mx = pm.movex(x, xx);
				my = pm.movey(y, yy);
			}
		});
		btn.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				temp_x = e.getX();
				temp_y = e.getY(); // used at mouseDragged.
			}

			public void mouseReleased(MouseEvent arg0) {
				// if its piece move is correct, it moves. (move rule, and no
				// same team piece)
				if (pm.move(location, mx, my, x / 95, y / 95, btn.getBackground(), Board.turn) == true) {
					if (location[mx][my] != 0) {
						int dx, dy;
						dx = mx * 95 + 30;
						dy = my * 95 + 30;
						// when some opponent pieces is located where it moves,
						// remove opponent piece.
						if (location[mx][my] == Board.BJOL) {
							if (dx == J1.getLocation().x && dy == J1.getLocation().y) {
								pnl.remove(J1);
								pnl.repaint();
								Board.cnt++;
								temp = Board.cnt;
								if (temp == 2) {
									q1.go();
								} else if (temp == 4) {
									q3.go();
								}
							}
							if (dx == J2.getLocation().x && dy == J2.getLocation().y) {
								pnl.remove(J2);
								pnl.repaint();
								Board.cnt++;
								temp = Board.cnt;
								if (temp == 2) {
									q1.go();
								} else if (temp == 4) {
									q3.go();
								}
							}
							if (dx == J3.getLocation().x && dy == J3.getLocation().y) {
								pnl.remove(J3);
								pnl.repaint();
								Board.cnt++;
								temp = Board.cnt;
								if (temp == 2) {
									q1.go();
								} else if (temp == 4) {
									q3.go();
								}
							}
							if (dx == J4.getLocation().x && dy == J4.getLocation().y) {
								pnl.remove(J4);
								pnl.repaint();
								Board.cnt++;
								temp = Board.cnt;
								if (temp == 2) {
									q1.go();
								} else if (temp == 4) {
									q3.go();
								}
							}
							if (dx == J5.getLocation().x && dy == J5.getLocation().y) {
								pnl.remove(J5);
								pnl.repaint();
								Board.cnt++;
								temp = Board.cnt;
								if (temp == 2) {
									q1.go();
								} else if (temp == 4) {
									q3.go();
								}
							}
						} else if (location[mx][my] == Board.BCHA) {
							if (dx == C1.getLocation().x && dy == C1.getLocation().y) {
								pnl.remove(C1);
								pnl.repaint();
								Board.cnt++;
								temp = Board.cnt;
								if (temp == 2) {
									q1.go();
								} else if (temp == 4) {
									q3.go();
								}
							}
							if (dx == C2.getLocation().x && dy == C2.getLocation().y) {
								pnl.remove(C2);
								pnl.repaint();
								Board.cnt++;
								temp = Board.cnt;
								if (temp == 2) {
									q1.go();
								} else if (temp == 4) {
									q3.go();
								}
							}
						} else if (location[mx][my] == Board.BJANG) {

							pnl.remove(J);
							pnl.repaint();
							Board.cnt++;
							temp = Board.cnt;
							if (temp == 2) {
								q1.go();
							} else if (temp == 4) {
								q3.go();
							}
							int result = JOptionPane.showConfirmDialog(null,
									"You catch king! RED Win!\n\nDo you want to save a result?", "END",
									JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null);

							if (result == JOptionPane.YES_OPTION) {

								sf.storeScore(sf.readBScore(), sf.readRScore() + 1);
								System.out.println("RED " + sf.readRScore() + "Blue " + sf.readBScore());
							}

							System.exit(0);

						} else {
							if (dx == R1.getLocation().x && dy == R1.getLocation().y) {
								pnl.remove(R1);
								pnl.repaint();
								Board.cnt++;
								temp = Board.cnt;
								if (temp == 2) {
									q1.go();
								} else if (temp == 4) {
									q3.go();
								}
							}
							if (dx == R2.getLocation().x && dy == R2.getLocation().y) {
								pnl.remove(R2);
								pnl.repaint();
								Board.cnt++;
								temp = Board.cnt;
								if (temp == 2) {
									q1.go();
								} else if (temp == 4) {
									q3.go();
								}
							}
						}

					}

					// piece location is changed. for interaction between all
					// pieces
					if (name.equals("rjol")) {
						location[mx][my] = Board.RJOL;
					} else if (name.equals("rcha")) {
						location[mx][my] = Board.RCHA;
					} else if (name.equals("rsa")) {
						location[mx][my] = Board.RSA;
					} else if (name.equals("rjang")) {
						location[mx][my] = Board.RJANG;
					}
					location[x / 95][y / 95] = 0;
					btn.setLocation(mx * 95 + 30, my * 95 + 30); // piece is
																	// located
																	// at panel.
					x = btn.getLocation().x;
					y = btn.getLocation().y;
					if (ssf.DeconductSerializing() == true) // sound setting is
															// on, play sound
						new Sound().PlaySound();
				}
			}
		});
	}

	// same as RedMoveAndRemove
	public void BlueMoveAndRemove(JButton b, String n, PieceMove p, int[][] arr, JPanel pn, JButton j1, JButton j2,
			JButton j3, JButton j4, JButton j5, JButton c1, JButton c2, JButton j, JButton r1, JButton r2) {
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
								Board.cnt2++;
								temp2 = Board.cnt2;
								if (temp2 == 2) {
									q1.go();
								} else if (temp2 == 4) {
									q3.go();
								}
							}
							if (dx == J2.getLocation().x && dy == J2.getLocation().y) {
								pnl.remove(J2);
								pnl.repaint();
								Board.cnt2++;
								temp2 = Board.cnt2;
								if (temp2 == 2) {
									q1.go();
								} else if (temp2 == 4) {
									q3.go();
								}
							}
							if (dx == J3.getLocation().x && dy == J3.getLocation().y) {
								pnl.remove(J3);
								pnl.repaint();
								Board.cnt2++;
								temp2 = Board.cnt2;
								if (temp2 == 2) {
									q1.go();
								} else if (temp2 == 4) {
									q3.go();
								}
							}
							if (dx == J4.getLocation().x && dy == J4.getLocation().y) {
								pnl.remove(J4);
								pnl.repaint();
								Board.cnt2++;
								temp2 = Board.cnt2;
								if (temp2 == 2) {
									q1.go();
								} else if (temp2 == 4) {
									q3.go();
								}
							}
							if (dx == J5.getLocation().x && dy == J5.getLocation().y) {
								pnl.remove(J5);
								pnl.repaint();
								Board.cnt2++;
								temp2 = Board.cnt2;
								if (temp2 == 2) {
									q1.go();
								} else if (temp2 == 4) {
									q3.go();
								}
							}
						} else if (location[mx][my] == Board.RCHA) {
							if (dx == C1.getLocation().x && dy == C1.getLocation().y) {
								pnl.remove(C1);
								pnl.repaint();
								Board.cnt2++;
								temp2 = Board.cnt2;
								if (temp2 == 2) {
									q1.go();
								} else if (temp2 == 4) {
									q3.go();
								}
							}
							if (dx == C2.getLocation().x && dy == C2.getLocation().y) {
								pnl.remove(C2);
								pnl.repaint();
								Board.cnt2++;
								temp2 = Board.cnt2;
								if (temp2 == 2) {
									q1.go();
								} else if (temp2 == 4) {
									q3.go();
								}
							}
						} else if (location[mx][my] == Board.RJANG) {

							pnl.remove(J);
							pnl.repaint();
							Board.cnt2++;
							temp2 = Board.cnt2;
							if (temp2 == 2) {
								q1.go();
							} else if (temp2 == 4) {
								q3.go();
							}

							int result = JOptionPane.showConfirmDialog(null,
									"You catch king! BLUE Win!\n\nDo you want to save a result?", "END",
									JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
							if (result == JOptionPane.YES_OPTION) {

								sf.storeScore(sf.readBScore() + 1, sf.readRScore());
								System.out.println("RED " + sf.readRScore() + "Blue " + sf.readBScore());
							}

							System.exit(0);

						} else {
							if (dx == R1.getLocation().x && dy == R1.getLocation().y) {
								pnl.remove(R1);
								pnl.repaint();
								Board.cnt2++;
								temp2 = Board.cnt2;
								if (temp2 == 2) {
									q1.go();
								} else if (temp2 == 4) {
									q3.go();
								}
							}
							if (dx == R2.getLocation().x && dy == R2.getLocation().y) {
								pnl.remove(R2);
								pnl.repaint();
								Board.cnt2++;
								temp2 = Board.cnt2;
								if (temp2 == 2) {
									q1.go();
								} else if (temp2 == 4) {
									q3.go();
								}
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
					System.out.println(temp2);
				}
			}
		});
	}
}