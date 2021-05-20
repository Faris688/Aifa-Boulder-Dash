package contract;

/**
 * The Class Controller.
 * @author client
 * @author Aifa-Boulder-Dash
 * @version 2021
 */

import java.awt.Image;

public interface IBlock {

	public int getPosX();
	
	public void setPosX(int posX);
	
	public void setSprite(Image img);

	public void walkOn();
	
	public int getPosY();
	
	public void setPosY(int posY);
	
	public Image getSprite();
	
	public boolean isWalked();
	
	public boolean isFalling();

	public void release();
	
}
