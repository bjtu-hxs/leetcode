public class Q020_ValidParentheses {
    // Method 1 2ms 100%
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }
        char[] stack = new char[s.length()];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack[index] = s.charAt(i);
                index++;
            } else if (s.charAt(i) == '}'){
                if (index == 0 || stack[index - 1] != '{') {
                    return false;
                } else {
                    index --;
                }
            } else if (s.charAt(i) == ']'){
                if (index == 0 || stack[index - 1] != '[') {
                    return false;
                } else {
                    index --;
                }
            } else if (s.charAt(i) == ')'){
                if (index == 0 || stack[index - 1] != '(') {
                    return false;
                } else {
                    index --;
                }
            }
        }
        return index == 0;
    }
}
