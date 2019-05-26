import java.util.HashMap;

public class Q242_ValidAnagram {
//    // Method 1 61ms 11.50%
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        if (s.equals("")) {
//            return true;
//        }
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (char c: s.toCharArray()) {
//            if (map.containsKey(c)) {
//                map.put(c, map.get(c)+1);
//            } else {
//                map.put(c, 1);
//            }
//        }
//        for (char c: t.toCharArray()) {
//            if (map.containsKey(c)) {
//                if (map.get(c) == 0) {
//                    return false;
//                } else {
//                    map.put(c, map.get(c) - 1);
//                }
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }

    // Method 2 3ms 96.47%
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.equals("")) {
            return true;
        }
        int[] array = new int[26];
        for (char c :
                s.toCharArray()) {
            array[c - 'a']++;
        }
        for (char c :
                t.toCharArray()) {
            array[c - 'a']--;
        }
        for (int a :
                array) {
            if (a != 0) {
                return false;
            }
        }
        return true;
    }
}
