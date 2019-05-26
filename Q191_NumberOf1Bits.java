public class Q191_NumberOf1Bits {
    // you need to treat n as an unsigned value
//    // Method 1 3ms 81.17%
//    public int hammingWeight(int n) {
//        int res = 0;
//        while (n != 0) {
//            res += n&1;
//            n = n >>> 1;
//        }
//        return res;
//    }

    // Method 1 3ms 81.17%
    public int hammingWeight(int n) {
        n = n - ((n >>> 1) & 0x55555555);
        n = (n & 0x33333333) + ((n >>> 2) & 0x33333333);
        n = (n + (n >>> 4)) & 0x0f0f0f0f;
        n = n + (n >>> 8);
        n = n + (n >>> 16);
        return n & 0x3f;
    }
}
