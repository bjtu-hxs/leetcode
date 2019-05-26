public class Q014_LongestCommonPrefix {
    // Method 1 5ms 99.97%
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String needle = strs[0];
        int len = 0;
        for (; len < needle.length(); len++) {
            boolean flag = false;
            for (int i = 1; i < strs.length; i++) {
                flag = false;
                if (len >= strs[i].length() || needle.charAt(len) != strs[i].charAt(len)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return strs[0].substring(0, len);
    }
}
