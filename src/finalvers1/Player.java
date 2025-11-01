package finalvers1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Player extends JComponent{
	 public static final int WIDTH  = 800;
	 public static final int HEIGHT = 600;
	 public static final float GRAVITY = .98f;
	 public static final float JUMP_FORCE =-15f;
	 
	 private int x;
	 private int y;
	 private boolean onGround;
	 private int yVelocity;
	 
	 public Player(int startX,int startY) {
		 setPreferredSize(new Dimension(WIDTH,HEIGHT));
		 this.x = startX;
		 this.y = startY;
		 this.onGround = true;
		 this.yVelocity = 0;

	 }
	 	 public void draw (Graphics2D g2) {
	 		g2.setColor(Color.CYAN);
            g2.fillRect(x, y, 20, 40);

	 	 }
		 public void moveDelta(int dx) {
			 x+=dx;

		 }
		 public void setPosition(int xNew, int yNew) {
			 x=xNew;
			 y=yNew;

		 }
		 
		 public void update() {
			 if(!onGround) {
				 yVelocity+=GRAVITY;
				 y+=yVelocity;
				 
				 if (y>=HEIGHT) {
					 y=HEIGHT;
					 yVelocity=0;
					 onGround = true;
				 }
			 }

			 
		 }
		 public void jump() {
			 if(onGround) {
				 yVelocity=(int) JUMP_FORCE;
				 onGround=false;

			 }

		 }
		 
		 
		 
	 
	

}
