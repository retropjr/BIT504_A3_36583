import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		// Done: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		// Done: Set the title
		setTitle(Settings.WINDOW_NAME);
		// Done: Set the background colour to white
		setBackground(Color.WHITE);
		// Done: Set resizable to false
		setResizable(false);
		// Done: Set visible to true
		setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);
	}

	public static void main(String[] args) {
		new Breakout();	
	}

}
