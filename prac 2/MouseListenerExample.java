import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListenerExample extends Frame implements MouseListener, MouseMotionListener{
	Label l;
	int count=0; 
	MouseListenerExample()
	{
	 	addMouseMotionListener(this);
        addMouseListener(this);  //Registering the class
        l=new Label();  
        l.setBounds(20,50,200,20);  
        add(l);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseListenerExample();

	}

	public void mouseClicked(MouseEvent arg0) {
		 int x = arg0.getX();
		 int y = arg0.getY();
		 String str = "x =" +x+",y = "+y;
		 l.setText(str);
		
	}
	public void mouseEntered(MouseEvent arg0) {
		
		l.setText("mouseEntered");
	}
	public void mouseExited(MouseEvent arg0) {
		
		l.setText("mouseExited");
	}	
	public void mousePressed(MouseEvent arg0) {
		
		count = arg0.getClickCount();
		l.setText("Press count::"+count); 
	}
	public void mouseReleased(MouseEvent arg0) {
		
		l.setText("mouseReleased");
	}

	
	public void mouseDragged(MouseEvent e) {		
		l.setText("mouse dragged  "+ e.getX() + " " + e.getY());
	}

	
	public void mouseMoved(MouseEvent e) {
		l.setText("mouse moved to point "+ e.getX() + " " + e.getY());	
	}

	
	

}
