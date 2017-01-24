
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author farrb0382
 */
public class IceCream extends DessertItem {
    
    public String icName;
    public int icCost;
        
    public IceCream(String name, int cost) {
        super(name);
        this.icCost = cost;
        this.icName = name;
    }
    
    public String toString() {
        String spaces = new String();
        int space = 30 - (this.icName.length() + DessertShoppe.cents2dollarsAndCents(this.getCost()).length());
        for (int i = 0; i < space; i++) {
            spaces = spaces + " ";
        }
        return (this.icName + spaces + DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }
    
    @Override
    public int getCost() {
        return icCost;
    }
}
