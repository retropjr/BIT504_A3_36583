//Open Polytechnic course BIT504 Assignment 3
//Richard Porter 36583

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
		public Breakout() {
		// DONE: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		setSize(Settings.WINDOW_WIDTH + 14, Settings.WINDOW_HEIGHT);
		// DONE: Set the title
		setTitle(Settings.WINDOW_NAME);
		// DONE: Set resizable to false
		setResizable(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    //BreakoutPanel class is responsible for setting up all the game parameters
  		//including bricks, ball, paddle and the panel itself. 
  		//The panel object of class BreakoutPanel is actually a JPanel and implements
  		//action listener. So it contains all the visual information for a panel to be displayed.
  		//Hence before displaying the panel using setVisible(true), we need to add the current 
  		//active panel. That is why we need to move the setVisible to AFTER the add(panel)
	    add(new BreakoutPanel());
		// DONE: Set visible to true
		setVisible(true);
	}

	public static void main(String[] args) {
		new Breakout();	
	}

}
