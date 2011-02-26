import java.util.Scanner;
import java.io.*;
/*
  This class includes the following functions:
  
  readShapes(<filename>);
  *returns String[command][hotkey]

  readKeys(<filename>);
  *returns Boolean[shapeLetter+RotationalState][x][y]
*/


class ReadFiles {   
    boolean[][][] shapes = new boolean[19][4][4];
    String[][] keys = new String[2][20];
    
    String[][] readKeys (String filename) {
	String input = "";
	String[] array = null;
	
	try {
	    FileReader file = new FileReader(filename);
	    Scanner fin = new Scanner(file);
	    int counter = 0;
	    while(fin.hasNext()){
		input = fin.nextLine();
		array = input.split("=");
		keys[0][counter] = array[1];
		keys[1][counter] = array[0];
		counter++;
	    }
	    file.close();
	    return keys;
	}
	catch (Exception e) {System.out.println("error");}
	return null;
    }
    
    boolean[][][] readShapes (String filename) {
	int counter = 0;
	try {
	    FileReader file = new FileReader(filename);
	    Scanner fin = new Scanner(file);
	  
	    while(fin.hasNext()){
		fin.nextLine();
		for(int y = 0; y < 4; ++y){
		    char[] cArray = (fin.nextLine()).toCharArray();
		    for(int x = 0; x < 4; ++x){
			if(cArray[x] == '1'){
			    shapes[counter][x][y] = true;
			}
			else if (cArray[x] == '0'){
			    shapes[counter][x][y] = false;   
			}
		    }
		}
		counter++;
	    }
	    return shapes;
	}
	catch (Exception e) {System.out.println("error");}
	return null;
    }
}
