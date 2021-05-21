package model;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.IPlayer;

/**
 * The Class Controller.
 * @author client
 * @author Aifa-Boulder-Dash
 * @version 2021
 */

/**
 * Class Player
 */
public class Player implements IPlayer {
	
	/**
	 * Creating different attributes to take care of the positions. 
	 */
	
	private int posX;
	private int posY;
	

	/**
	 * A simple Player Method to Initialise the position and images.
	 */
	public Player() {
		this.posX = 16;
		this.posY = 16;
		this.score = 0;
		try {
	    	this.setSprite(ImageIO.read(Model.class.getResource("/Normal.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Different Player methods to generate the position and images.
	 * @return a required action
	 */
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		try {
			if (posX > 0) {
		    	this.setSprite(ImageIO.read(Model.class.getResource("/Right.png")));
			} else {
				this.setSprite(ImageIO.read(Model.class.getResource("/Left.png")));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.posX += posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		try {
			if (posY > 0) {
		    	this.setSprite(ImageIO.read(Model.class.getResource("/Down.png")));
			} else {
				this.setSprite(ImageIO.read(Model.class.getResource("/Up.png")));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.posY += posY;
	}
	
	
	/**
	 * Creating different attributes to take care of the images and scores. 
	 */
	
	private Image sprite;
	private int score;

	
	/**
	 * Different Player methods to generate the position and images.
	 * @return a required action
	 */
	
	public Image getSprite() {
		return sprite;
	}

	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score += score;
	}
	
	/**
	 * Printing a message as soon as the player is dead and close the window.
	 */
	public void die() {
		try {
			this.setSprite(ImageIO.read(Model.class.getResource("/Death.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
