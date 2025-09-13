import java.util.ArrayList;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Amit");
        list.add("Priya");
        list.add("Rohan");

        System.out.println("Add students: "+list);
        System.out.println("Remove student: "+ "Priya");
        list.remove("Priya");
        System.out.println("Students: "+list);
    }
}
