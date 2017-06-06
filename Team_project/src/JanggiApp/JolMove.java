package JanggiApp;

import java.awt.Color;

public class JolMove extends PieceMove{
	int result;
	
	public int movex(int currentx, int laterx)
	{
		if (laterx>currentx) result = Math.round((laterx+50-currentx)/95)+currentx/95;
		else result = Math.round((laterx-50-currentx)/95)+currentx/95;
		return result;
	}
	public int movey(int currenty,int latery)
	{
		if(latery>currenty) result=Math.round((latery+50-currenty)/95)+currenty/95;
		else result = Math.round((latery-50-currenty)/95)+currenty/95;
		return result;
	}
	public boolean move(int[][] location,int x, int y,int currentx,int currenty,Color c)
	{
		if (c==Color.RED)
		{
			if (x>=0 && x<9 && Math.abs(currentx-x) <= 1 && y>=0 && y<=9 && Math.abs(currenty-y) <= 1 && currenty<=y)
			{
				if ((currentx==x && currenty!=y) || (currentx!=x && currenty==y)) 
				{
					if (location[x][y]==0) return true;
					if (location[x][y]!=0 && location[x][y]/10==0) return true;
					else return false;
				}
			}
			return false;
		}
		else
		{
			if (x>=0 && x<=8 && Math.abs(currentx-x) <= 1 && y>=0 && y<=9 && Math.abs(currenty-y) <= 1 && currenty>=y)
			{
				if ((currentx==x && currenty!=y) || (currentx!=x && currenty==y)) 
				{
					if (location[x][y]==0) return true;
					if (location[x][y]!=0 && location[x][y]/10!=0) return true;
					else return false;
				}
			}
			return false;
		}
	}

}
