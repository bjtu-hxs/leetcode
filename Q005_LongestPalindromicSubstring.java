public class Q005_LongestPalindromicSubstring {
//    // Method 1 120ms 39.82%
//    public String longestPalindrome(String s) {
//        if (s == null || s.equals("")) {
//            return "";
//        }
//        if (s.length() == 1) {
//            return s;
//        }
//        String res = s.substring(0,1);
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 1; j <= Math.min(s.length()-i-1, i); j++) {
//                if (s.charAt(i-j) == s.charAt(i+j)) {
//                    res = j * 2 + 1 >= res.length() ? s.substring(i - j, i + j + 1) : res;
//                } else {
//                    break;
//                }
//            }
//            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
//                if (2 >= res.length()) {
//                    res = s.substring(i, i+2);
//                }
//                for (int j = 1; j <= Math.min(s.length()-i-2, i); j++) {
//                    if (s.charAt(i - j) == s.charAt(i + j + 1)) {
//                        res = j * 2 + 2 >= res.length() ? s.substring(i - j, i + j + 2) : res;
//                    } else {
//                        break;
//                    }
//                }
//            }
//        }
//        return res;
//    }

    // Method 2 16ms 90.89%
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
