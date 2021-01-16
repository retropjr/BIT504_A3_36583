import java.awt.Color;
import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		// DONE: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		setSize(Settings.WINDOW_WIDTH + 14, Settings.WINDOW_HEIGHT);
		// DONE: Set the title
		setTitle(Settings.WINDOW_NAME);
		// DONE: Set the background color to white
		setBackground(Color.WHITE);
		// DONE: Set resizable to false
		setResizable(false);
		// DONE: Set visible to true
		setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);
	}

	public static void main(String[] args) {
		new Breakout();	
	}

}
