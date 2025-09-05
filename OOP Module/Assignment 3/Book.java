import java.util.Scanner;

public class Book {

    private int copiesAvailable;

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }
 
    
    public int addCopies(int n){
        copiesAvailable=copiesAvailable+n;
        return copiesAvailable;
    }

    public int removeCopies(int n){
        copiesAvailable=copiesAvailable-n;
        return copiesAvailable;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Book b=new Book();

        System.out.println("Add copies ");
        int copies=sc.nextInt();
        b.addCopies(copies);

        System.out.println("Removes copy");
        int remove=sc.nextInt();
        b.removeCopies(remove);

        System.out.println("Available copies: "+b.getCopiesAvailable());



    }
}