
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author farrb0382
 */
public class Candy extends DessertItem {

    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    public String toString() {
        String spaces = new String();
        int space = 30 - (this.getName().length() + DessertShoppe.cents2dollarsAndCents(this.getCost()).length());
        for (int i = 0; i < space; i++) {
            spaces = spaces + " ";
        }
        return (this.weight + " lbs." + " @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb.\n" + this.getName() +  spaces + DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }

    @Override
    public int getCost() {
        return (int) Math.round(weight * pricePerLbs);
    }
}
