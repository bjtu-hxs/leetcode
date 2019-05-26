public class Q268_MissingNumber {
    // Method 1 2ms 61.21%
    public int missingNumber(int[] nums) {
        long total = nums.length * (nums.length + 1) / 2;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (int) (total - sum);
    }
}
