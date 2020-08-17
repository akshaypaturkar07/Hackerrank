import java.util.*;

/**
 * Leetcode #819. Most Common Word
 */
public class MostCommonWord {
    public static void main(String[] args) {
        String[] banned = {"hit"};
        String[] banned1 = {};
        String[] banned2 = {"a"};
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", banned));
        System.out.println(mostCommonWord("a.", banned1));
        System.out.println(mostCommonWord("a, a, a, a, b,b,b,c, c", banned2));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        String[] words = normalizedStr.split("\\s+");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String str : words) {
            if (!Arrays.asList(banned).contains(str)) {
                if (!map.containsKey(str)) {
                    map.put(str, 1);
                } else {
                    map.put(str, map.get(str) + 1);
                }
            }

        }
        return map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
    }
}
