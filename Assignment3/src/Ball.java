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
}
	