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
 * Class End
 */
public class End extends Block implements IBlock {

	/**
	 * Methods to take into consideration when moving the Player
	 */
	
	public End(int posX, int posY) {
		super(posX, posY);
		try {
			this.setSprite(ImageIO.read(Model.class.getResource("/voidGround.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
	
	/**
	 * Methods of the png Player
	 */
	public void release() {
		try {
			this.setSprite(ImageIO.read(Model.class.getResource("/Normal.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  
}
