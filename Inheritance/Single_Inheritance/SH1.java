class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class EBook extends Book {
    private double fileSize; // in MB

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookInfo() {
        displayInfo();
        System.out.println("File Size: " + fileSize + "MB");
    }
}

public class SH1{
    public static void main(String[] args) {
        EBook ebook = new EBook("Java Programming", "James Gosling", 5.2);
        ebook.displayEBookInfo();
    }
}
