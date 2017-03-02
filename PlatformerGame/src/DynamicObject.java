public class DynamicObject {
	
	private int health;
	public int x, y, w, h;
	private String type;
	
	public DynamicObject(int x, int y, int w, int h, String type) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.type = type;
	}

	public int getHealth() {
		return this.health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void loseHealth() {
		setHealth(getHealth()-1);
	}
}
