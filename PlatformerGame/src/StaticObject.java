import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class StaticObject {

	private int x,y,w,h;
	private String type;
	private Image img;

	public StaticObject(int x, int y, int w, int h, String type) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		if(type.equals("large")) {
			try {
				img = ImageIO.read(getClass().getResourceAsStream("images/Large Platform.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if(type.equals("small")) {
			try {
				img = ImageIO.read(getClass().getResourceAsStream("images/Small Platform.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void draw(Graphics g) {
		g.drawImage(img, this.x, this.y, this.w, this.h, null);
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
