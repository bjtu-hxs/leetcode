public class Q008_StringToInteger {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        char[] chars = str.toCharArray();
        double res = 0;
        boolean negative = false;

        int index = 0;


        return (int) res;
    }
//    // Method 2 92ms 6.09%
//    public int myAtoi(String str) {
//        char[] chars = str.toCharArray();
//        double result = 0;
//        char pre = ' ';
//        boolean negative = false;
//        for (char c : chars) {
//            if (c >= '0' && c <= '9') {
//                if (negative) {
//                    result = (result * 10) - (c - '0');
//                } else {
//                    result = (result * 10) + (c - '0');
//                }
//                if (result > Integer.MAX_VALUE) {
//                    return Integer.MAX_VALUE;
//                }
//                if (result < Integer.MIN_VALUE) {
//                    return Integer.MIN_VALUE;
//                }
//            } else if (c == ' ' || c == '-' || c == '+') {
//                if (pre != ' '){
//                    return result > Integer.MAX_VALUE ? Integer.MAX_VALUE : result < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) result;
//                }
//                negative = c == '-';
//            } else {
//                return result > Integer.MAX_VALUE ? Integer.MAX_VALUE : result < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) result;
//            }
//            pre = c;
//            System.out.println(result);
//        }
//        return (int) result;
//    }
}
