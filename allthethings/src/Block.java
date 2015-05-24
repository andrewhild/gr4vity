package allthethings;

public class Block {

	private int[] pos0 = new int[2];
	private int x, y;
	
	//Initialize a Block object given a numerical value to specify type and a size based on desired resolution of playing field. Likely derived from image size in future release.
	public Block(int x, int y){
		this.x=x;
		this.y=y;
		pos0[0]=x;
		pos0[1]=y;
		
	}

	public int[] getPos(){
		return new int[]{x,y};
	}

	public int[] getPos0(){
		return pos0;
	}

	public void setX(int newX){
		x=newX;
	}

	public void setY(int newY){
		y=newY;
	}

}