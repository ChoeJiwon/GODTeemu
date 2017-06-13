package JanggiApp;

import java.awt.Color;

public class JolMove extends PieceMove {      //inheritance, JOL move(there is restriction for range of move, it is one block)
   
   int result;      //array coordinate

   public int movex(int currentx, int laterx) {      //moving of x
      
      if (laterx > currentx)                                          //95 is width of one block
         result = Math.round((laterx + 50 - currentx) / 95) + currentx / 95;      //move to one step right
      
      else
         result = Math.round((laterx - 50 - currentx) / 95) + currentx / 95;      //move to one step left
      
      
      return result;
   }

   public int movey(int currenty, int latery) {      //moving of y
      
      if (latery > currenty)
         result = Math.round((latery + 50 - currenty) / 95) + currenty / 95;
      
      else
         result = Math.round((latery - 50 - currenty) / 95) + currenty / 95;
      
      return result;
   }

   public boolean move(int[][] location, int x, int y, int currentx, int currenty, Color c, int turn) {
      
      if (c == Color.RED && turn == 1) {      //red piece moving, 'turn is 1' means red turn
         
         if ((currentx == 3 || currentx == 5) && currenty == 7 && x == 4 && y == 8) {
            Board.turn = 0;      //Changing turn
            return true;
         }
         
         if (currentx == 4 && currenty == 8 && (x == 3 || x == 5) && y == 9) {
            Board.turn = 0;
            return true;
         }
         
         if (x >= 0 && x < 9 && Math.abs(currentx - x) <= 1 && y >= 0 && y <= 9 && Math.abs(currenty - y) <= 1
               && currenty <= y) {
            if ((currentx == x && currenty != y) || (currentx != x && currenty == y)) {
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
      
      if (c == Color.BLUE && turn == 0) {      //blue piece moving, 'turn is 0' means blue turn
         
         if ((currentx == 3 || currentx == 5) && currenty == 2 && x == 4 && y == 1) {
            Board.turn = 1;
            return true;
         }
         
         if (currentx == 4 && currenty == 1 && (x == 3 || x == 5) && y == 0) {
            Board.turn = 1;
            return true;
         }
         
         if (x >= 0 && x <= 8 && Math.abs(currentx - x) <= 1 && y >= 0 && y <= 9 && Math.abs(currenty - y) <= 1
               && currenty >= y) {
            if ((currentx == x && currenty != y) || (currentx != x && currenty == y)) {
               if (location[x][y] == 0) {
                  Board.turn = 1;
                  return true;
               }
               if (location[x][y] != 0 && location[x][y] / 10 != 0) {
                  Board.turn = 1;
                  return true;
               } else
                  return false;
            }
         }
         return false;
      }
      return false;
   }
}