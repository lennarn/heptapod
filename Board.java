/*
  This class stores data of the boards cells,
  where each cell is either true or false
  *note* it is a 10*20 grid for standard tetris
  
  It contains:
  
  void toggleCell(int x , int y);
  * toggles boolean state of a cell

  boolean getCell(int x, int y);
  * returns value of a cell
  * this is needed for rowFullCheck();
*/

class Board
{
    final int columns = 10;
    final int rows = 20;

    boolean cell[][];
       
    public Board(){
	this.cell = new boolean[columns][rows];
    }

    public void toggleCell(int x, int y){
	if (this.cell[x][y] == true)
	    this.cell[x][y] = false;
	else
	    this.cell[x][y] = true;
    }
    public boolean getCell(int x, int y){
	return this.cell[x][y];
    }
}
