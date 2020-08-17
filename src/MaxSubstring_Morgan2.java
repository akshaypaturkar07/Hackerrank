import java.util.ArrayList;
import java.util.List;

public class MaxSubstring_Morgan2 {
    private static Object String;

    public static void main(String[] args) {
        System.out.println(maxSubString("baca"));
        System.out.println(maxSubString("ba"));
        System.out.println(maxSubString("aaa"));
        System.out.println(maxSubString("banana"));
    }

    public static String maxSubString(String s) {
        List<String> result = helper(s, 0, s.length(), new ArrayList<String>());
        return s;
    }

    static List<String> helper(String s, int start, int end, List<String> result) {
        StringBuffer sb = new StringBuffer();
        while (start < end) {
            sb.append(s.charAt(start));
        }
        result.add(sb.toString());

        helper(s, start + 1, end, result);
        return result;

    }


}
