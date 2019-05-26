public class Q189_Rotate {
    public void rotate(int[] nums, int k) {
//        // Method_01 132ms
//        k = k % nums.length;
//        while (k-- > 0) {
//            int tmp = nums[nums.length - 1];
//            for (int j = nums.length - 1; j > 0; j--) {
//                nums[j] = nums[j - 1];
//            }
//            nums[0] = tmp;
//        }

        // Method_02 2ms
        k = k % nums.length;
        int[] tmp = new int[k];
        System.arraycopy(nums, nums.length - k, tmp, 0, k);
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        System.arraycopy(tmp, 0, nums, 0, k);

        // Method_03

    }
}
