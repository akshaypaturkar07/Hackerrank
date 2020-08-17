import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class PayPalTest {
    public static void main(String[] args) {
        System.out.println(printStringifyAggressive("Time to write great code"));
    }

    static String printStringifyAggressive(String str) {
        Map<String, Integer> map = new LinkedHashMap<>();
        String strArray[] = str.split(" ");
        for (String s : strArray) {
            map.put(s, s.length());
        }
        Optional<Map.Entry<String, Integer>> maxEntry = map.entrySet()
                .stream()
                .filter(e -> e.getValue() % 2 == 0)
                .max(Comparator.comparing(Map.Entry::getValue));
        return maxEntry.get().getKey();
    }
}
