import java.awt.Graphics;

public class gMap {
		
	private Hero h = new Hero(200,200,150,150,"begin");
	
	public gMap() {
		
	}

	public void tick() {
		h.loseHealth();
		h.changeState();
	}
	
	public void draw(Graphics g) {
		h.draw(g);
	}

	public void mLeft() {
		
	}

	public void mRight() {
	}
	
	public void mDown() {
	}
	
	public void mUp() {
	}
}
