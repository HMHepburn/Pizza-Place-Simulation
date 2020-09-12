package culminatingpizzaplace;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * RecipePizza
 * 
 * Date: 17/01/2020 
 * School: Northview Heights Secondary School
 *
 * This class is an extension of Pizza so that it can be cast to Pizza object
 * RecipePizza allows user to select predetermined recipes
 *
 * @author Nathan Tang and Hannah Hepburn
 * @version 1.0
 */
public class RecipePizza extends Pizza {
    
    //Encapsulated data
    protected String recipe; //Name of recipe stored here
    private DecimalFormat df = new DecimalFormat("#0.00");
    
    /**
     * Constructor that instantiates the recipePizza as one of the 9 options
     * 
     * @param recipe
     */
    public RecipePizza(String recipe) {
        switch (recipe) {
            case "Zombie Pizza":
                zombiePizza();
                break;
            case "Poe Pizza":
                poePizza();
                break;
            case "Marilyn Monroe Pizza":
                marilynMonroePizza();
                break;
            case "Green Dream Pizza":
                greenDreamPizza();
                break;
            case "Fruity Pig Pizza":
                fruityPigPizza();
                break;
            case "Salty Sailor Pizza":
                saltySailorPizza();
                break;
            case "Meat Lovers Pizza":
                meatLoversPizza();
                break;
            case "Supreme Pizza":
                supremePizza();
                break;
            case "Hawaiian Pizza":
                hawaiianPizza();
                break;
        }
    }
    
    /**
     * Provides user with a list of the recipes and an option to select a recipe
     * or see recipe description
     * 
     * @return userInput
     */
    public static String selectPizza() {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLEASE SELECT A PIZZA FROM THE FOLLOWING RECIPES:");
        System.out.println("(1) Zombie Pizza");
        System.out.println("(2) Poe Pizza");
        System.out.println("(3) Marilyn Monroe Pizza");
        System.out.println("(4) Green Dream Pizza");
        System.out.println("(5) Fruity Pig Pizza");
        System.out.println("(6) Salty Sailor Pizza");
        System.out.println("(7) Hawiian Pizza");
        System.out.println("(8) Supreme Pizza");
        System.out.println("(9) Meat Lovers Pizza");
        System.out.println();
        System.out.println("Please enter a number to select your pizza");
        System.out.println("OR");
        System.out.println("Enter a number and \'?\' (#?) to see a description of that recipe!");
        String userInput = scan.next();
        return userInput;
    }
    
    /**
     * Outputs the description of the pizza for user
     */
    public void pizzaDescription() {
        System.out.println("Dough: " + this.dough);
        System.out.println("Sauce: " + this.sauce);
        System.out.println("Cheese: " + this.cheese);
        System.out.print("Toppings: ");
        if (this.onion) {
            System.out.print("ONION ");
        }
        if (this.redPepper) {
            System.out.print("RED-PEPPER ");
        }
        if (this.mushroom) {
            System.out.print("MUSHROOM ");
        }
        if (this.greenPepper) {
            System.out.print("GREEN-PEPPER ");
        }
        if (this.olive) {
            System.out.print("OLIVE ");
        }
        if (this.pineapple) {
            System.out.print("PINEAPPLE ");
        }
        if (this.tomato) {
            System.out.print("TOMATO ");
        }
        if (this.bacon) {
            System.out.print("BACON ");
        }
        if (this.pepperoni) {
            System.out.print("PEPPERONI ");
        }
        if (this.ham) {
            System.out.print("HAM ");
        }
        if (this.anchovy) {
            System.out.print("ANCHOVY ");
        }
        System.out.println();
        System.out.println("Price: $" + df.format(price));
    }
    
    /**
     * Selection of zombie pizza, instantiates the RecipePizza object as a
     * zombie pizza
     */
    public void zombiePizza() {
        this.dough = "WHOLE GRAIN";
        this.sauce = "PESTO";
        this.cheese = "CHEDDAR";
        this.pepperoni = true;
        this.bacon = true;
        this.ham = true;
        this.price = 14.00;
    }
    
    /**
     * Selection of poe pizza, instantiates the RecipePizza object as a
     * poe pizza
     */
    public void poePizza() {
        this.dough = "REGULAR";
        this.sauce = "CREAM";
        this.cheese = "MOZZARELLA";
        this.mushroom = true;
        this.olive = true;
        this.price = 13.00;
    }
    
    /**
     * Selection of Marilyn Monroe pizza, instantiates the RecipePizza object as
     * a Marilyn Monroe pizza
     */
    public void marilynMonroePizza() {
        this.dough = "REGULAR";
        this.sauce = "CREAM";
        this.cheese = "MOZZARELLA";
        this.mushroom = true;
        this.olive = true;
        this.greenPepper = true;
        this.pineapple = true;
        this.price = 15.00;
    }

    /**
     * Selection of green dream pizza, instantiates the RecipePizza object as a
     * green dream pizza
     */
    public void greenDreamPizza() {
        this.dough = "WHOLE GRAIN";
        this.sauce = "PESTO";
        this.cheese = "MOZZARELLA";
        this.greenPepper = true;
        this.price = 12.00;
    }
    
    /**
     * Selection of fruity pig pizza, instantiates the RecipePizza object as a
     * fruity pig pizza
     */
    public void fruityPigPizza() {
        this.dough = "WHOLE GRAIN";
        this.sauce = "TOMATO";
        this.cheese = "CHEDDAR";
        this.bacon = true;
        this.ham = true;
        this.olive = true;
        this.greenPepper = true;
        this.pineapple = true;
        this.tomato = true;
        this.price = 17.00;
    }
    
    /**
     * Selection of salty sailor pizza, instantiates the RecipePizza object as a
     * salty sailor pizza
     */
    public void saltySailorPizza() {
        this.dough = "REGULAR";
        this.sauce = "CREAM";
        this.cheese = "CHEDDAR";
        this.olive = true;
        this.anchovy = true;
        this.price = 13.00;
    }
    
    /**
     * Selection of Hawaiian pizza, instantiates the RecipePizza object as a
     * Hawaiian pizza
     */
    public void hawaiianPizza() {
        this.dough = "REGULAR";
        this.sauce = "TOMATO";
        this.cheese = "MOZZARELLA";
        this.pineapple = true;
        this.ham = true;
        this.price = 13.00;
    }
    
    /**
     * Selection of supreme pizza, instantiates the RecipePizza object as a
     * supreme pizza
     */
    public void supremePizza() {
        this.dough = "REGULAR";
        this.sauce = "TOMATO";
        this.cheese = "MOZZARELLA";
        this.pepperoni = true;
        this.mushroom = true;
        this.olive = true;
        this.onion = true;
        this.greenPepper = true;
        this.price = 16.00;
    }
    
    /**
     * Selection of meat lovers pizza, instantiates the RecipePizza object as a
     * meat lovers pizza
     */
    public void meatLoversPizza() {
        this.dough = "REGULAR";
        this.sauce = "TOMATO";
        this.cheese = "MOZZARELLA";
        this.pepperoni = true;
        this.ham = true;
        this.bacon = true;
        this.price = 14.00;
    }
    
    /**
     * Getter that returns price
     * @return price
     */
    public double getPrice() {
        return this.price;
    }
}