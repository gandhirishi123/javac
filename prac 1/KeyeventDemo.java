import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyeventDemo extends Applet implements KeyListener{
	String msg = " "; 
	public void init()
	{
		addKeyListener(this);	
	}
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		showStatus("keyPressed");
		switch(key)
		{
		case KeyEvent.VK_0:
			msg = msg + "0";
			break;
		case KeyEvent.VK_1:
			msg = msg + "1";
			break;
		case KeyEvent.VK_F1:
			msg = msg + "F1";
			break;
		case KeyEvent.VK_F2:
			msg = msg + "F2";
			break;
		case KeyEvent.VK_UP:
			msg = msg + "up";
			break;
		case KeyEvent.VK_DOWN:
			msg = msg + "Down";
		}
		repaint();
	}
	public void keyReleased(KeyEvent e) {
		showStatus("keyReleased");
		repaint();
	}
	public void keyTyped(KeyEvent e) {
		showStatus("keyTyped");
		
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg, 20, 20);
	}

}
