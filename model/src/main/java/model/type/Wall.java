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
 * Class Wall
 */
public class Wall extends Block implements IBlock {

	// Protected Attribute
  protected boolean breakable;

  /**
	 * Methods to take into consideration when moving the Player
	 */
  
	public Wall(int posX, int posY, boolean breakable) {
    super(posX, posY);
    try {
    	if (breakable) {
    		this.setSprite(ImageIO.read(Model.class.getResource("/breakableWall.png")));
    	} else {
    		this.setSprite(ImageIO.read(Model.class.getResource("/unbreakableWall.png")));
    	}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    this.breakable = breakable;
  }
  
}
