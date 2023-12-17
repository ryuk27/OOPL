import java.util.Scanner;

class Publication {
private String title;
private double price;
protected int copies;

public Publication(String title, double price, int copies) {
this.title = title;
this.price = price;
this.copies = copies;
}

public double saleCopy(int quantity) {
if (quantity <= copies) {
copies -= quantity;
return getPrice() * quantity;
} else {
return 0.0;
}
}

public double getPrice() {
return price;
}

public int getCopies() {
return copies;
}

public void setCopies(int copies) {
this.copies = copies;
}

public String getTitle() {
return title;
}
}

class Book extends Publication {
private String author;

public Book(String title, double price, int copies, String author) {
super(title, price, copies);
this.author = author;
}

public String getAuthor() {
return author;
}

@Override
public double saleCopy(int quantity) {
if (quantity <= getCopies()) {
int availableCopies = getCopies();
availableCopies -= quantity;
setCopies(availableCopies);
return getPrice() * quantity * 0.9;
} else {
return 0.0;
}
}
}

class Magazine extends Publication {
private int currentIssue;

public Magazine(String title, double price, int copies, int currentIssue) {
super(title, price, copies);
this.currentIssue = currentIssue;
}

public int getCurrentIssue() {
return currentIssue;
}

@Override
public double saleCopy(int quantity) {
if (quantity <= getCopies()) {
int availableCopies = getCopies();
availableCopies -= quantity;
setCopies(availableCopies);
return getPrice() * quantity;
} else {
return 0.0;
}
}
}

public class SalesProgram {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

Book book = new Book("Java Programming", 29.99, 100, "John Doe");
Magazine magazine = new Magazine("Tech Magazine", 5.99, 200, 10);

System.out.println("Book Details:");
System.out.println("Title: " + book.getTitle());
System.out.println("Author: " + book.getAuthor());
System.out.println("Price: Rs. " + book.getPrice());
System.out.println("Available Copies: " + book.getCopies());

System.out.print("Enter the quantity of books to order: ");
int bookQty = scanner.nextInt();
double bookSales = book.saleCopy(bookQty);
System.out.println("Total Book Sales: Rs. " + bookSales);

System.out.println("\nMagazine Details:");
System.out.println("Title: " + magazine.getTitle());
System.out.println("Current Issue: " + magazine.getCurrentIssue());
System.out.println("Price: Rs. " + magazine.getPrice());
System.out.println("Available Copies: " + magazine.getCopies());

System.out.print("Enter the quantity of magazines to order: ");
int magazineQty = scanner.nextInt();
double magazineSales = magazine.saleCopy(magazineQty);
System.out.println("Total Magazine Sales: Rs. " + magazineSales);

double totalSales = bookSales + magazineSales;
System.out.println("\nTotal Publication Sales: Rs. " + totalSales);

scanner.close();
}
}
