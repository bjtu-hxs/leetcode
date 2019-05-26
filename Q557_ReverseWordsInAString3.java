public class Q557_ReverseWordsInAString3 {
//    // Method 1 14ms 75.25%
//    public String reverseWords(String s) {
//        char[] chars = s.toCharArray();
//        int start = -1, end = -1;
//        for (int i = 0; i < s.length(); i++) {
//            if (chars[i] != ' ' && end == start) {
//                start = i;
//            }
//            else if (chars[i] == ' ' && start != end) {
//                end = i - 1;
//                reverseWord(chars, start, end);
//                start = end;
//            }
//            if (i == s.length()-1 && start != end) {
//                reverseWord(chars, start, i);
//            }
//        }
//        return new String(chars);
//    }
//
//    public void reverseWord(char[] chars, int start, int end) {
//        int mid = end + (end - start) / 2;
//        for (int i = 0; i < mid && start < end; i++, start++, end--) {
//            char tmp = chars[start];
//            chars[start] = chars[end];
//            chars[end] = tmp;
//        }
//    }

    // Method 2 4ms 99.33%
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        if(s!=null && s.length()>0){
            String [] ss = s.split(" ");
            for(int i=0; i<ss.length-1; ++i)
                sb.append(getReverStr(ss[i])).append(' ');
            sb.append(getReverStr(ss[ss.length-1]));
        }
        return sb.toString();
    }

    private String getReverStr(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; --i)
            sb.append(s.charAt(i));
        return sb.toString();
    }
}
