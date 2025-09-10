
public class PaymentGateway {
    
    public static void paymentProccessing() throws CustomException{
        try {
          throw new CustomException("Payment Failed");
        } catch (CustomException e) {
           System.out.println("Exception Occured: " +e.getMessage());
        }
        finally{
            System.out.println("Cleanup done");
        }
    }

    public static void main(String[] args) throws CustomException{
        paymentProccessing();
    }
}

/*
 * PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java SchoolManagementSystem
SalarySplit.java
file is found: 
PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> javac PaymentGateway.java        
PS F:\java\OOP Module\Assignment 2\OOP Module\Assignment No 4> java PaymentGateway
Exception Occured: Payment Failed
Cleanup done
 */