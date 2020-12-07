import java.awt.Graphics;

public class Paddle {

	private int x;
	private int y;
	private int width = 50 ;	
	private int height = 200;
	private int vy = 0;
	
	
	public Paddle(int newX, int newY) {
		//assign instance variables
		x = newX;
		y = newY;
		
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	public void setX(int newX) {
	x =newX;	
	
	}
	
	
	public void paint(Graphics g) {
		y += vy;
		g.fillRect(x, y, width, height);
		
	}
	
	
	public void moveUp() {
		vy -= 10;
		
	}
	public void moveDown() {
		vy += 10;
		
	}
	public void stop() {
		vy = 0;
		
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}
	
	
	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}
	
	
	
	
	
}
