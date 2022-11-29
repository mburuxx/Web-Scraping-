import java.util.LinkedList;

public class BookTest { 

    public static void main(String[] args) { 
    
    // create linked list 
    LinkedList<Book> list = new LinkedList<Book>(); 
    
    // create some books 
    Book b1 = new Book(1111, "Java for Dummies", "Barry Burd", 888, 29.99); 
    Book b2 = new Book(2222, "More Java for Dummies", "Barry Burd", 999, 19.99); 
    Book b3 = new Book(3333, "Even More Java for Dummies", "Barry Burd", 777, 39.99); 
    
    // insert at beginning 
    list.addFirst(b1); 
    list.addFirst(b2); 
    list.addFirst(b3); 
    
    // insert at end 
    list.addLast(new Book(4444, "Java: A Beginner's Guide", "Herbert Schildt", 556, 49.99)); 
    
    // insert in specific position 
    list.add(3, new Book(5555, "Java: The Complete Reference", "Herbert Schildt", 1234, 54.99)); 
    
    // remove a book 
    list.remove(2); 
    
    // search for a book by ISBN 
    int searchISBN = 2222; 
    int position = -1; 
    for(int i = 0; i < list.size(); i++) { 
    if(list.get(i).getISBN() == searchISBN) { 
    position = i; 
    break; 
    } 
    } 
    if(position >= 0) { 
    System.out.println("Book found at position: " + position); 
    } 
    else { 
    System.out.println("Book not found"); 
    } 
    
    // print list 
    System.out.println("\nBook List:"); 
    for(Book b : list) { 
    System.out.println(b); 
    } 
    } 
    }