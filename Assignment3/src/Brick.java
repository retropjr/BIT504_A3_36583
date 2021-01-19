public class Brick extends Sprite {
	
	private boolean broken = false;
	
	public Brick(int xCoordinate, int yCoordinate) {
		// DONE: Set x using the parameter
		x = xCoordinate;
		// DONE: Set y using the parameter
		y = yCoordinate;
		// TODO: Set the width and height of the brick using Settings.BRICK_WIDTH/HEIGHT
		width = Settings.BRICK_WIDTH;
		height = Settings.BRICK_HEIGHT;
	}

	public boolean isBroken() {
		return broken;	// DONE: Return the correct variable
	}
	public void setBroken(boolean b) {
		// DONE: Set the broken variable using the parameter given
		broken = b;
	}
	
	
}
