package finalvers1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.Timer;



public class GameComponent extends JComponent {


	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final Color BG = Color.BLUE;
	public static final Color FG = Color.BLACK;
	Timer timer;
	
	
	public GameComponent() {
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		//  seed a couple so something is visible immediately

	        	repaint();

	}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;

	        }
			
		}


