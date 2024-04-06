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







// import java.util.Scanner;

// class Publication{
//     protected String title;
//     protected float price;
//     protected int qty;

//     public Publication(String title, int qty, float price){
//         this.title=title;
//         this.price=price;
//         this.qty=qty;
//     }

//     public void print(){
//         System.out.println("Title: "+title);
//         System.out.println("Price= "+price);
//         System.out.println("Quantity= "+qty);
//     }

//     public float salesCopy(){
//         return price*qty;
//     }
// }

// class Book extends Publication{
//     String author;
//     public Book(String title,String author,int qty,float price){
//         super(title, qty,price);
//         this.author = author;
//     }

// }

// class Magzine extends Publication{
//     String curr_issue;
//     public Magzine(String title,String cuur_issue,int qty,float price){
//         super(title, qty,price);
//         this.curr_issue = cuur_issue;
//     }

// }

// public class Store {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String title,author,curr_issue;
//         float price;int qty;
//         float magzine_Sale=0,bookSales=0;
//         int choice,ans=1;

//         do {
//         System.out.println("Enter Choice\n1. Book Sales\n2. Magzine Sales\n3. Total Sale");
//         choice=sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.println("Book sale");
//                     System.out.println("Enter Title");
//                     title = sc.next();
//                     System.out.println("Enter name of Author");
//                     author = sc.next();
//                     System.out.println("Enter total Quantity");
//                     qty = sc.nextInt();
//                     System.out.println("Enter Price");
//                     price = sc.nextFloat();
//                     Book book = new Book(title, author, qty, price);
//                     book.print();
//                     System.out.println("Author= " + author);
//                     bookSales = book.salesCopy();
//                     System.out.println("Total Book Sale = " + bookSales);
//                     break;
//                 case 2:
//                     System.out.println("Magzine Sale");
//                     System.out.println("Enter Title");
//                     title = sc.next();
//                     System.out.println("Enter current issue");
//                     curr_issue = sc.next();
//                     System.out.println("Enter total Quantity");
//                     qty = sc.nextInt();
//                     System.out.println("Enter Price");
//                     price = sc.nextFloat();
//                     Magzine magzine = new Magzine(title, curr_issue, qty, price);
//                     magzine.print();
//                     System.out.println("Current Issue= " + curr_issue);
//                     magzine_Sale = magzine.salesCopy();
//                     System.out.println("Total Magzine Sale = " + magzine_Sale);
//                     break;
//                 case 3:
//                     System.out.println("Total Sale");
//                     float totalSale = bookSales + magzine_Sale;
//                     System.out.println("Total Sale is" + totalSale);
//                     break;
//                 default:
//                     System.out.println("Wrong Choice");
//             }
//             System.out.println("Do You want to Continue: Yes=1");
//             ans=sc.nextInt();
//         }while(ans==1);
//     }

// }
