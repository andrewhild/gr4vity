package allthethings;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameObj extends JPanel implements KeyListener,ActionListener{
	
	private boolean hit = false, paused=false, inGame=true;
	private ArrayList<Block> blocks;
	private Piece activePiece;
	private int xdim, ydim, g, size, clicks=0;
	private long t0;
	private Timer timer;

	public GameObj(int x, int y) {
		xdim=x;
		ydim=y;
		setSize(xdim,ydim);
		setFocusable(true);
		addKeyListener(this);
		g=5;
		size=20;
		blocks = new ArrayList<Block>();
		//Placeholder: starts timer as soon as board appears
		timer = new Timer(500,this);
		timer.start();
		t0 = System.nanoTime();
		//generate one square tetromino
		activePiece=new Piece(2,size,xdim,ydim);
	}

	//Handle piece position update
	private void step(Piece p){

	}

	//Check collision
	private boolean contact(){
		return hit;
	}

	//Handle clearing of row
	private void clear(){

	}

	//Drop activePiece in place
	private void drop(){
		System.out.println("noot noot!");
	}

	//Pause game when P is pressed
	private boolean pause(){
		if(inGame){
			if(paused){
				timer.start();
				paused=!paused;
			}
			else{
				timer.stop();
				paused=!paused;
			}
		}
		return paused;
	}

	//Future implementation of resetting for new game
	private void reset(){
		System.out.println("noot noot!");
	}

	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		//Pause
		if(code==KeyEvent.VK_P){
			pause();
			return;
		}
		//Reset
		else if(code==KeyEvent.VK_R){
			reset();
			return;
		}
		//Directional input
		if(!paused){
			if(code==KeyEvent.VK_UP)
				activePiece.rotate();
			else if(code==KeyEvent.VK_DOWN)
				drop();
			else if(code==KeyEvent.VK_RIGHT)
				activePiece.right(xdim);
			else if(code==KeyEvent.VK_LEFT)
				activePiece.left();
		}
	
	}

	public void actionPerformed(ActionEvent e){
		//count number of timer clicks since block began falling
		clicks++;
		activePiece.fall(g,clicks);
		Graphics g = getGraphics();
		paint(g);
	}

	public void paint(Graphics g) {
		if(contact()){
			clicks=0;
			activePiece=new Piece((int)(Math.random()*7)+1,size,xdim,ydim);

		}
		else{
			ArrayList<Block> queue = activePiece.self();
			super.paint(g);
			for(Block b:queue){
				g.setColor(activePiece.getColor());
				g.fillRect(b.getPos()[0],b.getPos()[1],size,size);
			}
			g.dispose();
		}
	}

	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}

}