package LAB_02.AimsProject;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private int length;
    private String author;
    private float price;

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public int getLength() {
        return this.length;
    }

    public String getDirector() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public DigitalVideoDisc(String author, String category, String title, float price) {
        this(title, category, price);
        this.author = author;
    }

    public DigitalVideoDisc(String title, String category, String author, int length, float price) {
        this(author, category, title, price);
        this.length = length;
    }
}
