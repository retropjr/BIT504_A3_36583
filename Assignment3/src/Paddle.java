//Open Polytechnic course BIT504 Assignment 3
//Richard Porter 36583

public class Paddle extends Sprite {

	
	// Constructor 
		public Paddle() {
			setInitialXPosition(Settings.INITIAL_PADDLE_X);
			setInitialYPosition(Settings.INITIAL_PADDLE_Y);
			// DONE: Set width to Settings.BALL_WIDTH
			setWidth(Settings.PADDLE_WIDTH);
			// DONE: Set height to Settings.BALL_HEIGHT
			setHeight(Settings.PADDLE_HEIGHT);
			// Set the paddle's initial velocity
			setXVelocity(0);
			setYVelocity(0);
			// DONE: Call resetPosition
			resetPosition();
		}
}
