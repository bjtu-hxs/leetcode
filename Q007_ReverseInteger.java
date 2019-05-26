public class Q007_ReverseInteger {
    public int reverse(int x) {
//        // Method_01  31ms  78.59%
//        String s = Integer.toString(x);
//        char[] chars = s.toCharArray();
//        int start = chars[0] == '-' ? 1 : 0;
//        int end = chars.length - 1;
//        while (start < end) {
//            char tmp = chars[start];
//            chars[start] = chars[end];
//            chars[end] = tmp;
//            start++;
//            end--;
//        }
//        s = new String(chars);
//        long res = Long.valueOf(s);
//        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
//            return 0;
//        }
//        return (int) res;

        // Method_02  28ms  88.84%
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) res;
    }
}
