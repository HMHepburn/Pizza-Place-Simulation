package culminatingpizzaplace;

/**
 * Pizza
 * 
 * Date: 17/01/2020 
 * School: Northview Heights Secondary School
 *
 * This class is abstract and is used to cast RecipePizza and CreateYourOwnPizza
 * into a single object.
 *
 * @author Nathan Tang and Hannah Hepburn
 * @version 1.0
 */
public abstract class Pizza {
    //Encapsulated data - Protected
    //VEGGIES
    protected boolean onion = false;
    protected boolean redPepper = false;
    protected boolean mushroom = false;
    protected boolean greenPepper = false;
    protected boolean olive = false;
    protected boolean pineapple = false;
    protected boolean tomato = false;

    //MEATS
    protected boolean bacon = false;
    protected boolean pepperoni = false;
    protected boolean ham = false;
    protected boolean anchovy = false;

    protected String cheese; //Mozzarella, cheddar, or none
    protected String sauce; //Pesto, cream sauce, tomato, or none
    protected String dough; //Whole grain, or regular

    protected double price; //Price of the pizza
    
    /*
    Abstract inheritance to RecipePizza and CreateYourOwnPizza
    */
    public abstract void pizzaDescription();
}