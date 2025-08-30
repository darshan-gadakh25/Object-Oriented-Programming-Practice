
class Book {
    String title;
    String auther;
    boolean issued;
    static int totalIssuedBooks;
    
    Book(String title, String auther, boolean issued ){
        this.title=title;
        this.auther=auther;
        this.issued=issued;
        if(issued == true) {
            totalIssuedBooks++;
        }
    }
    
    
    void setTitle(String title){
        this.title=title;
    }
    
    void setAuther(String auther){
        this.auther=auther;
    }
    void setIssued(boolean issued){
        this.issued=issued;
        if(issued == true){
            totalIssuedBooks++;
        }
    }
    
    String getTitle(){
        return auther;
    }
    String getAuther(){
        return auther;
    }
    
    boolean getIssued(){
        return issued;
    }
    
    static void showTotalIssued(){
        System.out.println("Total books issued: "+totalIssuedBooks);
    }
}

public class BookDemo{

    public static void main(String [] args){
        Book b1=new Book("Harry Potter", "J.K. Rowling", true);
        Book b2=new Book("Five Point Someone", "Chetan Bhagat", false );
        Book b3=new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true );
        System.out.println("Book1 issued?"+b1.getIssued());
        System.out.println("Book2 issued?"+b2.getIssued());
        System.out.println("Book3 issued?"+b3.getIssued());
        
        
        Book.showTotalIssued();
        
    
    }
}
/*

OUTPUT

Book1 issued?true
Book2 issued?false
Book3 issued?true
Total books issued: 2

*/