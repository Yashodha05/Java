package W2;

public class Book {
    String title;
    String author;
    int pageCount;

    
    public Book(String t, String ar, int pc) {
        title= t;
        author = ar;
        pageCount = pc;
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }

    public static void main(String[] args) {
        
        Book myBook = new Book("The God of Small things", "Arundati Roy", 340);
        System.out.println("Initial Information:");
        myBook.displayInfo();
        myBook.title = "The Discovery of India";
        myBook.author="Jawaharlal Nehru";
        myBook.pageCount = 700;
        System.out.println("\nModified Information:");
        myBook.displayInfo();
    }
}
