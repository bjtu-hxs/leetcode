public class Q344_ReverseString {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        char tmp;
        int start = 0, end = s.length() - 1;
        while(start < end) {
            tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
