public class Book { 

    // instance variables 
    int ISBN; 
    String title; 
    String author; 
    int pages; 
    double price; 
    
    // constructor 
    public Book(int i, String t, String a, int p, double pr) { 
    
    ISBN = i; 
    title = t; 
    author = a; 
    pages = p; 
    price = pr; 
    } 
    
    // getters and setters 
    public int getISBN() { 
    return ISBN; 
    } 
    
    public void setISBN(int i) { 
    ISBN = i; 
    } 
    
    public String getTitle() { 
    return title; 
    } 
    
    public void setTitle(String t) { 
    title = t; 
    } 
    
    public String getAuthor() { 
    return author; 
    } 
    
    public void setAuthor(String a) { 
    author = a; 
    } 
    
    public int getPages() { 
    return pages; 
    } 
    
    public void setPages(int p) { 
    pages = p; 
    } 
    
    public double getPrice() { 
    return price; 
    } 
    
    public void setPrice(double pr) { 
    price = pr; 
    } 
    
    // toString method 
    public String toString() { 
    return "\nISBN: " + ISBN + 
    "\nTitle: " + title + 
    "\nAuthor: " + author + 
    "\nPages: " + pages + 
    "\nPrice: $" + price; 
    } 
    }