package allthethings;

public class Block {
	
	public Block(int type){
		switch(type)
		{
			/*
			Type randomly selected in GameObj with higher probability for non-giga derp piece. Shape determined based on specified number.
			*/
			//line
			case 1:
			//square
			case 2:
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

		//Update block position due to rotation
		public void rotate(){

		}

	}
}