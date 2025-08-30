
class Book {

    int bookId;
    String title; 
    String auther;
	
    
     Book(int bookId,String title, String auther){
        this.bookId=bookId;
        this.title=title;
        this.auther=auther;
    }

    public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId){
	   this.bookId=bookId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title){
	  this.title=title;
	}
	
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther){
	 this.auther=auther;
	}
	
}

public class Library{

	String libraryName;
	static int totalBooks;
	
	Library(String libraryName){
	    this.libraryName=libraryName;
	}
	
	public void addBook(Book b){
	    totalBooks++;
	}
	
	public void displayTtoalBook(){
	    System.out.println("The Total Book is="+this.totalBooks);
	}
	
	public static void main(String[] args) {
	    Library lib=new Library("Paras Library");
	    
	    Book b1=new Book(11,"java","jame goslin");
	    Book b2=new Book(12,"Cpp","Bjarme");
	    
	    lib.addBook(b1);
	    lib.addBook(b2);
	    
	    lib.displayTtoalBook();
	    
	}
	
}

/*

OUTPUT
The Total Book is=2
*/
