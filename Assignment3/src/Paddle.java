import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		// DONE: Set width to Settings.PADDLE_WIDTH
		width = Settings.PADDLE_WIDTH;
		// DONE: Set width to Settings.PADDLE_HEIGHT
		height = Settings.PADDLE_HEIGHT;
		// DONE: Call resetPosition
		resetPosition();
	}
	
	public void resetPosition() {
		// DONE: Set initial position x and y (use INITIAL_PADDLE_X/Y)
		// Note: Check Ball.java for a hint
		setX(Settings.INITIAL_PADDLE_X);
		// DONE: Set the balls y by using the INITIAL_BALL_Y (see above)
		setY(Settings.INITIAL_PADDLE_Y);
		
	}
	
	public void update() {
		x += xVelocity;
		
		// TODO: Prevent the paddle from moving outside of the screen
		// This can be done using two if statements (one for the left side of the screen and one for the right)

	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		// DONE: Set x velocity
		xVelocity = vel;
	}
}
