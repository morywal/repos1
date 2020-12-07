import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball {

	private int x;
	private int y;
	private int width = 30;	
	private int height = 30;
	private int vx, vy; 
	
	public Ball(int newX, int newY) {
		//assign instance variables
		x = newX;
		y = newY;
		
		vx = (int)(Math.random()*(4-3+1))+3;
		vy = (int)(Math.random()*(4-3+1))+3;
		
	}		
		
			
	public int getX() {
		return x;
	
	}
	
	public int getY() {
		return y;
	}
	
	
	public void setX(int newX,int newY, int vx, int vy) {
	x = newX;	
	y = newY;
	//y = newY;
	
	vx = (int)(Math.random()*(4-3+1))+3;
	vy = (int)(Math.random()*(4-3+1))+3;
	
	if (Math.random()<.50 ) {
		vx *= -1;
	}
	if (Math.random()<.50 ) {
		vy *= -1;
	}
	
	
	}
		
	
			
	public void paint(Graphics g) {
		x += vx;
		y += vy;
		if (y<= 0 || y>= 550) {
			vy *= -1;
			
		}
		if (x<= 0 || x>= 800) {
			vx *= -1;
			
		}
		
		g.fillOval(x, y, width, height);
	}
	
	
	public void isColliding(Paddle p) {
		
		Rectangle r1 = new Rectangle(x,y, width, height);
		
		Rectangle r2 = new Rectangle(p.getX(), p.getY(), p.getWidth(), p.getHeight());
		
		
		if(r1.intersects(r2)) {
			vx *= -1;
		}
		
	}
	
	
	
	
		
			
	
	
}
