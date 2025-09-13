import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GradeReportGenerator {
    
    public static void main(String[] args) {
        Map<String, Integer> gradeReport=new HashMap<>();
        gradeReport.put("Amit", 85);
        gradeReport.put("Priya", 90);

        Iterator<Map.Entry<String, Integer>> iterateMap=gradeReport.entrySet().iterator();
        while (iterateMap.hasNext()) {
            Map.Entry<String, Integer> entry= iterateMap.next();
           System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
    }
}
