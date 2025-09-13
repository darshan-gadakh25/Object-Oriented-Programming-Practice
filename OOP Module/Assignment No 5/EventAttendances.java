import java.util.*;


public class EventAttendances {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> studentName=new ArrayList<>();

        System.out.println("Enter attendess");
        while (true) {
            String name=sc.next();
            if(name.equalsIgnoreCase("done")){
                break;
            }
            studentName.add(name);
        }

        System.out.println("Attendees: " +studentName);

        Set<String> uniqueAttendies= new HashSet<>(studentName);

        System.out.println("Total unique attendees: "+uniqueAttendies.size());
    }
}
