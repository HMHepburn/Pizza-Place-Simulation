package culminatingpizzaplace;

import javax.swing.JFrame; //Swing has graphics tools, and JFrame is the external window frame

public class graphicsTesterRun {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(750, 750); //640x480 pixels
        window.getContentPane().setBackground(new java.awt.Color(227, 133, 66));
        window.setTitle("Pizza is served!"); //title on the top of the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when user presses 'x' button the window will close
        window.setVisible(true); //makes the window visible
        
        DrawPizzaTester DC = new DrawPizzaTester();//will summarize the drawn rectangle and other objects together
        window.add(DC);
    }
}
