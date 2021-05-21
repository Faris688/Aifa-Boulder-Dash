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
 * Stone Class
 */

public class Stone extends Block implements IBlock {
	
	private boolean falling = false;

	/**
	 * Methods to take into consideration when moving the Player
	 */
	
	public Stone(int posX, int posY) {
		super(posX, posY);
		try {
			this.setSprite(ImageIO.read(Model.class.getResource("/stone.png")));
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
