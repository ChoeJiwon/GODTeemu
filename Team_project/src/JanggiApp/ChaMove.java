package JanggiApp;

import java.awt.Color;

public class ChaMove extends PieceMove{
	int result,i,cnt,xx,yy;
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
			if (x>=0 && x<9  && y>=0 && y<=9)
			{
				System.out.println(currentx + "  " +currenty + "  " + x + "  " + y);
				if (currentx!=x && currenty==y)
				{
					cnt=0;
					if (currentx>x) 
					{
						for (i=x;i<=currentx-1;i++) 
						{
							if (location[i][y]!=0)
							{
								cnt++;
								if (cnt==1) xx=i;
							}
						}
						System.out.println(cnt);
						if (cnt==0)
						{
							return true;
						}
						else if (cnt==1)
						{
							if (location[x][y]/10==0 && xx==x) return true;
							else return false;
						}
					}
					else
					{
						for (i=currentx+1;i<=x;i++)
						{
							if (location[i][y]!=0) 
							{
								cnt++;
								if (cnt==1) xx=i;
							}
						}
						System.out.println(cnt + "\n위치 : "+xx + "   " + x);
						if (cnt==0) return true;
						else if (cnt==1)
						{
							if (location[x][y]/10==0 && xx==x) return true;
							else return false;							
						}
					}
				}
				if (currentx==x && currenty!=y)
				{
					cnt=0;
					if (currenty>y) 
					{
						for (i=y;i<=currenty-1;i++) 
						{
							if (location[x][i]!=0)
							{
								cnt++;
								if (cnt==1) yy=i;
							}
						}
						System.out.println(cnt);
						if (cnt==0)
						{
							return true;
						}
						else if (cnt==1)
						{
							if (location[x][y]/10==0 && yy==y) return true;
							else return false;
						}
					}
					else
					{
						for (i=currenty+1;i<=y;i++)
						{
							if (location[x][i]!=0) 
							{
								cnt++;
								if (cnt==1) yy=i;
							}
						}
						System.out.println(cnt + "\n위치 : "+xx + "   " + x);
						if (cnt==0) return true;
						else if (cnt==1)
						{
							if (location[x][y]/10==0 && yy==y) return true;
							else return false;							
						}
					}
				}
			}
			return false;
		}
		else
		{
			if (x>=0 && x<=8  && y>=0 && y<=9 )
			{
				System.out.println(currentx + "  " + x+"  " + currenty + "  " + y);
				if (currentx!=x && currenty==y)
				{
					cnt=0;
					if (currentx>x) 
					{
						for (i=x;i<=currentx-1;i++) 
						{
							if (location[i][y]!=0)
							{
								cnt++;
								if (cnt==1) xx=i;
							}
						}
						System.out.println(cnt);
						if (cnt==0)
						{
							return true;
						}
						else if (cnt==1)
						{
							if (location[x][y]/10!=0 && xx==x) return true;
							else return false;
						}
					}
					else
					{
						for (i=currentx+1;i<=x;i++)
						{
							if (location[i][y]!=0) 
							{
								cnt++;
								if (cnt==1) xx=i;
							}
						}
						System.out.println(cnt + "\n위치 : "+xx + "   " + x);
						if (cnt==0) return true;
						else if (cnt==1)
						{
							if (location[x][y]/10!=0 && xx==x) return true;
							else return false;							
						}
					}
				}
				if (currentx==x && currenty!=y)
				{
					cnt=0;
					if (currenty>y) 
					{
						for (i=y;i<=currenty-1;i++) 
						{
							if (location[x][i]!=0)
							{
								cnt++;
								if (cnt==1) yy=i;
							}
						}
						System.out.println(cnt);
						if (cnt==0)
						{
							return true;
						}
						else if (cnt==1)
						{
							if (location[x][y]/10!=0 && yy==y) return true;
							else return false;
						}
					}
					else
					{
						for (i=currenty+1;i<=y;i++)
						{
							if (location[x][i]!=0) 
							{
								cnt++;
								if (cnt==1) yy=i;
							}
						}
						System.out.println(cnt + "\n위치 : "+xx + "   " + x);
						if (cnt==0) return true;
						else if (cnt==1)
						{
							if (location[x][y]/10!=0 && yy==y) return true;
							else return false;							
						}
					}
				}
			}
			return false;
		}
	}

}
