
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author farrb0382
 */
public class Cookie extends DessertItem {

    // variables for the cookie class
    private int number;
    private int pricePer12;

    // the variables used to caclulate the price per 12 and output the information for the cookie class 
    public Cookie(String name, int number, int pricePer12) {
        // getting the price per 12 and the number of cookies for the dessert item class
        super(name);
        this.pricePer12 = pricePer12;
        this.number = number;
    }

    // method for outputting the string onto the reciept 
    public String toString() {
        // string spaces that will be used in the return line to format the price correctly 
        String spaces = new String();
        // subtracting the length of the words from 30 to figure out how many spaces must be used to format the price
        int space = 30 - (super.getName().length() + DessertShoppe.cents2dollarsAndCents(this.getCost()).length());
        // for loop that outputs the number of spaces needed to format the price 
        for (int i = 0; i < space; i++) {
            spaces = spaces + " ";
        }
        // returning the information about the sundae as well as the formatted price 
        return (this.number + " @ " + DessertShoppe.cents2dollarsAndCents(this.pricePer12) + " /dz\n" + super.getName() + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }
    
    // method for getting the cost of the cookie
    @Override
    public int getCost() {
        double cost = (this.number * this.pricePer12)/12;
        return (int) cost;
    }
}
