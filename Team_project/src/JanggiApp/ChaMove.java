package JanggiApp;

import java.awt.Color;

public class ChaMove extends PieceMove {
	int result, i, cnt, xx, yy;

	public int movex(int currentx, int laterx) {
		if (laterx > currentx)
			result = Math.round((laterx + 50 - currentx) / 95) + currentx / 95;
		else
			result = Math.round((laterx - 50 - currentx) / 95) + currentx / 95;
		return result;
	}

	public int movey(int currenty, int latery) {
		if (latery > currenty)
			result = Math.round((latery + 50 - currenty) / 95) + currenty / 95;
		else
			result = Math.round((latery - 50 - currenty) / 95) + currenty / 95;
		return result;
	}

	public boolean move(int[][] location, int x, int y, int currentx, int currenty, Color c, int turn) {
		if (c == Color.RED && turn == 1) {
			if (((currentx == 3 && currenty == 7) || (currentx == 5 && currenty == 7)
					|| (currentx == 3 && currenty == 9) || (currentx == 5 && currenty == 9)) && x == 4 && y == 8) {
				if (location[x][y] == 0) {
					Board.turn = 0;
					return true;
				}
				if (location[x][y] / 10 == 0 && location[x][y] != 0) {
					Board.turn = 0;
					return true;
				} else
					return false;
			}
			if ((currentx == 3 && currenty == 7 && x == 5 && y == 9)
					|| (currentx == 5 && currenty == 7 && x == 3 && y == 9)
					|| (currentx == 3 && currenty == 9 && x == 5 && y == 7)
					|| (currentx == 5 && currenty == 9 && x == 3 && y == 7)) {
				if (location[4][8] != 0)
					return false;
				if (location[x][y] != 0 && location[x][y] / 10 != 0)
					return false;
				else {
					Board.turn = 0;
					return true;
				}
			}
			if (currentx == 4 && currenty == 8 && ((x == 3 || x == 5) && (y == 7 || y == 9))) {
				if (location[x][y] != 0 && location[x][y] / 10 == 0) {
					Board.turn = 0;
					return true;
				}
				if (location[x][y] == 0) {
					Board.turn = 0;
					return true;
				} else
					return false;
			}
			if (((currentx == 3 && currenty == 2) || (currentx == 5 && currenty == 2)
					|| (currentx == 3 && currenty == 0) || (currentx == 5 && currenty == 0)) && x == 4 && y == 1) {
				if (location[x][y] == 0) {
					Board.turn = 0;
					return true;
				}
				if (location[x][y] / 10 == 0 && location[x][y] != 0) {
					Board.turn = 0;
					return true;
				} else
					return false;
			}
			if ((currentx == 3 && currenty == 2 && x == 5 && y == 0)
					|| (currentx == 5 && currenty == 2 && x == 3 && y == 0)
					|| (currentx == 3 && currenty == 0 && x == 5 && y == 2)
					|| (currentx == 5 && currenty == 0 && x == 3 && y == 2)) {
				if (location[4][1] != 0)
					return false;
				if (location[x][y] != 0 && location[x][y] / 10 != 0)
					return false;
				else {
					Board.turn = 0;
					return true;
				}
			}
			if (currentx == 4 && currenty == 1 && ((x == 3 || x == 5) && (y == 2 || y == 0))) {
				if (location[x][y] != 0 && location[x][y] / 10 == 0) {
					Board.turn = 0;
					return true;
				}
				if (location[x][y] == 0) {
					Board.turn = 0;
					return true;
				} else
					return false;
			}
			if (x >= 0 && x < 9 && y >= 0 && y <= 9) {
				if (currentx != x && currenty == y) {
					cnt = 0;
					if (currentx > x) {
						for (i = x; i <= currentx - 1; i++) {
							if (location[i][y] != 0) {
								cnt++;
								if (cnt == 1)
									xx = i;
							}
						}
						if (cnt == 0) {
							Board.turn = 0;
							return true;
						}
						if (cnt == 1) {
							if (location[x][y] / 10 == 0 && xx == x) {
								Board.turn = 0;
								return true;
							} else
								return false;
						}
					} else {
						for (i = currentx + 1; i <= x; i++) {
							if (location[i][y] != 0) {
								cnt++;
								if (cnt == 1)
									xx = i;
							}
						}
						if (cnt == 0) {
							Board.turn = 0;
							return true;
						} else if (cnt == 1) {
							if (location[x][y] / 10 == 0 && xx == x) {
								Board.turn = 0;
								return true;
							} else
								return false;
						}
					}
				}
				if (currentx == x && currenty != y) {
					cnt = 0;
					if (currenty > y) {
						for (i = y; i <= currenty - 1; i++) {
							if (location[x][i] != 0) {
								cnt++;
								if (cnt == 1)
									yy = i;
							}
						}
						if (cnt == 0) {
							Board.turn = 0;
							return true;
						} else if (cnt == 1) {
							if (location[x][y] / 10 == 0 && yy == y) {
								Board.turn = 0;
								return true;
							} else
								return false;
						}
					} else {
						for (i = currenty + 1; i <= y; i++) {
							if (location[x][i] != 0) {
								cnt++;
								if (cnt == 1)
									yy = i;
							}
						}
						if (cnt == 0) {
							Board.turn = 0;
							return true;
						} else if (cnt == 1) {
							if (location[x][y] / 10 == 0 && yy == y) {
								Board.turn = 0;
								return true;
							} else
								return false;
						}
					}
				}
			}
			return false;
		}
		if (c == Color.BLUE && turn == 0) {
			if (((currentx == 3 && currenty == 7) || (currentx == 5 && currenty == 7)
					|| (currentx == 3 && currenty == 9) || (currentx == 5 && currenty == 9)) && x == 4 && y == 8) {
				if (location[x][y] == 0) {
					Board.turn = 1;
					return true;
				}
				if (location[x][y] / 10 != 0 && location[x][y] != 0) {
					Board.turn = 1;
					return true;
				} else
					return false;
			}
			if ((currentx == 3 && currenty == 7 && x == 5 && y == 9)
					|| (currentx == 5 && currenty == 7 && x == 3 && y == 9)
					|| (currentx == 3 && currenty == 9 && x == 5 && y == 7)
					|| (currentx == 5 && currenty == 9 && x == 3 && y == 7)) {
				if (location[4][8] != 0)
					return false;
				if (location[x][y] != 0 && location[x][y] / 10 == 0)
					return false;
				else {
					Board.turn = 1;
					return true;
				}
			}
			if (currentx == 4 && currenty == 8 && ((x == 3 || x == 5) && (y == 7 || y == 9))) {
				if (location[x][y] != 0 && location[x][y] / 10 != 0) {
					Board.turn = 1;
					return true;
				}
				if (location[x][y] == 0) {
					Board.turn = 1;
					return true;
				} else
					return false;
			}
			if (((currentx == 3 && currenty == 2) || (currentx == 5 && currenty == 2)
					|| (currentx == 3 && currenty == 0) || (currentx == 5 && currenty == 0)) && x == 4 && y == 1) {
				if (location[x][y] == 0) {
					Board.turn = 1;
					return true;
				}
				if (location[x][y] / 10 != 0 && location[x][y] != 0) {
					Board.turn = 1;
					return true;
				} else
					return false;
			}
			if ((currentx == 3 && currenty == 2 && x == 5 && y == 0)
					|| (currentx == 5 && currenty == 2 && x == 3 && y == 0)
					|| (currentx == 3 && currenty == 0 && x == 5 && y == 2)
					|| (currentx == 5 && currenty == 0 && x == 3 && y == 2)) {
				if (location[4][1] != 0)
					return false;
				if (location[x][y] != 0 && location[x][y] / 10 == 0)
					return false;
				else {
					Board.turn = 1;
					return true;
				}
			}
			if (currentx == 4 && currenty == 1 && ((x == 3 || x == 5) && (y == 2 || y == 0))) {
				if (location[x][y] != 0 && location[x][y] / 10 != 0) {
					Board.turn = 1;
					return true;
				}
				if (location[x][y] == 0) {
					Board.turn = 1;
					return true;
				} else
					return false;
			}
			if (x >= 0 && x <= 8 && y >= 0 && y <= 9) {
				if (currentx != x && currenty == y) {
					cnt = 0;
					if (currentx > x) {
						for (i = x; i <= currentx - 1; i++) {
							if (location[i][y] != 0) {
								cnt++;
								if (cnt == 1)
									xx = i;
							}
						}
						if (cnt == 0) {

							Board.turn = 1;
							return true;
						}
						if (cnt == 1) {
							if (location[x][y] / 10 != 0 && xx == x) {
								Board.turn = 1;
								return true;
							} else
								return false;
						}
					} else {
						for (i = currentx + 1; i <= x; i++) {
							if (location[i][y] != 0) {
								cnt++;
								if (cnt == 1)
									xx = i;
							}
						}
						if (cnt == 0) {
							Board.turn = 1;
							return true;
						}
						if (cnt == 1) {
							if (location[x][y] / 10 != 0 && xx == x) {
								Board.turn = 1;
								return true;
							} else
								return false;
						}
					}
				}
				if (currentx == x && currenty != y) {
					cnt = 0;
					if (currenty > y) {
						for (i = y; i <= currenty - 1; i++) {
							if (location[x][i] != 0) {
								cnt++;
								if (cnt == 1)
									yy = i;
							}
						}
						if (cnt == 0) {

							Board.turn = 1;
							return true;
						} else if (cnt == 1) {
							if (location[x][y] / 10 != 0 && yy == y) {
								Board.turn = 1;
								return true;
							} else
								return false;
						}
					} else {
						for (i = currenty + 1; i <= y; i++) {
							if (location[x][i] != 0) {
								cnt++;
								if (cnt == 1)
									yy = i;
							}
						}
						if (cnt == 0) {
							Board.turn = 1;
							return true;
						}
						if (cnt == 1) {
							if (location[x][y] / 10 != 0 && yy == y) {
								Board.turn = 1;
								return true;
							} else
								return false;
						}
					}
				}
			}
			return false;
		}
		return false;
	}
}
