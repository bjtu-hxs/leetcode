public class Q231_PowerOfTwo {
//    // Method 1 6ms 24.92%
//    public boolean isPowerOfTwo(int n) {
//        return n > 0 && Math.pow(2, 31) % n == 0;
//    }

//    // Method 2 6ms 24.92%
//    public boolean isPowerOfTwo(int n) {
//        return n > 0 && Integer.bitCount(n) == 1;
//    }

    // Method 2 6ms 24.92%
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n-1)) == 0;
    }
}
