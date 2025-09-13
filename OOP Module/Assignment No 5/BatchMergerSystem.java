import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BatchMergerSystem {
    
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        System.out.println("Moring Batch");
        list1.add("Amit");
        list1.add("Priya");
        System.out.println(list1);

        List<String> list2=new ArrayList<>();
        System.out.println("Evening List");
        list2.add("Rohan");
        list2.add("Priya");
        System.out.println(list2);

        System.out.println("Merge list");
        list1.addAll(list2);
        System.out.println(list1);

        Set<String> uniqueSet= new LinkedHashSet<>(list1);
        System.out.println("Combined Batched: "+uniqueSet);

    }
}
