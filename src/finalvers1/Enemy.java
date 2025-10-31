package finalvers1;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Enemy extends Sprite implements Collision{
	
	private int dx = 3;
    private int dy = 3;

    public Enemy(int x, int y) {
        super(x, y, 40, 40); // initialize Sprite fields

        try {
            sprite = ImageIO.read(Enemy.class.getResource("Enemy.png"));
            spriteLoaded = (sprite != null);
        } catch (IOException | IllegalArgumentException ex) {
            spriteLoaded = false;
        }
    }

    @Override
    public void update() {
        // move logic can go here (if you call update() from your timer)
        move(GameComponent.WIDTH, GameComponent.HEIGHT);
    }

    @Override
    public void draw(Graphics2D g2) {
        if (spriteLoaded) {
            g2.drawImage(sprite, x - width, y - height, width, height, null);
        } else {
            g2.setColor(Color.CYAN);
            g2.fillRect(x, y, width, height);
        }
    }
    
    public void move(int screenWidth, int screenHeight) {
    	x += dx;
    	y += dy;
    	
    	if (x < 0 || x + width > screenWidth) { dx = -dx; }
    	if (y < 0 || y + height > screenHeight) { dy = -dy; }
    }
	
}
