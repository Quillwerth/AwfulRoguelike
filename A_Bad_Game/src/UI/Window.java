/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

//import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Jess
 */
public class Window{
    private static void newGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("A Bad Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(407, 600);
        JLabel newLabel = new JLabel("Look at this silly gui");
        frame.getContentPane().add(newLabel);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                newGUI();
            }
        });
    }
}