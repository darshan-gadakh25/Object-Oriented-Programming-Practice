import java.util.*;
public class VotingSystem {
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        Set <Integer> voterList=new HashSet<>();
        System.out.print("Enter the Voter ID: ");

        while(true){
            int id=sc.nextInt();
            if(id == 0){
                break;
            }
            voterList.add(id);
        }

        System.out.println("Total votes: "+voterList.size());
    }
}
