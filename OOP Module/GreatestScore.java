import java.util.Scanner;
public class HighestSalary { 
  
  public static int highestSalary(int sal1, int sal2, int sal3) {
    int result = 0;
	
	if( sal1 > sal2 && sal2 > sal3) {
		 System.out.println("Company 1 offers the highest salary.");
 	}
	else if ( sal2> sal3 && sal2 > sal1){
		 System.out.println("Company 2 offers the highest salary.");
 	}
	else {
		 System.out.println("Company 3 offers the highest salary.");
 	}
    return result;
  }

  public static void main(String[] args) { 
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter salary for Company 1: ");
    int sal1 = sc.nextInt();

    System.out.println("Enter salary for Company 2: ");
    int sal2 = sc.nextInt();
    System.out.println();

    System.out.println("Enter salary for Company 3: ");
    int sal3 = sc.nextInt();
    System.out.println();
	
	
    highestSalary(score1, score2);
       
  }
}

/*

OUtPUT:--
java GreatestScore
Enter test 1 score:75
Enter test 2 score:
86

Test 2 has higher

*/
