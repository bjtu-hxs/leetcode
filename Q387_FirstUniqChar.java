import java.util.HashMap;

public class Q387_FirstUniqChar {
    public int firstUniqChar(String s) {
//        // Method_01  79ms  31.38%
//        char[] chars = s.toCharArray();
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        for (char ch :
//                chars) {
//            hashMap.put(ch, hashMap.get(ch) == null ? 1 : hashMap.get(ch) + 1);
//        }
//        for (int i = 0; i < chars.length; i++) {
//            if (hashMap.get(chars[i]) == 1) {
//                return i;
//            }
//        }
//        return -1;

//        //Method_02  48ms  48.97%
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            boolean unique = true;
//            for (int j = 0; j < chars.length; j++) {
//                if (chars[i] == chars[j] && i != j) {
//                    unique = false;
//                    break;
//                }
//            }
//            if (unique) {
//                return i;
//            }
//        }
//        return -1;

        // Method_03  7ms  98.63%
        int start;
        int end;
        int result = s.length();
        for(char ch='a';ch<='z';ch++) {
            start = s.indexOf(ch);
            end = s.lastIndexOf(ch);
            if(start == end && start != -1) {
                result = Math.min(result,start);
            }
        }
        if(result == s.length()) {
            return -1;
        }
        return result;


    }
}
