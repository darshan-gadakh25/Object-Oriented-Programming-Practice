import java.util.*;

public class RecentSerach {
    
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        ArrayList<String> recentlist=new ArrayList<>();

        System.out.println("Enter order in application: ");
        while(true){
            String item=sc.nextLine();
            if(item.equalsIgnoreCase("done")) break;
            recentlist.add(item);
        }

        System.out.println("Serach : "+recentlist);


    
    while (recentlist.size() > 5) {
        recentlist.remove(0);
    }


        System.out.println("Recent seraches: "+recentlist);
    }
}
