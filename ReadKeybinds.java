import java.util.Scanner;
import java.util.BufferedReader;
import java.io;
/*
  This class includes the following functions:
  
  readShapes(<filename>);
  *returns String[command][hotkey]

  readKeys(<filename>);
  *returns Boolean[shapeLetter+RotationalState][x][y]
*/


class ReadKeybinds {   
    boolean[][][] shapes = new boolean[18][4][4];
    String[][] keys = new String[2][20];
    
    String[][] readKeys (String filename) {
	String input = "";
	String[] array = null;
	
	try {
	    BufferedReader file = new BufferedReader(filename);
	    Scanner fin = new Scanner(file);
	    int counter = 0;
	    while(fin.hasNext()){
		input = fin.nextLine();
		array = input.split("=");
		keys[0][counter] = array[1];
		keys[1][counter] = array[0];
		counter++;
	    }
	    return keys;
	}
	catch (Exception e) {System.out.println("error");}
	return null;
    }
    
    int readShapes (String filename) {
	String input = "";
	String[] array = null;
	int counter = 0;
	try {
	    BufferedReader file = new BufferedReader(filename);
	    Scanner fin = new Scanner(file);
	  
	    while(fin.hasNext()){
		input = fin.nextLine();
		array = input.split("=");
		shapes[][][] = ;
		counter++;
	    }
	    return shapes;
	}
	catch (Exception e) {System.out.println("error");}
	return null;
    }
}
