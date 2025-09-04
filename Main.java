import java.util.Scanner;
public class GreatestScore { 
  
  public static int greatscore(int  test1, int test2) {
    if( test1> test2) ? : return test1 : test2;
  }

  public static void main(String[] args) { 
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter test 1 score: ");
    int score1 = sc.nextInt();

    System.out.println("Enter test 2 score: ");
    int score2 = sc.nextInt();
    System.out.println();
	
    int result= greatscore(score1, score2);
    if( result == score1)  { System.out.println("Test 1 has higher"); }
    else {  System.out.println("Test 2 has higher");
    

    
  }
}