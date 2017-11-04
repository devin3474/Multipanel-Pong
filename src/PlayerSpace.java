import javax.swing.*;
import java.awt.*;

public class PlayerSpace{
int mycx, mycy, myl, myw;
Color mycolor;
	
	public PlayerSpace(int cx, int cy, int l, int w, Color c) {
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
	
	public void move(int ax, int ay) {
		mycx += ax;
		mycy += ay;
	}
	
	public int getcx() {
		return mycx;
	}
	
	public int getcy() {
		return mycy;
	}
	
	public int getl() {
		return myl;
	}
	
	public int getw() {
		return myw;
	}
}
