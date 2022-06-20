package framework;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import testgame.Handler;


public class KeyInput extends KeyAdapter{
	 
	Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
		System.out.println("this intializes the handler");
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		System.out.println("key is "+ key);
		//takes each key's code and stores it
		
		
		for (int i =0; i <handler.object.size();i++) {
			GameObject tempObject = handler.object.get(i);
					
			if(tempObject.getId()== ObjectId.Player) {
				if (key == KeyEvent.VK_D)tempObject.setVelX(5);
				if (key == KeyEvent.VK_A)tempObject.setVelX(-5);
				System.out.println("hey");
				if (key == KeyEvent.VK_SPACE && !tempObject.isJumping()){
					tempObject.setJumping(true);
					tempObject.setVelY(-10);
				}
			}
		}
		
		if (key == KeyEvent.VK_ESCAPE) {//enum for the ASCII code number{
			System.exit(1); 
		} 
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		for (int i =0; i <handler.object.size();i++) {
			GameObject tempObject = handler.object.get(i);
			System.out.println("hello");
					
			if(tempObject.getId()== ObjectId.Player) {
				if (key == KeyEvent.VK_D)tempObject.setVelX(0);
				if (key == KeyEvent.VK_A)tempObject.setVelX(0);
				System.out.println("kys");

			}
		}
	}

}
