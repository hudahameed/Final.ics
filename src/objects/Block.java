package objects;

import java.awt.Color;

import java.awt.Graphics;
import java.util.LinkedList;

import framework.GameObject;
import framework.ObjectId;
import java.awt.Rectangle;
 

public class Block extends GameObject{

	public Block(float x, float y, ObjectId id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
	}

	
	public void tick(LinkedList<GameObject> object) {
		
	}

	
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.drawRect((int)x, (int) y, 32, 32);
		
		for(int i = 0; i < 448; i += 32)
	      g.drawRect(0, i+8, 32, 32);
	}


	public Rectangle getBounds() {
		return new Rectangle ((int)x,(int)y, 32, 32);
	}

	
}