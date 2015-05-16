package allthethings;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameObj extends JPanel implements ActionListener{
	
	private ArrayList<Block> blocks;

	public GameObj() {
		addActionListener(this);
		blocks = new ArrayList<Block>();
		
		

	}

	public void actionPerformed(ActionEvent e) {
			//TODO: add code here
		}

}
