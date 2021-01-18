
import java.awt.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class BreakoutPanel extends JPanel implements ActionListener, KeyListener {
	
	static final long serialVersionUID = 2L;

	
	private int livesLeft = 3;
	private String screenMessage = "";
	private Ball ball;
	private Paddle paddle;
	private Brick bricks[];
	
	GameState gameState = GameState.Initialising;
	
	
	//constructor
	public BreakoutPanel() {
		setBackground(Color.WHITE);
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		Timer timer = new Timer(5, this);
		timer.start();
		addKeyListener(this);
		setFocusable(true);
	}
	
	public void createObjects() {
		// DONE: Create a new ball object and assign it to the appropriate variable
		ball = new Ball();
		// DONE: Create a new paddle object and assign it to the appropriate variable
		paddle = new Paddle();
		// DONE: Create a new bricks array (Use Settings.TOTAL_BRICKS)
		bricks = new Brick[Settings.TOTAL_BRICKS];
		// DONE: Call the createBricks() method
		createBricks();
	}
	
	private void createBricks() {
		int counter = 0;
		int x_space = 0;
		int y_space = 0;
		for(int x = 0; x < 4; x++) {
			for(int y = 0; y < 5; y++) {
				bricks[counter] = new Brick((x * Settings.BRICK_WIDTH) + Settings.BRICK_HORI_PADDING + x_space, 
											(y * Settings.BRICK_HEIGHT) + Settings.BRICK_VERT_PADDING + y_space);
				counter++;
				y_space++;
			}
			x_space++;
			y_space = 0;
		}
	}
	
	
	
	private void update() {
		switch(gameState) {
			case Initialising: {
				createObjects();
				gameState = GameState.Playing;
				paddle.setXVelocity(0);
				ball.setXVelocity(1);
				ball.setYVelocity(-1);
				break;
			}
			case Playing: {
				ball.update();
				paddle.update();
				gameOver();
				gameWon();
				collisions();
				repaint();
				break;
			}
			case GameOver: {
				break;
			}
		}
	}
	
	
	
	private void gameOver() {
		// Check for loss
				if(ball.y > 450) {
					// life lost
					livesLeft--;
					if(livesLeft <= 0) {
						screenMessage = "Game Over!";
						gameState = GameState.GameOver;
						return;
					} else {
						ball.resetPosition();
						ball.setYVelocity(-1);
					}
				}
	}
	
	private void gameWon() {
		// Check for win
		boolean bricksLeft = false;
		for(int i = 0; i < bricks.length; i++) {
			// Check if there are any bricks left
			if(!bricks[i].isBroken()) {
				// Brick was found, close loop
				bricksLeft = true;
				break;
				}
			}
			if(!bricksLeft) {
				screenMessage = "Game Won!";
				gameState = GameState.GameOver;
				return;
				}
	}
	
	
	private void collisions() {	
		// Check collisions
		if(ball.getRectangle().intersects(paddle.getRectangle())) {
			// Simplified touching of paddle
			// Proper game would change angle of ball depending on where it hit the paddle
			ball.setYVelocity(-1);
		}
		
		for(int i = 0; i < bricks.length; i++) {
			if (ball.getRectangle().intersects(bricks[i].getRectangle())) {
				int ballLeft = (int) ball.getRectangle().getMinX();
	            int ballHeight = (int) ball.getRectangle().getHeight();
	            int ballWidth = (int) ball.getRectangle().getWidth();
	            int ballTop = (int) ball.getRectangle().getMinY();

	            Point pointRight = new Point(ballLeft + ballWidth + 1, ballTop);
	            Point pointLeft = new Point(ballLeft - 1, ballTop);
	            Point pointTop = new Point(ballLeft, ballTop - 1);
	            Point pointBottom = new Point(ballLeft, ballTop + ballHeight + 1);

	            if (!bricks[i].isBroken()) {
	                if (bricks[i].getRectangle().contains(pointRight)) {
	                    ball.setXVelocity(-1);
	                } else if (bricks[i].getRectangle().contains(pointLeft)) {
	                    ball.setXVelocity(1);
	                }

	                if (bricks[i].getRectangle().contains(pointTop)) {
	                    ball.setYVelocity(1);
	                } else if (bricks[i].getRectangle().contains(pointBottom)) {
	                    ball.setYVelocity(-1);
	                }
	                bricks[i].setBroken(true);
	            }
			}
		}
	}
	
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(gameState != GameState.Initialising) {
        paintBall(g);
        paintPaddle(g);
        paintBricks(g);
        
        // Draw lives left
        // DONE: Draw lives left in the top left hand corner
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Lives: " + Integer.toString(livesLeft), Settings.LIVES_POSITION_X, Settings.LIVES_POSITION_Y);
        
        // Draw screen message
        if(screenMessage != null) {
        	g.setFont(new Font("Arial", Font.BOLD, 18));
        	int messageWidth = g.getFontMetrics().stringWidth(screenMessage);
        	g.drawString(screenMessage, (Settings.WINDOW_WIDTH / 2) - (messageWidth / 2), Settings.MESSAGE_POSITION);
        	}
        }
     }
	
    public void paintBall(Graphics g) {
		g.fillOval(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
	}
    
    public void paintPaddle(Graphics g) {
		g.fillRect(paddle.getX(), paddle.getY(), paddle.getWidth(), paddle.getHeight());
	}
    
    private void paintBricks(Graphics g) {
		// DONE: Loop through the bricks and call the paint() method
		for(int i = 0; i < Settings.TOTAL_BRICKS; i++) {
			bricks[i].paint(g);
			}
	}
        
        

	@Override
	public void keyPressed(KeyEvent event) {
		// DONE: Set the velocity of the paddle depending on whether the player is pressing left or right
		if(event.getKeyCode() == KeyEvent.VK_RIGHT) {
			paddle.setXVelocity(1);
		} else if (event.getKeyCode() == KeyEvent.VK_LEFT) {
			paddle.setXVelocity(-1);
		}
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// DONE: Set the velocity of the paddle after the player has released the keys
		if(event.getKeyCode() == KeyEvent.VK_RIGHT || event.getKeyCode() == KeyEvent.VK_LEFT) {
			paddle.setXVelocity(0);
		}
	}

	@Override
	public void keyTyped(KeyEvent event) {
	
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		update();
		
	}

}
