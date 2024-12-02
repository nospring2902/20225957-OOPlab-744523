package hust.soict.hedspi.aims.store;
import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Media;

public class Store {
	
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void removeMedia(Media media) {
    	if (itemsInStore.remove(media)) {
            System.out.println("The media " + media.getTitle() + " has been removed from the store.");
        } else {
            System.out.println("The media " + media.getTitle() + " is not in the store.");
        }
    }

    public void addMedia(Media media) {
    	if (itemsInStore.contains(media)) {
			System.out.println("The media " + media.getTitle() + " is already in the store.");
		} else {
			itemsInStore.add(media);
			System.out.println("The media " + media.getTitle() + " has been added to the store.");
		}
    }
    

    public String toString() {
        StringBuilder string = new StringBuilder("****************STORE***************\nItems in the store: \n");
        if(itemsInStore.size() == 0) string.append("The store is empty!\n");
        else {
            for (Media media : itemsInStore) {
            	if (media != null)
            		System.out.println(media);
            }
        }
        string.append("***************************************");
        return string.toString();
    }
}
