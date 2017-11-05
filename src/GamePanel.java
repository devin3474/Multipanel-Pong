import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {
	
	public GamePanel(Color bg) {
		setBackground(bg);
		Timer ptimer = new Timer(10, null);
		ptimer.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int h = getHeight();
		int w = getWidth();
		PlayerSpace s1 = new PlayerSpace(0, (int)(h * .33), (int)(h * .33), (int)(w * .33), Color.white);
		PlayerSpace s2 = new PlayerSpace((int)(w * .66), (int)(h * .33), (int)(h * .33), (int)(w * .33), Color.gray);
		s1.draw(g);
		s2.draw(g);
		
		int s1h = s1.getl();
		int s2h = s2.getl();
		int s1w = s1.getw();
		int s2w = s2.getw();
		Paddle p1 = new Paddle((int)(s1h * .1) + s1.getcx(), (int)(s1w * .05) + s1.getcy(), (int)(s1h * .2), (int)(s1w * .02), Color.black);
		Paddle p2 = new Paddle((s2w + s2.getcx()) - (int)(s2w * .1), (int)(s2w * .05) + s2.getcy(), (int)(s2h * .2), (int)(s2w * .02), Color.black);
		p1.draw(g);
		p2.draw(g);
		
		addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_UP) {
					s2.move(0, -1);
					repaint();
				}
				if (keyCode == KeyEvent.VK_DOWN) {
					s2.move(0, 1);
					repaint();
				}
				if (keyCode == KeyEvent.VK_LEFT) {
					s2.move(-1, 0);
					repaint();
				}
				if (keyCode == KeyEvent.VK_RIGHT) {
					s2.move(1, 0);
					repaint();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
			}	
		});
	}
	
}
