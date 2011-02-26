class Testris {
    public static void main(String[] args){
	printKeys();
	printShape("L2");
    }

    static void printKeys(){
	ReadFiles read = new ReadFiles();
	String[][] keys = read.readKeys("keybindings.cfg");
		
	int x = 0, y = 0;
	for(y = 0;y < 20; ++y){
	    if(keys[0][y] != null && keys[1][y] != null){
		System.out.print("command = " + keys[0][y] + " &");
		System.out.print(" key = " + keys[1][y] + "\n");
	    }
	}
    }

    static void printShape(String shapeID){ // ex. "Z1" or "O0"
	ReadFiles read = new ReadFiles();	
	boolean[][][] shapes = read.readShapes("tetrominii.cfg");
	char[][] myShape = new char[4][4];
	int shapeNumber;
	
	char[] cArray = shapeID.toCharArray();
	
	shapeNumber = Integer.parseInt(Character.toString(cArray[1]));
	
	if (cArray[0] == 'O')
	    shapeNumber += 0;
	else if (cArray[0] == 'I')
	    shapeNumber += 1;
	else if (cArray[0] == 'S')
	    shapeNumber += 3;
	else if (cArray[0] == 'Z')
	    shapeNumber += 5;
	else if (cArray[0] == 'L')
	    shapeNumber += 7;
	else if (cArray[0] == 'J')
	    shapeNumber += 11;
	else if (cArray[0] == 'T')
	    shapeNumber += 15;
	
	for(int y=0; y<4; ++y){
	    for(int x=0; x<4; ++x){
		if(shapes[shapeNumber][x][y] == true)
		    System.out.print("O");
		else
		    System.out.print(" ");
	    }
	    System.out.print("\n");
	}
    }
}