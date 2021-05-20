package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 */
public final class View implements IView, Runnable {

	/** The frame. */
	public final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_UP:
				return ControllerOrder.Top;
			case KeyEvent.VK_RIGHT:
				return ControllerOrder.Right;
			case KeyEvent.VK_DOWN:
				return ControllerOrder.Bottom;
			case KeyEvent.VK_LEFT:
				return ControllerOrder.Left;
			default:
				return null;
		}
	}


	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
		this.viewFrame.getGraphics().drawString(message, 200, 200);
	}

	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}

	public void actualiser() {
		this.viewFrame.repaint();
	}
	
	
}
