
/**
 * Method to test all of your classes and inheritance structure.
 *
 * This is the main file set to run in this project. Once all of your classes
 * have been implemented, this file can be run to output the examples shown on
 * the assignment. Feel free to change this file up if you want to test other
 * parts.
 *
 * @author lamonta
 */

public class TestShoppe {

    public static void main(String[] args) {
        
        // creates a new checkout till
        Checkout checkout = new Checkout();
        
        // adds some items to the receipt
        checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
        checkout.enterItem(new IceCream("Vanilla Ice Cream", 105));
        checkout.enterItem(new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50));
        checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));
        
        // prints ou the receipt
        System.out.println(checkout);
        
        // clear the till
        checkout.clear();
        
        // print a few spaces between the runs
        System.out.println("\n\n");
        
        // adds some new items to the till
        checkout.enterItem(new IceCream("Strawberry Ice Cream", 145));
        checkout.enterItem(new Sundae("Vanilla Ice Cream", 105, "Caramel", 50));
        checkout.enterItem(new Candy("Gummy Worms", 1.33, 89));
        checkout.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
        checkout.enterItem(new Candy("Salt Water Taffy", 1.5, 209));
        checkout.enterItem(new Candy("Candy Corn", 3.0, 109));
        
        // prints out the receipt
        System.out.println(checkout);
    }
}
