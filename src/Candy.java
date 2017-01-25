
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author farrb0382
 */
public class Candy extends DessertItem {

    // variables for the candy's weight and price per lbs 
    private double weight;
    private int pricePerLbs;

    // the variables used to caclulate the price and output the information for the candy class 
    public Candy(String name, double weight, int pricePerLbs) {
        // getting the weight of candy and the price per lbs 
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    // method for outputting the string onto the reciept 
    public String toString() {
        // string spaces that will be used in the return line to format the price correctly 
        String spaces = new String();
        // subtracting the length of the words from 30 to figure out how many spaces must be used to format the price
        int space = 30 - (this.getName().length() + DessertShoppe.cents2dollarsAndCents(this.getCost()).length());
        // for loop that outputs the number of spaces needed to format the price 
        for (int i = 0; i < space; i++) {
            spaces = spaces + " ";
        }
        // returning the information about the candy as well as the formatted price 
        return (this.weight + " lbs." + " @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb.\n" + this.getName() +  spaces + DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }

    // method for getting the cost of the candy
    @Override
    public int getCost() {
        return (int) Math.round(weight * pricePerLbs);
    }
}
