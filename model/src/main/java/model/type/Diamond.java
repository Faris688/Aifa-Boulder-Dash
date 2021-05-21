package model.type;

import java.io.IOException;

import javax.imageio.ImageIO;

import contract.IBlock;
import model.Block;
import model.Model;

/**
 * The Class Controller.
 * @author client
 * @author Aifa-Boulder-Dash
 * @version 2021
 */

/**
 * Class Diamond
 */
public class Diamond extends Block implements IBlock {

	private boolean falling = false;
	// Constructor to take care of the position of the Player
	public Diamond(int posX, int posY) {
    super(posX, posY);
    try {
    	this.setSprite(ImageIO.read(Model.class.getResource("/diamond.png")));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	
	/**
	 * Methods to take into consideration when moving the Player
	 */
	
	public void walkOn() {
		try {
	    	this.setSprite(ImageIO.read(Model.class.getResource("/voidGround.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isFalling() {
		return falling;
	}

	public void setFalling(boolean falling) {
		this.falling = falling;
	}
	
	
  
}
