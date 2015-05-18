package allthethings;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.EventQueue;

public class gr4vity extends JFrame {

	public gr4vity() {

	}

	//Set up UI and place a playing field inside this frame
	//TODO: Add other components to do things like track score, etc.
	private void init() {

		add(new GameObj());

		setResizable(false);
		pack();

		//Setup for containing frame
		setTitle("gr4vity");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		//Interior class to define a new thread and run it
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				JFrame game = new gr4vity();
				game.setVisible(true);
			}
		});
		
	}

}