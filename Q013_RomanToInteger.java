import java.util.HashMap;

public class Q013_RomanToInteger {
    // Method 1 28ms 100%
    public int romanToInt(String s) {
        if (s.equals("")) {
            return 0;
        }
        HashMap<Character, Integer> dimentions = new HashMap<Character, Integer>(){{
            put('M', 1000);
            put('D', 500);
            put('C', 100);
            put('L', 50);
            put('X', 10);
            put('V', 5);
            put('I', 1);
        }};
        char[] chars = s.toCharArray();
        int pre = 1, res = 0;
        for (int i = chars.length - 1; i >= 0 ; i--) {
            int value = dimentions.get(chars[i]);
            if (value < pre) {
                res -= value;
            }
            else {
                res += value;
            }
            pre = value;
        }
        return res;
    }
}
