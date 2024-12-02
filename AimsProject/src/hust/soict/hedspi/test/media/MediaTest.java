package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;

public class MediaTest {

	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();
		
		DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book("Conan", "Manga", 20.00f);


        CompactDisc cd = new CompactDisc("rosie", "Music", "ROSÉ", 1500.98f);
        Track track1 = new Track("number one girl", 161);
        Track track2 = new Track("APT", 403);
        Track track3 = new Track("two years", 300);
        
        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);
        
        mediae.add(cd);
        mediae.add(book);
        mediae.add(dvd); 
        
        for (Media media : mediae) {
        	System.out.println(media.toString());
        }
	}

}
