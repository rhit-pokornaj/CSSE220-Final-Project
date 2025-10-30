package finalvers1;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Enemy extends Sprite implements Collision{
	
	public static final int ENEMY_WIDTH = 10;
	public static final int ENEMT_HEIGHT = 10;
	
	int x, y;
	int dx = 3;
	int dy = 3;
	private BufferedImage sprite;
	private boolean spriteLoaded = false;
	
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
		
		try {
			sprite = ImageIO.read(Enemy.class.getResource("Enemy.png"));
		} catch (IOException | IllegalArgumentException ex) {
			spriteLoaded = false;
		}
	}
	
	public void draw(Graphics2D g2) {
    	if (spriteLoaded) {
    	
    		g2.drawImage(sprite, x - 40, y - 40, 40, 40, null);
    	} else {
    		g2.setColor(Color.CYAN);
            g2.fillRect(x, y, 40, 40);
    	}
    }
	
	// moves him around the screen
	public void move(int width, int height) {
		x += dx;
		y += dy;
		
		// left & right bounds
		if (x - 40 < 0) { x = 40; dx = -dx; }
		else if (x + 40 > width) { x = width - 40; dx = -dx; }
		
		// top & bottom bounds
		if (y - 40 < 0) {y = 40; dy = -dy; }
		else if (y + 40 > height) { y = height - 40; dy = -dy; }
		
		// edges
		if (x < 0) x = width;
        if (x > width) x = 0;
        if (y < 0) y = height;
        if (y > height) y = 0;
        
        // implement collisions
	}
	
}
