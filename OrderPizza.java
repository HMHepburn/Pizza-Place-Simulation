package culminatingpizzaplace;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
import javax.swing.JFrame; //Swing has graphics tools, and JFrame is the external window frame
import java.util.concurrent.TimeUnit;

public class OrderPizza {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean customerFinished = false;
        DecimalFormat df = new DecimalFormat("#0.00");

        //Array of recipe objects (list of recipes to choose from and describe)
        RecipePizza recipeList[] = new RecipePizza[9];
        recipeList[0] = new RecipePizza("Zombie Pizza");
        recipeList[1] = new RecipePizza("Poe Pizza");
        recipeList[2] = new RecipePizza("Marilyn Monroe Pizza");
        recipeList[3] = new RecipePizza("Green Dream Pizza");
        recipeList[4] = new RecipePizza("Fruity Pig Pizza");
        recipeList[5] = new RecipePizza("Salty Sailor Pizza");
        recipeList[6] = new RecipePizza("Hawaiian Pizza");
        recipeList[7] = new RecipePizza("Supreme Pizza");
        recipeList[8] = new RecipePizza("Meat Lovers Pizza");

        ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
        ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
        Pizza pizzaOfUser = recipeList[0];

        System.out.println("Welcome to Hannah and Nathan's Pizza Place!");
        while (customerFinished == false) {
            Transaction purchaseInfo = new Transaction(0.0);
            boolean pizzaPurchased = false;
            Pizza userPizza;

            while (pizzaPurchased == false) {
                System.out.println("Would you like to order a recipe pizza (R) or make your own pizza (M)?");
                System.out.print("Please enter R or M: ");
                char pizzaType;
                pizzaType = scan.next().charAt(0);

                if (pizzaType == 'R' || pizzaType == 'r') {
                    System.out.println();
                    System.out.println("RECIPE PIZZA");

                    int pizzaChosen = 0;
                    while (pizzaChosen == 0) {
                        String userInput = RecipePizza.selectPizza();

                        try {
                            int userDecision = Integer.parseInt(userInput);
                            userDecision--; //Convert into index number of recipe array of objects
                            userPizza = recipeList[userDecision];

                            pizzaOfUser = userPizza;

                            pizzaChosen = 1;
                            Transaction userTransaction = new Transaction((((RecipePizza) userPizza).getPrice()));
                            purchaseInfo = userTransaction;
                            pizzaPurchased = true;

                        } catch (Exception e) {
                            if (userInput.charAt(1) == '?') {
                                userInput = userInput.substring(0, 1);
                                int userDecision = Integer.parseInt(userInput);
                                userDecision--;
                                userPizza = (RecipePizza) recipeList[userDecision];
                                userPizza.pizzaDescription();
                            }
                            else{
                                System.out.append("Please enter a number!");
                            }
                        }
                    }

                } else if (pizzaType == 'M' || pizzaType == 'm') {
                    System.out.println();
                    System.out.println("MAKE YOUR OWN PIZZA");
                    pizzaPurchased = true;
                    CreateYourOwnPizza.listDoughSauceCheese();
                    CreateYourOwnPizza.listToppings();
                    userPizza = new CreateYourOwnPizza();
                    ((CreateYourOwnPizza) userPizza).selectDough();
                    ((CreateYourOwnPizza) userPizza).selectSauce();
                    ((CreateYourOwnPizza) userPizza).selectCheese();
                    ((CreateYourOwnPizza) userPizza).selectToppings();
                    ((CreateYourOwnPizza) userPizza).pizzaDescription();

                    pizzaOfUser = userPizza;

                    Transaction userTransaction = new Transaction((((CreateYourOwnPizza) userPizza).getPrice()));
                    purchaseInfo = userTransaction;
                    pizzaPurchased = true;

                } else {
                    System.out.println("That is not a valid input!");
                }
            }

            pizzaList.add(pizzaOfUser);

            transactionList.add(purchaseInfo);

            System.out.println("Would you like to purchase another pizza? (Y/N)");
            System.out.print("Please enter Y or N: ");

            char anotherPizza = scan.next().charAt(0);
            boolean yesNo = false;
            while (yesNo == false) {
                if (anotherPizza == 'N' || anotherPizza == 'n') {
                    customerFinished = true;
                    yesNo = true;
                } else if (anotherPizza == 'Y' || anotherPizza == 'y') {
                    customerFinished = false;
                    yesNo = true;
                } else {
                    System.out.println("That is not a valid input!");
                }
            }
        }
        double hst = 0;
        double subtotal = 0;
        double total = 0;
        System.out.println();
        System.out.println("--------RECEIPT--------");
        for (int i = 0; i < transactionList.size(); i++) {
            double price = (transactionList.get(0)).getPrice();
            subtotal += price;
            System.out.println("Pizza " + (i + 1) + ": $" + df.format(price));
        }
        hst = subtotal * 0.14;
        total = subtotal + hst;
        System.out.println("-----------------------");
        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("HST: $" + df.format(hst));
        System.out.println();
        System.out.println("TOTAL: $" + df.format(total));

        System.out.println("YOUR PIZZA WILL BE READY IN:");
        try {
            System.out.println("10");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("9");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("8");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("7");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("6");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("5");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("4");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("3");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("2");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("1");
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }

        for (int i = 0; i < pizzaList.size(); i++) {
            JFrame window = new JFrame();
            window.setSize(750, 750); //640x480 pixels
            window.getContentPane().setBackground(new java.awt.Color(227, 133, 66));
            window.setTitle("Pizza is served!"); //title on the top of the window
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when user presses 'x' button the window will close
            window.setVisible(true); //makes the window visible

            DrawPizza DP = new DrawPizza(pizzaList.get(i));//will summarize the drawn rectangle and other objects together
            window.add(DP);
        }
    }
}
