package allthethings;

import java.awt.Color;

public class Block {

	private int[][] pos = new int[4][2];
	private int[][] pos0 = new int[4][2];
	private final double conversion = .000000001;
	private int size = 0, xdim, ydim;
	private Color color;
	
	//Initialize a Block object given a numerical value to specify type and a size based on desired resolution of playing field. Likely derived from image size in future release.
	public Block(int type, int size, int x, int y){
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
			pos[0][0]=xdim/2-size/2;
			pos[0][1]=size/2;
			pos[1][0]=xdim/2+size/2;
			pos[1][1]=size/2;
			pos[2][0]=xdim/2-size/2;
			pos[2][1]=3*size/2;
			pos[3][0]=xdim/2+size/2;
			pos[3][1]=3*size/2;
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
		for(int q = 0;q<pos.length;q++){
			if(pos[q][0]-size>=size)
			pos[q][0]-=size;
		}

	}

	//Move piece right one block, where dim is the width of the field in pixels
	public void right(int dim){
		for(int q = 0;q<pos.length;q++){
			if(pos[q][0]+size<dim)
			pos[q][0]+=size;
		}
	}

	//Increments position under influence of gravity
	public int[][] fall(double g, long dt){
		for(int q=0;q<pos.length;q++){
			pos[q][1]=pos0[q][1]+(int)(.5*g*Math.pow(conversion*dt,2));
		}
		return pos;

	}

	//Return matrix of sub-block positions
	public int[][] getPos(){
		return pos;
	}

	//Set sub-block positions manually
	public int[][] setPos(int[][] pos){
		this.pos = pos;
		return this.pos;
	}

	public Color getColor(){
		return color;
	}



}
