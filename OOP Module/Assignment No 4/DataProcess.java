public class DataProcess {
    public static void main(String[] args) throws CustomException{
        try{
            throw new CustomException("Invalid input");
        }catch(CustomException e){
            System.out.println("Exception Occur: "+e.getMessage());
        }
        finally{
            System.out.println("Data Processing completeed");
        }
    }
}

/*
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java DataProcess      
Exception Occur: Invalid input
Data Processing completeed
 */