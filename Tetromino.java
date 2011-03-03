class Tetromino
{
    Point displacementX;
    Point displacementY;
    
    boolean shape[][][];
    private enum Shape
    {
	O  0,
	    I0 1,
	    I1 2,
	    S0 3,
	    S1 4,	
	    Z0 5,
	    Z1 6,
	    L0 7,
	    L1 8,
	    L2 9,
	    L3 10,
	    J0 11,
	    J1 12,
	    J2 13,
	    J3 14,
	    T0 15,
	    T1 16,
	    T2 17,
	    T3 18;
    }
    
    public Tetromino(){
	this.displacementX = 0;
	this.displacementY = 0;
	
	this.shape = new boolean[18][4][4];
    }
    
    public void draw(Board framebuf){
	framebuf.insert(displacementX, displacementY, shape);
    }
}

class Shape extends Tetromino{
    public Shape(){
	super();
    }
	
    public Shape(int displacementX, int displacementY){
	this.displacementX = displacementX;
	this.displacementY = displacementY;
    }
}

