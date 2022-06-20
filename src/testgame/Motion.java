package testgame;

import framework.GameObject;

public class Motion{
	
	private float x, y;
	
	public Motion(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void tick(GameObject Player) {
		x = -Player.getX()+Game.WIDTH/2;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	
}
