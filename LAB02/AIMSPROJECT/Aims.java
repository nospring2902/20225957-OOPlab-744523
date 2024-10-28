package LAB_02.AimsProject;

public class Aims {
    public static void main(String[] args) {
        // Initialize a new shopping cart
        Cart myCart = new Cart();

        // Create and add DVDs to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
            "Animation", "Roger Allers", 87, 19.95f);
        myCart.addDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
            "Science Fiction", "George Lucas", 87, 24.95f);
        myCart.addDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", 
            "Animation", 18.99f);
        myCart.addDisc(dvd3);

        // Adding a fourth DVD to the cart
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Incredibles", 
            "Animation", "Brad Bird", 115, 21.99f);
        myCart.addDisc(dvd4);

        // Display the total cost of items in the cart
        System.out.println("Total cost of items in cart: ");
        System.out.println(myCart.calculateTotalCost());

        // Remove a DVD from the cart
        myCart.removeDisc(dvd3);

        // Display updated total cost after removal
        System.out.println("Total cost after removing a disc: ");
        System.out.println(myCart.calculateTotalCost());
    }
}
