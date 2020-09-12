package culminatingpizzaplace;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * CreateYourOwnPizza
 * 
 * Date: 17/01/2020 
 * School: Northview Heights Secondary School
 *
 * This class is an extension of Pizza object to ensure that CreateYourOwnPizza
 * can be cast to Pizza object
 * CreateYourOwnPizza allows user to create an original pizza
 *
 * @author Nathan Tang and Hannah Hepburn
 * @version 1.0
 */
public class CreateYourOwnPizza extends Pizza {
    private DecimalFormat df = new DecimalFormat("#0.00");
    
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
     * Lists the options for dough, sauce, and cheese and their number values
     */
    public static void listDoughSauceCheese() {
        System.out.println("DOUGH CHOICES");
        System.out.println("(1)Regular Dough");
        System.out.println("(2)Whole Grain Dough");
        System.out.println();
        System.out.println("SAUCE CHOICES");
        System.out.println("(1)Tomato Sauce");
        System.out.println("(2)Cream Sauce");
        System.out.println("(3)Pesto Sauce");
        System.out.println("(4)None");
        System.out.println();
        System.out.println("CHEESE");
        System.out.println("(1)Mozzarella");
        System.out.println("(2)Cheddar");
        System.out.println("(3)None");
        System.out.println();
    }
    
    /**
     * Lists the topping options and their number values
     */
    public static void listToppings() {
        System.out.println("VEGGIES:");
        System.out.println("(1)Onion");
        System.out.println("(2)Red Pepper");
        System.out.println("(3)Mushroom");
        System.out.println("(4)Green Pepper");
        System.out.println("(5)Olive");
        System.out.println("(6)Pineapple");
        System.out.println("(7)Tomato");
        System.out.println();
        System.out.println("MEATS");
        System.out.println("(8)Bacon");
        System.out.println("(9)Pepperoni");
        System.out.println("(10)Ham");
        System.out.println("(11)Anchovy");
        System.out.println();
    }
    
