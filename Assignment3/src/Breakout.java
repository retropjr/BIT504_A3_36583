import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
		public Breakout() {
		// DONE: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		// DONE: Set the title
		setTitle(Settings.WINDOW_NAME);
		// DONE: Set resizable to false
		setResizable(false);
		// DONE: Set visible to true
		setVisible(true);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    add(new BreakoutPanel());
	}

	public static void main(String[] args) {
		new Breakout();	
	}

}
