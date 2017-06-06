package JanggiApp;

import java.awt.Color;

public abstract class PieceMove {
	public abstract int movex(int currentx, int laterx);
	public abstract int movey(int currentx, int latery);
	public abstract boolean move(int location[][], int x, int y,int currentx,int currenty,Color c);	
}