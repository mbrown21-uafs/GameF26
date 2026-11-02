package game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ball extends GameObject{
	
	public Ball() {
		this.x = 150;
		this.y = 150;
		randomBall();
	}
	

	
	public Ball(int x, int y, int speed, int size, Color color) {
		super(x,y,speed,size,color);
	}
	
	public void update() {
		if (this.x + this.size >= 900) {
			this.speed = -this.speed;
		}
		if (this.x <= 0) {
			this.speed = -this.speed;
		}
		
		this.x = this.x + this.speed;
		
		if(this.y + this.size >= 700) {
			this.vSpeed = -this.speed;
		}
		if (this.y <= 0) {
			this.vSpeed = -this.vSpeed;
		}
		
		this.y = this.y + this.vSpeed;
		
		
	}
	
	public void render(Graphics g) {
		g.setColor(this.color);
		g.fillOval(this.x, this.y, this.size, this.size);
	}
	
	public void randomBall() {
		Random r = new Random();
		
		Color[] colors = {Color.GREEN, Color.BLUE, 
				Color.RED, Color.ORANGE, Color.YELLOW};
		
		
		this.size = r.nextInt(100) + 10;
		this.color = colors[r.nextInt(5)];
		this.speed = r.nextInt(5) + 1;
		this.vSpeed = r.nextInt(5) + 1;
		
		
	}
	
}
