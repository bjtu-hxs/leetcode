public class Q038_CountAndSay {
    // Method 1 3ms 93.36%
    public String countAndSay(int n) {
        String res = "1";
        if (n == 1) {
            return res;
        }
        while (--n > 0){
            StringBuffer resres = new StringBuffer();
            char[] chars = res.toCharArray();
            char pre = chars[0];
            int num = 1;

            for (int i = 1; i < chars.length; i++) {
                if (pre == chars[i]) {
                    num++;
                } else {
                    resres.append(num).append(pre);
                    num = 1;
                    pre = chars[i];
                }
            }

            resres.append(num).append(pre);
            res = resres.toString();
        }
        return res;
    }
}
