public class Q198_HouseRobber {
    // Method 1 1ms 99.31%
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] maxMatrix = new int[nums.length];
        maxMatrix[0] = nums[0];
        maxMatrix[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < nums.length; i++) {
            maxMatrix[i] = Math.max(maxMatrix[i - 2] + nums[i], maxMatrix[i - 1]);
        }
        return maxMatrix[nums.length - 1];
    }
}
