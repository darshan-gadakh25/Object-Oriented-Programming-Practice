import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class GradeDistributionCounter {

    public static void main(String[] args) {
        ArrayList<String> charList = new ArrayList<>();
        charList.add("A");
        charList.add("B");
        charList.add("A");
        charList.add("C");
        charList.add("B");
        charList.add("A");

        System.out.println(charList);

        Map<String, Integer> unique = new LinkedHashMap<>();
        for (int i = 0; i < charList.size(); i++) {
            String currentChar = charList.get(i);
            if (!unique.containsKey(currentChar)) {
                int count = 1;
                for (int j = i + 1; j < charList.size(); j++) {
                    if (charList.get(i).equals(charList.get(j))) {
                        count++;
                    }
                }
                unique.put(currentChar, count);
            }
        }

        System.out.println("Grade Distribution: "+unique);
    }
}
