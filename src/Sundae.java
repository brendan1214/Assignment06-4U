
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author farrb0382
 */
public class Sundae extends IceCream {

    // variables for the sundae's topping name and topping cost 
    String toppingName;
    int toppingCost;

    // the variables used to caclulate the price and output the information for the sundae class 
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        // getting the ice cream names and costs from the ice cream class 
        super(icName, icCost);
        this.toppingCost = toppingCost;
        this.toppingName = toppingName; 
    }

    // method for outputting the string onto the reciept 
    public String toString() {
        
        // string spaces that will be used in the return line to format the price correctly 
        String spaces = new String();
        // subtracting the length of the words from 30 to figure out how many spaces must be used to format the price
        int space = 30 - (this.icName.length() + DessertShoppe.cents2dollarsAndCents(this.getCost()).length());
        // for loop that outputs the number of spaces needed to format the price 
        for (int i = 0; i < space; i++) {
            spaces = spaces + " ";
        }
        // returning the information about the sundae as well as the formatted price 
        return (this.toppingName + " Sundae" + " With\n" + this.icName + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }

    // method for getting the cost of the sundae
    @Override
    public int getCost() {
        // return the cost of the ice cream as well as the super cost 
        return (int) super.getCost() + toppingCost;
    }
}
