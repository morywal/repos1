import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Draw extends JPanel implements ActionListener{

	
	public void paint(Graphics g) {
		
		super.paintComponent(g); //do not remove
		
		int x1 = 200;
		int y1 = 200;
		int x2 = 400;
		int y2 = 200;
		int sum = 1;
		
		g.drawLine(x1,y1,x2,y2);
		while(sum <= 20) {
			x1 = x1 + 10;
			y1 = y1 + 0;
			
			x2 = x2 + 0;
			y2 = y2 - 10;
			g.drawLine(x1,y1,x2,y2);
			sum++;
		}
		x1 = 200;
		y1 = 0;
		x2 = 200;
		y2 = 200;
		sum = 1;
		g.drawLine(x1,y1,x2,y2);
		while(sum <= 20) {
			x1 = x1 + 0;
			y1 = y1 + 10;
			
			x2 = x2 + 10;
			y2 = y2 + 0;
			g.drawLine(x1,y1,x2,y2);
			sum++;
		
		}
		x1 = 200;
		y1 = 200;
		x2 = 200;
		y2 = 0;
		sum = 1;
		g.drawLine(x1,y1,x2,y2);
		
		while(sum <= 20) {
			x1 = x1 + 0;
			y1 = y1 - 10;
			
			x2 = x2 + 10;
			y2 = y2 + 0;
			g.drawLine(x1,y1,x2,y2);
			sum++;
		
		}
		x1 = 400;
		y1 = 200;
		x2 = 400;
		y2 = 0;
		sum = 1;
		g.drawLine(x1,y1,x2,y2);
		
		while(sum <= 20) {
			x1 = x1 + 0;
			y1 = y1 - 10;
			
			x2 = x2 - 10;
			y2 = y2 + 0;
			g.drawLine(x1,y1,x2,y2);
			sum++;
		
		}
		
				
		
		
		
		
		
		
	
	} //end of paint curly do not delete

	/*g.setColor(new Color(0, 128, 0));
		 g.fillRoundRect(50, 100, 200, 150, 50, 50);
		 g.setColor(new Color(200, 52, 100));
		 g.fillOval(50, 200, 200, 10 );
		 g.setColor(new Color(42, 102, 13));
		 g.fillRoundRect(50, 10, 50, 164, 50, 50);
		 g.setColor(new Color(42, 102, 13));
		 g.fillRoundRect(200, 10, 50, 164, 50, 50);
		 
		 //eyes
		 g.setColor(new Color(0, 0, 0));
		 g.fillRoundRect(60, 10, 20, 50, 50, 50);
		 g.setColor(new Color(0, 0, 0));
		 g.fillRoundRect(210, 10, 20, 50, 50, 50);
		 //pupils
		 g.setColor(new Color(0, 0, 255));
		 g.fillRoundRect(60, 25, 20, 20, 20, 20);
		 g.setColor(new Color(0, 0, 255));
		 g.fillRoundRect(210, 25, 20, 20, 20, 20);
		*/

	/*g.drawRect(10,10,700,500);
	g.drawLine(400,10,400,590);
	g.drawLine(10,300,790,300);
	
	int cntr = 0;
	while(cntr != 100) {
		
		//random RGB
		// (int)(Math.random()*(max-min +1)+ min); 
		int red = (int)(Math.random()*(255-0 +1)+ 0); 
		int green = (int)(Math.random()*(255-0 +1)+ 0); 
		int blue = (int)(Math.random()*(255-0 +1)+ 0); 
		
		
		g.setColor( new Color(red,green,blue));
		
		//random rect 
		
		int x1 = (int)(Math.random()*(255-0 +1)+ 400); 
		int y1 = (int)(Math.random()*(255-0 +1)+ 10); 
		//int x2 = (int)(Math.random()*(255-0 +1)+ 0); 
		//int y2 = (int)(Math.random()*(255-0 +1)+ 0); 
		
		g.fillRect(x1, y1, 30, 30);
	
		
		g.setColor( new Color(red,green,blue));
		
		//random line 
		
		int x3 = (int)(Math.random()*(400-20 + 1)+ 20); 
		int y3 = (int)(Math.random()*(290-20 + 1)+ 20); 
		int x4 = (int)(Math.random()*(400-20 + 1)+ 20); 
		int y4 = (int)(Math.random()*(290-20 + 1)+ 20); 
		
		g.drawLine(x3, y3, x4, y4);
		
		
		g.setColor( new Color(red,green,blue));
		
		//random oval 
		
		int xOw = (int)(Math.random()*(300-20 + 1)+ 20); 
		int yOh = (int)(Math.random()*(350-310 + 1)+ 310); 
		int x6 = (int)(Math.random()*(200-0 + 1)+ 0); 
		
		while(xOw+x6 > 400 || yOh + x6 > 510) {
		xOw = (int)(Math.random()*(300-20 + 1)+ 20);
		yOh = (int)(Math.random()*(350-310 + 1)+ 310); 
		}
		
		
		//x5, y5 is greater than the total width then pick new numbers 
		
		g.drawOval(xOw, yOh, x6, x6);
		
		
		//increment counter
	cntr = cntr +1;
	
	}
*/	
	
	
	
	
	
	//do not touch
	public Draw(){
		JFrame frame = new JFrame("Pong");
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);

		//Timer t = new Timer(16, this);
	//	t.start();
		frame.setVisible(true);
	}//end of MainFrame




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	} //end of actionPerformed curly do not delete

} //end of class curly - do not delete
