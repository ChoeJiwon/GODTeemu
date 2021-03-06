package Game;

import java.awt.Color;

public class JangSaMove extends PieceMove {         //JANG and SA moving
   int result = 0;

   public int movex(int currentx, int laterx) {
      
      if (laterx > currentx)
         result = Math.round((laterx + 50 - currentx) / 95) + currentx / 95;
      
      else
         result = Math.round((laterx - 50 - currentx) / 95) + currentx / 95;
      
      return result;
   }

   public int movey(int currenty, int latery) {         //JANG,SA move(there is restriction for range of move, it is one block)
      
      if (latery > currenty)
         result = Math.round((latery + 50 - currenty) / 95) + currenty / 95;
      
      else
         result = Math.round((latery - 50 - currenty) / 95) + currenty / 95;
      
      return result;
   }

   public boolean move(int[][] location, int x, int y, int currentx, int currenty, Color c, int turn) {
      
      if (c == Color.RED && turn == 1) {         //red piece moving, 'turn is 1' means red turn
         if (x >= 3 && x <= 5 && Math.abs(currentx - x) <= 1 && y >= 0 && y <= 2 && Math.abs(currenty - y) <= 1) {

            if (x == 4 && (y == 0 || y == 2) && (currentx == 3 || currentx == 5) && (currenty == 1))
               return false;
            
            else if ((x == 3 || x == 5) && y == 1 && currentx == 4 && (currenty == 0 || currenty == 2))
               return false;
            
            else {
               if (location[x][y] == 0) {
                  Board.turn = 0;
                  return true;
               }
               if (location[x][y] != 0 && location[x][y] / 10 == 0) {
                  Board.turn = 0;
                  return true;
               } else
                  return false;
            }
         }
         return false;
      }
      if (c == Color.BLUE && turn == 0) {         //blue piece moving, 'turn is 0' means blue turn
         if (x >= 3 && x <= 5 && Math.abs(currentx - x) <= 1 && y >= 7 && y <= 9 && Math.abs(currenty - y) <= 1) {
            
            if (x == 4 && (y == 7 || y == 9) && (currentx == 3 || currentx == 5) && (currenty == 8))
               return false;
            
            else if ((x == 3 || x == 5) && y == 8 && currentx == 4 && (currenty == 7 || currenty == 9))
               return false;
            
            else {
               if (location[x][y] == 0) {
                  Board.turn = 1;
                  return true;
               }
               if (location[x][y] != 0 && location[x][y] / 10 != 0) {
                  Board.turn = 1;
                  return true;
               } 
               else
                  return false;
            }
         }
         return false;
      }
      return false;
   }

}