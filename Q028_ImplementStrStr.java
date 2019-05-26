public class Q028_ImplementStrStr {
    // Method 1 2ms 100%
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i+needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
