package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	
	
	private List<String> authors = new ArrayList<String>();


	public List<String> getAuthors() {
		return authors;
	}


	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}


	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
            System.out.println(authorName + "is already in the list.");
        } else {
            authors.add(authorName);
        }
	}
	
	public void removeAuthor(String authorName) {
        if(authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println(authorName + "is not in the list.");
        }
    }

}
