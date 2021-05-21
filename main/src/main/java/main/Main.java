package main;

import java.io.File;
import java.io.IOException;
import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Controller.
 * @author client
 * @author Aifa-Boulder-Dash
 * @version 2021
 */

/**
 * The Class Main.
 *
 * 
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException 
     * @throws UnsupportedAudioFileException 
     * @throws LineUnavailableException 
     */
    public static void main(final String[] args) {
        final Model model = new Model();
        model.loadMap(4);
        final View view = new View(model);
        final Controller controller = new Controller(view, model);
        view.setController(controller);
        controller.run();
        controller.control();
        
        
    }}
