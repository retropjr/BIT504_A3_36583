public class Paddle extends Sprite {

	
	// Constructor 
		public Paddle() {
			setInitialXPosition(Settings.INITIAL_PADDLE_X);
			setInitialYPosition(Settings.INITIAL_PADDLE_Y);
			// DONE: Set width to Settings.BALL_WIDTH
			setWidth(Settings.PADDLE_WIDTH);
			// DONE: Set height to Settings.BALL_HEIGHT
			setHeight(Settings.PADDLE_HEIGHT);
			// DONE: Call resetPosition
			setXVelocity(0);
			setYVelocity(0);
			resetPosition();
		}

	/*
	
	public void update() {
		setX(getX() + xVelocity);
		
		// DONE: Prevent the paddle from moving outside of the screen
		// This can be done using two if statements (one for the left side of the screen and one for the right)
		if (getX() < 0) {
			setX(0);
		} else if(getX() + Settings.PADDLE_WIDTH > Settings.WINDOW_WIDTH) {
			setX(Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH);
		}

	}
	
	
	
	public void setXVelocity(int vel) {
		// DONE: Set x velocity
		xVelocity = vel;
	}
	
	*/
}
