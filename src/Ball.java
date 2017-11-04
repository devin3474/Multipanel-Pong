import java.awt.*;

public class Ball {
	int mycx, mycy, myr;
	Color mycolor;
	
	public Ball(int cx, int cy, int r, Color c) {
		mycx = cx;
		mycy = cy;
		myr = r;
		mycolor = c;
	}
	
	public void draw(Graphics g) {
		g.setColor(mycolor);
		g.fillOval(mycx, mycy, myr * 2, myr * 2);
	}
	
	public void move(int ax, int ay) {
		mycx += ax;
		mycy += ay;
	}

}
