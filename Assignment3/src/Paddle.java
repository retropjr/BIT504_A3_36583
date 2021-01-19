public class Paddle extends Sprite {

	private int xVelocity = 0;
	
	public Paddle() {
		// DONE: Set width to Settings.PADDLE_WIDTH
		setWidth(Settings.PADDLE_WIDTH);
		// DONE: Set width to Settings.PADDLE_HEIGHT
		setHeight(Settings.PADDLE_HEIGHT);
		// DONE: Call resetPosition
		resetPosition();
	}
	
	public void resetPosition() {
		// DONE: Set initial position x and y (use INITIAL_PADDLE_X/Y)
		// Note: Check Ball.java for a hint
		setX(Settings.INITIAL_PADDLE_X);
		// DONE: Set the paddles initial y position by using the INITIAL_PADDLE_Y (see above)
		setY(Settings.INITIAL_PADDLE_Y);
		
	}
	
	public void update() {
		setX(getX() + xVelocity);
		
		// DONE: Prevent the paddle from moving outside of the screen
		// This can be done using two if statements (one for the left side of the screen and one for the right)
		if (getX() < 0) {
			setX(0);
		} else if(getX() >=  Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH) {
			setX(Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH);
		}

	}
	
	
	
	public void setXVelocity(int vel) {
		// DONE: Set x velocity
		xVelocity = vel;
	}
}
