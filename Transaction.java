package culminatingpizzaplace;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Transaction
 * 
 * Date: 17/01/2020 
 * School: Northview Heights Secondary School
 *
 * The following class carries the details and properties of a Transaction after
 * every purchase. This includes the date it was purchased and the price. It
 * also makes it useful to budget and determine profit IN REAL WORLD BUSINESSES.
 * Which is why we decided to implement it
 *
 * @author Nathan Tang and Hannah Hepburn
 * @version 1.0
 */
public class Transaction implements Serializable {
    /* 
     implementing serializable allows objects in this class to be converted into a byte stream and 
     loaded onto a file (.dat file) that is saved everytime the program is finished running and loaded
     everytime the program begins to run. 
    
     Example of/Related to: FILE INPUT/OUTPUT
     */
    
    //Encapsulated data - Private
    private long epochDatePurchased;
    private double price;
    private Date estDate;
    private DateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
    private DecimalFormat dfo = new DecimalFormat("0.00");
    //ENCAPSULATION is used to make fields that are exclusive to this class and can only be accessed
    //by other classes in the package using getters and setters as seen below.

    public Transaction(double pizzaPrice) {
        this.date();
        this.setPrice(pizzaPrice);
    }
    
    /**
     * Getter that returns the epoch date of when a pizza was purchased, used
     * for sorting transactions by date
     * 
     * @return epochDatePurchased
     */
    public long getEpochDate() {
        return this.epochDatePurchased;
    }
    
    /**
     * Getter that returns a formatted date 
     * 
     * @return df.format(this.estDate)
     */
    public String getDate() {
        return df.format(this.estDate);
    }
    
    /**
     * Getter that returns price, to be used in transaction
     * 
     * @return price
     */
    public double getPrice() {
        return this.price;
    }
    
    /**
     * Setter that instantiates the price of Transaction object
     * 
     * @param pizzaPrice 
     */
    public void setPrice(double pizzaPrice) {
        this.price = pizzaPrice;
    }

    /**
     * gets the date and converts it to epoch value to allow
     */
    public void date() {
        this.epochDatePurchased = System.currentTimeMillis() / 1000;
        this.estDate = java.util.Calendar.getInstance().getTime();
    }

    @Override
    public String toString() {
        return ("\nTRANSACTION\n" + "\nPrice: " + dfo.format(this.getPrice()) + "\nDate: " + this.getDate());
    }
}