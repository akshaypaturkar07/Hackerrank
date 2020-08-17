/**
 * leetcode #1108
 */
public class DefangIpAddress {
    public static void main(String[] args) {
        System.out.println(defangIpAddress("1.1.1.1"));
        System.out.println(defangIpAddress("255.100.50.0"));
    }

    public static String defangIpAddress(String str) {
        if (str.contains(".")) {
            return str.replace(".", "[.]");
        }
        return str;
    }
}
