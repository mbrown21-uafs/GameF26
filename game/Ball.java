package game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ball extends GameObject{
	public int width;
	public int height;
	
	
	public Ball() {
		this.x = 150;
		this.y = 150;
		randomBall(height, width);
	}
	

	
	public Ball(int x, int y, int speed, int size, Color color) {
		super(x,y,speed,size,color);
	}
	
	public void update() {
		Random r = new Random();
		
		if (this.x + this.size >= 900 || this.x <= 0) {
			this.speed = (r.nextInt(5)+1);
			
		if(r.nextBoolean()) {
			this.speed = -this.speed;
			}
		}
		
		if (this.y + this.size >= 800 || this.y <= 0) {
			this.vSpeed = (r.nextInt(5)+1);
			
			
			if(r.nextBoolean()) {
				this.vSpeed = -this.vSpeed;
			}
		}
		
		this.x = this.x + this.speed;
		this.y = this.y + this.vSpeed;
	}
	
	public void render(Graphics g) {
		g.setColor(this.color);
		g.fillOval(this.x, this.y, this.size, this.size);
		//g.drawRect(this.x, this.y, this.size, this.size);
	}
	
	public void randomBall(int width, int height) {
		Random r = new Random();
		
		this.x = r.nextInt(400) + 10;
		this.y = r.nextInt(400) + 10;
		this.size = r.nextInt(100) + 20;
		this.color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
		this.speed = r.nextInt(2) + 1;
		this.vSpeed = r.nextInt(2) + 1;

	}
}
