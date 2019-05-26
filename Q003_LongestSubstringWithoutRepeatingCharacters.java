public class Q003_LongestSubstringWithoutRepeatingCharacters {
    // Method 1 6ms 98.03%
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int res = 1;
        int head = 0;
        int tail = 0;
        for (int i = 1; i < s.length(); i++) {
            boolean inSub = false;
            for (int j = head; j <= tail; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    head =  j + 1;
                    tail = i;
                    inSub = true;
                    break;
                }
            }
            if (!inSub) {
                tail++;
            }
            res = res < tail - head + 1 ? tail - head + 1 : res;

        }
        return res;
    }
}
