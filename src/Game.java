import javax.swing.*;
import java.awt.*;

public class Game {
	public static void main(String[] args) {
		JFrame theGame = new JFrame();
		theGame.setTitle("Multi-Stage Pong");
		theGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theGame.setSize(1000,1000);
		theGame.setBackground(Color.black);
		theGame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		theGame.setUndecorated(true);
		theGame.setVisible(true);
		
		GamePanel master = new GamePanel(Color.black);
		master.setSize(theGame.getWidth(), theGame.getHeight());
		
		Container pane = theGame.getContentPane();
		pane.add(master);
		pane.setVisible(true);
	}
}
