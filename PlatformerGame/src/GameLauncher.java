import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GameLauncher {
	
	public static void main(String[] args) {
		JFrame frameriono = new JFrame();
		Dimension d = new Dimension(800,600);
		gPanel p = new gPanel(d);
		frameriono.add(p);
		frameriono.pack();
		frameriono.setVisible(true);
		frameriono.setDefaultCloseOperation(frameriono.EXIT_ON_CLOSE);
	}
}
