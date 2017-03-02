import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.AbstractAction;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class gPanel extends JPanel {
	
	final Dimension dim;
	private Timer t;
	private gMap m = new gMap();
	
	public gPanel(Dimension d) {
		this.dim = d;
		this.setPreferredSize(dim);
		Color c = new Color(122, 173, 255);
		this.setBackground(c);
		makeMap();
		setUpKeyMappings();
		t.start();
	}
	
	private void makeMap() {
		t = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			m.tick();
			repaint();
			}
		});
	}

	private void setUpKeyMappings() {
			this.getInputMap().put(KeyStroke.getKeyStroke("SPACE"),"fly");	
			this.getActionMap().put("fly",new AbstractAction(){
				@Override
				public void actionPerformed(ActionEvent e) {
				}
			});
			this.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"mLeft");
			this.getActionMap().put("mLeft",new AbstractAction(){
				@Override
				public void actionPerformed(ActionEvent e) {
					m.mLeft();
				}
			});
			this.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"mRight");
			this.getActionMap().put("mRight",new AbstractAction(){
				@Override
				public void actionPerformed(ActionEvent e) {
					m.mRight();
				}
			});
			this.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"mDown");
			this.getActionMap().put("mDown",new AbstractAction(){
				@Override
				public void actionPerformed(ActionEvent e) {
					m.mDown();
				}
			});
			this.getInputMap().put(KeyStroke.getKeyStroke("UP"),"mUp");
			this.getActionMap().put("mUp",new AbstractAction(){
				@Override
				public void actionPerformed(ActionEvent e) {
					m.mUp();
				}
			});
			
			this.getInputMap().put(KeyStroke.getKeyStroke("released UP"),"stopVert");
			this.getInputMap().put(KeyStroke.getKeyStroke("released DOWN"),"stopVert");
			this.getActionMap().put("stopVert",new AbstractAction(){
				@Override
				public void actionPerformed(ActionEvent e) {
				}
			});
			this.getInputMap().put(KeyStroke.getKeyStroke("released LEFT"),"stopHoriz");
			this.getInputMap().put(KeyStroke.getKeyStroke("released RIGHT"),"stopHoriz");
			this.getActionMap().put("stopHoriz",new AbstractAction(){
				@Override
				public void actionPerformed(ActionEvent e) {
				}
			});
			this.requestFocusInWindow();		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		m.draw(g);
	}
}
