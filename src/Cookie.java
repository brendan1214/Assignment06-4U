
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

    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.pricePer12 = pricePer12;
        this.number = number;
    }

    public String toString() {
        String spaces = new String();
        int space = 30 - (super.getName().length() + DessertShoppe.cents2dollarsAndCents(this.getCost()).length());
        for (int i = 0; i < space; i++) {
            spaces = spaces + " ";
        }
        return (this.number + " @ " + DessertShoppe.cents2dollarsAndCents(this.pricePer12) + " /dz\n" + super.getName() + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }
    
    @Override
    public int getCost() {
        double cost = (this.number * this.pricePer12)/12;
        return (int) cost;
    }
}
