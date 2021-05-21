package model.type;

import java.awt.Image;
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
 * Class Monster
 */
public class Monster extends Block implements IBlock {

	private Image sprite;

	/**
	 * Methods to take into consideration when moving the Player
	 */
	
	public Monster(int posX, int posY) {
		super(posX, posY);
		try {
	    	this.setSprite(ImageIO.read(Model.class.getResource("/monster.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Image getSprite() {
		return sprite;
	}

	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}
	
}
