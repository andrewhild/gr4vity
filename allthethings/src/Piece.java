package allthethings;

import java.awt.Color;
import java.util.ArrayList;

public class Piece {

	private ArrayList<Block> self=new ArrayList<Block>();
	private int size = 0, xdim, ydim;
	private Color color;
	private final double conversion = .5;
	
	//Initialize a Block object given a numerical value to specify type and a size based on desired resolution of playing field. Likely derived from image size in future release.
	public Piece(int type, int size, int x, int y){
		this.size = size;
		xdim=x;
		ydim=y;
		//Type randomly selected in GameObj with higher probability for non-giga derp piece. Shape determined based on specified number.
		switch(type){	
			//line
			case 1:
			//square
			case 2:
			//preliminary implementation, disregard later
			self.add(new Block(xdim/2-size/2,size/2));
			self.add(new Block(xdim/2+size/2,size/2));
			self.add(new Block(xdim/2-size/2,3*size/2));
			self.add(new Block(xdim/2+size/2,3*size/2));
			//(R)L
			case 3:
			//(L)L
			case 4:
			//(R)z
			case 5:
			//(L)z
			case 6:
			//T
			case 7:
			//Giga derp jutsu
			case 8:
			//base case in case probability switching derps
			default:
		}
	}

	//Update block position due to rotation
	public void rotate(){

	}

	//Move piece left one block
	public void left(){
		for(Block b:self){
			if(b.getPos()[0]-size<=0)
				return;
		}
		for(Block b:self)
			b.setX(b.getPos()[0]-size);

	}

	//Move piece right one block, where dim is the width of the field in pixels
	public void right(int dim){
		for(Block b:self){
			if(b.getPos()[0]+size>=xdim)
				return;
		}
		for(Block b:self)
			b.setX(b.getPos()[0]+size);
	}

	//Increments position under influence of gravity
	public ArrayList<Block> fall(double g, int dt){
		for(Block b:self){
			b.setY(b.getPos0()[1]+(int)(.5*g*Math.pow(conversion*dt,2)));
		}
		return self;

	}

	//Return ArrayList of constituent blocks
	public ArrayList<Block> self(){
		return self;
	}

	public Color getColor(){
		return color;
	}
	
}