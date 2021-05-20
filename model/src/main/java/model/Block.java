package model;

import java.awt.Image;

import contract.IBlock;

/**
 * The Class Controller.
 * @author client
 * @author Aifa-Boulder-Dash
 * @version 2021
 */

public abstract class Block implements IBlock {
	// Attributes of the Distribution and sprite
	protected int posX;
	protected int posY;
	protected Image sprite;

	// Constructor of the different block position
	public Block(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	// Sprite method
	public Image getSprite() {
		return this.sprite;
	}
	
	public void setSprite(Image img) {
		this.sprite = img;
	}
	
	// Methods of the different position
	public int getPosX() {
		return this.posX;
	}
	
	public void setPosX(int posX) {
		this.posX += posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public void setPosY(int posY) {
		this.posY += posY;
	}
	
	// Displacement methods

	public void walkOn() {}
	
	public boolean isWalked() {
		return false;
	}
	
	public boolean isFalling() {
		return false;
	}

	public void release() {}
}
