public class Q006ZigZagConversion {
    // Method 1 13ms 96.85%
    public String convert(String s, int numRows) {
        if (s == null || s.length() <= numRows || numRows == 1) {
            return s;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += (numRows-1) * 2) {
                res.append(s.charAt(j));
                if (i > 0 && i < numRows - 1 && j+(numRows-1-i) * 2 < s.length()) {
                    res.append(s.charAt(j+(numRows-1-i)*2));
                }
            }
        }
        return res.toString();
    }
}
