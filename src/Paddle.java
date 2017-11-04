import java.awt.*;

public class Paddle {
	int mycx, mycy, myl, myw;
	Color mycolor;
	
	public Paddle(int cx, int cy, int l, int w, Color c) {
		mycx = cx;
		mycy = cy;
		myl = l;
		myw = w;
		mycolor = c;
	}
	
	public void draw(Graphics g) {
		g.setColor(mycolor);
		g.fillRect(mycx, mycy, myw, myl);
	}
	
	public void move(int ay) {
		mycy += ay;
	}
}