    /**
     * User selects dough
     * Setter that confirms dough selection
     */
    public void selectDough() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which dough would you like? Regular (1) or Whole Grain (2)?");
        boolean doughCollected = false;
        while(doughCollected == false){
        int doughNum = scan.nextInt();
        if (doughNum == 1) {
            this.dough = "REGULAR";
            doughCollected = true;
        } else if (doughNum == 2) {
            this.dough = "WHOLE GRAIN";
            doughCollected = true;
        } else {
            System.out.println("Sorry that isn't a valid input!");
        }
        }
        this.price += 5.0;
    }
    
    /**
     * User selects sauce
     * Setter that confirms sauce selection
     */
    public void selectSauce() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which sauce would you like? Tomato (1), cream (2), pesto (3), or no sauce (4)?");
        boolean sauceCollected = false;
        while(sauceCollected == false){
        int sauceNum = scan.nextInt();
        if (sauceNum == 1) {
            this.sauce = "TOMATO";
            sauceCollected = true;
        } else if (sauceNum == 2) {
            this.sauce = "CREAM";
            sauceCollected = true;
        } else if (sauceNum == 3) {
            this.sauce = "PESTO";
            sauceCollected = true;
        } else if (sauceNum == 4) {
            this.sauce = "NONE";
        } else {
            System.out.println("Sorry that isn't a valid input!");
        }
        }
        this.price += 2.5;
    }
    
    /**
     * User selects cheese
     * Setter that confirms cheese selection
     */
    public void selectCheese() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which cheese would you like? Mozarella (1), cheddar (2), or no cheese (3)?");
        boolean cheeseCollected = false;
        while(cheeseCollected == false){
        int cheeseNum = scan.nextInt();
        if (cheeseNum == 1) {
            this.cheese = "MOZARELLA";
            cheeseCollected = true;
        } else if (cheeseNum == 2) {
            this.cheese = "CHEDDAR";
            cheeseCollected = true;
        } else if (cheeseNum == 3) {
            this.cheese = "NONE";
            cheeseCollected = true;
        } else {
            System.out.println("Sorry that isn't a valid input!");
        }
        }
        this.price += 2.5;
    }
    
    /**
     * User selects toppings, causing the price to increase by $1 each time a
     * topping is added, users cannot choose multiple of the same topping
     * Topping setter, adds toppings
     */
    public void selectToppings() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number or name of the topping you would like! Enter (!) to confirm selection. Enter (?) to remove toppings.");
        String userScan = "Hello";
        while (userScan.charAt(0) != '!') {
            userScan = scan.nextLine();
            if ((userScan.equals("1") || userScan.equalsIgnoreCase("onion")) && this.onion == false) {
                this.price += 1.00;
                this.onion = true;
            } else if ((userScan.equals("2") || userScan.equalsIgnoreCase("red pepper")) && this.redPepper == false) {
                this.price += 1.00;
                this.redPepper = true;
            } else if ((userScan.equals("3") || userScan.equalsIgnoreCase("mushroom")) && this.mushroom == false) {
                this.price += 1.00;
                this.mushroom = true;
            } else if ((userScan.equals("4") || userScan.equalsIgnoreCase("green pepper")) && this.greenPepper == false) {
                this.price += 1.00;
                this.greenPepper = true;
            } else if ((userScan.equals("5") || userScan.equalsIgnoreCase("olive")) && this.olive == false) {
                this.price += 1.00;
                this.olive = true;
            } else if ((userScan.equals("6") || userScan.equalsIgnoreCase("pineapple")) && this.pineapple == false) {
                this.price += 1.00;
                this.pineapple = true;
            } else if ((userScan.equals("7") || userScan.equalsIgnoreCase("tomato")) && this.tomato == false) {
                this.price += 1.00;
                this.tomato = true;
            } else if ((userScan.equals("8") || userScan.equalsIgnoreCase("bacon")) && this.bacon == false) {
                this.price += 1.00;
                this.bacon = true;
            } else if ((userScan.equals("9") || userScan.equalsIgnoreCase("pepperoni")) && this.pepperoni == false) {
                this.price += 1.00;
                this.pepperoni = true;
            } else if ((userScan.equals("10") || userScan.equalsIgnoreCase("ham")) && this.ham == false) {
                this.price += 1.00;
                this.ham = true;
            } else if ((userScan.equals("11") || userScan.equalsIgnoreCase("anchovy")) && this.anchovy == false) {
                this.price += 1.00;
                this.anchovy = true;
            } else if (userScan.charAt(0) == '?') {
                this.removeToppings();
            } else if (userScan.charAt(0) == '!') {
                System.out.println("Thank you!");
            } else {
                System.out.println("Sorry, that isn't a valid input!");
            }
        }
    }

    /**
     * Allows user to remove toppings
     * User cannot remove multiple of the same toppings (to prevent inaccurate
     * pricing) For every topping removed $1 is deducted from the price
     * Topping setter, removes toppings
     */
    public void removeToppings() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number or name of the topping you would like to remove! Enter (!) to confirm selection. Enter (?) to add toppings.");
        String userScan = "Hello";
        while (userScan.charAt(0) != '!') {
            userScan = scan.nextLine();
            if ((userScan.equals("1") || userScan.equalsIgnoreCase("onion")) && this.onion == true) {
                this.price -= 1.00;
                this.onion = false;
            } else if ((userScan.equals("2") || userScan.equalsIgnoreCase("red pepper")) && this.redPepper == true) {
                this.price -= 1.00;
                this.redPepper = false;
            } else if ((userScan.equals("3") || userScan.equalsIgnoreCase("mushroom")) && this.mushroom == true) {
                this.price -= 1.00;
                this.mushroom = false;
            } else if ((userScan.equals("4") || userScan.equalsIgnoreCase("green pepper")) && this.greenPepper == true) {
                this.price -= 1.00;
                this.greenPepper = false;
            } else if ((userScan.equals("5") || userScan.equalsIgnoreCase("olive")) && this.olive == true) {
                this.price -= 1.00;
                this.olive = false;
            } else if ((userScan.equals("6") || userScan.equalsIgnoreCase("pineapple")) && this.pineapple == true) {
                this.price -= 1.00;
                this.pineapple = false;
            } else if ((userScan.equals("7") || userScan.equalsIgnoreCase("tomato")) && this.tomato == true) {
                this.price -= 1.00;
                this.tomato = false;
            } else if ((userScan.equals("8") || userScan.equalsIgnoreCase("bacon")) && this.bacon == true) {
                this.price -= 1.00;
                this.bacon = false;
            } else if ((userScan.equals("9") || userScan.equalsIgnoreCase("pepperoni")) && this.pepperoni == true) {
                this.price -= 1.00;
                this.pepperoni = false;
            } else if ((userScan.equals("10") || userScan.equalsIgnoreCase("ham")) && this.ham == true) {
                this.price -= 1.00;
                this.ham = false;
            } else if ((userScan.equals("11") || userScan.equalsIgnoreCase("anchovy")) && this.anchovy == true) {
                this.price -= 1.00;
                this.anchovy = false;
            } else if (userScan.charAt(0) == '?') {
                this.selectToppings();
            } else if (userScan.charAt(0) == '!') {
                System.out.println("Thank you!");
            } else {
                System.out.println("Sorry, that isn't a valid input!");
            }
        }
    }
    
    /**
     * Getter that returns price
     * @return price
     */
    public double getPrice() {
        return this.price;
    }
}