package LAB_02.AimsProject;

public class Cart {
    
    // Maximum number of items allowed in the cart
    public static final int MAX_ITEMS = 20;
    private DigitalVideoDisc discsInCart[] = new DigitalVideoDisc[MAX_ITEMS];
    private int totalDiscs = 0;

    // Method to add a disc to the cart
    public void addDisc(DigitalVideoDisc disc) {
        if (totalDiscs < MAX_ITEMS) {
            discsInCart[totalDiscs++] = disc;
            System.out.println("DigitalVideoDisc has been added to the cart.");
        } else {
            System.out.println("Cart is full! Cannot add more items.");
        }
    }

    // Method to remove a disc from the cart
    public void removeDisc(DigitalVideoDisc disc) {
        boolean discFound = false;
        for (int i = 0; i < totalDiscs; i++) {
            if (discsInCart[i].getTitle().equals(disc.getTitle())) {
                discFound = true;
                // Shift elements to fill removed item position
                for (int j = i; j < totalDiscs - 1; j++) {
                    discsInCart[j] = discsInCart[j + 1];
                }
                discsInCart[--totalDiscs] = null; // Clear last item, adjust count
                System.out.println("DigitalVideoDisc removed from the cart.");
                break;
            }
        }
        if (!discFound) {
            System.out.println("DigitalVideoDisc not found in the cart.");
        }
    }

    // Method to calculate the total cost of discs in the cart
    public float calculateTotalCost() {
        float totalCost = 0;
        for (int i = 0; i < totalDiscs; i++) {
            totalCost += discsInCart[i].getPrice(); // Sum up prices of discs
        }
        return totalCost;
    }
}
