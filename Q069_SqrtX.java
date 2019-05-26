public class Q069_SqrtX {
    // Method 1 6ms 97.63%
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int ans = 0, left = 0, right = x;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
