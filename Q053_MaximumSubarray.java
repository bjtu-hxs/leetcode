public class Q053_MaximumSubarray {
    // Method 1 2ms 100%
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int head = max;
        for (int i = 1; i < nums.length; i++) {
            head = head < 0 ? nums[i] : head + nums[i];
            max = head > max ? head : max;
        }
        return max;
    }
}
