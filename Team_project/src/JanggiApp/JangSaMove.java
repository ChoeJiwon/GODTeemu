package JanggiApp;

import java.awt.Color;

public class JangSaMove extends PieceMove{
   int result = 0;
   
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
         if (x>=3 && x<=5 && Math.abs(currentx-x) <= 1 && y>=0 && y<=2 && Math.abs(currenty-y) <= 1 )
         {

            if(x==4&&(y==0||y==2)&&(currentx==3||currentx==5)&&(currenty==1)) return false;
            else if((x==3||x==5)&&y==1&&currentx==4&&(currenty==0||currenty==2)) return false;
            else
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
         if (x>=3 && x<=5 && Math.abs(currentx-x) <= 1 && y>=7 && y<=9 && Math.abs(currenty-y) <= 1 )
         {
        	 
        	 if(x==4&&(y==7||y==9)&&(currentx==3||currentx==5)&&(currenty==8)) return false;
             else if((x==3||x==5)&&y==8&&currentx==4&&(currenty==7||currenty==9)) return false;
             else
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