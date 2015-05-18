package allthethings;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameObj extends JPanel implements ActionListener{
	
	private ArrayList<Block> blocks;

	public GameObj() {
		//addActionListener(this);
		blocks = new ArrayList<Block>();
		
		

	}

	//Handle piece position update
	private void step(Block b){
	
	}

	//Handle clearing of row
	private void clear(){

	}



	public void actionPerformed(ActionEvent e) {
			//TODO: add code here
		}

}
