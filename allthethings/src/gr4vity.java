package allthethings;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.EventQueue;
import java.awt.BorderLayout;

public class gr4vity extends JFrame {

	//placeholder values for size of board
	private final int xdim = 768;
	private final int ydim = 1024;
	public gr4vity(String title) {
		setTitle(title);
		init();
	}

	//Set up UI and place a playing field inside this frame
	//TODO: Add other components to do things like track score, etc.
	private void init() {
		//Setup for containing frame
		super.setSize(768,1024);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		super.add(new GameObj(xdim,ydim),BorderLayout.CENTER);
		//pack();

		setVisible(true);

	}
	
	public static void main(String[] args) {
		//Interior class to define a new thread and run it
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				JFrame game = new gr4vity("gr4vity by Andrew Hild");
			}
		});
		
	}

}