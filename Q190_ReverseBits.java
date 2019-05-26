public class Q190_ReverseBits {
    // you need treat n as an unsigned value
    // Method 1 4ms 76.564%
//    public int reverseBits(int n) {
//        n = (n & 0x55555555) << 1 | (n >>> 1) & 0x55555555;
//        n = (n & 0x33333333) << 2 | (n >>> 2) & 0x33333333;
//        n = (n & 0x0f0f0f0f) << 4 | (n >>> 4) & 0x0f0f0f0f;
//        n = (n << 24) | ((n & 0xff00) << 8) |
//                ((n >>> 8) & 0xff00) | (n >>> 24);
//        return n;
//    }

    // Method 2 1ms 100%
    public int reverseBits(int n) {
        int ans=0;
        int i=32;
            while(i>0){
            ans<<=1;
            ans+=n&1;
            n>>=1;
            i--;
        }
            return ans;
    }
}

