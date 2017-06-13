package JanggiApp;

import java.awt.Color;

public abstract class PieceMove {
   public abstract int movex(int currentx, int laterx);   //x's moving(current x, later x)
   public abstract int movey(int currenty, int latery);   //y's moving(current x, later x)
   public abstract boolean move(int location[][], int x, int y,int currentx,int currenty,Color c,int turn);   
   /*
    * 'location[][]' is coordinate of piece
    * 'x' is later x's coordinate, 'y' is y's coordinate
    * 'currentx' is current x's coordinate, 'currenty' is cuurent y's coordinate
    * 'c' distinguishes whether the piece is red team or blue team.
    * 'turn' is distinguishes whether whose turn it is.
    */
}      
//Every Move's superclass (abstract class)
//Polymorphism

