package hust.soict.hedspi.aims.cart;
import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full.");
		} else if (itemsOrdered.contains(media)){
			System.out.println(media.getTitle() + " is already in the cart.");
		} else {
			itemsOrdered.add(media);
			System.out.println(media.getTitle() + "has been added.");
		}
	}
	
	public void removeMedia(Media media) {
		if (itemsOrdered.size() == 0) {
			System.out.println("Nothing to remove.");
		} else {
			if (itemsOrdered.remove(media)) {
				System.out.println(media.getTitle() + "has been remove from the cart.");
			} else {
				System.out.println("Media not found in cart.");
			}
		}
	}
	
	// tinh tong gia tien
	public float totalCost() {
        float sum = 0;
        for(Media media : itemsOrdered) {
            sum += media.getCost();
        }
        return sum;
    }
	
	// hien thong tin dia
	public void displayDigitalVideoDisc() {
		StringBuilder output = new StringBuilder("***********************CART*********************** \nOrdered items: \n");
		int i = 0;
        for(Media media : itemsOrdered) {
            i++;
            System.out.println(i + ". " + media);
        }
        output.append("Total cost: ").append(totalCost()).append(" $\n");
        output.append("***************************************************\n");
        System.out.println(output);
	}
	
	// tim kiem boi ID
	public void searchById(int id) {
		boolean found = false;
    	for (Media media : itemsOrdered) {
    		if (media.getId() == id) {
    			System.out.println("Found " + media);
    			found = true;
    		}
    	}
    	if (found==false) {
    		System.out.println("Sorry, no DVDs were found that match the ID provided.");
    	}
    }
	
	// tim kiem bang title
	public void searchByTitle(String title) {
		boolean found = false;
    	for (Media media : itemsOrdered) {
    		if (media.isMatch(title)) {
    			System.out.println("Found" + media);
    			found = true;
    		}
    	}
    	if (found == false) {
    		System.out.println("Sorry, no DVDs were found with \"" + title +"\" in the title!");
    	}
    }

}
