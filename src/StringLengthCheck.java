public class StringLengthCheck {
    public static void main(String[] args) {
        System.out.println(isPure(4454));
        System.out.println(isPure(44554));
        System.out.println(isPure(1445454455));
    }

    static boolean checkStringSizeIfeven(long value) {
        return String.valueOf(value).length() % 2 == 0 ? true : false;
    }

    static boolean isPure(long n) {
        String str = String.valueOf(n);
        if (checkStringSizeIfeven(n)) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '4' || str.charAt(i) == '5') {
                    continue;
                } else {
                    return false;
                }

            }
            return true;
        }
        return false;
    }
}

