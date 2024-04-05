import java.util.Scanner;

class Publication {
    protected String title;
    protected double price;
    protected int copies;

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public double saleCopy() {
        return price * copies;
    }
}

class Book extends Publication {
    protected String author;

    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    public void orderCopies(int quantity) {
        copies += quantity;
    }
}

class Magazine extends Publication {
    protected int orderQty;
    protected int currentIssue;

    public Magazine(String title, double price, int copies, int currentIssue) {
        super(title, price, copies);
        this.currentIssue = currentIssue;
    }

    public void receiveIssue(int quantity) {
        currentIssue += quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Book book1 = new Book("Book1", 20.0, 100, "Author1");
        Magazine magazine1 = new Magazine("Magazine1", 10.0, 200, 5);

        
        book1.orderCopies(50);
        magazine1.receiveIssue(100);

        // Displaying total sale of publications
        double totalSale = book1.saleCopy() + magazine1.saleCopy();
        System.out.println("Total sale of publications: $" + totalSale);

        
        scanner.close();
    }
}
