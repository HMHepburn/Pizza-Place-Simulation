package culminatingpizzaplace;

import java.awt.Graphics; //Must import graphics before using graphics class (Graphics g)
import javax.swing.JComponent; //must import Jcomponent before extending
import java.awt.Graphics2D; //Draw more advanced objects than with Graphics class
import java.awt.Rectangle;
import java.awt.Color; //used to draw in different colours
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
//import java.awt.geom.Point2D;
import java.awt.Font;
import java.awt.GradientPaint;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.*;
//import java.io.IOException;
//import javax.imageio.ImageIO;
//import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Toolkit;

public class DrawPizzaTester extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; //casting graphics to graphics2D

        /*
        Image img1 = Toolkit.getDefaultToolkit().getImage("pepper.png");
        g2.drawImage(img1, 100, 100, this);
        g2.finalize();
         */
        g2.setColor(new Color(250, 250, 250));
        g2.setFont(new Font("serif", Font.ITALIC, 50)); //(font name, bold or italic or both, font size)
        g2.drawString("Enjoy your pizza!", 200, 600); //x and y vals, displays a string, instance of g2 object

        //white dough
        g2.setColor(new Color(211, 158, 97));
        Ellipse2D.Double whiteCrust = new Ellipse2D.Double(150, 75, 450, 450);
        g2.fill(whiteCrust);

        //whole grain dough
        g2.setColor(new Color(150, 96, 31));
        Ellipse2D.Double wholeGrainCrust = new Ellipse2D.Double(150, 75, 450, 450);
        g2.fill(wholeGrainCrust);

        //tomato sauce
        g2.setColor(new Color(255, 58, 58));
        Ellipse2D.Double tomatoSauce = new Ellipse2D.Double(160, 85, 430, 430);
        g2.fill(tomatoSauce);

        //cream sauce
        /*
        g2.setColor(new Color(247,239,200));
        Ellipse2D.Double creamSauce = new Ellipse2D.Double(160, 85, 430, 430);
        g2.fill(creamSauce);
         */
        //pesto sauce
        /*
        g2.setColor(new Color(158,209,168));
        Ellipse2D.Double pestoSauce = new Ellipse2D.Double(160, 85, 430, 430);
        g2.fill(pestoSauce);
         */
        //mozzarella cheese
        g2.setColor(new Color(255, 246, 191));
        Ellipse2D.Double mozarellaCheese = new Ellipse2D.Double(165, 90, 420, 420);
        g2.fill(mozarellaCheese);

        //cheddar cheese
        /*
        g2.setColor(new Color(229,189,59));
        Ellipse2D.Double cheddarCheese = new Ellipse2D.Double(165, 90, 420, 420);
        g2.fill(cheddarCheese);
         */
 /*
        TOPPINGS
        onion, redPepper, mushroom, greenPepper, olive, pineapple, tomato
        bacon, pepperoni, ham, anchovy
        
        //red peppers
        /*
        g2.setColor(new Color(255,241,50));
        g2.fillPolygon(new int[] {350, 380, 410, }, new int[] {}, 6);

        //green peppers
         */
        //ham
        g2.setColor(new Color(244, 195, 195));
        Ellipse2D.Double ham = new Ellipse2D.Double(275, 140, 70, 70);
        g2.fill(ham);
        Ellipse2D.Double ham1 = new Ellipse2D.Double(390, 125, 70, 70);
        g2.fill(ham1);
        Ellipse2D.Double ham2 = new Ellipse2D.Double(400, 380, 70, 70);
        g2.fill(ham2);
        Ellipse2D.Double ham3 = new Ellipse2D.Double(475, 320, 70, 70);
        g2.fill(ham3);
        Ellipse2D.Double ham4 = new Ellipse2D.Double(470, 200, 70, 70);
        g2.fill(ham4);
        Ellipse2D.Double ham5 = new Ellipse2D.Double(280, 400, 70, 70);
        g2.fill(ham5);
        Ellipse2D.Double ham6 = new Ellipse2D.Double(200, 210, 70, 70);
        g2.fill(ham6);
        Ellipse2D.Double ham7 = new Ellipse2D.Double(200, 320, 70, 70);
        g2.fill(ham7);

        //onion
        GradientPaint gp1 = new GradientPaint(0, 0, new java.awt.Color(130, 16, 56), 10, 10, new java.awt.Color(210, 146, 232), true);
        g2.setPaint(gp1);
        g2.fillArc(260, 170, 100, 100, 0, 90);
        g2.fillArc(340, 170, 100, 100, 0, 90);
        g2.fillArc(260, 370, 100, 100, 0, 90);
        g2.fillArc(340, 370, 100, 100, 0, 90);
        g2.fillArc(190, 230, 100, 100, 0, 90);
        g2.fillArc(410, 230, 100, 100, 0, 90);
        g2.fillArc(190, 310, 100, 100, 0, 90);
        g2.fillArc(410, 310, 100, 100, 0, 90);

        //tomato
        g2.setColor(new Color(214, 17, 17));
        Ellipse2D.Double tomato = new Ellipse2D.Double(305, 110, 60, 60);
        g2.fill(tomato);
        Ellipse2D.Double tomato2 = new Ellipse2D.Double(385, 110, 60, 60);
        g2.fill(tomato2);
        Ellipse2D.Double tomato3 = new Ellipse2D.Double(305, 440, 60, 60);
        g2.fill(tomato3);
        Ellipse2D.Double tomato4 = new Ellipse2D.Double(385, 440, 60, 60);
        g2.fill(tomato4);
        Ellipse2D.Double tomato5 = new Ellipse2D.Double(205, 210, 60, 60);
        g2.fill(tomato5);
        Ellipse2D.Double tomato6 = new Ellipse2D.Double(205, 310, 60, 60);
        g2.fill(tomato6);
        Ellipse2D.Double tomato7 = new Ellipse2D.Double(505, 210, 60, 60);
        g2.fill(tomato7);
        Ellipse2D.Double tomato8 = new Ellipse2D.Double(505, 310, 60, 60);
        g2.fill(tomato8);

        g2.setColor(new Color(232, 84, 84));
        Ellipse2D.Double tomatoa = new Ellipse2D.Double(305, 135, 30, 10);
        g2.fill(tomatoa);
        Ellipse2D.Double tomatob = new Ellipse2D.Double(335, 135, 30, 10);
        g2.fill(tomatob);
        Ellipse2D.Double tomatoc = new Ellipse2D.Double(330, 110, 10, 30);
        g2.fill(tomatoc);
        Ellipse2D.Double tomatod = new Ellipse2D.Double(330, 140, 10, 30);
        g2.fill(tomatod);
        Ellipse2D.Double tomato2a = new Ellipse2D.Double(385, 135, 30, 10);
        g2.fill(tomato2a);
        Ellipse2D.Double tomato2b = new Ellipse2D.Double(405, 135, 30, 10);
        g2.fill(tomato2b);
        Ellipse2D.Double tomato2c = new Ellipse2D.Double(410, 110, 10, 30);
        g2.fill(tomato2c);
        Ellipse2D.Double tomato2d = new Ellipse2D.Double(410, 140, 10, 30);
        g2.fill(tomato2d);
        Ellipse2D.Double tomato3a = new Ellipse2D.Double(305, 465, 30, 10);
        g2.fill(tomato3a);
        Ellipse2D.Double tomato3b = new Ellipse2D.Double(335, 465, 30, 10);
        g2.fill(tomato3b);
        Ellipse2D.Double tomato3c = new Ellipse2D.Double(330, 440, 10, 30);
        g2.fill(tomato3c);
        Ellipse2D.Double tomato3d = new Ellipse2D.Double(330, 470, 10, 30);
        g2.fill(tomato3d);
        Ellipse2D.Double tomato4a = new Ellipse2D.Double(385, 465, 30, 10);
        g2.fill(tomato4a);
        Ellipse2D.Double tomato4b = new Ellipse2D.Double(405, 465, 30, 10);
        g2.fill(tomato4b);
        Ellipse2D.Double tomato4c = new Ellipse2D.Double(410, 440, 10, 30);
        g2.fill(tomato4c);
        Ellipse2D.Double tomato4d = new Ellipse2D.Double(410, 470, 10, 30);
        g2.fill(tomato4d);
        Ellipse2D.Double tomato5a = new Ellipse2D.Double(205, 235, 30, 10);
        g2.fill(tomato5a);
        Ellipse2D.Double tomato5b = new Ellipse2D.Double(235, 235, 30, 10);
        g2.fill(tomato5b);
        Ellipse2D.Double tomato5c = new Ellipse2D.Double(230, 210, 10, 30);
        g2.fill(tomato5c);
        Ellipse2D.Double tomato5d = new Ellipse2D.Double(230, 240, 10, 30);
        g2.fill(tomato5d);
        Ellipse2D.Double tomato6a = new Ellipse2D.Double(205, 335, 30, 10);
        g2.fill(tomato6a);
        Ellipse2D.Double tomato6b = new Ellipse2D.Double(235, 335, 30, 10);
        g2.fill(tomato6b);
        Ellipse2D.Double tomato6c = new Ellipse2D.Double(230, 310, 10, 30);
        g2.fill(tomato6c);
        Ellipse2D.Double tomato6d = new Ellipse2D.Double(230, 340, 10, 30);
        g2.fill(tomato6d);
        Ellipse2D.Double tomato7a = new Ellipse2D.Double(505, 235, 30, 10);
        g2.fill(tomato7a);
        Ellipse2D.Double tomato7b = new Ellipse2D.Double(535, 235, 30, 10);
        g2.fill(tomato7b);
        Ellipse2D.Double tomato7c = new Ellipse2D.Double(530, 210, 10, 30);
        g2.fill(tomato7c);
        Ellipse2D.Double tomato7d = new Ellipse2D.Double(530, 240, 10, 30);
        g2.fill(tomato7d);
        Ellipse2D.Double tomato8a = new Ellipse2D.Double(505, 335, 30, 10);
        g2.fill(tomato8a);
        Ellipse2D.Double tomato8b = new Ellipse2D.Double(535, 335, 30, 10);
        g2.fill(tomato8b);
        Ellipse2D.Double tomato8c = new Ellipse2D.Double(530, 310, 10, 30);
        g2.fill(tomato8c);
        Ellipse2D.Double tomato8d = new Ellipse2D.Double(530, 340, 10, 30);
        g2.fill(tomato8d);
        //bacon
        g2.setColor(new Color(193, 46, 17));
        Rectangle bacon = new Rectangle(300, 140, 60, 30);
        g2.fill(bacon);
        Rectangle bacon2 = new Rectangle(400, 140, 60, 30);
        g2.fill(bacon2);
        Rectangle bacon3 = new Rectangle(300, 440, 60, 30);
        g2.fill(bacon3);
        Rectangle bacon4 = new Rectangle(400, 440, 60, 30);
        g2.fill(bacon4);
        Rectangle bacon5 = new Rectangle(200, 240, 60, 30);
        g2.fill(bacon5);
        Rectangle bacon6 = new Rectangle(200, 340, 60, 30);
        g2.fill(bacon6);
        Rectangle bacon7 = new Rectangle(500, 240, 60, 30);
        g2.fill(bacon7);
        Rectangle bacon8 = new Rectangle(500, 340, 60, 30);
        g2.fill(bacon8);
        g2.setColor(new Color(245, 211, 200));
        Rectangle bacona = new Rectangle(300, 147, 60, 5);
        g2.fill(bacona);
        Rectangle baconb = new Rectangle(300, 157, 60, 5);
        g2.fill(baconb);
        Rectangle bacon2a = new Rectangle(400, 147, 60, 5);
        g2.fill(bacon2a);
        Rectangle bacon2b = new Rectangle(400, 157, 60, 5);
        g2.fill(bacon2b);
        Rectangle bacon3a = new Rectangle(300, 447, 60, 5);
        g2.fill(bacon3a);
        Rectangle bacon3b = new Rectangle(300, 457, 60, 5);
        g2.fill(bacon3b);
        Rectangle bacon4a = new Rectangle(400, 447, 60, 5);
        g2.fill(bacon4a);
        Rectangle bacon4b = new Rectangle(400, 457, 60, 5);
        g2.fill(bacon4b);
        Rectangle bacon5a = new Rectangle(200, 247, 60, 5);
        g2.fill(bacon5a);
        Rectangle bacon5b = new Rectangle(200, 257, 60, 5);
        g2.fill(bacon5b);
        Rectangle bacon6a = new Rectangle(200, 347, 60, 5);
        g2.fill(bacon6a);
        Rectangle bacon6b = new Rectangle(200, 357, 60, 5);
        g2.fill(bacon6b);
        Rectangle bacon7a = new Rectangle(500, 247, 60, 5);
        g2.fill(bacon7a);
        Rectangle bacon7b = new Rectangle(500, 257, 60, 5);
        g2.fill(bacon7b);
        Rectangle bacon8a = new Rectangle(500, 347, 60, 5);
        g2.fill(bacon8a);
        Rectangle bacon8b = new Rectangle(500, 357, 60, 5);
        g2.fill(bacon8b);

        //pepperoni
        g2.setColor(new Color(224, 59, 38));
        Ellipse2D.Double pepperoni = new Ellipse2D.Double(300, 120, 40, 40);
        g2.fill(pepperoni);
        Ellipse2D.Double pepperoni2 = new Ellipse2D.Double(425, 120, 40, 40);
        g2.fill(pepperoni2);
        Ellipse2D.Double pepperoni3 = new Ellipse2D.Double(300, 450, 40, 40);
        g2.fill(pepperoni3);
        Ellipse2D.Double pepperoni4 = new Ellipse2D.Double(400, 450, 40, 40);
        g2.fill(pepperoni4);
        Ellipse2D.Double pepperoni5 = new Ellipse2D.Double(190, 200, 40, 40);
        g2.fill(pepperoni5);
        Ellipse2D.Double pepperoni6 = new Ellipse2D.Double(190, 350, 40, 40);
        g2.fill(pepperoni6);
        Ellipse2D.Double pepperoni7 = new Ellipse2D.Double(525, 250, 40, 40);
        g2.fill(pepperoni7);
        Ellipse2D.Double pepperoni8 = new Ellipse2D.Double(525, 325, 40, 40);
        g2.fill(pepperoni8);
        Ellipse2D.Double pepperoni9 = new Ellipse2D.Double(325, 350, 40, 40);
        g2.fill(pepperoni9);
        Ellipse2D.Double pepperoni10 = new Ellipse2D.Double(380, 350, 40, 40);
        g2.fill(pepperoni10);
        Ellipse2D.Double pepperoni11 = new Ellipse2D.Double(275, 250, 40, 40);
        g2.fill(pepperoni11);
        Ellipse2D.Double pepperoni12 = new Ellipse2D.Double(275, 315, 40, 40);
        g2.fill(pepperoni12);
        Ellipse2D.Double pepperoni13 = new Ellipse2D.Double(425, 250, 40, 40);
        g2.fill(pepperoni13);
        Ellipse2D.Double pepperoni14 = new Ellipse2D.Double(430, 310, 40, 40);
        g2.fill(pepperoni14);
        Ellipse2D.Double pepperoni15 = new Ellipse2D.Double(320, 210, 40, 40);
        g2.fill(pepperoni15);
        Ellipse2D.Double pepperoni16 = new Ellipse2D.Double(390, 200, 40, 40);
        g2.fill(pepperoni16);

        //mushroom
        g2.setColor(new Color(198, 192, 159));
        Ellipse2D.Double mushroom = new Ellipse2D.Double(300, 200, 50, 25);
        g2.fill(mushroom);
        Rectangle mushrooma = new Rectangle(315, 210, 20, 30);
        g2.fill(mushrooma);
        Ellipse2D.Double mushroom2 = new Ellipse2D.Double(396, 200, 50, 25);
        g2.fill(mushroom2);
        Rectangle mushroom2a = new Rectangle(410, 210, 20, 30);
        g2.fill(mushroom2a);
        Ellipse2D.Double mushroom3 = new Ellipse2D.Double(270, 120, 50, 25);
        g2.fill(mushroom3);
        Rectangle mushroom3a = new Rectangle(285, 130, 20, 30);
        g2.fill(mushroom3a);
        Ellipse2D.Double mushroom4 = new Ellipse2D.Double(436, 120, 50, 25);
        g2.fill(mushroom4);
        Rectangle mushroom4a = new Rectangle(450, 130, 20, 30);
        g2.fill(mushroom4a);
        Ellipse2D.Double mushroom5 = new Ellipse2D.Double(310, 350, 50, 25);
        g2.fill(mushroom5);
        Rectangle mushroom5a = new Rectangle(325, 360, 20, 30);
        g2.fill(mushroom5a);
        Ellipse2D.Double mushroom6 = new Ellipse2D.Double(386, 350, 50, 25);
        g2.fill(mushroom6);
        Rectangle mushroom6a = new Rectangle(400, 360, 20, 30);
        g2.fill(mushroom6a);
        Ellipse2D.Double mushroom7 = new Ellipse2D.Double(240, 420, 50, 25);
        g2.fill(mushroom7);
        Rectangle mushroom7a = new Rectangle(255, 430, 20, 30);
        g2.fill(mushroom7a);
        Ellipse2D.Double mushroom8 = new Ellipse2D.Double(456, 420, 50, 25);
        g2.fill(mushroom8);
        Rectangle mushroom8a = new Rectangle(470, 430, 20, 30);
        g2.fill(mushroom8a);
        Ellipse2D.Double mushroom9 = new Ellipse2D.Double(270, 250, 50, 25);
        g2.fill(mushroom9);
        Rectangle mushroom9a = new Rectangle(285, 260, 20, 30);
        g2.fill(mushroom9a);
        Ellipse2D.Double mushroom10 = new Ellipse2D.Double(270, 300, 50, 25);
        g2.fill(mushroom10);
        Rectangle mushroom10a = new Rectangle(285, 310, 20, 30);
        g2.fill(mushroom10a);
        Ellipse2D.Double mushroom11 = new Ellipse2D.Double(420, 250, 50, 25);
        g2.fill(mushroom11);
        Rectangle mushroom11a = new Rectangle(435, 260, 20, 30);
        g2.fill(mushroom11a);
        Ellipse2D.Double mushroom12 = new Ellipse2D.Double(420, 300, 50, 25);
        g2.fill(mushroom12);
        Rectangle mushroom12a = new Rectangle(435, 310, 20, 30);
        g2.fill(mushroom12a);
        Ellipse2D.Double mushroom13 = new Ellipse2D.Double(190, 230, 50, 25);
        g2.fill(mushroom13);
        Rectangle mushroom13a = new Rectangle(205, 240, 20, 30);
        g2.fill(mushroom13a);
        Ellipse2D.Double mushroom14 = new Ellipse2D.Double(190, 320, 50, 25);
        g2.fill(mushroom14);
        Rectangle mushroom14a = new Rectangle(205, 330, 20, 30);
        g2.fill(mushroom14a);
        Ellipse2D.Double mushroom15 = new Ellipse2D.Double(510, 230, 50, 25);
        g2.fill(mushroom15);
        Rectangle mushroom15a = new Rectangle(525, 240, 20, 30);
        g2.fill(mushroom15a);
        Ellipse2D.Double mushroom16 = new Ellipse2D.Double(510, 320, 50, 25);
        g2.fill(mushroom16);
        Rectangle mushroom16a = new Rectangle(525, 330, 20, 30);
        g2.fill(mushroom16a);

        //Green pepper
        g2.setColor(new Color(23, 145, 25));
        g2.fillPolygon(new int[]{280, 300, 340, 360, 335, 305}, new int[]{150, 135, 135, 150, 145, 145}, 6);
        g2.fillPolygon(new int[]{380, 400, 440, 460, 435, 405}, new int[]{150, 135, 135, 150, 145, 145}, 6);

        g2.fillPolygon(new int[]{280, 300, 340, 360, 335, 305}, new int[]{200, 185, 185, 200, 195, 195}, 6);
        g2.fillPolygon(new int[]{380, 400, 440, 460, 435, 405}, new int[]{200, 185, 185, 200, 195, 195}, 6);

        g2.fillPolygon(new int[]{280, 300, 340, 360, 335, 305}, new int[]{470, 455, 455, 470, 465, 465}, 6);
        g2.fillPolygon(new int[]{380, 400, 440, 460, 435, 405}, new int[]{470, 455, 455, 470, 465, 465}, 6);

        g2.fillPolygon(new int[]{280, 300, 340, 360, 335, 305}, new int[]{400, 385, 385, 400, 395, 395}, 6);
        g2.fillPolygon(new int[]{380, 400, 440, 460, 435, 405}, new int[]{400, 385, 385, 400, 395, 395}, 6);

        g2.fillPolygon(new int[]{180, 200, 240, 260, 235, 205}, new int[]{380, 365, 365, 380, 375, 375}, 6);
        g2.fillPolygon(new int[]{230, 250, 290, 310, 285, 255}, new int[]{350, 335, 335, 350, 345, 345}, 6);

        g2.fillPolygon(new int[]{480, 500, 540, 560, 535, 505}, new int[]{380, 365, 365, 380, 375, 375}, 6);
        g2.fillPolygon(new int[]{430, 450, 490, 510, 485, 455}, new int[]{350, 335, 335, 350, 345, 345}, 6);

        g2.fillPolygon(new int[]{180, 200, 240, 260, 235, 205}, new int[]{230, 215, 215, 230, 225, 225}, 6);
        g2.fillPolygon(new int[]{230, 250, 290, 310, 285, 255}, new int[]{270, 255, 255, 270, 265, 265}, 6);

        g2.fillPolygon(new int[]{480, 500, 540, 560, 535, 505}, new int[]{230, 215, 215, 230, 225, 225}, 6);
        g2.fillPolygon(new int[]{430, 450, 490, 510, 485, 455}, new int[]{270, 255, 255, 270, 265, 265}, 6);

        //Red Pepper
        g2.setColor(new Color(214, 17, 17));
        g2.fillPolygon(new int[]{280, 300, 340, 360, 335, 305}, new int[]{170, 155, 155, 170, 165, 165}, 6);
        g2.fillPolygon(new int[]{380, 400, 440, 460, 435, 405}, new int[]{170, 155, 155, 170, 165, 165}, 6);
        g2.fillPolygon(new int[]{280, 300, 340, 360, 335, 305}, new int[]{220, 205, 205, 220, 215, 215}, 6);
        g2.fillPolygon(new int[]{380, 400, 440, 460, 435, 405}, new int[]{220, 205, 205, 220, 215, 215}, 6);
        g2.fillPolygon(new int[]{280, 300, 340, 360, 335, 305}, new int[]{490, 475, 475, 490, 485, 485}, 6);
        g2.fillPolygon(new int[]{380, 400, 440, 460, 435, 405}, new int[]{490, 475, 475, 490, 485, 485}, 6);
        g2.fillPolygon(new int[]{280, 300, 340, 360, 335, 305}, new int[]{420, 405, 405, 420, 415, 415}, 6);
        g2.fillPolygon(new int[]{380, 400, 440, 460, 435, 405}, new int[]{420, 405, 405, 420, 415, 415}, 6);
        g2.fillPolygon(new int[]{180, 200, 240, 260, 235, 205}, new int[]{400, 385, 385, 400, 395, 395}, 6);
        g2.fillPolygon(new int[]{230, 250, 290, 310, 285, 255}, new int[]{370, 355, 355, 370, 365, 365}, 6);
        g2.fillPolygon(new int[]{480, 500, 540, 560, 535, 505}, new int[]{400, 385, 385, 400, 395, 395}, 6);
        g2.fillPolygon(new int[]{430, 450, 490, 510, 485, 455}, new int[]{370, 355, 355, 370, 365, 365}, 6);
        g2.fillPolygon(new int[]{180, 200, 240, 260, 235, 205}, new int[]{250, 235, 235, 250, 245, 245}, 6);
        g2.fillPolygon(new int[]{230, 250, 290, 310, 285, 255}, new int[]{290, 275, 275, 290, 285, 285}, 6);
        g2.fillPolygon(new int[]{480, 500, 540, 560, 535, 505}, new int[]{250, 235, 235, 250, 245, 245}, 6);
        g2.fillPolygon(new int[]{430, 450, 490, 510, 485, 455}, new int[]{290, 275, 275, 290, 285, 285}, 6);

        //olives
        g2.setColor(new Color(0, 0, 0));
        Ellipse2D.Double olive = new Ellipse2D.Double(340, 370, 25, 25);
        g2.fill(olive);
        Ellipse2D.Double olive2 = new Ellipse2D.Double(390, 370, 25, 25);
        g2.fill(olive2);
        Ellipse2D.Double olive3 = new Ellipse2D.Double(340, 220, 25, 25);
        g2.fill(olive3);
        Ellipse2D.Double olive4 = new Ellipse2D.Double(390, 220, 25, 25);
        g2.fill(olive4);
        Ellipse2D.Double olive5 = new Ellipse2D.Double(290, 270, 25, 25);
        g2.fill(olive5);
        Ellipse2D.Double olive6 = new Ellipse2D.Double(290, 320, 25, 25);
        g2.fill(olive6);
        Ellipse2D.Double olive7 = new Ellipse2D.Double(510, 220, 25, 25);
        g2.fill(olive7);
        Ellipse2D.Double olive8 = new Ellipse2D.Double(510, 370, 25, 25);
        g2.fill(olive8);
        Ellipse2D.Double olive9 = new Ellipse2D.Double(440, 270, 25, 25);
        g2.fill(olive9);
        Ellipse2D.Double olive10 = new Ellipse2D.Double(440, 320, 25, 25);
        g2.fill(olive10);
        Ellipse2D.Double olive11 = new Ellipse2D.Double(320, 150, 25, 25);
        g2.fill(olive11);
        Ellipse2D.Double olive12 = new Ellipse2D.Double(410, 150, 25, 25);
        g2.fill(olive12);
        Ellipse2D.Double olive13 = new Ellipse2D.Double(320, 450, 25, 25);
        g2.fill(olive13);
        Ellipse2D.Double olive14 = new Ellipse2D.Double(410, 450, 25, 25);
        g2.fill(olive14);
        Ellipse2D.Double olive15 = new Ellipse2D.Double(220, 220, 25, 25);
        g2.fill(olive15);
        Ellipse2D.Double olive16 = new Ellipse2D.Double(220, 370, 25, 25);
        g2.fill(olive16);

        //pineapple
        g2.setColor(new Color(255, 241, 50));
        g2.fillPolygon(new int[]{400, 415, 385}, new int[]{210, 240, 240}, 3);
        g2.fillPolygon(new int[]{350, 365, 335}, new int[]{220, 250, 250}, 3);
        g2.fillPolygon(new int[]{310, 325, 295}, new int[]{260, 290, 290}, 3);
        g2.fillPolygon(new int[]{310, 325, 295}, new int[]{310, 340, 340}, 3);
        g2.fillPolygon(new int[]{350, 365, 335}, new int[]{340, 370, 370}, 3);
        g2.fillPolygon(new int[]{400, 415, 385}, new int[]{340, 370, 370}, 3);
        g2.fillPolygon(new int[]{440, 455, 425}, new int[]{310, 340, 340}, 3);
        g2.fillPolygon(new int[]{440, 455, 425}, new int[]{260, 290, 290}, 3);
        g2.fillPolygon(new int[]{450, 465, 435}, new int[]{130, 160, 160}, 3);
        g2.fillPolygon(new int[]{230, 245, 215}, new int[]{220, 250, 250}, 3);
        g2.fillPolygon(new int[]{310, 325, 295}, new int[]{140, 170, 170}, 3);
        g2.fillPolygon(new int[]{310, 325, 295}, new int[]{410, 440, 440}, 3);
        g2.fillPolygon(new int[]{230, 245, 215}, new int[]{340, 370, 370}, 3);
        g2.fillPolygon(new int[]{520, 535, 505}, new int[]{340, 370, 370}, 3);
        g2.fillPolygon(new int[]{440, 455, 425}, new int[]{410, 440, 440}, 3);
        g2.fillPolygon(new int[]{540, 555, 525}, new int[]{220, 250, 250}, 3);

        //anchovy
        g2.setColor(new Color(114, 165, 175));
        Ellipse2D.Double anchovy = new Ellipse2D.Double(250, 145, 40, 20);
        g2.fill(anchovy);
        g2.fillPolygon(new int[]{260, 240, 240}, new int[]{155, 145, 165}, 3);
        Ellipse2D.Double anchovy2 = new Ellipse2D.Double(310, 185, 40, 20);
        g2.fill(anchovy2);
        g2.fillPolygon(new int[]{320, 300, 300}, new int[]{195, 185, 205}, 3);
        Ellipse2D.Double anchovy3 = new Ellipse2D.Double(450, 145, 40, 20);
        g2.fill(anchovy3);
        g2.fillPolygon(new int[]{460, 440, 440}, new int[]{155, 145, 165}, 3);
        Ellipse2D.Double anchovy4 = new Ellipse2D.Double(390, 185, 40, 20);
        g2.fill(anchovy4);
        g2.fillPolygon(new int[]{400, 380, 380}, new int[]{195, 185, 205}, 3);
        Ellipse2D.Double anchovy5 = new Ellipse2D.Double(250, 435, 40, 20);
        g2.fill(anchovy5);
        g2.fillPolygon(new int[]{260, 240, 240}, new int[]{445, 435, 455}, 3);
        Ellipse2D.Double anchovy6 = new Ellipse2D.Double(310, 385, 40, 20);
        g2.fill(anchovy6);
        g2.fillPolygon(new int[]{320, 300, 300}, new int[]{395, 385, 405}, 3);
        Ellipse2D.Double anchovy7 = new Ellipse2D.Double(450, 425, 40, 20);
        g2.fill(anchovy7);
        g2.fillPolygon(new int[]{460, 440, 440}, new int[]{435, 425, 445}, 3);
        Ellipse2D.Double anchovy8 = new Ellipse2D.Double(410, 385, 40, 20);
        g2.fill(anchovy8);
        g2.fillPolygon(new int[]{420, 400, 400}, new int[]{395, 385, 405}, 3);
        Ellipse2D.Double anchovy9 = new Ellipse2D.Double(200, 265, 40, 20);
        g2.fill(anchovy9);
        g2.fillPolygon(new int[]{210, 190, 190}, new int[]{275, 265, 285}, 3);
        Ellipse2D.Double anchovy10 = new Ellipse2D.Double(290, 255, 40, 20);
        g2.fill(anchovy10);
        g2.fillPolygon(new int[]{300, 280, 280}, new int[]{265, 255, 275}, 3);
        Ellipse2D.Double anchovy11 = new Ellipse2D.Double(530, 265, 40, 20);
        g2.fill(anchovy11);
        g2.fillPolygon(new int[]{540, 520, 520}, new int[]{275, 265, 285}, 3);
        Ellipse2D.Double anchovy12 = new Ellipse2D.Double(440, 255, 40, 20);
        g2.fill(anchovy12);
        g2.fillPolygon(new int[]{450, 430, 430}, new int[]{265, 255, 275}, 3);
        Ellipse2D.Double anchovy13 = new Ellipse2D.Double(200, 315, 40, 20);
        g2.fill(anchovy13);
        g2.fillPolygon(new int[]{210, 190, 190}, new int[]{325, 315, 335}, 3);
        Ellipse2D.Double anchovy14 = new Ellipse2D.Double(290, 305, 40, 20);
        g2.fill(anchovy14);
        g2.fillPolygon(new int[]{300, 280, 280}, new int[]{315, 305, 325}, 3);
        Ellipse2D.Double anchovy15 = new Ellipse2D.Double(530, 365, 40, 20);
        g2.fill(anchovy15);
        g2.fillPolygon(new int[]{540, 520, 520}, new int[]{375, 365, 385}, 3);
        Ellipse2D.Double anchovy16 = new Ellipse2D.Double(420, 305, 40, 20);
        g2.fill(anchovy16);
        g2.fillPolygon(new int[]{430, 410, 410}, new int[]{315, 305, 325}, 3);

        g2.setColor(Color.BLACK);
        Line2D.Double line1 = new Line2D.Double(375, 75, 375, 525); //(x, y coords of first point, x, y coords of second point)
        g2.draw(line1);

        g2.setColor(Color.BLACK);
        Line2D.Double line2 = new Line2D.Double(150, 300, 600, 300); //(x, y coords of first point, x, y coords of second point)
        g2.draw(line2);

        g2.setColor(Color.BLACK);
        Line2D.Double line3 = new Line2D.Double(207, 150, 540, 450); //(x, y coords of first point, x, y coords of second point)
        g2.draw(line3);

        g2.setColor(Color.BLACK);
        Line2D.Double line4 = new Line2D.Double(540, 150, 207, 450); //(x, y coords of first point, x, y coords of second point)
        g2.draw(line4);

    }

}
