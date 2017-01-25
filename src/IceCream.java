
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author farrb0382
 */
public class IceCream extends DessertItem {
    
    // variables for the ice cream class
    public String icName;
    public int icCost;
        
    // the variables used to caclulate the cost and name and to output the information for the ice cream class 
    public IceCream(String name, int cost) {
        // getting the ice cream cost and name from the dessert item class 
        super(name);
        this.icCost = cost;
        this.icName = name;
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
        return (this.icName + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }
    
    // method for getting the cost of the ice cream
    @Override
    public int getCost() {
        return icCost;
    }
}
