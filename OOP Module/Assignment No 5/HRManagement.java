import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HRManagement {

    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        map.put("IT", new ArrayList<>());
        map.put("HR", new ArrayList<>());

        map.get("IT").add("Amit");
        map.get("IT").add("Rohan");

        map.get("HR").add("Priya");

        System.out.println(map);

    }
}