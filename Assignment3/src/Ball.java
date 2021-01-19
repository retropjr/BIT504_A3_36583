public class Ball extends Sprite {
	
	// Constructor 
	public Ball() {
		setInitialXPosition(Settings.INITIAL_BALL_X);
		setInitialYPosition(Settings.INITIAL_BALL_Y);
		// DONE: Set width to Settings.BALL_WIDTH
		setWidth(Settings.BALL_WIDTH);
		// DONE: Set height to Settings.BALL_HEIGHT
		setHeight(Settings.BALL_HEIGHT);
		// DONE: Call resetPosition
		setXVelocity(1);
		setYVelocity(-1);
		resetPosition();
	}
	
	/**
	 * Resets the ball to the initial position
	 * Uses Settings.INITIAL_BALL_X/Y to set the position of the ball
	 
	public void resetPosition() {
		setX(Settings.INITIAL_BALL_X);
		// DONE: Set the balls y by using the INITIAL_BALL_Y (see above)
		setY(Settings.INITIAL_BALL_Y);
	}
	
	
	public void update() {
		setX(getX() + xVelocity);
		// DONE: Increase the y variable by yVelocity (see above)
		setY(getY() + yVelocity);
		
		// Bounce off left side of screen
		if(getX() <= 0) {
			// DONE: Set x to 0 so it does not leave the screen
			setX(0);
			// DONE: Change the x velocity to make the ball go right
			// A negative x velocity and the ball is moving left.  Multiplied by -1 to make a positive (right moving) value
			xVelocity = xVelocity * -1;
		}
		
		// Bounce off right side of screen
		if(getX() >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {
			// DONE: Set x to the right edge of the screen (see the above if condition)
			setX(Settings.WINDOW_WIDTH - Settings.BALL_WIDTH);
			// DONE: Change the x velocity to make the ball go left
			// A positive x velocity and the ball is moving right.  Multiplied by -1 to make a negative (i.e. left movement) value
			xVelocity = xVelocity * -1;
		}
		
		// Bounce off top of screen
		if(getY() <= 0) {
			// DONE: Set y to 0 so it does not leave the screen
			setY(0);
			// DONE: Change the y velocity to make the ball go downward
			// A positive y velocity and the ball is moving down.  Multiplied by -1 to make a negative (i.e. upward movement) value
			yVelocity = yVelocity * -1;
		}
		
	}
	
	public void setXVelocity(int x) {
		// DONE: Set the x velocity
		xVelocity = x;
	}
	public void setYVelocity(int y) {
		// DONE: Set the y velocity
		yVelocity = y;
	}
	
	public int getXVelocity() {
		return xVelocity;	// TODO: Return the x velocity
	}
	public int getYVelocity() {
		return yVelocity;	// TODO: Return the y velocity
	}
	
	*/
}
