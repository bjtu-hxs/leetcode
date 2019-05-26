public class Q125_ValidPalindrome {
    // Method 1 6ms 92.68%
    public boolean isPalindrome(String s) {

        char[] chars = s.toCharArray();

        for (int head = 0, tail = s.length() - 1; head < tail; head++, tail--){

            while (getCharType(chars[head]) == 2) {
                head++;
                if (head == tail) {
                    return true;
                }
            }

            while (getCharType(chars[tail]) == 2) {
                tail--;
                if (head == tail) {
                    return true;
                }
            }

            if (getCharType(chars[head]) == 1) {
                chars[head] += 'a' - 'A';
            }

            if (getCharType(chars[tail]) == 1) {
                chars[tail] += 'a' - 'A';
            }

            if (chars[head] != chars[tail]) {
                return false;
            }
        }

        return true;
    }

    public int getCharType(char c) {
        if (c >= '0' && c <= '9' || (c >= 'a' && c <= 'z')) {
            return 0;
        }
        else if (c >= 'A' && c <= 'Z') {
            return 1;
        }
        else {
            return 2;
        }
    }
}
