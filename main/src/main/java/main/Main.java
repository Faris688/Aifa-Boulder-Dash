package main;

import java.util.Scanner;

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
     */
    public static void main(final String[] args) {
        final Model model = new Model();
        model.loadMap(4);
        final View view = new View(model);
        final Controller controller = new Controller(view, model);
        view.setController(controller);
        controller.run();
        controller.control();
        
        Scanner input = new Scanner(System.in);
        
        String username, password;
        
        System.out.print("Enter your username: ");
        username = input.nextLine();

        System.out.print("Enter your password: ");
        password = input.nextLine();
        
        if(username.equals("Faris") && (password.equals("Love"))) {
        	System.out.println("Welcome to Aifa-Boulder-Dash! ");
        }else {
        	System.out.println("The entered information is invalid! ");
        }
    }
}
