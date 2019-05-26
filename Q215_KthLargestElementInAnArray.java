import java.util.Arrays;

public class Q215_KthLargestElementInAnArray {
    // Method 1 3ms 99.28%
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
