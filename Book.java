 import java.util.Scanner;
 class Publication{
     protected String title;
     protected float price;
     protected int qty;

     public Publication(){
         this.title=null;
         this.price=0;
         this.qty=0;
     }
     public float salesCopy(){
         return price*qty;
     }
 }

 class Book extends Publication{
     String author;
     Scanner sc = new Scanner(System.in);
     public Book(){
         System.out.println("Enter Title");
         this.title = sc.next();
         System.out.println("Enter name of Author");
         this.author = sc.next();
         System.out.println("Enter total Quantity");
         this.qty = sc.nextInt();
         System.out.println("Enter Price");
         this.price = sc.nextFloat();
         }

     public void print(){
         System.out.println("Title: "+this.title);
         System.out.println("Current issue= "+this.author);
         System.out.println("Price= "+this.price);
         System.out.println("Quantity= "+this.qty);
     }

 }

 class Magzine extends Publication{
     String curr_issue;
     Scanner sc = new Scanner(System.in);
     public Magzine(){
         System.out.println("Enter Title");
         this.title = sc.next();
         System.out.println("Enter name of Author");
         this.curr_issue = sc.next();
         System.out.println("Enter total Quantity");
         this.qty = sc.nextInt();
         System.out.println("Enter Price");
         this.price = sc.nextFloat();
     }

     public void print(){
         System.out.println("Title: "+this.title);
         System.out.println("Current issue= "+this.curr_issue);
         System.out.println("Price= "+this.price);
         System.out.println("Quantity= "+this.qty);
     }

 }

 public class Store {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         float magzine_Sale=0,bookSales=0;
         int choice,ans;

         do {
         System.out.println("Enter Choice\n1. Book Sales\n2. Magzine Sales\n3. Total Sale");
         choice=sc.nextInt();

             switch (choice) {
                 case 1:
                     System.out.println("Book sale");
                     Book book = new Book();
                     book.print();
                     bookSales = book.salesCopy();
                     System.out.println("Total Book Sale = " + bookSales);
                     break;
                 case 2:

                     Magzine magzine = new Magzine();
                     magzine.print();
                     magzine_Sale = magzine.salesCopy();
                     System.out.println("Total Magzine Sale = " + magzine_Sale);
                     break;
                 case 3:
                     System.out.println("Total Sale");
                     float totalSale = bookSales + magzine_Sale;
                     System.out.println("Total Sale is" + totalSale);
                     break;
                 default:
                     System.out.println("Wrong Choice");
             }
             System.out.println("Do You want to Continue: Yes=1");
             ans=sc.nextInt();
         }while(ans==1);
     }
 }
