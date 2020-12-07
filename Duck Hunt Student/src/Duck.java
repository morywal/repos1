import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Duck implements MouseListener{
	private int x = 0,y = 150;
	private int vx, vy;
	private Image img; // image of the frog
	private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);

	

	Music haha = new Music("haha.wav", false);
	
	Music soundBalloony2 = new Music("balloony2.wav", false);
		
	Music soundBalloony1 = new Music("balloony1.wav", false);
	
	
	public Duck() {
		img = getImage("balloony.png"); //load the image for Tree
		init(x, y); 	
		
		vx = (int)(Math.random()*(4-3+1))+3;
		vy = (int)(Math.random()*(4-3+1))+3;
		
		
		
		if (y == 490) {
			y = 470;
			vx = (int)(Math.random()*(4-3+1))+3;
			vy = (int)(Math.random()*(4-3+1))+3;
			
			
		}
		
		
		//initialize the location of the image
	}
	
	public void paint(Graphics g) {
		
		//these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;
		
		/* get the bird to move randomly up from the bottom of the screen
		 * it should start at the bottom 
		 * make it bounce off the top and side borders
		 */
		x += vx;
		y += vy;
		if (y<= -10 || y>= 515) {
			vy *= -1;
			
		}
		if (x<= -10 || x>= 830) {
			vx *= -1;
			
			
		}
		if (y <= -10) {
			x = (int)(Math.random()*(800-10+1))+10;
			//x = 400;
			y = 490;
			vx = 0;
			vy = 0;
			
		
		}
		if (y == 490) {
			y = 470;
			vx = (int)(Math.random()*(4-3+1))+3;
			vy = (int)(Math.random()*(4-3+1))+3;
			
			
		}
		
		//y--;
		tx.setToTranslation(x,y);; // must call this any time you update x and y
		
		g2.drawImage(img, tx, null);   
		
	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(1, 1);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Duck.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
	public boolean collided(int mX, int mY) {
		
		System.out.println(mX+":"+mY);
		
		Rectangle example = new Rectangle(x,y, 100, 120);
		if (example.contains(mX, mY)){
			
			System.out.println("ouch!");
			vx = 0;
			vy = 5;
			
			soundBalloony1.play();
			//collision detection code
			//duck fall
			//play bang sound 
		if (y <= 500) {
		
			y = 470;
			vx = (int)(Math.random()*(4-3+1))+3;
			vy = (int)(Math.random()*(4-3+1))+3;
			
			
		}
			
		
		
		
		}else{
		if (example.contains(mX+40, mY+40)){
			haha.play();
			System.out.println("HAH");
		}
			
			
			
		}
		
		//haha if you miss by a little 
		
		
		return false;
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ouch");
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
