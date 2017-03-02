import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Hero extends DynamicObject {

	private Image img;

	public Hero(int x, int y, int w, int h, String type) {
		super(x,y,w,h,type);
		if(type.equals("begin")) {
			try {
				img = ImageIO.read(getClass().getResourceAsStream("images/Large Platform.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		super.setHealth(4);
	}

	public void changeState() {
		if(super.getHealth()==4) {
			return;
		}
		else if(super.getHealth()==3) {
			try {
				img = ImageIO.read(getClass().getResourceAsStream("images/Large Platform Broken.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if(super.getHealth()==2) {
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
}
