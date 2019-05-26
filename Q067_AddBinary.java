public class Q067_AddBinary {
    // Method 1 4ms 79.81%
    public String addBinary(String a, String b) {
        StringBuffer res = new StringBuffer();
        int minLength = Math.min(a.length(), b.length());
        String longerStr = a.length() > b.length() ? a : b;
        int carry = 0;
        for (int i = 1; i <= minLength; i++) {
            int cur = a.charAt(a.length() - i) - '0' + b.charAt(b.length() - i) - '0' + carry;
            carry = cur / 2;
            res.append(cur % 2);
        }
        for (int i = minLength + 1; i <= longerStr.length(); i++) {
            int cur = longerStr.charAt(longerStr.length() - i) - '0' + carry;
            carry = cur / 2;
            res.append(cur % 2);
        }
        if (carry == 1) {
            res.append(1);
        }
        return res.reverse().toString();
    }
}
